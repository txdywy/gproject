package com.google.android.finsky.wear;

import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bs;

final class C4797r implements C0660x {
    public final /* synthetic */ String f25049a;
    public final /* synthetic */ C4796q f25050b;

    C4797r(C4796q c4796q, String str) {
        this.f25050b = c4796q;
        this.f25049a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        bs bsVar = (bs) obj;
        int i = bsVar.b;
        if (i == 1) {
            this.f25050b.f25044m.mo2665a(this.f25049a, bsVar.c, System.currentTimeMillis());
            C2129c a = this.f25050b.f25044m.mo2657a(this.f25049a);
            this.f25050b.m22565a(a);
            this.f25050b.m22570b(a);
            return;
        }
        FinskyLog.m21659a("Received non-OK response %d", Integer.valueOf(i));
        this.f25050b.m22574e();
        Runnable c4798s = new C4798s(this, i);
        if (i == 5) {
            C1473m.f7980a.bk().mo4382b(c4798s, "delivery_doc_outdated");
        } else {
            c4798s.run();
        }
    }
}
