package com.google.android.gms.internal;

final class up {
    public static Class f27536a = m25755b();

    public static uq m25754a() {
        if (f27536a != null) {
            try {
                return (uq) f27536a.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
            }
        }
        return uq.f27538b;
    }

    private static Class m25755b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
