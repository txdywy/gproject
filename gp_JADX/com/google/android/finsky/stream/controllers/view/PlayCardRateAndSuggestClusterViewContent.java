package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.C3899y;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.playcluster.C4285g;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewContent;
import com.google.android.play.layout.d;

public class PlayCardRateAndSuggestClusterViewContent extends PlayCardClusterViewContent {
    public int f23026q;

    public PlayCardRateAndSuggestClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23026q = 0;
    }

    public final void mo4244a(C3748a c3748a, ab abVar, C4285g c4285g, ad adVar, C2495w c2495w, Document document, int i) {
        super.mo4244a(c3748a, abVar, c4285g, adVar, c2495w, document, i);
        m21044a(false);
    }

    protected int getNumberOfTilesToBind() {
        if (this.f23026q == 0) {
            return 1;
        }
        return super.getNumberOfTilesToBind();
    }

    final void m21044a(boolean z) {
        int i = 1;
        int i2 = 0;
        if (getCardChildCount() != 0) {
            for (int i3 = 0; i3 < this.b.m19884a(); i3++) {
                m19876b(i3).setVisibility(0);
            }
            if (this.f23026q == 2) {
                i2 = 1;
            }
            while (i < this.b.m19884a()) {
                d b = m19876b(i);
                if (b.getData() == null) {
                    b.b();
                }
                C3899y c3899y = (C3899y) b;
                if (i2 != 0) {
                    c3899y.mo3860b(z);
                } else {
                    c3899y.mo3859a(z);
                }
                i++;
            }
        }
    }
}
