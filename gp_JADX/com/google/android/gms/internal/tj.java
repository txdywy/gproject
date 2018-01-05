package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.regex.Pattern;

public final class tj {
    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-]+)/locations/([0-9a-zA-Z\\-]+)/keyRings/([0-9a-zA-Z\\-]+)/cryptoKeys/([0-9a-zA-Z\\-]+)$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-]+)/locations/([0-9a-zA-Z\\-]+)/keyRings/([0-9a-zA-Z\\-]+)/cryptoKeys/([0-9a-zA-Z\\-]+)/cryptoKeyVersions/([0-9a-zA-Z\\-]+)$", 2);
    }

    public static void m25581a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new GeneralSecurityException("invalid Aes key size");
        }
    }

    public static boolean m25582a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static byte[] m25583a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        Object obj = new byte[i];
        i = 0;
        for (Object obj2 : bArr) {
            System.arraycopy(obj2, 0, obj, i, obj2.length);
            i += obj2.length;
        }
        return obj;
    }

    public static void m25584b(int i) {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), Integer.valueOf(0)}));
        }
    }
}
