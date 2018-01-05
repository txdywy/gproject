package com.google.archivepatcher.p406a;

import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public final class C6866b {
    static final byte[] m31237a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bytes = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.".getBytes("US-ASCII");
            for (int i = 0; i < 135; i++) {
                byteArrayOutputStream.write(bytes, 0, i);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException("System doesn't support ASCII", e);
        }
    }

    private static final String m31236a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            int i = b & HprofParser.ROOT_UNKNOWN;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }

    public static Map m31238b() {
        Map hashMap = new HashMap();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            C6869e c6869e = new C6869e();
            c6869e.f33912g = true;
            boolean[] zArr = new boolean[]{true, false};
            int[] iArr = new int[]{0, 1, 2};
            int[] iArr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            for (int i = 0; i < 2; i++) {
                boolean z = zArr[i];
                if (z != c6869e.f33908c) {
                    c6869e.m31239a();
                    c6869e.f33908c = z;
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = iArr[i2];
                    if (!(c6869e.f33911f == null || i3 == c6869e.f33907b)) {
                        c6869e.f33911f.reset();
                        c6869e.f33911f.setStrategy(i3);
                    }
                    c6869e.f33907b = i3;
                    int[] iArr3 = i3 == 2 ? new int[]{1} : iArr2;
                    int length = iArr3.length;
                    int i4 = 0;
                    while (i4 < length) {
                        int i5 = iArr3[i4];
                        if (i5 < 0 || i5 > 9) {
                            throw new IllegalArgumentException("compressionLevel must be in the range [0,9]: " + i5);
                        }
                        if (!(c6869e.f33911f == null || i5 == c6869e.f33906a)) {
                            c6869e.f33911f.reset();
                            c6869e.f33911f.setLevel(i5);
                        }
                        c6869e.f33906a = i5;
                        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            c6869e.m31240a(new ByteArrayInputStream(C6868d.f33905a), byteArrayOutputStream);
                            byte[] toByteArray = byteArrayOutputStream.toByteArray();
                            instance.reset();
                            hashMap.put(C6872h.m31243a(i5, i3, z), C6866b.m31236a(instance.digest(toByteArray)));
                            i4++;
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            c6869e.m31239a();
            return hashMap;
        } catch (Throwable e2) {
            throw new RuntimeException("System doesn't support SHA-256", e2);
        }
    }
}
