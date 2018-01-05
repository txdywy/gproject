package com.google.android.finsky.playcard;

import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;

final class ax extends C3901z {
    ax() {
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardViewDoubleWideAd flatCardViewDoubleWideAd = (FlatCardViewDoubleWideAd) dVar;
        super.mo3861a(flatCardViewDoubleWideAd, document, c3748a, c2495w);
        flatCardViewDoubleWideAd.f19369a.m18406a(0.5f);
        C2581g c2581g = flatCardViewDoubleWideAd.E_;
        bd a = C2581g.m13636a(document);
        if (a != null) {
            flatCardViewDoubleWideAd.f19371d.m9288a(flatCardViewDoubleWideAd.f19370b, a.f11860f, a.f11863i);
        } else {
            FinskyLog.m21669e("Missing Hero Graphic", new Object[0]);
        }
    }
}
