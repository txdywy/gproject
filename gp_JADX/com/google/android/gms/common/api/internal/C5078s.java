package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.internal.ax;
import java.util.Map;

final class C5078s extends aa {
    public final Map f25902a;
    public final /* synthetic */ C5075p f25903b;

    public C5078s(C5075p c5075p, Map map) {
        this.f25903b = c5075p;
        super(c5075p);
        this.f25902a = map;
    }

    public final void mo4607a() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        for (C4949i c4949i : this.f25902a.keySet()) {
            if (!c4949i.mo5112m()) {
                i = 0;
                i4 = i5;
            } else if (!((C5077r) this.f25902a.get(c4949i)).f25901c) {
                i = 1;
                break;
            } else {
                i = i4;
                i4 = 1;
            }
            i5 = i4;
            i4 = i;
        }
        i2 = i5;
        i = 0;
        if (i2 != 0) {
            i3 = C5095d.m23655a(this.f25903b.f25880c);
        }
        if (i3 == 0 || (r0 == 0 && i4 == 0)) {
            if (this.f25903b.f25889l) {
                this.f25903b.f25887j.mo4512g();
            }
            for (C4949i c4949i2 : this.f25902a.keySet()) {
                ax axVar = (ax) this.f25902a.get(c4949i2);
                if (!c4949i2.mo5112m() || i3 == 0) {
                    c4949i2.mo4509a(axVar);
                } else {
                    this.f25903b.f25878a.m23392a(new C5080u(this.f25903b, axVar));
                }
            }
            return;
        }
        this.f25903b.f25878a.m23392a(new C5079t(this, this.f25903b, new ConnectionResult(i3, null)));
    }
}
