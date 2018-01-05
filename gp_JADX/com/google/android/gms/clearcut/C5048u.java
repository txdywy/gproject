package com.google.android.gms.clearcut;

import java.util.Comparator;

final class C5048u implements Comparator {
    C5048u() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = 0;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr == null && bArr2 == null) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int min = Math.min(bArr.length, bArr2.length);
        while (i < min) {
            if (bArr[i] != bArr2[i]) {
                return bArr[i] - bArr2[i];
            }
            i++;
        }
        return bArr.length - bArr2.length;
    }

    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException("what are you doing?");
    }
}
