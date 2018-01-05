package io.reactivex.exceptions;

public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th) {
        super(th);
    }
}
