package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.squareup.haha.perflib.HprofParser;

final class cw implements OnClickListener {
    public final /* synthetic */ cu f6646a;

    cw(cu cuVar) {
        this.f6646a = cuVar;
    }

    public final void onClick(View view) {
        eu euVar;
        C3748a c3748a = this.f6646a.f6547z;
        Document document = this.f6646a.f6519D;
        if (document.bK()) {
            euVar = document.f14885a.f12112s.f12052e.f11780l.f12752c;
        } else {
            euVar = null;
        }
        c3748a.mo3643a(euVar.f12324d, "", this.f6646a.f6519D.f14885a.f12099f, C1473m.f7980a.dn(), this.f6646a.f6535T, 0, this.f6646a.f6534S);
        if (this.f6646a.f6519D.f14885a.f12098e == 64) {
            this.f6646a.m6350d((int) HprofParser.ROOT_UNREACHABLE);
        }
        if (this.f6646a.f6519D.f14885a.f12098e == 5) {
            this.f6646a.m6350d(143);
        }
    }
}
