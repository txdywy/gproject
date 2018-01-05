package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.C4250b;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class cg extends C4250b {
    public final C4808a f22010a;
    public int f22011b;
    public int f22012o;

    protected int mo4176b() {
        return C7582R.layout.warm_welcome_card_single_column;
    }

    protected int mo4177c() {
        return C7582R.layout.warm_welcome_card_double_column;
    }

    public cg(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22010a = c4808a;
    }

    public final void mo4050a(C2720j c2720j) {
        int i;
        super.mo4050a(c2720j);
        Resources resources = this.e.getResources();
        int integer = resources.getInteger(C7582R.integer.warm_welcome_card_columns);
        this.f22011b = integer == 1 ? mo4176b() : mo4177c();
        if (integer == 1) {
            resources.getBoolean(C7582R.bool.play_warm_welcome_single_column_shows_graphic);
        }
        if (this.f22010a.m22588a(this.g.f14908a.f14885a.f12096c)) {
            i = 0;
        } else {
            i = 1;
        }
        this.f22012o = i;
    }

    public final int mo1508a() {
        return this.f22012o;
    }

    public final int mo1509a(int i) {
        return this.f22011b;
    }

    public final void mo1510a(View view, int i) {
        Document document = this.g.f14908a;
        List c = document.m14644c(4);
        bd bdVar = (c == null || c.isEmpty()) ? null : (bd) c.get(0);
        mo4175a(view, document, bdVar);
        ai.m1823a(view, this.k, 0, this.k, 0);
    }

    protected void mo4175a(View view, Document document, bd bdVar) {
        cv cvVar = document.f14885a;
        document.m14612A();
        cvVar = document.f14885a;
        cvVar = document.f14885a;
        throw new NoSuchMethodError();
    }

    public final void mo1511b(View view, int i) {
        ((ae) view).Z_();
    }

    protected final OnClickListener m20421a(Document document, ah ahVar, ad adVar) {
        return new ch(this, ahVar, adVar, document);
    }
}
