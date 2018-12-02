package com.chensong.exception;

public class CsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -801156616540622337L;
	
	public CsException(){
		super();
	}
	
	public CsException(String message){
		super(message);
	}
	
	public CsException(String message,Throwable cause){
		super(message,cause);
	}
	
	public CsException(Throwable cause){
		super(cause);
	}
	
}
