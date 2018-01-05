package com.google.android.finsky.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class C4692x {
    public static byte[] m21844a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C4692x.m21843a(inputStream, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            return toByteArray;
        } finally {
            byteArrayOutputStream.close();
        }
    }

    public static void m21843a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            } finally {
                inputStream.close();
            }
        }
    }
}
