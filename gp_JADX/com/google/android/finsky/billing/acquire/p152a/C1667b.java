package com.google.android.finsky.billing.acquire.p152a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.acquire.C1348d;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.i;
import com.squareup.leakcanary.C7582R;

public final class C1667b extends C1666l {
    public C2798j f8680a;
    public C1612l f8681b;
    public final i f8682c;
    public final C2793j f8683d;

    public C1667b(LayoutInflater layoutInflater, i iVar, C2793j c2793j) {
        super(layoutInflater);
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1722a(this);
        this.f8682c = iVar;
        this.f8683d = c2793j;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        bd bdVar;
        TextView textView;
        int i;
        int i2;
        if (this.f8682c.b == null) {
            bdVar = null;
        } else {
            bdVar = this.f8682c.b.b;
        }
        if (bdVar != null) {
            View view2 = (FifeImageView) view.findViewById(C7582R.id.application_icon);
            this.f8681b.m9287a((FifeImageView) view2, bdVar, -1);
            C2798j.m14898a(this.f8682c.b.c, view2, c2797e);
        }
        this.f8680a.m14904a(this.f8682c.c, (TextView) view.findViewById(C7582R.id.item_title), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.d, (TextView) view.findViewById(C7582R.id.item_subtitle), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.e, (TextView) view.findViewById(C7582R.id.instrument), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.f, (TextView) view.findViewById(C7582R.id.item_price), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.g, (TextView) view.findViewById(C7582R.id.price_byline), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.h, (TextView) view.findViewById(C7582R.id.price_byline_2), c2797e, new Object[0]);
        this.f8680a.m14904a(this.f8682c.i, (TextView) view.findViewById(C7582R.id.instrument_error_message), c2797e, new Object[0]);
        if (this.f8682c.e != null) {
            textView = (TextView) view.findViewById(C7582R.id.instrument);
            i = C7582R.drawable.ic_expand_more_18px;
            i2 = C7582R.drawable.ic_expand_less_18px;
        } else {
            textView = (TextView) view.findViewById(C7582R.id.item_price);
            i = C7582R.drawable.ic_menu_expander_minimized_light;
            i2 = C7582R.drawable.ic_menu_expander_maximized_light;
        }
        C2798j.m14894a(textView, view, i2, this.f8682c.j, i, this.f8682c.k, this.f8683d);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_cart_header;
    }
}
