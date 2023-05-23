package model.exception;

public class RequirementsNotMatchesException extends Exception {
	private static final String message = "Error por requerimiento no cumplido ";
	
	public RequirementsNotMatchesException() {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RequirementsNotMatchesException(Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RequirementsNotMatchesException(Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RequirementsNotMatchesException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
