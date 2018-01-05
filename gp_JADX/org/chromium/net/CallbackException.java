package org.chromium.net;

public class CallbackException extends CronetException {
    public CallbackException(String str, Throwable th) {
        super(str, th);
    }
}
