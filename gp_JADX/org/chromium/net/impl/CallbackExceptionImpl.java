package org.chromium.net.impl;

import org.chromium.net.CallbackException;

public class CallbackExceptionImpl extends CallbackException {
    public CallbackExceptionImpl(String str, Throwable th) {
        super(str, th);
    }
}
