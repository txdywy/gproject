package org.keyczar.exceptions;

import org.keyczar.p570b.C7985a;

public class ShortSignatureException extends KeyczarException {
    public ShortSignatureException(int i) {
        super(C7985a.m38177a("SignatureTooShort", Integer.valueOf(i)));
    }
}
