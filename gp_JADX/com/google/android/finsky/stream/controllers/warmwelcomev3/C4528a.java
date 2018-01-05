package com.google.android.finsky.stream.controllers.warmwelcomev3;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.warmwelcomev3.view.C4527a;
import com.google.android.finsky.stream.controllers.warmwelcomev3.view.C4529b;
import com.google.android.finsky.stream.controllers.warmwelcomev3.view.WarmWelcomeV3ClusterView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.C6325i;
import com.squareup.leakcanary.C7582R;

public final class C4528a extends C4250b implements C4527a {
    public C4529b f23177a;
    public int f23178b;

    public C4528a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
    }

    public final void mo4050a(C2720j c2720j) {
        int i = 0;
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        C4529b c4529b = new C4529b();
        c4529b.f23189a = document.f14885a.f12100g;
        c4529b.f23190b = document.f14885a.f12101h;
        c4529b.f23191c = document.cx().f13066b;
        c4529b.f23192d = document.f14885a.f12099f;
        c4529b.f23193e = document.m14644c(1);
        c4529b.f23194f = document.f14885a.f12087D;
        this.f23177a = c4529b;
        if (!this.e.getSharedPreferences("user_education_card", 0).getBoolean(C4528a.m21105a(this.g.f14908a.f14885a.f12096c), false)) {
            i = 1;
        }
        this.f23178b = i;
    }

    public final int mo1508a() {
        return this.f23178b;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.warm_welcome_v3_card_cluster;
    }

    public final void mo1510a(View view, int i) {
        WarmWelcomeV3ClusterView warmWelcomeV3ClusterView = (WarmWelcomeV3ClusterView) view;
        C4529b c4529b = this.f23177a;
        ad adVar = this.h;
        warmWelcomeV3ClusterView.f23180b = c4529b;
        warmWelcomeV3ClusterView.f23185g = adVar;
        warmWelcomeV3ClusterView.f23188j = this;
        warmWelcomeV3ClusterView.f23181c.setText(c4529b.f23189a);
        warmWelcomeV3ClusterView.f23182d.setText(c4529b.f23190b);
        if (c4529b.f23193e == null || c4529b.f23193e.size() == 0) {
            warmWelcomeV3ClusterView.m21115b();
            FinskyLog.m21669e("A banner image for Warm Welcome V3 card was expected.", new Object[0]);
        } else {
            warmWelcomeV3ClusterView.f23184f.setVisibility(0);
            bd bdVar = (bd) c4529b.f23193e.get(0);
            warmWelcomeV3ClusterView.f23184f.setOnLoadedListener(warmWelcomeV3ClusterView);
            warmWelcomeV3ClusterView.f23184f.a(bdVar.f11860f, bdVar.f11863i, warmWelcomeV3ClusterView.f23179a);
        }
        warmWelcomeV3ClusterView.f23183e.setText(c4529b.f23191c);
        warmWelcomeV3ClusterView.f23183e.setTextColor(C6325i.m28969a(warmWelcomeV3ClusterView.getContext(), c4529b.f23192d));
        warmWelcomeV3ClusterView.f23183e.setOnClickListener(warmWelcomeV3ClusterView);
        this.h.mo1219a(warmWelcomeV3ClusterView);
    }

    public final void mo1511b(View view, int i) {
        ((WarmWelcomeV3ClusterView) view).Z_();
    }

    public final void mo4257a(ad adVar) {
        if (!(this.g == null || this.g.f14908a == null)) {
            this.e.getSharedPreferences("user_education_card", 0).edit().putBoolean(C4528a.m21105a(this.g.f14908a.f14885a.f12096c), true).apply();
        }
        this.C.mo4088b(this, 0, 1);
        this.f23178b = 0;
        this.i.m13379b(new C2475d(adVar).m13256a(1231));
    }

    private static String m21105a(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("dismissed_by_user");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
