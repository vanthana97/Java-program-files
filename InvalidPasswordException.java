package com.interfaces;

public class InvalidPasswordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public InvalidPasswordException(String s)
    {
    	super(s);
    }
}
