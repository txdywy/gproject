package com.google.android.finsky.utils;

import android.util.Base64;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class C4688t {
    public static String m21838a(byte[] bArr) {
        return C4688t.m21839a(bArr, "SHA-1", 11);
    }

    public static String m21839a(byte[] bArr, String str, int i) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), i);
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    public static C4689u m21836a(File file) {
        Throwable th;
        Closeable fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                C4689u a = C4688t.m21837a(fileInputStream, "SHA-256");
                C4679j.m21814a(fileInputStream);
                return a;
            } catch (Throwable th2) {
                th = th2;
                C4679j.m21814a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            C4679j.m21814a(fileInputStream);
            throw th;
        }
    }

    public static C4689u m21837a(InputStream inputStream, String str) {
        byte[] bArr = new byte[8192];
        long j = 0;
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        instance.update(bArr, 0, read);
                        j += (long) read;
                    }
                } finally {
                    C4679j.m21814a(inputStream);
                }
            }
            C4689u c4689u = new C4689u(instance.digest(), j, str, (byte) 0);
            return c4689u;
        } catch (NoSuchAlgorithmException e) {
            FinskyLog.m21669e("Unable to access hash: %s", str);
            C4679j.m21814a(inputStream);
            return null;
        }
    }
}
