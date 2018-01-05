package com.google.android.finsky.stream.controllers.emptycluster;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C3143h;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.emptycluster.view.C4387a;
import com.google.android.finsky.stream.controllers.emptycluster.view.EmptyClusterView;
import com.google.android.finsky.utils.C4685p;
import com.google.android.play.utils.c;
import com.squareup.leakcanary.C7582R;

public final class C4386a extends C4250b {
    public C4387a f22259a;

    public C4386a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.empty_cluster;
    }

    public final void mo1510a(View view, int i) {
        EmptyClusterView emptyClusterView = (EmptyClusterView) view;
        Document document = this.g.f14908a;
        if (this.f22259a == null) {
            String str;
            if (document.aS()) {
                str = document.bg().f12932k.f12139b;
            } else {
                str = null;
            }
            bd a = c.a(document.f14885a, 4);
            C4387a c4387a = new C4387a();
            c4387a.f22266a = str;
            c4387a.f22267b = a;
            c4387a.f22268c = document.f14885a.f12099f;
            c4387a.f22269d = document.f14885a.f12100g;
            c4387a.f22270e = document.f14885a.f12101h;
            c4387a.f22271f = document.f14885a.f12087D;
            this.f22259a = c4387a;
        }
        C4387a c4387a2 = this.f22259a;
        emptyClusterView.f22264e = this.h;
        C2482j.m13285a(emptyClusterView.getPlayStoreUiElement(), c4387a2.f22271f);
        C3143h c3143h = new C3143h();
        c3143h.f16261b = c4387a2.f22269d;
        c3143h.f16262c = c4387a2.f22270e;
        c3143h.f16260a = c4387a2.f22268c;
        View view2 = emptyClusterView.f22261b;
        view2.f16184u = null;
        Context context = view2.getContext();
        Integer valueOf = Integer.valueOf(c3143h.f16266g);
        bd bdVar = c3143h.f16263d;
        if (bdVar != null) {
            view2.f16165b.m9288a(view2.f16167d, bdVar.f11860f, bdVar.f11863i);
            if (valueOf.intValue() == -1) {
                valueOf = Integer.valueOf(C1608h.m9243a(context, c3143h.f16260a));
            }
            view2.f16167d.setVisibility(0);
        } else if (c3143h.f16264e > 0) {
            if (c3143h.f16265f == -1) {
                view2.f16167d.setImageResource(c3143h.f16264e);
            } else {
                Drawable mutate = C0259a.m1526e(C0216d.m1112a(context, c3143h.f16264e)).mutate();
                C0259a.m1514a(mutate, c3143h.f16265f);
                view2.f16167d.setImageDrawable(mutate);
            }
            view2.f16167d.setVisibility(0);
        } else {
            view2.f16167d.setVisibility(8);
        }
        LayoutParams layoutParams;
        if (view2.f16167d.getVisibility() != 0 || valueOf.intValue() == -1) {
            view2.f16167d.setBackgroundPaintColor(-1);
            view2.f16167d.setScaleType(ScaleType.FIT_CENTER);
            layoutParams = view2.f16167d.getLayoutParams();
            layoutParams.height = view2.f16176m;
            layoutParams.width = view2.f16176m;
        } else {
            view2.f16167d.setBackgroundPaintColor(valueOf.intValue());
            layoutParams = view2.f16167d.getLayoutParams();
            layoutParams.height = view2.f16177n;
            layoutParams.width = view2.f16177n;
            if (c3143h.f16264e > 0) {
                view2.f16167d.setScaleType(ScaleType.CENTER);
            }
        }
        if (TextUtils.isEmpty(c3143h.f16267h)) {
            view2.f16169f.setVisibility(8);
        } else {
            view2.f16169f.setText(c3143h.f16267h);
            Drawable background = view2.f16169f.getBackground();
            if (background != null) {
                C0259a.m1514a(background, Integer.valueOf(C0216d.m1116c(view2.getContext(), C7582R.color.ad_badge_cluster_color)).intValue());
            }
            view2.f16169f.setVisibility(0);
        }
        view2.f16171h.setText(c3143h.f16261b);
        if (TextUtils.isEmpty(c3143h.f16262c)) {
            view2.f16172i.setVisibility(8);
        } else {
            view2.f16172i.setText(C4685p.m21831a(c3143h.f16262c));
            view2.f16172i.setVisibility(0);
        }
        view2.f16180q = null;
        view2.f16173j.setVisibility(8);
        ai.m1823a(view2, view2.f16182s, c3143h.f16268i ? view2.f16175l : view2.f16181r, view2.f16183t, view2.getPaddingBottom());
        Object obj = c4387a2.f22266a;
        if (TextUtils.isEmpty(obj)) {
            emptyClusterView.f22263d.setVisibility(8);
        } else {
            emptyClusterView.f22263d.setText(C4685p.m21831a(obj));
            emptyClusterView.f22263d.setVisibility(0);
        }
        bd bdVar2 = c4387a2.f22267b;
        if (bdVar2 != null) {
            emptyClusterView.f22260a.m9288a(emptyClusterView.f22262c, bdVar2.f11860f, bdVar2.f11863i);
            emptyClusterView.f22262c.setVisibility(0);
        } else {
            emptyClusterView.f22262c.setVisibility(8);
        }
        this.h.mo1219a(emptyClusterView);
    }

    public final void mo1511b(View view, int i) {
        ((EmptyClusterView) view).Z_();
    }
}
