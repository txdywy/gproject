package com.google.protobuf;

public abstract class C7196a implements cf {
    public static boolean f35085g = false;
    public int f35086f = 0;

    public final C7203j mo6022c() {
        try {
            C7223o b = C7203j.m33203b(mo6115a());
            mo6116a(b.f35480a);
            return b.m33625a();
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }
}
