package com.google.android.finsky.stream.controllers.view;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.PlayCardViewRate;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.cl;

final class aa implements cl {
    public final /* synthetic */ PlayCardViewRate f23073a;
    public final /* synthetic */ C2495w f23074b;
    public final /* synthetic */ PlayCardRateAndSuggestClusterView f23075c;

    aa(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, PlayCardViewRate playCardViewRate, C2495w c2495w) {
        this.f23075c = playCardRateAndSuggestClusterView;
        this.f23073a = playCardViewRate;
        this.f23074b = c2495w;
    }

    public final void mo4252a() {
        ao.m18504a(this.f23073a, (Document) this.f23073a.getData(), this.f23075c.f23016n.mo2015a(), this.f23075c, (ad) this.f23073a.getLoggingData(), this.f23074b);
    }
}
