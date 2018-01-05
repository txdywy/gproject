package com.google.android.finsky.instantapps.metrics;

import android.content.Context;
import com.google.android.gms.clearcut.C5012a;
import com.google.android.gms.clearcut.C5019g;
import com.google.android.instantapps.common.p316c.C5708d;

public final class C3536i {
    static C5019g m17118a(Context context) {
        C5019g c5019g = new C5019g(new C5012a(context, "WESTINGHOUSE_COUNTERS", (byte) 0), "WESTINGHOUSE_COUNTERS", Math.max(2, ((Integer) C5708d.f28874a.m26938b()).intValue()));
        c5019g.f25564i.writeLock().lock();
        try {
            c5019g.f25560e = true;
            return c5019g;
        } finally {
            c5019g.f25564i.writeLock().unlock();
        }
    }
}
