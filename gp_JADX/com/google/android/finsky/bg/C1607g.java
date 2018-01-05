package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.da;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;

public final class C1607g {
    public static ColorStateList m9239a(int i, Context context) {
        int[][] iArr = new int[4][];
        iArr[0] = new int[]{16842910};
        iArr[1] = new int[]{-16842910};
        iArr[2] = new int[]{-16842912};
        iArr[3] = new int[]{16842919};
        return new ColorStateList(iArr, new int[]{i, context.getResources().getColor(C7582R.color.play_disabled_black), i, i});
    }

    public static int m9236a(bd bdVar, int i) {
        return C1607g.m9238a(bdVar.f11866l, i);
    }

    public static int m9237a(da daVar, int i) {
        return C1607g.m9238a(daVar.f12134f, i);
    }

    public static int m9238a(String str, int i) {
        if (str.length() > 0) {
            try {
                i = Color.parseColor(str.trim());
            } catch (IllegalArgumentException e) {
                IllegalArgumentException illegalArgumentException = e;
                String str2 = "Bad color: ";
                String valueOf = String.valueOf(str);
                FinskyLog.m21669e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), illegalArgumentException);
            }
        }
        return i;
    }

    public static boolean m9240a(int i) {
        return ((Color.red(i) * 21) + (Color.green(i) * 72)) + (Color.blue(i) * 7) >= 12800;
    }

    public static int m9234a(int i, float f) {
        float f2 = 1.0f - f;
        return (((((int) ((((float) ((i >> 24) & HprofParser.ROOT_UNKNOWN)) * f) + (f2 * 255.0f))) << 24) | (((int) ((((float) ((i >> 16) & HprofParser.ROOT_UNKNOWN)) * f) + (f2 * 255.0f))) << 16)) | (((int) ((((float) ((i >> 8) & HprofParser.ROOT_UNKNOWN)) * f) + (f2 * 255.0f))) << 8)) | ((int) ((((float) (i & HprofParser.ROOT_UNKNOWN)) * f) + (f2 * 255.0f)));
    }

    public static int m9235a(int i, int i2) {
        return (16777215 & i) | (i2 << 24);
    }
}
