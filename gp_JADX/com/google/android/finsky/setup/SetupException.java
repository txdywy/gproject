package com.google.android.finsky.setup;

public class SetupException extends Exception {
    public SetupException(String str) {
        super(str);
    }

    public SetupException(String str, Throwable th) {
        super(str, th);
    }
}
