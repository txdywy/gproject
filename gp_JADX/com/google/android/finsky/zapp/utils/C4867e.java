package com.google.android.finsky.zapp.utils;

import android.util.Base64;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class C4867e {
    public static String m22755a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    public static C4868f m22754a(InputStream inputStream, OutputStream outputStream, int i) {
        try {
            MessageDigest instance = MessageDigest.getInstance(i == 1 ? "SHA-1" : "SHA-256");
            byte[] bArr = new byte[8192];
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, read);
                    }
                    instance.update(bArr, 0, read);
                    j = ((long) read) + j;
                } finally {
                    inputStream.close();
                }
            }
            C4868f c4868f = new C4868f(Base64.encodeToString(instance.digest(), 11), j);
            return c4868f;
        } catch (NoSuchAlgorithmException e) {
            inputStream.close();
            return null;
        }
    }
}
