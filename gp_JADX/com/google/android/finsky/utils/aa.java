package com.google.android.finsky.utils;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class aa {
    public static String m21683a(byte[] bArr) {
        return Base64.encodeToString(m21684b(bArr), 11);
    }

    private static byte[] m21684b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
