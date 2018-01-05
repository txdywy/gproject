package com.google.android.finsky.layout.play;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aq.C1500a;
import com.google.android.play.drawer.C3714i;
import com.squareup.leakcanary.C7582R;

final class C3715w implements C3714i {
    public final /* synthetic */ Context f18799a;

    C3715w(Context context) {
        this.f18799a = context;
    }

    public final String mo3617a(Account account) {
        if (C1473m.f7980a.mo2035O().m8839b() && "cn.google".equals(account.type)) {
            return account.name.split("@")[0];
        }
        C1473m.f7980a.mo2033M();
        if (C1500a.m8816c(account)) {
            return this.f18799a.getString(C7582R.string.work_account_label);
        }
        return account.name;
    }
}
