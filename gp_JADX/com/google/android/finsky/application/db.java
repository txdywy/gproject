package com.google.android.finsky.application;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.finsky.accounts.C0988c;

final class db extends AsyncTask {
    public final /* synthetic */ C1475d f8034a;

    db(C1475d c1475d) {
        this.f8034a = c1475d;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.f8034a.aN != null) {
            C0988c c0988c = this.f8034a;
            if (c0988c == null) {
                throw null;
            }
            for (Account account : c0988c.cX()) {
                this.f8034a.aN.m15190b(account.name);
            }
        }
        return null;
    }
}
