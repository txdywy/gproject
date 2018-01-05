package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.providers.d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.h.a.c;
import com.google.wireless.android.finsky.dfe.h.a.d;

protected final class com.google.android.finsky.bc.e extends com.google.android.finsky.bc.v implements View$OnClickListener, com.google.android.play.utils.m
{

    public com.google.android.finsky.bg.l a;

    e() {
        com.google.android.finsky.bc.v();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v3 = super.a(p0, p1, p2);
        v4 = this.ag.c();
        ((TextView)v3.findViewById(2131755822)).setText(v4.d);
        com.google.android.finsky.bg.ae.a((TextView)v3.findViewById(2131755823), v4.f, this);
        ((TextView)v3.findViewById(2131755792)).setText(v4.g);
        v0 = (ViewGroup)v3.findViewById(2131755771);
        v2 = 0;
        while (v2 < v4.e.length) {
            v8 = p0.inflate(2130968836, v0, 0);
            this.a.a((FifeImageView)v8.findViewById(2131755768), v4.e[v2].e.f, v4.e[v2].e.i);
            ((TextView)v8.findViewById(2131755769)).setText(v4.e[v2].c);
            ((TextView)v8.findViewById(2131755770)).setText(v4.e[v2].d);
            v0.addView(v8);
            v2 = v2 + 1;
        }
        ((com.google.android.finsky.bc.s)this.h()).a(v3, v4, this);
        return v3;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
        super.a(p0);
    }

    public final void a(View p0, String p1) {
        ((com.google.android.finsky.bc.s)this.h()).C();
    }

    protected final int aj() {
        return 2130968857;
    }

    protected final void ao() {
        this.ag.d().b();
    }

    protected final int ap() {
        return 5227;
    }

}
