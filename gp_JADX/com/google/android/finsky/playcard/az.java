package com.google.android.finsky.playcard;

import android.accounts.Account;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.hu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;

final class az extends C3901z {
    public final /* synthetic */ ao f19617a;

    az(ao aoVar) {
        this.f19617a = aoVar;
    }

    private final void m18529a(FlatCardViewReEngagement flatCardViewReEngagement, Document document, View view, ad adVar, C2495w c2495w, C3748a c3748a) {
        c2495w.m13379b(new C2475d(adVar).m13256a(2946));
        this.f19617a.f19597l.m8973a(flatCardViewReEngagement.getContext(), document, "40", view.getWidth(), view.getHeight(), c3748a.mo3705g());
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardViewReEngagement flatCardViewReEngagement = (FlatCardViewReEngagement) dVar;
        super.mo3861a(flatCardViewReEngagement, document, c3748a, c2495w);
        ad adVar = (ad) flatCardViewReEngagement.getLoggingData();
        hu huVar = document.bB() ? document.f14885a.f12115v.aa : null;
        Account cY = this.f19617a.f19593h.cY();
        if (huVar != null) {
            OnClickListener baVar;
            if (huVar.f12622b != null) {
                baVar = new ba(this, flatCardViewReEngagement, document, adVar, c2495w, c3748a, huVar, cY);
            } else {
                Object bbVar = new bb(this, flatCardViewReEngagement, document, adVar, c2495w, c3748a, cY);
            }
            bd bdVar = null;
            if (huVar.f12621a != null) {
                bdVar = huVar.f12621a;
            } else {
                FinskyLog.m21669e("Missing re-engagement image", new Object[0]);
            }
            flatCardViewReEngagement.f19403a.setOnClickListener(baVar);
            flatCardViewReEngagement.f19407e.m9288a(flatCardViewReEngagement.f19405c, bdVar.f11860f, bdVar.f11863i);
            flatCardViewReEngagement.f19406d = adVar;
            return;
        }
        FinskyLog.m21669e("Missing re-engagement annotation.", new Object[0]);
    }
}
