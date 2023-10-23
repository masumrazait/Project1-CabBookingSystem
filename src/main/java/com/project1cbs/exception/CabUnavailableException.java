package com.project1cbs.exception;

public class CabUnavailableException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CabUnavailableException(String str) {
		super(str);
	}

	@Override
	public String toString() {
		return "No cabs are available for booking rightnow";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Please wait no cabs are available at this moment";
	}
	
	

}
