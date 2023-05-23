package model.exception;

public class DataOutOfBoundsException extends Exception{
	
	private static final String message = "Error en el rango de datos aceptable ";
	
	public DataOutOfBoundsException() {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataOutOfBoundsException(Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DataOutOfBoundsException(Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataOutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
