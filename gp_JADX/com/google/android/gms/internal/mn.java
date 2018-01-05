package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

public class mn {
    public int[] f27182a;
    public int f27183b;

    static {
        mn.class.getSimpleName();
    }

    public mn(DataHolder dataHolder, int i) {
        if (dataHolder != null && dataHolder.f25953e == 0) {
            Object a = m25168a(dataHolder.m23681b("", i, dataHolder.m23676a(i)));
            if (a != null && a.length >= 3 && a[0] == 1 && a[1] == 1936614772) {
                this.f27182a = new int[a.length];
                System.arraycopy(a, 0, this.f27182a, 0, a.length);
                this.f27183b = this.f27182a[2];
            }
        }
    }

    private static int[] m25168a(byte[] bArr) {
        if (bArr == null || bArr.length % 4 != 0) {
            return null;
        }
        int[] iArr = new int[(bArr.length / 4)];
        for (int i = 0; i < bArr.length; i += 4) {
            iArr[i / 4] = (int) ((((((long) bArr[i + 3]) & 255) | ((((long) bArr[i + 2]) & 255) << 8)) | ((((long) bArr[i + 1]) & 255) << 16)) | ((((long) bArr[i]) & 255) << 24));
        }
        return iArr;
    }
}
