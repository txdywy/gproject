package com.google.android.finsky.billing.common;

import android.content.Context;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C1788a {
    public final Context f9313a;

    public C1788a(Context context) {
        this.f9313a = context;
    }

    public static int m9750a(int[] iArr) {
        int i = 0;
        if (iArr != null) {
            for (int i2 : iArr) {
                switch (i2) {
                    case 1:
                        i |= 4194304;
                        break;
                    case 2:
                        i |= 32768;
                        break;
                    case 3:
                        i |= 67108864;
                        break;
                    case 4:
                        i |= 8388608;
                        break;
                    case 5:
                        i |= 33554432;
                        break;
                    case 6:
                        i |= 1048576;
                        break;
                    case 7:
                        i |= 134217728;
                        break;
                    case 8:
                        i |= 524288;
                        break;
                    case 9:
                        i |= 268435456;
                        break;
                    case 10:
                        i |= 65536;
                        break;
                    case 11:
                        i |= MemoryMappedFileBuffer.DEFAULT_SIZE;
                        break;
                    case 12:
                        i |= 262144;
                        break;
                    case 13:
                        i |= 16777216;
                        break;
                    case 14:
                        i |= 2097152;
                        break;
                    case 15:
                        i |= 131072;
                        break;
                    case 16:
                        i |= 536870912;
                        break;
                    case 17:
                        i |= 16384;
                        break;
                    default:
                        break;
                }
            }
        }
        return i;
    }
}
