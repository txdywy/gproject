package com.google.android.finsky.bg;

import com.google.android.finsky.utils.FinskyLog;
import java.text.NumberFormat;
import java.text.ParseException;

public final class aa {
    public static NumberFormat f8506a;

    public static float m9201a(float f) {
        try {
            f = f8506a.parse(m9202b(f)).floatValue();
        } catch (ParseException e) {
            FinskyLog.m21669e("Cannot parse %s. Exception %s", r1, e);
        }
        return f;
    }

    public static String m9202b(float f) {
        return f8506a.format((double) f);
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        f8506a = numberInstance;
        numberInstance.setMinimumFractionDigits(1);
        f8506a.setMaximumFractionDigits(1);
    }
}
