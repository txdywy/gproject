package com.google.android.agera;

public final class FailedResultException extends IllegalStateException {
    FailedResultException(Throwable th) {
        super("Cannot get() from a failed result", th);
    }
}
