package com.google.android.finsky.billing.acquire.p152a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.acquire.C1348d;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.x;
import com.squareup.leakcanary.C7582R;

public final class C1676i extends C1666l {
    public C2798j f8697a;
    public final x f8698b;
    public TextView f8699c;
    public FifeImageView f8700d;

    public C1676i(LayoutInflater layoutInflater, x xVar) {
        super(layoutInflater);
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1724a(this);
        this.f8698b = xVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        this.f8697a.m14902a(this.f8698b.a, (ImageView) view.findViewById(C7582R.id.icon), c2797e);
        this.f8697a.m14904a(this.f8698b.b, (TextView) view.findViewById(C7582R.id.title), c2797e, new Object[0]);
        this.f8699c = (TextView) view.findViewById(C7582R.id.description);
        this.f8697a.m14904a(this.f8698b.c, (TextView) view.findViewById(C7582R.id.description), c2797e, new Object[0]);
        this.f8699c.setVisibility(8);
        this.f8700d = (FifeImageView) view.findViewById(C7582R.id.caret);
        this.f8697a.m14902a(this.f8698b.d, this.f8700d, c2797e);
        if (this.f8698b.c != null) {
            view.setOnClickListener(new C1677j(this, c2797e));
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_permission;
    }
}
