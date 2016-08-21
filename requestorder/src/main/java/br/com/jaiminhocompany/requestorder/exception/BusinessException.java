package br.com.jaiminhocompany.requestorder.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -4611928382041349280L;

	public BusinessException(final Throwable throwable) {
		
		super(throwable);
	}
	
	public BusinessException(final String message) {
		
		super(message);
	}
	
	public BusinessException() {

		super();
	}

}