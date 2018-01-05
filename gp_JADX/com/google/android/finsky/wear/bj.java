package com.google.android.finsky.wear;

import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;

public final class bj {
    public ba f24880a;

    public bj(ba baVar) {
        this.f24880a = baVar;
    }

    public final void m22493a(int i, String str, long j, long j2, String str2, String str3) {
        C4025c c4025c = new C4025c();
        c4025c.m18849a("node_id", str2);
        c4025c.m18849a("hygiene_reason", str3);
        c4025c.m18850a("is_foreground", true);
        int i2 = i;
        String str4 = str;
        this.f24880a.m18888a(i2, str4, bl.class, new C4024b().m18839a(j).m18843b(j2).m18837a(), c4025c).mo4398a(new bk(str));
    }
}
