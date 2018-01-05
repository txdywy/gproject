package com.google.android.finsky.datasync.p180a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.datasync.C2502q;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import java.util.List;

abstract class C2503a implements C2502q {
    public long f13474a;
    public final List f13475b;
    public final List f13476c;
    public final C2531s f13477d;
    public final C1461c f13478e;
    public final ai f13479f;

    C2503a(List list, List list2, long j, C2531s c2531s, C1461c c1461c, ai aiVar) {
        this.f13475b = list;
        this.f13476c = list2;
        this.f13477d = c2531s;
        this.f13478e = c1461c;
        this.f13479f = aiVar;
        this.f13474a = j;
    }

    protected abstract void mo2923a(String str);

    protected final boolean m13411d() {
        return C4678i.m21812a() > this.f13474a;
    }

    protected final boolean m13412e() {
        C1552e dj = this.f13478e.dj();
        boolean z = dj.mo2294a(12632809) || dj.mo2294a(12632810) || dj.mo2294a(12632807);
        Boolean a = this.f13479f.m21696a();
        if (z || ((a != null && a.booleanValue()) || this.f13479f.m21697b() >= ((Integer) C0955b.dy.m28964b()).intValue())) {
            if (dj.mo2294a(12632808) || dj.mo2294a(12632810) || dj.mo2294a(12632807)) {
                z = true;
            } else {
                z = false;
            }
            if (z || !this.f13479f.m21698c()) {
                return true;
            }
            FinskyLog.m21662b("[Cache and Sync] task should not be running on interactive device.", new Object[0]);
            this.f13477d.m13481a(this.f13475b, 1625);
            return false;
        }
        FinskyLog.m21662b("[Cache and Sync] task should not be running on low battery.", new Object[0]);
        this.f13477d.m13481a(this.f13475b, 1624);
        return false;
    }

    protected final void m13413f() {
        if (this.f13476c != null) {
            for (String a : this.f13476c) {
                mo2923a(a);
            }
        }
    }
}
