package com.myHealth.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myHealth.model.Address;
import com.myHealth.model.User;
import com.myHealth.model.data.AddressDetails;
import com.myHealth.model.data.UserDetails;


@Repository
public class UserDAOImpl implements IUserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<UserDetails> getAllUsers() {
		
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
		Collection<UserDetails> users =  session.createCriteria(UserDetails.class).list();
		
		
		session.getTransaction().commit();
        session.close();
		
		return (List<UserDetails>)users;
	}

	public Integer saveUser(UserDetails user) {
		Session session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer userId = (Integer)session.save(user);
		tx.commit();
		session.close();
		return userId;
	}

	public User getUser(Integer id) {
		
		Session session =  sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		UserDetails userDetails = (UserDetails)session.get(UserDetails.class, id);
		userDetails.getChildren();

		User user = new User(userDetails.getUserId(), userDetails.getFname(), userDetails.getMname(), userDetails.getLname(), userDetails.getEmail());
		
		populateChild(userDetails.getChildren(), user);
		
		populateAddress(userDetails.getAddressDetails(), user);
		
		tx.commit();
		session.close();
		return user;
	}

	private void populateAddress(AddressDetails addressDetails, User user) {
		
		user.setAddress(new Address(addressDetails.getAddressId(), addressDetails.getFlatNo(),addressDetails.getBuildingName(), addressDetails.getStreetName(), addressDetails.getCity(), addressDetails.getState(), addressDetails.getCountry(), addressDetails.getZip()));
		
	}

	private void populateChild(Set<UserDetails> children, User user) {
		
		List<User> users = new ArrayList<User>();
		for(UserDetails userDetails : children){
			
			users.add(new User(userDetails.getUserId(), userDetails.getFname(), userDetails.getMname(), userDetails.getLname(), userDetails.getEmail()));
		}
		
		user.setChildren(users);
		
		
	}

}
