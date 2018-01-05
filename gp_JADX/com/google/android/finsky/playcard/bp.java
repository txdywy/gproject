package com.google.android.finsky.playcard;

import android.content.res.Resources;
import com.google.android.finsky.ed.C2973a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.i;
import com.squareup.leakcanary.C7582R;

final class bp implements i {
    public final /* synthetic */ Resources f19685a;
    public final /* synthetic */ C2495w f19686b;
    public final /* synthetic */ bl f19687c;

    bp(bl blVar, Resources resources, C2495w c2495w) {
        this.f19687c = blVar;
        this.f19685a = resources;
        this.f19686b = c2495w;
    }

    public final void m18542a(int i) {
        C2973a.m15395a(this.f19687c.f19666e.bd(), this.f19685a.getString(C7582R.string.done), this.f19686b).m625a(this.f19687c.f19668g.mo3709k().f730B, "wtaDialog");
        this.f19686b.m13379b(new C2475d(this.f19687c.f19665d).m13256a(327));
    }
}
