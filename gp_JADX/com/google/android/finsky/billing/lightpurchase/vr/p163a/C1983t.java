package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.vr.a.a.a.c;
import com.google.vr.a.a.a.d;

final class C1983t implements d {
    public final /* synthetic */ String f10090a;
    public final /* synthetic */ C1980q f10091b;

    C1983t(C1980q c1980q, String str) {
        this.f10091b = c1980q;
        this.f10090a = str;
    }

    public final void m10491a(c cVar) {
        if (!this.f10091b.f10087n && this.f10091b.f10085l.length() != this.f10091b.f10084k) {
            C1980q c1980q = this.f10091b;
            String valueOf = String.valueOf(this.f10091b.f10085l);
            String valueOf2 = String.valueOf(this.f10090a);
            c1980q.m10488b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            this.f10091b.m10487a(null);
            if (this.f10091b.f10085l.length() == this.f10091b.f10084k) {
                this.f10091b.f10087n = true;
                if (this.f10091b.f10086m != null) {
                    this.f10091b.f10086m.mo2549a(this.f10091b.f10085l);
                }
            }
        }
    }
}
