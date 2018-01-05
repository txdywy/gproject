package com.google.android.finsky.detailspage;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.fd;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class df extends dg {
    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (C1473m.f7980a.dj().mo2294a(12629590) && document != null && document.aL()) {
            if (this.b == null) {
                this.b = new dj();
            }
            ((dj) this.b).f14423a = document;
        }
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.prereg_milestone_rewards_module;
    }

    protected final int mo3068a() {
        return 1867;
    }

    protected final String mo3069b() {
        return m14149d().f12357d;
    }

    protected final String mo3070c() {
        return m14149d().f12358e;
    }

    private final fd m14149d() {
        return ((dj) this.b).f14423a.m14625N().f13158G.f12544a;
    }
}
