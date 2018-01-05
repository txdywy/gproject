package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.da;
import com.google.android.finsky.utils.FinskyLog;

public static class com.google.android.finsky.bg.g
{

    public static int a(int p0, float p1) {
        return (int)((float)(p0 >> 24 & 255) * p1 + (1065353216 - p1) * 1132396544) << 24 | (int)((float)(p0 >> 16 & 255) * p1 + (1065353216 - p1) * 1132396544) << 16 | (int)((float)(p0 >> 8 & 255) * p1 + (1065353216 - p1) * 1132396544) << 8 | (int)((float)(p0 & 255) * p1 + (1065353216 - p1) * 1132396544);
    }

    public static int a(int p0, int p1) {
        return 16777215 & p0 | p1 << 24;
    }

    public static int a(com.google.android.finsky.cv.a.bd p0, int p1) {
        return com.google.android.finsky.bg.g.a(p0.l, p1);
    }

    public static int a(com.google.android.finsky.cv.a.da p0, int p1) {
        return com.google.android.finsky.bg.g.a(p0.f, p1);
    }

    public static int a(String p0, int p1) {
        if (p0.length() > 0) {
            try {
                p1 = Color.parseColor(p0.trim());
            }
            catch (IllegalArgumentException ex) {
                v0 = String.valueOf(p0);
                if (v0.length() != 0)
                    v0 = "Bad color: ".concat(v0);
                else
                    v0 = new String("Bad color: ");
                v2 = new Object[1];
                v2[0] = ex;
                FinskyLog.e(v0, v2);
            }
        }
        return p1;
    }

    public static ColorStateList a(int p0, Context p1) {
        v0 = new int[4][];
        v1 = new int[1];
        v1[0] = 16842910;
        v0[0] = v1;
        v1 = new int[1];
        v1[0] = -16842910;
        v0[1] = v1;
        v1 = new int[1];
        v1[0] = -16842912;
        v0[2] = v1;
        v1 = new int[1];
        v1[0] = 16842919;
        v0[3] = v1;
        v1 = new int[4];
        v1[0] = p0;
        v1[1] = p1.getResources().getColor(2131558670);
        v1[2] = p0;
        v1[3] = p0;
        return new ColorStateList(v0, v1);
    }

    public static boolean a(int p0) {
        if (Color.red(p0) * 21 + Color.green(p0) * 72 + Color.blue(p0) * 7 >= 12800)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
