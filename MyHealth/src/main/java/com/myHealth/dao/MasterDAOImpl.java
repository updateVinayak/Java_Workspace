package com.myHealth.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myHealth.model.data.StateDetails;

@Repository
public class MasterDAOImpl implements IMasterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<StateDetails> getAllStates() {
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from StateDetails");
		query.setCacheable(true);
		List list = query.list();

		session.getTransaction().commit();
		
		session.close();
		
		
		return list;
		
		//List<StateDetails> states =  session.createCriteria(StateDetails.class).list();
		
		
	}

}