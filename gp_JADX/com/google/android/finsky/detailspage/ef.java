package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailscomponents.C1058q;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public class ef extends ck implements ad, C1058q {
    public ce f14470d;
    public C2473o f14471e;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.screenshots_module_rv;
    }

    public final boolean mo2979f() {
        return this.b != null && m14225a();
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null && m14225a() && document.ak()) {
            this.b = new eg();
            ((eg) this.b).f14472a = document;
        }
    }

    public final void mo2976b(View view, int i) {
        ScreenshotsModuleLayoutV2 screenshotsModuleLayoutV2 = (ScreenshotsModuleLayoutV2) view;
        Document document = ((eg) this.b).f14472a;
        ad adVar = this.I;
        if (document.ak()) {
            screenshotsModuleLayoutV2.setVisibility(0);
            screenshotsModuleLayoutV2.f14055a.m13618a(C2596w.m13652a(document, 0), this, adVar);
        } else {
            screenshotsModuleLayoutV2.setVisibility(8);
        }
        screenshotsModuleLayoutV2.getLayoutParams().height = screenshotsModuleLayoutV2.getAdjustedHeight();
        getParentNode().mo1219a(this);
    }

    public final void mo1347a(int i) {
        if (this.b != null && ((eg) this.b).f14472a != null) {
            this.z.mo3651a(((eg) this.b).f14472a, i);
            if (this.f14471e == null) {
                this.f14471e = new C2473o(2939, this);
            }
            this.f14471e.m13202a(new cf().b(i));
            this.J.m13379b(new C2475d(this.f14471e));
        }
    }

    private static boolean m14225a() {
        return C1473m.f7980a.dj().mo2294a(12642389);
    }

    public ce getPlayStoreUiElement() {
        if (this.f14470d == null) {
            this.f14470d = C2482j.m13283a(1863);
        }
        return this.f14470d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
