package com.google.android.finsky.billing.myaccount;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.av;
import com.google.wireless.android.finsky.dfe.c.a.bh;
import com.squareup.leakcanary.C7582R;

final class C2034x extends C1155g implements ac {
    public final TextView f10493t = ((TextView) this.a.findViewById(C7582R.id.title));
    public final TextView f10494u = ((TextView) this.a.findViewById(C7582R.id.subtitle));
    public final FifeImageView f10495v = ((FifeImageView) this.a.findViewById(C7582R.id.icon_start));
    public final FifeImageView f10496w = ((FifeImageView) this.a.findViewById(C7582R.id.icon_end));
    public final /* synthetic */ C2033w f10497x;

    C2034x(C2033w c2033w, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f10497x = c2033w;
        super(layoutInflater.inflate(C7582R.layout.customer_selectable_row, viewGroup, false));
    }

    public final void mo2573a(ab abVar, ad adVar, C2495w c2495w) {
        av avVar;
        boolean z;
        boolean z2 = true;
        C2033w.m10717a(abVar, adVar);
        bh bhVar = abVar.f10175a;
        if (bhVar.a == 0) {
            avVar = bhVar.d;
        } else {
            avVar = null;
        }
        if ((avVar.a & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10493t.setVisibility(0);
            ae.m9217a(this.f10493t, avVar.b);
        } else {
            this.f10493t.setVisibility(8);
        }
        if ((avVar.a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10494u.setVisibility(0);
            ae.m9217a(this.f10494u, avVar.c);
        } else {
            this.f10494u.setVisibility(8);
        }
        if (avVar.d != null) {
            this.f10495v.setVisibility(0);
            this.f10497x.f10487e.m9287a(this.f10495v, avVar.d, -1);
            if ((avVar.a & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f10495v.setContentDescription(avVar.g);
            }
        } else {
            this.f10495v.setVisibility(8);
        }
        if (avVar.e != null) {
            this.f10496w.setVisibility(0);
            this.f10497x.f10487e.m9287a(this.f10496w, avVar.e, -1);
            if ((avVar.a & 8) == 0) {
                z2 = false;
            }
            if (z2) {
                this.f10496w.setContentDescription(avVar.h);
            }
        } else {
            this.f10496w.setVisibility(8);
        }
        if (avVar.f != null) {
            this.a.setOnClickListener(new C2035y(this, abVar, adVar, c2495w, avVar));
            return;
        }
        this.a.setOnClickListener(null);
        this.a.setClickable(false);
    }
}
