package com.google.android.finsky.playcard;

import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

final class bw extends C3901z {
    bw() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        PlayCardViewRate playCardViewRate = (PlayCardViewRate) dVar;
        super.mo3861a(playCardViewRate, document, c3748a, c2495w);
        String str = document.f14885a.f12096c;
        int i = document.f14885a.f12098e;
        cj cjVar = new cj();
        cjVar.f19723a = str;
        cjVar.f19724b = i;
        playCardViewRate.f19525k = c2495w;
        playCardViewRate.f19516a = cjVar.f19723a;
        playCardViewRate.f19520f.setVerticalPadding(C7582R.dimen.rate_card_stars_vpadding);
        playCardViewRate.f19520f.m16030a(0, playCardViewRate.R, playCardViewRate);
        playCardViewRate.f19520f.setContentDescription(C1608h.m9248a(playCardViewRate.getResources(), cjVar.f19724b));
    }
}
