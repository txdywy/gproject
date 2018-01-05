package com.google.android.finsky.notification.impl;

import android.support.v4.p037h.C0305a;
import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p108z.C4809e;

public final class aa {
    public final C1198a f19010a;
    public final C1202e f19011b;

    public aa(C1203f c1203f) {
        C1201d c1201d = new C1201d("proxies", "TEXT", new C0305a());
        this.f19010a = c1203f.mo1516a("queue", new C1201d[]{c1201d});
        this.f19011b = c1203f.mo1517a(this.f19010a, "proxies", new ab(), new ac(), new ad(), 0, null);
    }

    final C4809e m18077a() {
        return this.f19011b.mo1519a(new C1215q());
    }
}
