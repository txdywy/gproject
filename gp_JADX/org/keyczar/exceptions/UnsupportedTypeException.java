package org.keyczar.exceptions;

import org.keyczar.p570b.C7985a;
import org.keyczar.p571c.C7990b;

public class UnsupportedTypeException extends KeyczarException {
    public UnsupportedTypeException(C7990b c7990b) {
        super(C7985a.m38177a("InvalidTypeInInput", c7990b));
    }
}
