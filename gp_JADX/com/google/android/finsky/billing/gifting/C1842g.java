package com.google.android.finsky.billing.gifting;

import android.content.Context;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.squareup.leakcanary.C7582R;

final class C1842g extends C1047f {
    public final /* synthetic */ C1841f f9470a;

    C1842g(C1841f c1841f, Context context) {
        this.f9470a = c1841f;
        super(context);
    }

    protected final int mo1305a() {
        return C7582R.layout.header_list_recycler_view;
    }

    protected final boolean m9907l() {
        return true;
    }

    protected final boolean mo1400j() {
        return false;
    }

    protected final int mo1397d() {
        return 0;
    }

    protected final int m9908n() {
        return C1608h.m9243a(this.f, 0);
    }

    protected final int m9903b() {
        return C7582R.id.recycler_view;
    }

    protected final int m9904c() {
        return this.f9470a.ak();
    }

    protected final int mo1440t() {
        return this.f.getResources().getDimensionPixelOffset(C7582R.dimen.play_credit_header_height);
    }
}
