package com.google.android.finsky.by;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.fw;

public final class C2234p implements C0660x {
    public final C2199l f11137a;
    public final Account f11138b;
    public final Runnable f11139c;

    public C2234p(C2199l c2199l, Account account, Runnable runnable) {
        this.f11137a = c2199l;
        this.f11138b = account;
        this.f11139c = runnable;
    }

    public final /* synthetic */ void b_(Object obj) {
        fw fwVar = (fw) obj;
        this.f11137a.mo2796a(this.f11138b, "revoke", this.f11139c, fwVar.a);
    }
}
