package com.google.protobuf;

final class cr {
    public static final cp f35279a = m33131a();
    public static final cp f35280b = new cq();

    private static cp m33131a() {
        try {
            return (cp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
