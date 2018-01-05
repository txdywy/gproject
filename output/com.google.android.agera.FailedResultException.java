package com.google.android.agera;

class FailedResultException extends IllegalStateException
{

    FailedResultException(Throwable p0) {
        IllegalStateException("Cannot get() from a failed result", p0);
    }

}
