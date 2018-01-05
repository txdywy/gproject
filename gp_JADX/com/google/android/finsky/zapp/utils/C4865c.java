package com.google.android.finsky.zapp.utils;

import android.util.Base64;
import java.io.Closeable;
import java.io.File;

public final class C4865c {
    public static void m22751a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static boolean m22752a(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                for (String file2 : list) {
                    C4865c.m22752a(new File(file, file2));
                }
            }
            if (file.delete()) {
                return true;
            }
        }
        return false;
    }

    public static String m22750a(String str) {
        byte[] decode = Base64.decode(str, 11);
        char[] cArr = new char[(decode.length * 2)];
        int i = 0;
        for (byte b : decode) {
            int i2 = (b >> 4) & 15;
            int i3 = i + 1;
            cArr[i] = (char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
            i2 = b & 15;
            i = i3 + 1;
            cArr[i3] = (char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
        }
        return new String(cArr);
    }
}
