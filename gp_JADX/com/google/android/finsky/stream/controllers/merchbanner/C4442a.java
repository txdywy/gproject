package com.google.android.finsky.stream.controllers.merchbanner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.gd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.merchbanner.view.C4441a;
import com.google.android.finsky.stream.controllers.merchbanner.view.C4443b;
import com.google.android.finsky.stream.controllers.merchbanner.view.FlatMerchBannerView;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4442a extends C4250b implements C4441a {
    public C4443b f22550a;

    public C4442a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        C4443b c4443b = new C4443b();
        gd gdVar = document.bg().f12925d;
        c4443b.f22562a = gdVar.f12427b;
        c4443b.f22563b = gdVar.f12430e;
        c4443b.f22564c = gdVar.f12429d;
        List c = document.m14644c(20);
        if (c == null || c.get(0) == null) {
            FinskyLog.m21667d("Missing Feature Image for Cardster Merch Banner.", new Object[0]);
            c4443b.f22565d = (bd) document.m14644c(14).get(0);
        } else {
            c4443b.f22565d = (bd) c.get(0);
        }
        c4443b.f22566e = document.f14885a.f12087D;
        this.f22550a = c4443b;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_merch_banner;
    }

    public final void mo1510a(View view, int i) {
        int i2;
        FlatMerchBannerView flatMerchBannerView = (FlatMerchBannerView) view;
        C4443b c4443b = this.f22550a;
        ad adVar = this.h;
        flatMerchBannerView.f22558h = C1607g.m9236a(c4443b.f22565d, flatMerchBannerView.f22559i);
        flatMerchBannerView.getCardViewGroupDelegate().mo3864a(flatMerchBannerView, flatMerchBannerView.f22558h);
        flatMerchBannerView.f22551a.m9288a(flatMerchBannerView.f22557g, c4443b.f22565d.f11860f, c4443b.f22565d.f11863i);
        if (flatMerchBannerView.f22557g.getDrawable() != null) {
            flatMerchBannerView.m20778b();
        } else {
            flatMerchBannerView.f22557g.m16023b();
        }
        flatMerchBannerView.f22553c.setText(c4443b.f22562a);
        CharSequence charSequence = c4443b.f22563b;
        if (TextUtils.isEmpty(charSequence)) {
            flatMerchBannerView.f22554d.setVisibility(8);
            flatMerchBannerView.f22555e.setVisibility(8);
        } else {
            flatMerchBannerView.f22554d.setVisibility(0);
            flatMerchBannerView.f22554d.setText(charSequence);
            flatMerchBannerView.f22555e.setVisibility(0);
        }
        String str = c4443b.f22564c;
        if (C1607g.m9240a(flatMerchBannerView.f22558h)) {
            i2 = C7582R.color.play_banner_dark_fg;
        } else {
            i2 = C7582R.color.play_banner_light_fg;
        }
        int a = C1607g.m9238a(str, C0216d.m1116c(flatMerchBannerView.getContext(), i2));
        flatMerchBannerView.f22553c.setTextColor(a);
        flatMerchBannerView.f22554d.setTextColor(a);
        ((GradientDrawable) flatMerchBannerView.f22554d.getBackground()).setStroke(flatMerchBannerView.getResources().getDimensionPixelSize(C7582R.dimen.flat_merch_banner_button_stroke_width), a);
        flatMerchBannerView.f22556f = this;
        C2482j.m13285a(flatMerchBannerView.f22560j, c4443b.f22566e);
        flatMerchBannerView.f22561k = adVar;
        this.h.mo1219a(flatMerchBannerView);
    }

    public final void mo1511b(View view, int i) {
        ((FlatMerchBannerView) view).Z_();
    }

    public final void mo4210a(ad adVar) {
        this.f.mo3655a(this.g.f14908a, adVar, this.i);
    }
}
