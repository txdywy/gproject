package com.google.android.finsky.stream.base;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public abstract class C4250b extends C1169s {
    public final C1556d f21485c;
    public final C1611k f21486d;
    public Context f21487e;
    public C3748a f21488f;
    public C2720j f21489g;
    public ad f21490h;
    public C2495w f21491i;
    @Deprecated
    public int f21492j;
    @Deprecated
    public int f21493k;
    public int f21494l;
    public LayoutInflater f21495m = LayoutInflater.from(this.f21487e);
    public C4231e f21496n;

    public C4250b(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, boolean z) {
        this.f21487e = context;
        this.f21488f = c3748a;
        this.f21490h = adVar;
        this.f21485c = c1556d;
        this.f21486d = c1611k;
        Resources resources = this.f21487e.getResources();
        this.f21493k = c1611k.m9275a(this.f21487e.getResources());
        this.f21492j = 0;
        resources.getDimensionPixelSize(C7582R.dimen.play_card_default_inset);
        resources.getDimensionPixelSize(C7582R.dimen.play_card_default_elevation);
        if (z && c1611k.m9285j(resources)) {
            this.f21494l = resources.getInteger(C7582R.integer.flat_grid_column_count_in_details);
        } else {
            this.f21494l = c1611k.m9284i(resources);
        }
        this.f21491i = c2495w;
    }

    public void mo4050a(C2720j c2720j) {
        this.f21489g = c2720j;
    }

    public boolean mo4058f() {
        return false;
    }

    public boolean mo4059g() {
        return this.f21489g.f14901t;
    }

    public final void m19722h() {
        if (this.f21496n != null) {
            this.f21496n.mo4030a(this);
        }
    }

    public boolean mo4153i() {
        return false;
    }

    public boolean mo4179j() {
        return false;
    }
}
