package com.google.android.finsky.billing.common;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.wallet.common.pub.i;
import com.squareup.leakcanary.C7582R;

final class C1794j extends AsyncTask {
    public final /* synthetic */ Context f9326a;
    public final /* synthetic */ String f9327b;
    public final /* synthetic */ C1793i f9328c;

    C1794j(C1793i c1793i, Context context, String str) {
        this.f9328c = c1793i;
        this.f9326a = context;
        this.f9327b = str;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (!isCancelled()) {
            this.f9328c.m9768a(this.f9326a, this.f9327b, new i(C7582R.style.Theme.InstrumentManager.BuyFlow).a(), "refresh");
        }
        return null;
    }
}
