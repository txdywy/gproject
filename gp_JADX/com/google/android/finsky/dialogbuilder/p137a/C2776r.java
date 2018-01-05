package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C2776r extends C1666l {
    public C2798j f15057a;
    public C1612l f15058b;
    public final ce f15059c;

    public C2776r(LayoutInflater layoutInflater, ce ceVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1828a(this);
        this.f15059c = ceVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        if (this.f15059c.b != null) {
            View view2 = (FifeImageView) view.findViewById(C7582R.id.thumbnail_image);
            this.f15058b.m9287a((FifeImageView) view2, this.f15059c.b.b, -1);
            C2798j.m14898a(this.f15059c.b.c, view2, c2797e);
        }
        this.f15057a.m14904a(this.f15059c.c, (TextView) view.findViewById(C7582R.id.title), c2797e, new Object[0]);
        this.f15057a.m14904a(this.f15059c.d, (TextView) view.findViewById(C7582R.id.title_byline), c2797e, new Object[0]);
        this.f15057a.m14904a(this.f15059c.e, (TextView) view.findViewById(C7582R.id.message), c2797e, new Object[0]);
        if (this.f15059c.f) {
            view.findViewById(C7582R.id.check_mark).setVisibility(0);
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_complex_template;
    }
}
