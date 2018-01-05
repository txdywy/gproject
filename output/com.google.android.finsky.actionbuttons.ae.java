package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.a.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ds.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.s;
import com.google.android.finsky.frameworkviews.t;
import java.util.List;

public final class com.google.android.finsky.actionbuttons.ae extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;
    public final com.google.android.finsky.ds.b g;
    public final com.google.android.finsky.ba.c h;
    public final Intent i;
    public com.google.android.finsky.actionbuttons.ag j;

    ae(Context p0, int p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.ad p3, Document p4, com.google.android.finsky.ds.b p5, com.google.android.finsky.ba.c p6, Intent p7) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p2, p3);
        this.f = p4;
        this.g = p5;
        this.h = p6;
        this.i = p7;
    }

    public static com.google.android.finsky.frameworkviews.s a(PlayActionButtonV2 p0, String p1) {
        v0 = (TextView)LayoutInflater.from(p0.getContext()).inflate(2130969011, 0);
        v0.setText(p1);
        v1 = new com.google.android.finsky.frameworkviews.s(v0, p0);
        v1.d.E = 1;
        return v1;
    }

    public static String a(com.google.android.finsky.ba.e p0, Context p1) {
        v0 = 0;
        if (p0.a(12637095))
            v0 = p1.getString(2131952330);
        else if (p0.a(12637096))
            v0 = p1.getString(2131952331);
        else if (p0.a(12637097))
            v0 = p1.getString(2131952332);
        else if (p0.a(12637098))
            v0 = p1.getString(2131952333);
        else if (p0.a(12637099))
            v0 = p1.getString(2131952334);
        else if (p0.a(12637100))
            v0 = p1.getString(2131952335);
        return v0;
    }

    private final boolean d() {
        v0 = 1;
        if (this.f.z().i != 1 || !this.h.dj().a(12643764))
            v0 = 0;
        return v0;
    }

    public final int a() {
        return 2943;
    }

    public final void a(PlayActionButtonV2 p0) {
        if (this.d())
            v0 = this.a.getString(2131952326);
        else
            v0 = this.a.getString(2131952327);
        p0.setContentDescription(v0);
        if (this.d())
            v0 = this.a.getString(2131952328);
        else
            v0 = this.a.getString(2131952329);
        p0.a(this.f.a.f, v0, this);
        if (this.h.dj().a(12637101))
            com.google.android.finsky.actionbuttons.p.a(p0, android.support.v4.a.d.a(this.a, 2130837733));
        if (this.g.c(this.f.N().k))
            p0.setEnabled(0);
        else if (!this.h.dj().a(12637094)) {
            v0 = com.google.android.finsky.actionbuttons.ae.a(this.h.dj(), this.a);
            if (v0 != 0)
                p0.getViewTreeObserver().addOnGlobalLayoutListener(new com.google.android.finsky.actionbuttons.af(this, p0, v0));
        }
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        if (this.i != 0 && !this.a.getPackageManager().queryIntentActivities(this.i, 131072).isEmpty())
            this.a.startActivity(this.i);
    }

}
