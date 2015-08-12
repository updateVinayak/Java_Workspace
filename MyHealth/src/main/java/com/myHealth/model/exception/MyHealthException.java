package com.myHealth.model.exception;

public class MyHealthException extends Exception {
	

	
	private String message = null;
	 
    public MyHealthException() {
        super();
    }
 
    public MyHealthException(String message) {
        super(message);
        this.message = message;
    }
 
    public MyHealthException(Throwable cause) {
        super(cause);
    }
 
    @Override
    public String toString() {
        return message;
    }


}
