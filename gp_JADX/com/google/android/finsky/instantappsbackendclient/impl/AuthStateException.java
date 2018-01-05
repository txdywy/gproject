package com.google.android.finsky.instantappsbackendclient.impl;

public class AuthStateException extends Exception {
    public AuthStateException(String str) {
        super(str);
    }

    public AuthStateException(String str, Throwable th) {
        super(str, th);
    }
}
