package com.google.common.flogger.backend;

import java.math.BigInteger;

enum C7039g extends C7035c {
    C7039g(String str) {
        super(str, 3, false);
    }

    public final boolean mo5993a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger);
    }
}
