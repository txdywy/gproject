package org.keyczar.exceptions;

public class KeyczarException extends Exception {
    public KeyczarException(String str) {
        super(str);
    }

    public KeyczarException(String str, Throwable th) {
        super(str, th);
    }

    public KeyczarException(Throwable th) {
        super(th);
    }
}
