package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.q;
import com.google.android.finsky.at.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;

public final class com.google.android.finsky.bc.f extends com.google.android.finsky.bc.v
{

    public com.google.android.finsky.bg.l a;

    f() {
        com.google.android.finsky.bc.v();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        v2 = this.ag.b();
        if (v2 != 0)
            this.a.a((FifeImageView)v1.findViewById(2131755797), v2.f, v2.i);
        this.a(v1, 2131755798, 5);
        this.a(v1, 2131755799, 6);
        ((ImageView)v1.findViewById(2131755800)).setImageDrawable(com.caverock.androidsvg.q.a(this.i(), 2131361820, new com.caverock.androidsvg.as()));
        this.a(v1, 2131755801, 20);
        return v1;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
        super.a(p0);
    }

    protected final int aj() {
        return 2130968848;
    }

    public final boolean am() {
        v1 = this.ag.a(22);
        if (TextUtils.isEmpty(v1))
            this.aq();
        else
            new com.google.android.finsky.at.k().c(this.ag.a(17)).a(v1).d(2131951947).e(2131952134).a(this, 1, 0).a().a(this.B, "FamilyLibraryStep1.confirmDialog");
        return 1;
    }

    protected final void ao() {
        v1 = new com.google.android.finsky.bc.g();
        v1.al = this.al;
        this.al.e.d().a(v1, 1);
    }

    protected final int ap() {
        return 5228;
    }

    public final void b(int p0, Bundle p1) {
        this.aq();
    }

}
