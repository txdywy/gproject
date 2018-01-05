package com.google.android.finsky.stream.controllers.floatinghighlights;

import android.view.View;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.dt;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4262b;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.AppInfoBannerView;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4390j;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4396h;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4399b;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4403i;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4405m;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.C4406n;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.TitleAndButtonBannerView;
import com.google.android.finsky.stream.controllers.floatinghighlights.view.TitleAndSubtitleBannerView;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4391a implements C4260a, C4390j {
    public final Document f22276a;
    public final C2495w f22277b;
    public final C3748a f22278c;
    public final C2288b f22279d;
    public final DfeToc f22280e;
    public final C2197a f22281f;
    public final boolean f22282g;
    public final boolean f22283h;
    public C4392b f22284i = new C4392b();

    public C4391a(Document document, C2495w c2495w, C3748a c3748a, C2288b c2288b, DfeToc dfeToc, C2197a c2197a, boolean z, boolean z2) {
        this.f22276a = document;
        this.f22277b = c2495w;
        this.f22278c = c3748a;
        this.f22279d = c2288b;
        this.f22280e = dfeToc;
        this.f22281f = c2197a;
        this.f22282g = z;
        this.f22283h = z2;
    }

    public final int mo4069a(int i) {
        throw new IllegalStateException("Not supported with this cluster");
    }

    public final int mo4068a() {
        if (this.f22276a == null || this.f22276a.aJ() == null) {
            FinskyLog.m21669e("Missing floating highlight banner annotation.", new Object[0]);
            return C7582R.layout.floating_highlights_banner_with_title_and_subtitle;
        }
        int i = this.f22276a.aJ().f12218b;
        if (i == 2) {
            return C7582R.layout.floating_highlights_banner_with_title_and_button;
        }
        if (i == 1) {
            return C7582R.layout.floating_highlights_banner_with_title_and_subtitle;
        }
        if (i == 3) {
            return C7582R.layout.floating_highlights_banner_with_app_info;
        }
        FinskyLog.m21669e("Floating highlights banner treatment unspecified.", new Object[0]);
        return C7582R.layout.floating_highlights_banner_with_title_and_subtitle;
    }

    public final void mo4186a(ad adVar) {
        this.f22278c.mo3655a(this.f22276a, adVar, this.f22277b);
    }

    public final /* synthetic */ int mo4070a(View view) {
        return ((C4396h) view).getBackgroundImage().getWidth();
    }

    public final /* synthetic */ int mo4073b(View view) {
        return ((C4396h) view).getBackgroundImage().getHeight();
    }

    public final /* synthetic */ C4262b mo4074b() {
        return this.f22284i;
    }

    public final /* synthetic */ void mo4075c(View view) {
        C4396h c4396h = (C4396h) view;
        if (c4396h instanceof ae) {
            c4396h.Z_();
        }
    }

    public final /* synthetic */ void mo4071a(View view, ad adVar) {
        String str = null;
        C4396h c4396h = (C4396h) view;
        dt aJ = this.f22276a.aJ();
        boolean z = this.f22282g;
        boolean z2 = this.f22283h;
        boolean z3 = aJ.f12220d;
        String str2 = this.f22276a.f14885a.f12100g;
        bd b = this.f22276a.m14642b(20);
        byte[] bArr = this.f22276a.f14885a.f12087D;
        C4403i c4403i = new C4403i();
        c4403i.f22349a = z;
        c4403i.f22350b = z2;
        c4403i.f22351c = z3;
        c4403i.f22352d = str2;
        c4403i.f22353e = b;
        c4403i.f22354f = bArr;
        if (c4396h instanceof TitleAndButtonBannerView) {
            C4405m c4405m = new C4405m();
            c4405m.f22357a = c4403i;
            c4405m.f22358b = aJ.f12219c;
            ((TitleAndButtonBannerView) c4396h).m20609a(c4405m, adVar, this);
        } else if (c4396h instanceof TitleAndSubtitleBannerView) {
            C4406n c4406n = new C4406n();
            c4406n.f22359a = c4403i;
            c4406n.f22360b = this.f22276a.f14885a.f12101h;
            ((TitleAndSubtitleBannerView) c4396h).m20611a(c4406n, adVar, this);
        } else if (c4396h instanceof AppInfoBannerView) {
            String str3;
            bl a = this.f22279d.m11788a(this.f22276a, this.f22280e, this.f22281f);
            if (a != null) {
                str3 = a.f11917g;
                str = a.f11922l;
            } else {
                FinskyLog.m21669e("Lacks offer in this doc for the app info banner.", new Object[0]);
                str3 = null;
            }
            ((AppInfoBannerView) c4396h).m20601a(new C4399b(c4403i, af.m9220a(this.f22276a, 0, 0, C1600a.f8505a), str3, str), adVar, this);
        }
    }

    public final /* synthetic */ void mo4072a(C4262b c4262b) {
        C4392b c4392b = (C4392b) c4262b;
        if (c4392b != null) {
            this.f22284i = c4392b;
        }
    }
}
