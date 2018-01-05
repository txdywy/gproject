package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.p270c.C4909c;

@C5302b
public abstract class yk {
    public final String f27734a;
    public final Object f27735b;

    yk(String str, Object obj) {
        this.f27734a = str;
        this.f27735b = obj;
        C4909c.m22927a().f25265e.f27736a.add(this);
    }

    public static yk m26001a(String str) {
        return new yo(str, Float.valueOf(0.0f));
    }

    public static yk m26002a(String str, int i) {
        return new ym(str, Integer.valueOf(i));
    }

    public static yk m26003a(String str, long j) {
        return new yn(str, Long.valueOf(j));
    }

    public static yk m26004a(String str, Boolean bool) {
        return new yl(str, bool);
    }

    public static yk m26005a(String str, String str2) {
        return new yp(str, str2);
    }

    protected abstract Object mo4952a(SharedPreferences sharedPreferences);

    public static yk m26006b(String str) {
        yk a = m26005a(str, null);
        C4909c.m22927a().f25265e.f27737b.add(a);
        return a;
    }

    public static yk m26007c(String str) {
        yk a = m26005a(str, null);
        C4909c.m22927a().f25265e.f27738c.add(a);
        return a;
    }
}
