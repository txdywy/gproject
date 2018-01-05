package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ao.C1237a;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import java.util.List;

final class aw extends C1904f {
    public final C1805b f9800g;

    public aw(C1237a c1237a, C2233o c2233o, C3340g c3340g, C0988c c0988c, C1805b c1805b) {
        super(c1237a, c2233o, c3340g, c0988c, null);
        this.f9800g = c1805b;
    }

    protected final void mo2510a(Account account, List list) {
        C1807a a = this.f9800g.mo2455a();
        for (Document c1811c : list) {
            a.mo2456a(new C1811c(account, c1811c));
        }
        a.mo2457a(new ax(this));
    }
}
