package com.google.android.instantapps.common.p221d.p222a;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import com.google.android.play.p179a.C6228m;
import com.google.android.play.p179a.C6229n;
import com.google.android.play.utils.p354b.C6321a;
import java.util.Locale;

public final class C5725o {
    public final Context f28971a;

    C5725o(Context context) {
        this.f28971a = context;
        C6321a.m28961a(context, new String[0]);
    }

    final C5724n m27021a(String str, String str2, long j, String str3, String str4, C6228m c6228m, Account account, C5733x c5733x, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Context context = this.f28971a;
            C6229n c6229n = C6229n.WESTINGHOUSE;
            Locale.getDefault().getCountry();
            C5724n c5724n = new C5724n(context, str, c6229n, str2, j, str3, str4, c6228m, account, c5733x, i);
            return c5724n;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
