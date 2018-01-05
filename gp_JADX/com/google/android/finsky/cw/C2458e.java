package com.google.android.finsky.cw;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.bg.C1613m;

public final class C2458e {
    public int f13271a = -1;
    public String f13272b = null;
    public String f13273c = null;
    public long f13274d;
    public int f13275e;

    public C2458e(C2458e c2458e) {
        this.f13271a = c2458e.f13271a;
        this.f13272b = c2458e.f13272b;
        this.f13273c = c2458e.f13273c;
        this.f13274d = c2458e.f13274d;
        this.f13275e = c2458e.f13275e;
    }

    public final void m13161a() {
        this.f13271a = -1;
        this.f13272b = null;
        this.f13273c = null;
        this.f13274d = 0;
    }

    public final String m13160a(Context context) {
        Resources resources = context.getResources();
        String a = this.f13274d > 0 ? C1613m.m9289a(this.f13274d, resources) : null;
        if (this.f13271a == -1) {
            return this.f13272b;
        }
        if (this.f13272b == null && a == null) {
            return resources.getString(this.f13271a);
        }
        if (this.f13272b == null) {
            return resources.getString(this.f13271a, new Object[]{a});
        } else if (a == null) {
            return resources.getString(this.f13271a, new Object[]{this.f13272b});
        } else {
            return resources.getString(this.f13271a, new Object[]{this.f13272b, a});
        }
    }
}
