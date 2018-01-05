package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class C4423c extends C1137h {
    public C2720j f22484c;
    public final LayoutInflater f22485d;
    public final C3748a f22486e;
    public ad f22487f;
    public final C2495w f22488g;
    public final ao f22489h;

    public C4423c(Context context, C3748a c3748a, C2495w c2495w, ao aoVar) {
        this.f22485d = LayoutInflater.from(context);
        this.f22486e = c3748a;
        this.f22488g = c2495w;
        this.f22489h = aoVar;
    }

    public final int mo1040a(int i) {
        if (i != this.f22484c.m14698m()) {
            return C7582R.layout.flat_card_listing;
        }
        if (this.f22484c.f14901t) {
            return C7582R.layout.loading_footer;
        }
        return C7582R.layout.inline_top_charts_padding_footer;
    }

    public final int mo1039a() {
        return this.f22484c != null ? this.f22484c.m14698m() + 1 : 0;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C4424d c4424d = (C4424d) frVar;
        if (c4424d.f3216f == C7582R.layout.flat_card_listing) {
            this.f22489h.m18517a((d) c4424d.a, (Document) this.f22484c.m14679a(i, true), this.f22484c.f14908a.f14885a.f12096c, this.f22486e, this.f22487f, this.f22484c.m14692c(i), this.f22488g);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C4424d(this.f22485d.inflate(i, viewGroup, false));
    }
}
