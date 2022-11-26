package in.bushansirgur.exception;

import java.io.Serializable;

public class CountryNotFoundException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public CountryNotFoundException() {
		this("Country is not available!");
	}
	
	public CountryNotFoundException(String message) {
		this.message = System.currentTimeMillis() + ": " + message;
	}
	
	public String getMessage() {
		return message;
	}
}
