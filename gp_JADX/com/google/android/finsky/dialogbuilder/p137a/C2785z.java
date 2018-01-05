package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.cs;
import com.squareup.leakcanary.C7582R;

public final class C2785z extends C1666l {
    public C2798j f15076a;
    public final cs f15077b;

    public C2785z(LayoutInflater layoutInflater, cs csVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1832a(this);
        this.f15077b = csVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        this.f15076a.m14904a(this.f15077b.a, (TextView) view.findViewById(C7582R.id.title), c2797e, new Object[0]);
        this.f15076a.m14904a(this.f15077b.b, (TextView) view.findViewById(C7582R.id.price), c2797e, new Object[0]);
        this.f15076a.m14904a(this.f15077b.c, (TextView) view.findViewById(C7582R.id.description), c2797e, new Object[0]);
        this.f15076a.m14904a(this.f15077b.d, (TextView) view.findViewById(C7582R.id.full_price), c2797e, new Object[0]);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_offer;
    }
}
