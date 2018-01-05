package io.reactivex.exceptions;

public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}
