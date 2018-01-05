package com.google.android.finsky.billing.p120d.p157a;

import android.accounts.Account;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;

final class C1809c implements C1091e {
    public final /* synthetic */ C1808b f9361a;

    C1809c(C1808b c1808b) {
        this.f9361a = c1808b;
    }

    public final void mo1425a(Account account, Document document) {
        if (this.f9361a.f9358d.f9366d != null) {
            this.f9361a.f9358d.f9366d.mo1425a(account, document);
        }
        C1808b c1808b = this.f9361a;
        if (c1808b.f9356b.isEmpty()) {
            c1808b.f9358d = null;
        }
        if (!c1808b.m9814a()) {
            c1808b.f9357c.postDelayed(new C1810d(c1808b), ((Long) C0955b.gv.m28964b()).longValue());
        } else if (c1808b.f9359e != null) {
            c1808b.f9359e.run();
            c1808b.f9359e = null;
        }
    }

    public final void S_() {
        if (this.f9361a.f9358d.f9366d != null) {
            this.f9361a.f9358d.f9366d.S_();
        }
        C1808b c1808b = this.f9361a;
        if (c1808b.f9356b.isEmpty()) {
            c1808b.f9358d = null;
        }
        if (!c1808b.m9814a()) {
            c1808b.f9357c.postDelayed(new C1810d(c1808b), ((Long) C0955b.gv.m28964b()).longValue());
        } else if (c1808b.f9359e != null) {
            c1808b.f9359e.run();
            c1808b.f9359e = null;
        }
    }
}
