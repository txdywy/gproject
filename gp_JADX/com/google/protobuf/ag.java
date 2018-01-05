package com.google.protobuf;

final class ag {
    public static final Class f35105a = m32877c();

    private static Class m32877c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static ah m32874a() {
        if (f35105a != null) {
            try {
                return m32875a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return ah.f35108c;
    }

    static ah m32876b() {
        ah ahVar = null;
        if (f35105a != null) {
            try {
                ahVar = m32875a("loadGeneratedRegistry");
            } catch (Exception e) {
            }
        }
        if (ahVar == null) {
            ahVar = ah.m32880c();
        }
        return ahVar == null ? m32874a() : ahVar;
    }

    private static final ah m32875a(String str) {
        return (ah) f35105a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
