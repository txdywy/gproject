package com.android.ex.photo.p052e;

import android.util.Log;
import com.squareup.haha.perflib.HprofParser;
import java.io.InputStream;

public final class C0558a {
    public static int m4089a(InputStream inputStream) {
        if (inputStream == null) {
            return 0;
        }
        int i;
        int i2;
        int i3;
        int a;
        C0564g c0564g = new C0564g(inputStream);
        if (C0558a.m4090a(c0564g, 1)) {
            i = (c0564g.m4099a(0) == (byte) -1 && c0564g.m4099a(1) == (byte) -40) ? 1 : 0;
            if (i == 0) {
                return 0;
            }
        }
        i = 0;
        while (C0558a.m4090a(c0564g, i + 3)) {
            i2 = i + 1;
            if ((c0564g.m4099a(i) & HprofParser.ROOT_UNKNOWN) != HprofParser.ROOT_UNKNOWN) {
                i3 = i2;
                i2 = 0;
                break;
            }
            i3 = c0564g.m4099a(i2) & HprofParser.ROOT_UNKNOWN;
            if (i3 != HprofParser.ROOT_UNKNOWN) {
                i = i2 + 1;
                if (!(i3 == 216 || i3 == 1)) {
                    if (i3 != 217 && i3 != 218) {
                        a = C0558a.m4088a(c0564g, i, 2, false);
                        if (a >= 2 && C0558a.m4090a(c0564g, (i + a) - 1)) {
                            if (i3 == 225 && a >= 8 && C0558a.m4088a(c0564g, i + 2, 4, false) == 1165519206 && C0558a.m4088a(c0564g, i + 6, 2, false) == 0) {
                                i2 = i + 8;
                                i = a - 8;
                                c0564g.m4101c(i2 - 4);
                                i3 = i2;
                                i2 = i;
                                break;
                            }
                            i += a;
                            c0564g.m4101c(i - 4);
                        } else {
                            Log.e("CameraExif", "Invalid length");
                            return 0;
                        }
                    }
                    c0564g.m4101c(i - 4);
                    i2 = 0;
                    i3 = i;
                    break;
                }
            }
            i = i2;
        }
        i2 = 0;
        i3 = i;
        if (i2 <= 8) {
            return 0;
        }
        i = C0558a.m4088a(c0564g, i3, 4, false);
        if (i == 1229531648 || i == 1296891946) {
            boolean z;
            if (i == 1229531648) {
                z = true;
            } else {
                z = false;
            }
            int a2 = C0558a.m4088a(c0564g, i3 + 4, 4, z) + 2;
            if (a2 < 10 || a2 > i2) {
                Log.e("CameraExif", "Invalid offset");
                return 0;
            }
            i3 += a2;
            a2 = i2 - a2;
            c0564g.m4101c(i3 - 4);
            i2 = C0558a.m4088a(c0564g, i3 - 2, 2, z);
            a = i3;
            i3 = a2;
            while (true) {
                a2 = i2 - 1;
                if (i2 <= 0 || i3 < 12) {
                    return 0;
                }
                if (C0558a.m4088a(c0564g, a, 2, z) == 274) {
                    break;
                }
                a += 12;
                i2 = i3 - 12;
                c0564g.m4101c(a - 4);
                i3 = i2;
                i2 = a2;
            }
            switch (C0558a.m4088a(c0564g, a + 8, 2, z)) {
                case 1:
                    return 0;
                case 3:
                    return 180;
                case 6:
                    return 90;
                case 8:
                    return 270;
                default:
                    Log.i("CameraExif", "Unsupported orientation");
                    return 0;
            }
        }
        Log.e("CameraExif", "Invalid byte order");
        return 0;
    }

    private static int m4088a(C0564g c0564g, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (i4 << 8) | (c0564g.m4099a(i) & HprofParser.ROOT_UNKNOWN);
            i += i3;
            i2 = i5;
        }
    }

    private static boolean m4090a(C0564g c0564g, int i) {
        if (-1 >= 0) {
            return ((long) i) < -1;
        } else {
            return c0564g.m4100b(i);
        }
    }
}
