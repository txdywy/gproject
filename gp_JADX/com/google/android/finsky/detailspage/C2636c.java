package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cv.p177a.C2448u;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class C2636c extends ck implements C2635e {
    public final boolean mo2979f() {
        return this.b != null && ((C2638d) this.b).f14399a;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.artist_radio_module;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2 = true;
        if (this.b == null) {
            this.b = new C2638d();
            ((C2638d) this.b).f14400b = ((String) C0955b.ee.m28964b()).replace("%artistId%", document.f14885a.f12097d);
            C1552e dj = C1473m.f7980a.dj();
            C2448u P = document.m14627P();
            boolean z3 = P != null && P.f13209f;
            boolean z4;
            if (dj.mo2294a(12620770) || !(z3 || dj.mo2294a(12603719))) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z5;
            if (document.f14885a.f12098e == 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            C2638d c2638d = (C2638d) this.b;
            if (!(C1473m.f7980a.bn().mo2714b(((C2638d) this.b).f14400b, C1473m.f7980a.cY().name) && r1 && r4)) {
                z2 = false;
            }
            c2638d.f14399a = z2;
        }
    }

    public final void mo2976b(View view, int i) {
        ArtistRadioModuleLayout artistRadioModuleLayout = (ArtistRadioModuleLayout) view;
        if ((this.b != null ? 1 : 0) == 0) {
            artistRadioModuleLayout.setVisibility(8);
            return;
        }
        artistRadioModuleLayout.setVisibility(0);
        artistRadioModuleLayout.f13912b = this;
    }

    public final void mo3063a() {
        this.t.startActivity(C1473m.f7980a.bn().mo2716c(((C2638d) this.b).f14400b, C1473m.f7980a.cY().name).addFlags(268435456));
    }
}
