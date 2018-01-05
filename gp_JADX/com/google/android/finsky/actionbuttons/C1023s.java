package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;

final class C1023s implements OnClickListener {
    public final /* synthetic */ Document f6271a;
    public final /* synthetic */ C1021q f6272b;

    C1023s(C1021q c1021q, Document document) {
        this.f6272b = c1021q;
        this.f6271a = document;
    }

    public final void onClick(View view) {
        this.f6272b.c.m13379b(new C2475d(this.f6272b.d).m13256a(2703));
        ax e = this.f6272b.f6264n.m11657e(this.f6271a, this.f6272b.f6263m.mo2811a(this.f6272b.f6258h));
        if (e != null) {
            this.f6272b.f6257g.mo3692b(C1289l.m7694a(C2726q.m14755d(e.f11833b)), this.f6272b.c);
        }
    }
}
