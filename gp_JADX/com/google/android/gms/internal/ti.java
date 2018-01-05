package com.google.android.gms.internal;

import java.security.SecureRandom;

public final class ti {
    public static final SecureRandom f27499a = new SecureRandom();

    public static byte[] m25580a(int i) {
        byte[] bArr = new byte[i];
        f27499a.nextBytes(bArr);
        return bArr;
    }
}
