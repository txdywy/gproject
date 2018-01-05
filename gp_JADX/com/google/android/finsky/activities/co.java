package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dfemodel.Document;

final class co implements OnClickListener {
    public final /* synthetic */ Document f6634a;
    public final /* synthetic */ cm f6635b;

    co(cm cmVar, Document document) {
        this.f6635b = cmVar;
        this.f6634a = document;
    }

    public final void onClick(View view) {
        this.f6635b.m6350d(2703);
        ax e = C1473m.f7980a.mo2045Y().m11657e(this.f6634a, C1473m.f7980a.ah().mo2811a(this.f6635b.C));
        if (e != null) {
            this.f6635b.z.mo3692b(C1289l.m7694a(C2726q.m14755d(e.f11833b)), this.f6635b.S);
        }
    }
}
