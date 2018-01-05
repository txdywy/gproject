package com.google.android.finsky.billing.acquire.p152a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.acquire.C1348d;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.j;
import com.squareup.leakcanary.C7582R;

public final class C1668c extends C1666l {
    public C2798j f8684a;
    public final j f8685b;
    public final C2793j f8686c;

    public C1668c(LayoutInflater layoutInflater, j jVar, C2793j c2793j) {
        super(layoutInflater);
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1723a(this);
        this.f8685b = jVar;
        this.f8686c = c2793j;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        PlayTextView playTextView = (PlayTextView) view.findViewById(C7582R.id.voucher_title);
        if (this.f8685b.h != null) {
            this.f8684a.m14902a(this.f8685b.h, (ImageView) view.findViewById(C7582R.id.voucher_icon), c2797e);
            playTextView.setCompoundDrawables(null, null, null, null);
            playTextView.setCompoundDrawablePadding(0);
        }
        this.f8684a.m14904a(this.f8685b.b, playTextView, c2797e, new Object[0]);
        this.f8684a.m14904a(this.f8685b.c, (TextView) view.findViewById(C7582R.id.voucher_discount), c2797e, new Object[0]);
        this.f8684a.m14904a(this.f8685b.d, (TextView) view.findViewById(C7582R.id.voucher_byline), c2797e, new Object[0]);
        if (this.f8685b.d()) {
            this.f8686c.m14879a(this.f8685b.e);
        }
        if (this.f8685b.g != null) {
            view.setOnClickListener(new C1669d(this, c2797e));
            return;
        }
        if (!this.f8685b.d()) {
            int i;
            if ((this.f8685b.a & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 0) {
                return;
            }
        }
        view.setOnClickListener(new C1670e(this));
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_cart_voucher;
    }
}
