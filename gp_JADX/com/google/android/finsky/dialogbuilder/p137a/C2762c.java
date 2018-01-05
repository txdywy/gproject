package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.bo;
import com.squareup.leakcanary.C7582R;

public final class C2762c extends C1666l {
    public C2798j f15026a;
    public final bo f15027b;

    public C2762c(LayoutInflater layoutInflater, bo boVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1821a(this);
        this.f15027b = boVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        this.f15026a.m14901a(this.f15027b.a, (Button) view, c2797e);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_button;
    }
}
