package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.gs;
import com.google.android.finsky.detailspage.TextModule.DetailsExtraPrimary;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

public final class C3719q implements OnClickListener {
    public final /* synthetic */ gs f18806a = null;
    public final /* synthetic */ C3748a f18807b;
    public final /* synthetic */ DetailsExtraPrimary f18808c;
    public final /* synthetic */ int f18809d;
    public final /* synthetic */ ad f18810e;
    public final /* synthetic */ C2495w f18811f;

    public C3719q(C3748a c3748a, DetailsExtraPrimary detailsExtraPrimary, int i, ad adVar, C2495w c2495w) {
        this.f18807b = c3748a;
        this.f18808c = detailsExtraPrimary;
        this.f18809d = i;
        this.f18810e = adVar;
        this.f18811f = c2495w;
    }

    public final void onClick(View view) {
        if (this.f18806a != null) {
            this.f18806a.m6682a();
        }
        this.f18807b.mo3673a(this.f18808c.f14116c, this.f18808c.f14114a, this.f18809d, 0, C1473m.f7980a.dn(), this.f18810e, this.f18811f);
    }
}
