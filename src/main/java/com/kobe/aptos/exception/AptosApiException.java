package com.kobe.aptos.exception;


public class AptosApiException extends RuntimeException {
    private final static long serialVersionUID = -4298738252483677889L;
    private AptosApiError error;

    public AptosApiException(AptosApiError error) {
        this.error = error;
    }

    public AptosApiException(Throwable cause) {
        super(cause);
    }

    public AptosApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public AptosApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.toString();
        }
        return super.getMessage();
    }
}
