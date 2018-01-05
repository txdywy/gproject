package com.google.protobuf;

final class al {
    public static final aj f35112a = new ak();
    public static final aj f35113b = m32906b();

    private static aj m32906b() {
        try {
            return (aj) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static aj m32905a() {
        if (f35113b != null) {
            return f35113b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
