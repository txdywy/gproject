package com.google.android.play.drawer;

import android.accounts.Account;

final class ag implements ai {
    public final /* synthetic */ C6300o f31415a;

    ag(C6300o c6300o) {
        this.f31415a = c6300o;
    }

    public final void mo5379a(Account account) {
        if (account == this.f31415a.f31504m) {
            this.f31415a.f31507p.contains(this.f31415a.f31504m.name);
            C3691k c3691k = this.f31415a.f31494c;
            this.f31415a.f31506o.get(this.f31415a.f31504m.name);
            c3691k.mo3598e();
            return;
        }
        this.f31415a.f31494c.mo3597a(account.name);
        this.f31415a.f31495d.mo3590d();
    }
}
