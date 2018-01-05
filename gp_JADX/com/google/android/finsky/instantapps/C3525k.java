package com.google.android.finsky.instantapps;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.instantapps.p216c.C3412d;
import com.google.android.finsky.providers.C1468e;

public final class C3525k implements C1468e {
    public static C3525k f17774a;
    public static Boolean f17775b;
    public final C3412d f17776c;

    public C3525k(C3412d c3412d) {
        this.f17776c = c3412d;
    }

    public static boolean m17101a() {
        if (f17775b != null) {
            return f17775b.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("com.android.vending:instant_app_installer".equals(C1473m.f7980a.bj()));
        f17775b = valueOf;
        return valueOf.booleanValue();
    }

    public final Object mo2051a(Class cls) {
        return cls.cast(this.f17776c);
    }
}
