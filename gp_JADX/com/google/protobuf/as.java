package com.google.protobuf;

final class as implements ce {
    public static final as f35178a = new as();

    private as() {
    }

    public final boolean mo6113a(Class cls) {
        return at.class.isAssignableFrom(cls);
    }

    public final cd mo6114b(Class cls) {
        if (at.class.isAssignableFrom(cls)) {
            try {
                return (cd) at.m32940a(cls.asSubclass(at.class)).m32947b();
            } catch (Throwable e) {
                Throwable th = e;
                String str = "Unable to get message info for ";
                String valueOf = String.valueOf(cls.getName());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            }
        }
        String str2 = "Unsupported message type: ";
        valueOf = String.valueOf(cls.getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
