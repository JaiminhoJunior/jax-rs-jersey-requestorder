package br.com.jaiminhocompany.requestorder.exception;

public class RESTRequestException extends BusinessException {

	private static final long serialVersionUID = -4997717029911851962L;
	
	public RESTRequestException(final Throwable e) {
		
		super(e);
	}
	
	public RESTRequestException(final String message) {

		super(message);
	}

	public int getCode() {
		
		return 500;
	}
	
}