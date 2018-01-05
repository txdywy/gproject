package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.cd;
import com.squareup.leakcanary.C7582R;

public final class C2775q extends C1666l {
    public C2798j f15055a;
    public final cd f15056b;

    public C2775q(LayoutInflater layoutInflater, cd cdVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1827a(this);
        this.f15056b = cdVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        this.f15055a.m14902a(this.f15056b.a, (ImageView) view.findViewById(C7582R.id.start_icon), c2797e);
        this.f15055a.m14902a(this.f15056b.c, (ImageView) view.findViewById(C7582R.id.end_icon), c2797e);
        this.f15055a.m14902a(this.f15056b.b, (ImageView) view.findViewById(C7582R.id.top_icon), c2797e);
        this.f15055a.m14902a(this.f15056b.d, (ImageView) view.findViewById(C7582R.id.bottom_icon), c2797e);
        this.f15055a.m14904a(this.f15056b.e, (TextView) view.findViewById(C7582R.id.text_view), c2797e, new Object[0]);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_icontext;
    }
}
