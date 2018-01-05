package com.google.android.finsky.detailspage;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.em;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;

public class de extends dg {
    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (C1473m.f7980a.dj().mo2294a(12636017) && document != null && document.aM() && !document.aL()) {
            if (this.b == null) {
                this.b = new dj();
            }
            ((dj) this.b).f14423a = document;
        }
    }

    public final int mo2977c(int i) {
        return C7582R.layout.prereg_iap_reward_module;
    }

    protected final int mo3068a() {
        return 1879;
    }

    protected final String mo3069b() {
        return m14143d().f12293c;
    }

    protected final String mo3070c() {
        return m14143d().f12294d;
    }

    private final em m14143d() {
        return ((dj) this.b).f14423a.m14625N().f13158G.f12545b;
    }
}
