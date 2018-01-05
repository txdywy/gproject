package com.google.android.finsky.stream.controllers.warmwelcome;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.lu;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.warmwelcome.view.C4523b;
import com.google.android.finsky.stream.controllers.warmwelcome.view.C4525a;
import com.google.android.finsky.stream.controllers.warmwelcome.view.C4526c;
import com.google.android.finsky.stream.controllers.warmwelcome.view.WarmWelcomeCard;
import com.google.android.finsky.stream.controllers.warmwelcome.view.WarmWelcomeCardButton;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4524a extends C4250b implements C4523b {
    public final C4808a f23140a;
    public C4525a f23141b;
    public lu f23142o;
    public Document f23143p;
    public boolean f23144q;
    public int f23145r;
    public int f23146s;

    public C4524a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f23140a = c4808a;
    }

    public final void mo4050a(C2720j c2720j) {
        int i;
        boolean z;
        int i2 = 0;
        super.mo4050a(c2720j);
        Resources resources = this.e.getResources();
        int integer = resources.getInteger(C7582R.integer.warm_welcome_card_columns);
        this.f23143p = c2720j.f14908a;
        Document document = this.f23143p;
        this.f23142o = document.aV() ? document.bg().f12930i : null;
        if (integer == 1) {
            i = C7582R.layout.warm_welcome_card_single_column;
        } else {
            i = C7582R.layout.warm_welcome_card_double_column;
        }
        this.f23145r = i;
        if (integer != 1 || resources.getBoolean(C7582R.bool.play_warm_welcome_single_column_shows_graphic)) {
            z = false;
        } else {
            z = true;
        }
        this.f23144q = z;
        if (!this.f23140a.m22588a(this.g.f14908a.f14885a.f12096c)) {
            i2 = 1;
        }
        this.f23146s = i2;
    }

    public final int mo1508a() {
        return this.f23146s;
    }

    public final int mo1509a(int i) {
        return this.f23145r;
    }

    public final void mo1510a(View view, int i) {
        C4525a c4525a;
        int i2;
        if (this.f23141b == null) {
            bd bdVar;
            List c = this.f23143p.m14644c(4);
            if (c == null || c.isEmpty()) {
                bdVar = null;
            } else {
                bdVar = (bd) c.get(0);
            }
            c4525a = new C4525a();
            cv cvVar = this.f23143p.f14885a;
            c4525a.f23165a = this.f23143p.f14885a.f12100g;
            c4525a.f23166b = this.f23143p.m14612A();
            c4525a.f23167c = this.f23143p.f14885a.f12099f;
            c4525a.f23168d = this.f23143p.f14885a.f12087D;
            boolean z = (c4525a.f23167c == 0 || c4525a.f23167c == 9) ? false : true;
            c4525a.f23169e = z;
            c4525a.f23171g = this.k;
            if (this.f23144q) {
                bdVar = null;
            }
            c4525a.f23170f = bdVar;
            c4525a.f23172h = new C4526c[this.f23142o.f13062b.length];
            for (int i3 = 0; i3 < this.f23142o.f13062b.length; i3++) {
                ah ahVar = this.f23142o.f13062b[i3];
                C4526c c4526c = new C4526c();
                c4526c.f23173a = ahVar.f11791d;
                c4526c.f23174b = ahVar.f11792e;
                c4526c.f23175c = ahVar.f11790c == 1;
                c4526c.f23176d = i3;
                c4525a.f23172h[i3] = c4526c;
            }
            this.f23141b = c4525a;
        }
        WarmWelcomeCard warmWelcomeCard = (WarmWelcomeCard) view;
        c4525a = this.f23141b;
        ad adVar = this.h;
        ai.m1823a(warmWelcomeCard, c4525a.f23171g, 0, c4525a.f23171g, 0);
        warmWelcomeCard.f23148b.setText(c4525a.f23165a);
        warmWelcomeCard.f23149c.setText(c4525a.f23166b);
        if (c4525a.f23170f != null) {
            warmWelcomeCard.f23150d.setVisibility(0);
            warmWelcomeCard.f23147a.m9288a(warmWelcomeCard.f23151e, c4525a.f23170f.f11860f, c4525a.f23170f.f11863i);
            if (c4525a.f23169e) {
                warmWelcomeCard.f23150d.setBackgroundColor(C1608h.m9243a(warmWelcomeCard.getContext(), c4525a.f23167c));
            } else {
                warmWelcomeCard.f23150d.setBackgroundDrawable(null);
            }
        } else {
            warmWelcomeCard.f23150d.setVisibility(8);
        }
        if (c4525a.f23170f == null || c4525a.f23169e || !warmWelcomeCard.f23155i) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ai.m1823a(warmWelcomeCard.f23148b, ai.f1848a.mo401l(warmWelcomeCard.f23148b), i2 != 0 ? 0 : warmWelcomeCard.f23156j, ai.f1848a.mo402m(warmWelcomeCard.f23148b), warmWelcomeCard.f23148b.getPaddingBottom());
        warmWelcomeCard.f23157k = C2482j.m13283a(516);
        C2482j.m13285a(warmWelcomeCard.f23157k, c4525a.f23168d);
        warmWelcomeCard.f23158l = adVar;
        int i4 = 0;
        while (i4 < c4525a.f23172h.length) {
            WarmWelcomeCardButton warmWelcomeCardButton;
            c4526c = c4525a.f23172h[i4];
            if ((i4 == 0 ? 1 : 0) != 0) {
                warmWelcomeCardButton = warmWelcomeCard.f23152f;
            } else {
                warmWelcomeCardButton = warmWelcomeCard.f23153g;
                warmWelcomeCard.f23154h.setVisibility(0);
                warmWelcomeCard.f23153g.setVisibility(0);
            }
            warmWelcomeCardButton.f23161d = c4526c;
            warmWelcomeCardButton.f23164g = warmWelcomeCard;
            warmWelcomeCardButton.f23160b = this;
            warmWelcomeCardButton.setOnClickListener(warmWelcomeCardButton);
            warmWelcomeCardButton.f23163f.setText(c4526c.f23173a);
            if (c4526c.f23174b != null) {
                warmWelcomeCardButton.f23159a.m9288a(warmWelcomeCardButton.f23162e, c4526c.f23174b.f11860f, c4526c.f23174b.f11863i);
                warmWelcomeCardButton.f23162e.setVisibility(0);
            } else {
                warmWelcomeCardButton.f23162e.setVisibility(8);
            }
            warmWelcomeCardButton.setContentDescription(c4526c.f23173a);
            warmWelcomeCard.m21103b();
            i4++;
        }
        if (c4525a.f23172h.length < 2) {
            warmWelcomeCard.f23154h.setVisibility(8);
            warmWelcomeCard.f23153g.setVisibility(8);
            warmWelcomeCard.m21103b();
        }
        this.h.mo1219a((ad) view);
    }

    public final void mo1511b(View view, int i) {
        ((ae) view).Z_();
    }

    public final void mo4256a(C4526c c4526c, ad adVar, int i) {
        ah ahVar = this.f23142o.f13062b[c4526c.f23176d];
        int i2 = ahVar.f11790c == 1 ? 1 : 0;
        this.i.m13379b(new C2475d(adVar).m13256a(i));
        this.f.mo3638a(ahVar, this.i);
        if (i2 != 0) {
            this.f23140a.m22589b(this.f23143p.f14885a.f12096c);
            this.f23146s = 0;
            this.C.mo4088b(this, 0, 1);
        }
    }
}
