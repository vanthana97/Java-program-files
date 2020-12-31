package com.interfaces;

public class AgeException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public AgeException(String s)
{
	super(s);
}

@Override
public String toString() {
	return "AgeException [s"+super.toString()+"]";
}
@Override
public String getMessage()
{
	return "Age is not correct";
}
}
