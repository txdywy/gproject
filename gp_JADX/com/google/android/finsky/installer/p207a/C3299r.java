package com.google.android.finsky.installer.p207a;

import android.support.v7.widget.eq;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.utils.FinskyLog;

public final class C3299r {
    public final C1461c f17056a;
    public final C2830g f17057b;

    public C3299r(C1461c c1461c, C2830g c2830g) {
        this.f17056a = c1461c;
        this.f17057b = c2830g;
    }

    final long m16531a(C3288f c3288f) {
        boolean f = this.f17057b.m14978f();
        long e;
        if ((c3288f.f17023b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            if (c3288f.f17028g <= 0) {
                if (f) {
                    e = this.f17057b.m14977e();
                } else {
                    e = C2830g.m14970d();
                }
                c3288f.f17028g = e;
            }
            return c3288f.f17028g;
        }
        if (c3288f.f17027f <= 0) {
            if (f) {
                e = this.f17057b.m14976c();
            } else {
                e = C2830g.m14967b();
            }
            c3288f.f17027f = e;
        }
        return c3288f.f17027f;
    }

    static long m16527a(long j) {
        return ((Long) C0955b.bf.m28964b()).longValue() + ((((long) ((Integer) C0955b.bd.m28964b()).intValue()) * j) / 100);
    }

    static long m16528a(C1518d c1518d) {
        return ((c1518d.f8209g + c1518d.f8213k.c) * 110) / 100;
    }

    static long m16530b(C1518d c1518d) {
        return (((long) ((Integer) C0955b.bb.m28964b()).intValue()) * c1518d.f8209g) / 100;
    }

    static boolean m16529a(long j, long j2) {
        return C2830g.m14970d() - ((((long) ((Integer) C0955b.aY.m28964b()).intValue()) * j) / 100) >= j2;
    }

    final long m16532b(long j) {
        long g = C2830g.m14971g();
        if (j >= 0) {
            return this.f17057b.m14974a(g) - j;
        }
        FinskyLog.m21669e("Cannot use a negative offset", new Object[0]);
        return -1;
    }
}
