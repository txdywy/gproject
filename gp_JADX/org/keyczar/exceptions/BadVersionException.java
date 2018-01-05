package org.keyczar.exceptions;

import org.keyczar.p570b.C7985a;

public class BadVersionException extends KeyczarException {
    public BadVersionException(byte b) {
        super(C7985a.m38177a("BadVersionNumber", Byte.valueOf(b)));
    }
}
