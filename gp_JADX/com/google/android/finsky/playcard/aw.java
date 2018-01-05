package com.google.android.finsky.playcard;

import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.d;

final class aw extends C3901z {
    aw() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardViewInlineVideo flatCardViewInlineVideo = (FlatCardViewInlineVideo) dVar;
        super.mo3861a(flatCardViewInlineVideo, document, c3748a, c2495w);
        HeroGraphicView heroGraphicView = flatCardViewInlineVideo.f19372a;
        ad adVar = (ad) flatCardViewInlineVideo.getLoggingData();
        heroGraphicView.f13731k = false;
        heroGraphicView.f13728h = 0.5625f;
        heroGraphicView.m13594a(document, false, adVar, true);
        C2581g c2581g = heroGraphicView.f13719B;
        bd a = C2581g.m13636a(document);
        heroGraphicView.f13721a.setVisibility(0);
        heroGraphicView.f13745y.m9288a(heroGraphicView.f13721a, a.f11860f, a.f11863i);
        heroGraphicView.f13736p = true;
    }
}
