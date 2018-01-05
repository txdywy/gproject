package com.google.android.finsky.billing.common;

import android.content.Context;

public static class com.google.android.finsky.billing.common.a
{

    public final Context a;

    a(Context p0) {
        this.a = p0;
    }

    public static int a(int[] p0) {
        v0 = 0;
        if (p0 != 0) {
            v1 = 0;
            while (v1 < p0.length) {
                switch (p0[v1]) {
                    case 1:
                        v0 = v0 | 4194304;
                        break;
                    case 2:
                        v0 = v0 | 32768;
                        break;
                    case 3:
                        v0 = v0 | 67108864;
                        break;
                    case 4:
                        v0 = v0 | 8388608;
                        break;
                    case 5:
                        v0 = v0 | 33554432;
                        break;
                    case 6:
                        v0 = v0 | 1048576;
                        break;
                    case 7:
                        v0 = v0 | 134217728;
                        break;
                    case 8:
                        v0 = v0 | 524288;
                        break;
                    case 9:
                        v0 = v0 | 268435456;
                        break;
                    case 10:
                        v0 = v0 | 65536;
                        break;
                    case 11:
                        v0 = v0 | 1073741824;
                        break;
                    case 12:
                        v0 = v0 | 262144;
                        break;
                    case 13:
                        v0 = v0 | 16777216;
                        break;
                    case 14:
                        v0 = v0 | 2097152;
                        break;
                    case 15:
                        v0 = v0 | 131072;
                        break;
                    case 16:
                        v0 = v0 | 536870912;
                        break;
                    case 17:
                        v0 = v0 | 16384;
                        break;
                    default:
                        break;
                }
                v1 = v1 + 1;
            }
        }
        return v0;
    }

}
