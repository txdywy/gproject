package com.google.android.finsky.billing.common;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.wallet.common.pub.i;

protected final class com.google.android.finsky.billing.common.j extends AsyncTask
{

    public final Context a;
    public final String b;
    public final com.google.android.finsky.billing.common.i c;

    j(com.google.android.finsky.billing.common.i p0, Context p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        if (!this.isCancelled())
            this.c.a(this.a, this.b, new com.google.android.wallet.common.pub.i(2132017931).a(), "refresh");
        return 0;
    }

}
