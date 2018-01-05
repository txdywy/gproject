package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.frameworkviews.FlowLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.bz;
import com.google.wireless.android.finsky.dfe.c.a.ca;
import com.squareup.leakcanary.C7582R;

public final class C2773o extends C1666l {
    public C2798j f15053a;
    public final bz f15054b;

    public C2773o(LayoutInflater layoutInflater, bz bzVar) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1826a(this);
        this.f15054b = bzVar;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        FlowLayout flowLayout = (FlowLayout) view;
        C2798j.m14896a(this.f15054b.b, flowLayout);
        if (this.f15054b.a != null) {
            for (ca caVar : this.f15054b.a) {
                View inflate = this.f.inflate(C7582R.layout.viewcomponent_horizontal_item, flowLayout, false);
                this.f15053a.m14902a(caVar.b, (FifeImageView) inflate.findViewById(C7582R.id.image), c2797e);
                this.f15053a.m14904a(caVar.c, (TextView) inflate.findViewById(C7582R.id.label), c2797e, new Object[0]);
                C2798j.m14898a(caVar.d, inflate, c2797e);
                flowLayout.addView(inflate);
            }
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_horizontal_group_list;
    }
}
