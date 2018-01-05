package com.google.android.finsky.billing.myaccount;

import android.graphics.Typeface;
import android.support.v4.widget.bg;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.wireless.android.finsky.dfe.c.a.bh;
import com.google.wireless.android.finsky.dfe.c.a.bj;
import com.squareup.leakcanary.C7582R;

final class aa extends C1155g implements ac {
    aa(ViewGroup viewGroup) {
        super(new TextView(viewGroup.getContext()));
    }

    public final void mo2573a(ab abVar, ad adVar, C2495w c2495w) {
        bj bjVar;
        C2033w.m10717a(abVar, adVar);
        bh bhVar = abVar.f10175a;
        if (bhVar.a == 1) {
            bjVar = bhVar.e;
        } else {
            bjVar = null;
        }
        TextView textView = (TextView) this.a;
        ae.m9217a(textView, bjVar.b);
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (2 == bjVar.c) {
            bg.m2221a(textView, 16974257);
            textView.setTextAlignment(4);
            textView.setBackgroundColor(-1);
            dimensionPixelSize = textView.getResources().getDimensionPixelSize(C7582R.dimen.account_country_centered_h_padding);
            dimensionPixelSize2 = textView.getResources().getDimensionPixelSize(C7582R.dimen.account_country_centered_v_padding);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            textView.setTypeface(Typeface.DEFAULT);
        } else if (1 == bjVar.c) {
            bg.m2221a(textView, 16974259);
            textView.setTextAlignment(2);
            textView.setBackgroundColor(16777215);
            dimensionPixelSize = textView.getResources().getDimensionPixelSize(C7582R.dimen.account_country_section_header_h_padding);
            dimensionPixelSize2 = textView.getResources().getDimensionPixelSize(C7582R.dimen.account_country_section_header_v_padding);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            textView.setTypeface(C2033w.f10485c);
        } else {
            bg.m2221a(textView, 16974253);
            textView.setTextAlignment(0);
            textView.setPadding(0, 0, 0, 0);
            textView.setTypeface(Typeface.DEFAULT);
        }
    }
}
