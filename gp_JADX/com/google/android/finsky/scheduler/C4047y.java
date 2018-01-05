package com.google.android.finsky.scheduler;

import android.support.v4.p037h.C0305a;
import java.util.Map;

public final class C4047y {
    public final Map f20343a = new C0305a();
    public final Map f20344b = new C0305a();

    public C4047y() {
        m18949a(4, 821848295, 12633420);
        m18949a(4, 821848296, 12633420);
        m18949a(1, 1337, 12644207);
        m18950b(4, 821848295, 12633420);
        m18950b(4, 821848296, 12633420);
        m18950b(1, 1337, 12644207);
    }

    private final void m18949a(int i, int i2, long j) {
        this.f20343a.put(Long.valueOf(aa.m18791a(i, i2)), Long.valueOf(j));
    }

    private final void m18950b(int i, int i2, long j) {
        this.f20344b.put(Long.valueOf(aa.m18791a(i, i2)), Long.valueOf(j));
    }
}
