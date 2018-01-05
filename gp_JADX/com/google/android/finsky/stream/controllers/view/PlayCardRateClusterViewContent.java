package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.playcluster.C4285g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;

public class PlayCardRateClusterViewContent extends PlayCardClusterViewContent {
    public int[] f23033q;

    public PlayCardRateClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardRateClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m21052b() {
        int docCount = getDocCount();
        if (docCount != 0 && this.b != null) {
            int i;
            int a = this.b.m19884a();
            if (this.f23033q == null) {
                this.f23033q = new int[a];
            }
            for (i = 0; i < a; i++) {
                this.f23033q[i] = -1;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < docCount && i3 < a) {
                boolean z;
                String str = m19872a(i2).f14885a.f12096c;
                if (this.n.f25084a.m18689a(str, null, false) != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean a2 = this.n.m22588a(str);
                if (z || a2) {
                    i2++;
                } else {
                    int i4 = i3 + 1;
                    i = i2 + 1;
                    this.f23033q[i3] = i2;
                    i2 = i;
                    i3 = i4;
                }
            }
        }
    }

    public final void mo4244a(C3748a c3748a, ab abVar, C4285g c4285g, ad adVar, C2495w c2495w, Document document, int i) {
        m21052b();
        super.mo4244a(c3748a, abVar, c4285g, adVar, c2495w, document, i);
    }

    public final boolean m21054c() {
        return this.f23033q[0] >= 0;
    }

    public final int mo4246c(int i) {
        return this.f23033q[i];
    }
}
