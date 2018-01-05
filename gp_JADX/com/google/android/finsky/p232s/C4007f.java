package com.google.android.finsky.p232s;

import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;

public final class C4007f {
    public final C3028c f20110a;
    public final C3027b f20111b;
    public final C0988c f20112c;
    public final C1506e f20113d;
    public final C1461c f20114e;

    public C4007f(C3028c c3028c, C3027b c3027b, C0988c c0988c, C1506e c1506e, C1461c c1461c) {
        this.f20110a = c3028c;
        this.f20111b = c3027b;
        this.f20112c = c0988c;
        this.f20113d = c1506e;
        this.f20114e = c1461c;
    }

    public final void m18751a(C4005d c4005d) {
        if (this.f20110a.m15631a(c4005d.f20099e, true).f15857a) {
            c4005d.f20095a |= 1;
        }
    }

    public final void m18752b(C4005d c4005d) {
        if (this.f20110a.m15631a(c4005d.f20099e, true).f15858b) {
            c4005d.f20095a |= 2;
        }
    }

    public static void m18750c(C4005d c4005d) {
        if (c4005d.f20100f != null && c4005d.f20100f.f11425j) {
            c4005d.f20095a |= 16;
        }
    }
}
