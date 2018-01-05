package com.google.android.finsky.playpass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.squareup.leakcanary.C7582R;

final class C3926d extends C1047f {
    public final int f19879a;

    public C3926d(Context context, int i) {
        super(context);
        this.f19879a = i;
    }

    protected final int mo1305a() {
        return C7582R.layout.header_list_recycler_view;
    }

    protected final void mo1395a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.addView(layoutInflater.inflate(C7582R.layout.family_benefits_header_v2, viewGroup, false));
    }

    protected final int mo1440t() {
        return this.f19879a;
    }

    protected final int mo1397d() {
        return 0;
    }

    protected final boolean m18612l() {
        return true;
    }

    protected final int m18608b() {
        return C7582R.id.recycler_view;
    }

    protected final boolean mo1400j() {
        return false;
    }

    protected final float m18611k() {
        return 0.5f;
    }

    protected final int m18613m() {
        return C1608h.m9243a(this.f, 3);
    }

    protected final int m18614n() {
        return C1608h.m9243a(this.f, 3);
    }
}
