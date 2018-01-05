package com.google.android.finsky.stream.controllers.musicmerchbanner;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.p028a.C0216d;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ah;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.fm;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.controllers.musicmerchbanner.view.C4457a;
import com.google.android.finsky.stream.controllers.musicmerchbanner.view.C4459b;
import com.google.android.finsky.stream.controllers.musicmerchbanner.view.MusicMerchBannerView;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4458a extends C4250b implements C4457a {
    public final C4808a f22655a;
    public C4459b f22656b;
    public Document f22657o;
    public int f22658p;

    public C4458a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22655a = c4808a;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f22657o = c2720j.f14908a;
        this.f22658p = this.f22655a.m22588a(this.f22657o.f14885a.f12096c) ? 0 : 1;
        Document document = this.f22657o;
        C4459b c4459b = new C4459b();
        fm aE = document.aE();
        c4459b.f22675a = aE.f12384b;
        c4459b.f22676b = aE.f12385c;
        c4459b.f22677c = aE.f12387e;
        c4459b.f22678d = aE.f12386d;
        c4459b.f22679e = document.m14642b(20);
        if (c4459b.f22679e == null) {
            FinskyLog.m21669e("Missing Feature Image for Music Merch Banner.", new Object[0]);
        }
        c4459b.f22680f = document.m14642b(21);
        c4459b.f22681g = document.f14885a.f12087D;
        this.f22656b = c4459b;
    }

    public final int mo1508a() {
        return this.f22658p;
    }

    public final int mo1509a(int i) {
        return C1592a.f8431F.intValue();
    }

    public final void mo1510a(View view, int i) {
        int i2;
        MusicMerchBannerView musicMerchBannerView = (MusicMerchBannerView) view;
        C4459b c4459b = this.f22656b;
        ad adVar = this.h;
        musicMerchBannerView.f22671m = C1607g.m9236a(c4459b.f22679e, musicMerchBannerView.f22672n);
        musicMerchBannerView.getCardViewGroupDelegate().mo3864a(musicMerchBannerView, musicMerchBannerView.f22671m);
        bd bdVar = c4459b.f22679e;
        if (bdVar != null) {
            musicMerchBannerView.f22659a.m9288a(musicMerchBannerView.f22670l, bdVar.f11860f, bdVar.f11863i);
            if (musicMerchBannerView.f22670l.getDrawable() != null) {
                musicMerchBannerView.m20839b();
            } else {
                musicMerchBannerView.f22670l.m16023b();
            }
        }
        bdVar = c4459b.f22680f;
        if (bdVar == null) {
            musicMerchBannerView.f22662d.setVisibility(8);
        } else {
            musicMerchBannerView.f22659a.m9288a(musicMerchBannerView.f22662d, bdVar.f11860f, bdVar.f11863i);
            musicMerchBannerView.f22662d.setVisibility(0);
        }
        musicMerchBannerView.f22663e.setText(c4459b.f22675a);
        MusicMerchBannerView.m20835a(musicMerchBannerView.f22664f, musicMerchBannerView.f22667i, c4459b.f22676b);
        MusicMerchBannerView.m20835a(musicMerchBannerView.f22665g, musicMerchBannerView.f22666h, c4459b.f22677c);
        String str = c4459b.f22678d;
        if (C1607g.m9240a(musicMerchBannerView.f22671m)) {
            i2 = C7582R.color.play_banner_dark_fg;
        } else {
            i2 = C7582R.color.play_banner_light_fg;
        }
        int a = C1607g.m9238a(str, C0216d.m1116c(musicMerchBannerView.getContext(), i2));
        musicMerchBannerView.f22663e.setTextColor(a);
        musicMerchBannerView.f22664f.setTextColor(a);
        musicMerchBannerView.f22665g.setTextColor(a);
        ((GradientDrawable) musicMerchBannerView.f22665g.getBackground()).setStroke(musicMerchBannerView.f22668j, a);
        musicMerchBannerView.f22669k = this;
        musicMerchBannerView.f22661c.setColorFilter(a, Mode.SRC_ATOP);
        C2482j.m13285a(musicMerchBannerView.f22673o, c4459b.f22681g);
        musicMerchBannerView.f22674p = adVar;
        this.h.mo1219a(musicMerchBannerView);
    }

    public final void mo1511b(View view, int i) {
        ((MusicMerchBannerView) view).Z_();
    }

    public final void mo4214a(ad adVar) {
        this.f.mo3655a(this.f22657o, adVar, this.i);
    }

    public final void mo4215b(ad adVar) {
        fm aE = this.f22657o.aE();
        this.i.m13379b(new C2475d(adVar).m13256a(212));
        C3748a c3748a = this.f;
        String str = aE.f12388f;
        ah ahVar = new ah();
        ahVar.f11790c = 1;
        ahVar.f11789b |= 1;
        if (str == null) {
            throw new NullPointerException();
        }
        ahVar.f11789b |= 4;
        ahVar.f11793f = str;
        c3748a.mo3638a(ahVar, this.i);
        this.f22655a.m22589b(this.f22657o.f14885a.f12096c);
        this.f22658p = 0;
        this.C.mo4088b(this, 0, 1);
    }
}
