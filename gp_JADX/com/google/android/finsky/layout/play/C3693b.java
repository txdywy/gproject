package com.google.android.finsky.layout.play;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import com.google.android.finsky.activities.C1033t;

final class C3693b implements OnAccountsUpdateListener {
    public final /* synthetic */ Context f18771a;
    public final /* synthetic */ FinskyDrawerLayout f18772b;

    C3693b(FinskyDrawerLayout finskyDrawerLayout, Context context) {
        this.f18772b = finskyDrawerLayout;
        this.f18771a = context;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        C1033t.m6037a(this.f18771a);
        this.f18772b.m17542g();
    }
}
