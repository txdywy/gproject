package com.google.android.finsky.detailspage;

import android.accounts.Account;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public class C2652f extends ck {
    public Document f14560d;
    public C2654h f14561e;
    public String f14562f;

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final int mo2977c(int i) {
        return C1592a.f8428C.intValue();
    }

    public final int mo2978e() {
        return 1;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = false;
        this.f14560d = document;
        if (this.f14560d != null && this.f14560d.f14885a.f12098e == 3) {
            C1552e dj = C1473m.f7980a.dj();
            boolean a = dj.mo2294a(87);
            if (dj.mo2294a(12602761) || a) {
                z2 = dj.mo2294a(12620770);
            }
        }
        if (z2) {
            Account cY = C1473m.f7980a.cY();
            if (this.b == null) {
                this.b = new C2653g();
                C2653g c2653g = (C2653g) this.b;
                c2653g.f14612a = C1473m.f7980a.mo2045Y().m11644a(C1473m.f7980a.ah().mo2811a(cY));
            }
            if (((C2653g) this.b).f14612a) {
                Document document3 = this.f14560d;
                this.f14562f = this.t.getString(C7582R.string.listen);
                Intent a2 = C1473m.f7980a.bn().mo2686a(this.t, document3, cY.name);
                a2.addFlags(268435456);
                this.f14561e = new C2654h(this, 285, a2);
                return;
            }
            if (C1473m.f7980a.dj().mo2294a(87)) {
                this.f14562f = this.t.getString(C1592a.f8476y.intValue());
            } else {
                this.f14562f = this.t.getString(C1592a.f8477z.intValue());
            }
            this.f14561e = new C2654h(this, 286, C1473m.f7980a.bn().mo2683a(2, (String) C0955b.eb.m28964b(), cY.name));
        }
    }

    public final void mo2976b(View view, int i) {
        ArtistSubscriptionUpsellModuleLayout artistSubscriptionUpsellModuleLayout = (ArtistSubscriptionUpsellModuleLayout) view;
        String str = this.f14562f;
        OnClickListener onClickListener = this.f14561e;
        int i2 = this.f14561e.f14670b;
        ad adVar = this.I;
        artistSubscriptionUpsellModuleLayout.f13913a.mo2588a(2, str, onClickListener);
        artistSubscriptionUpsellModuleLayout.f13914b = C2482j.m13283a(i2);
        artistSubscriptionUpsellModuleLayout.f13915c = adVar;
        artistSubscriptionUpsellModuleLayout.mo1219a(artistSubscriptionUpsellModuleLayout);
    }
}
