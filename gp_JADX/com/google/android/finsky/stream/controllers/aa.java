package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4254d;
import com.squareup.leakcanary.C7582R;

public final class aa extends C4302k {
    public aa(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, ac acVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w, afVar, aoVar, c4254d, z, acVar);
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_card_cluster;
    }

    private static boolean m19936c(int i) {
        return i == 3;
    }

    protected final boolean mo4100b(C2720j c2720j) {
        int i = c2720j.f14908a.f14885a.f12099f;
        if (i != 3) {
            if (i == 13) {
                return true;
            }
            int m = c2720j.m14698m();
            if (m > 0) {
                Document document = (Document) c2720j.m14679a(0, false);
                if (m19936c(document.f14885a.f12098e)) {
                    return true;
                }
                float b = m19935b(document);
                int min = Math.min(m, this.e.getResources().getInteger(C7582R.integer.flat_multiple_aspect_ratios_documents_max_count));
                for (m = 1; m < min; m++) {
                    document = (Document) c2720j.m14679a(m, false);
                    int i2 = document.f14885a.f12098e;
                    if (Math.abs(b - m19935b(document)) > 0.2f || m19936c(i2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static float m19935b(Document document) {
        bd a = C1600a.m9198a(document);
        if (a == null || a.f11859e == null || a.f11859e.f11878b == 0) {
            return C1617r.m9292a(document.f14885a.f12098e);
        }
        return ((float) a.f11859e.f11879c) / ((float) a.f11859e.f11878b);
    }

    protected final int mo4099b() {
        return this.p.m18478a(mo4100b(this.g));
    }
}
