package com.google.android.instantapps.common.p221d.p222a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.play.p179a.C6223h;
import com.google.android.play.p179a.C6228m;
import com.google.android.play.p179a.C6229n;

public final class C5724n {
    public final C6223h f28969a;
    public final C5733x f28970b;

    C5724n(Context context, String str, C6229n c6229n, String str2, long j, String str3, String str4, C6228m c6228m, Account account, C5733x c5733x, int i) {
        this.f28969a = new C6223h(context, str, c6229n, str2, i, j, str3, str4, c6228m, account);
        this.f28970b = c5733x;
    }

    public final void m27020a(Runnable runnable) {
        this.f28969a.mo5355a(runnable);
    }
}
