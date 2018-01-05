package com.google.android.finsky.stream.p248a;

import android.content.res.Resources;
import android.support.v7.widget.ff;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.playcard.ac;
import com.squareup.leakcanary.C7582R;

public final class C4229a {
    public final C1503a f21389a;
    public final C1461c f21390b;
    public final ac f21391c;

    public C4229a(C1503a c1503a, C1461c c1461c, ac acVar) {
        this.f21389a = c1503a;
        this.f21390b = c1461c;
        this.f21391c = acVar;
    }

    public final int m19641a(Resources resources) {
        if (this.f21389a.f8184h) {
            return ((Integer) C0955b.iB.m28964b()).intValue();
        }
        if (resources.getBoolean(C7582R.bool.preinflate_large_count)) {
            return ((Integer) C0955b.iA.m28964b()).intValue();
        }
        return ((Integer) C0955b.iz.m28964b()).intValue();
    }

    public final int m19640a() {
        if (this.f21389a.f8184h) {
            return ((Integer) C0955b.iD.m28964b()).intValue();
        }
        return 5;
    }

    public final void m19642a(Resources resources, ff ffVar) {
        if (this.f21390b.dj().mo2294a(12630217)) {
            ffVar.mo2355a(this.f21391c.m18478a(false), m19641a(resources));
            if (this.f21390b.dj().mo2294a(12642058)) {
                int intValue;
                int a = this.f21391c.m18478a(true);
                if (this.f21389a.f8184h) {
                    intValue = ((Integer) C0955b.iC.m28964b()).intValue();
                } else {
                    intValue = 5;
                }
                ffVar.mo2355a(a, intValue);
                ffVar.mo2355a((int) C7582R.layout.flat_card_cluster, m19640a());
            }
        }
    }
}
