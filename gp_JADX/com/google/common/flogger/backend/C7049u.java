package com.google.common.flogger.backend;

enum C7049u {
    ;

    abstract int mo6005a(Object obj, Object obj2);

    static C7049u m32116a(Object obj) {
        if (obj instanceof String) {
            return f34562b;
        }
        if (obj instanceof Boolean) {
            return f34561a;
        }
        if (obj instanceof Long) {
            return f34563c;
        }
        if (obj instanceof Double) {
            return f34564d;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 18).append("invalid tag type: ").append(valueOf).toString());
    }
}
