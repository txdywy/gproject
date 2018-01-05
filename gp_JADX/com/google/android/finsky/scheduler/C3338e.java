package com.google.android.finsky.scheduler;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0308c;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4026d;
import java.util.Set;

public abstract class C3338e extends ah implements C3337d {
    public final Set f17195i = new C0308c();
    public final Set f17196j = new C0308c();
    public final Handler f17197k = new Handler(Looper.getMainLooper());
    public C4026d f17198l;
    public boolean f17199m = false;
    public boolean f17200n = false;

    public abstract void mo1167a();

    public abstract void mo3476a(C4025c c4025c);

    public abstract boolean mo3477b(C4026d c4026d);

    public abstract boolean mo3478c(C4026d c4026d);

    protected final boolean mo1168a(C4026d c4026d) {
        if (c4026d.m18860e()) {
            this.f17199m = true;
            m16725a(mo3477b(c4026d));
        }
        mo3476a(c4026d.m18859d());
        if (this.f17195i.isEmpty()) {
            this.f17199m = true;
            m16725a(mo3477b(c4026d));
        } else {
            this.f17198l = c4026d;
            this.f17196j.addAll(this.f17195i);
            for (C3328c a : this.f17195i) {
                a.mo3471a(this);
            }
            this.f17197k.postDelayed(new C4032f(this), ((Long) C0955b.jb.m28964b()).longValue());
        }
        return true;
    }

    public final void mo3474a(C3328c c3328c, boolean z) {
        if (this.f17195i.contains(c3328c)) {
            if (this.f17196j.remove(c3328c)) {
                if (z) {
                    if (this.f17196j.isEmpty() && !this.f17199m) {
                        this.f17199m = true;
                        m16725a(mo3477b(this.f17198l));
                        return;
                    }
                    return;
                }
            } else if (!z) {
                if (this.f17199m && !this.f17200n) {
                    this.f17200n = true;
                    mo1167a();
                    return;
                }
            } else {
                return;
            }
            m16730b();
        }
    }

    final void m16730b() {
        this.f17197k.removeCallbacksAndMessages(null);
        if (!this.f17199m) {
            this.f17199m = true;
            m16725a(mo3478c(this.f17198l));
        }
    }

    private final void m16725a(boolean z) {
        if (!z && !this.f5950x) {
            m5802b(null);
        }
    }

    final void mo3475c() {
        super.mo3475c();
        for (C3328c a : this.f17195i) {
            a.mo3470a();
        }
        this.f17195i.clear();
    }
}
