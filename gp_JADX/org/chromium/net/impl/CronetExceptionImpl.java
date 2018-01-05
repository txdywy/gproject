package org.chromium.net.impl;

import org.chromium.net.CronetException;

public class CronetExceptionImpl extends CronetException {
    public CronetExceptionImpl(String str, Throwable th) {
        super(str, th);
    }
}
