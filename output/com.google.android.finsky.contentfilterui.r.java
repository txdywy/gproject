package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.r;
import com.google.android.finsky.d.a;

protected final class com.google.android.finsky.contentfilterui.r extends AsyncTask
{

    public final Account a;
    public final String b;
    public final String c;
    public final com.google.android.finsky.contentfilterui.q d;

    r(com.google.android.finsky.contentfilterui.q p0, Account p1, String p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        return new com.google.android.finsky.billing.e.k(this.d.h(), this.d.y_.a(0)).a(this.a, this.b, 0, this.c);
    }

    protected final void onPostExecute(Object p0) {
        if (this.d.k()) {
            if ((com.google.android.finsky.billing.e.r)p0 == 0)
                v0 = 900;
            else
                v0 = ((com.google.android.finsky.billing.e.r)p0).a;
            if (v0 == 0) {
                this.d.h().setResult(-1, new Intent().putExtra("result_key_extra_params", this.d.h().getIntent().getBundleExtra("result_key_extra_params")));
                this.d.h().finish();
            }
            else {
                if (v0 == 1100)
                    v0 = 2131952744;
                else
                    v0 = 2131952242;
                this.d.h = 0;
                this.d.ai();
                com.google.android.finsky.bg.ae.a(this.d.ah, this.d.c(2131952742), this.d.c(v0));
            }
        }
    }

}
