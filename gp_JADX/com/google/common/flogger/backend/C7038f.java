package com.google.common.flogger.backend;

enum C7038f extends C7035c {
    C7038f(String str) {
        super(str, 2, false);
    }

    public final boolean mo5993a(Object obj) {
        if (obj instanceof Character) {
            return true;
        }
        if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Character.isValidCodePoint(((Number) obj).intValue());
        }
        return false;
    }
}
