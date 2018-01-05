package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.dialogbuilder.C2797e;

public abstract class C1666l {
    public final LayoutInflater f8679f;

    public C1666l(LayoutInflater layoutInflater) {
        this.f8679f = layoutInflater;
    }

    public abstract int mo2377a();

    public abstract void mo2378a(C2797e c2797e, View view);

    public View mo2383a(C2797e c2797e, ViewGroup viewGroup) {
        View inflate = this.f8679f.inflate(mo2377a(), viewGroup, false);
        mo2378a(c2797e, inflate);
        return inflate;
    }
}
