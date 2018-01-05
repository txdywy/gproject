package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;

public final class uq {
    public static volatile boolean f27537a = false;
    public static final uq f27538b = new uq((byte) 0);

    static {
        m25757b();
    }

    uq() {
        HashMap hashMap = new HashMap();
    }

    private uq(byte b) {
        Collections.emptyMap();
    }

    public static uq m25756a() {
        return up.m25754a();
    }

    private static Class m25757b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
