package com.google.android.finsky.bg;

import com.google.android.finsky.utils.FinskyLog;
import java.text.NumberFormat;
import java.text.ParseException;

public static class com.google.android.finsky.bg.aa
{

    public static NumberFormat a;

    static {
        v0 = NumberFormat.getNumberInstance();
        com.google.android.finsky.bg.aa.a = v0;
        v0.setMinimumFractionDigits(1);
        com.google.android.finsky.bg.aa.a.setMaximumFractionDigits(1);
    }

    public static float a(float p0) {
        v1 = com.google.android.finsky.bg.aa.b(p0);
        try {
            p0 = com.google.android.finsky.bg.aa.a.parse(v1).floatValue();
        }
        catch (ParseException ex) {
            v3 = new Object[2];
            v3[0] = v1;
            v3[1] = ex;
            FinskyLog.e("Cannot parse %s. Exception %s", v3);
        }
        return p0;
    }

    public static String b(float p0) {
        return com.google.android.finsky.bg.aa.a.format((double)p0);
    }

}
