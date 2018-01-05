package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public abstract class C4321c extends C4250b implements ad, C4320e {
    public boolean f21797a = false;

    public C4321c(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        if (c2495w == null) {
            FinskyLog.m21669e("Logging context is not set.", new Object[0]);
        }
    }

    protected abstract int mo4124b();

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        C4323d.m20084a().f21799b.add(this);
    }

    public final int mo1508a() {
        return m20073d() ? 2 : 0;
    }

    public final int mo1509a(int i) {
        if (i == 1) {
            return C7582R.layout.vertical_spacer;
        }
        return mo4124b();
    }

    public final void mo1510a(View view, int i) {
        if (i == 1) {
            view.setMinimumHeight(this.e.getResources().getDimensionPixelSize(C7582R.dimen.play_card_myapps_cluster_padding_top));
            return;
        }
        C4323d.m20084a().f21800c.mo4116a(view);
        if (this.h != null) {
            this.h.mo1219a(this);
        }
    }

    public final void mo1511b(View view, int i) {
    }

    public final void mo4061q() {
        C4323d a = C4323d.m20084a();
        a.f21799b.remove(this);
        if (a.f21799b.isEmpty()) {
            a.f21800c.mo4120d();
            C4323d.f21798a = null;
        }
    }

    private final boolean m20073d() {
        this.f21797a = mo4124b() != 0;
        return this.f21797a;
    }

    public final void mo4123c() {
        boolean z = this.f21797a;
        boolean d = m20073d();
        if (d) {
            C4323d a = C4323d.m20084a();
            C2495w c2495w = this.i;
            if (c2495w == null) {
                FinskyLog.m21669e("activeLoggingContext is null", new Object[0]);
            }
            a.f21801d = c2495w;
            a = C4323d.m20084a();
            if (this == null) {
                FinskyLog.m21669e("activeParentNode is null", new Object[0]);
            }
            a.f21802e = this;
        }
        if (z && d) {
            this.C.mo4087a(this, 0, 1, false);
        } else if (z && !d) {
            this.C.mo4088b(this, 0, 2);
        } else if (!z && d) {
            this.C.mo4086a(this, 0, 2);
        }
    }

    public ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
