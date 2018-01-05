package com.google.android.instantapps.common.p316c;

import android.support.v4.p037h.C0305a;
import com.google.android.gms.clearcut.C5019g;
import com.google.android.gms.clearcut.C5044p;
import com.google.android.instantapps.common.C5804k;
import java.util.Map;
import p002a.C0002a;

public class C5705a {
    public static final C5804k f28867a = new C5804k("ClearcutCounters");
    public final C0002a f28868b;
    public final Map f28869c = new C0305a();

    public C5705a(C0002a c0002a) {
        C0305a c0305a = new C0305a();
        this.f28868b = c0002a;
    }

    static boolean m26966a() {
        return ((Integer) C5708d.f28874a.m26938b()).intValue() >= 2;
    }

    final synchronized C5044p m26967a(String str) {
        if (!this.f28869c.containsKey(str)) {
            this.f28869c.put(str, ((C5019g) this.f28868b.mo1a()).m23212a(str, C5019g.f25556p));
        }
        return (C5044p) this.f28869c.get(str);
    }
}
