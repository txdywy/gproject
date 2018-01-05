package com.google.android.finsky.playcard;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

final class bv extends C3901z {
    bv() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        PlayCardViewListingSmall playCardViewListingSmall = (PlayCardViewListingSmall) dVar;
        super.mo3861a(playCardViewListingSmall, document, c3748a, c2495w);
        playCardViewListingSmall.a((float) playCardViewListingSmall.getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_size));
    }
}
