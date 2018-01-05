package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.p131e.C1823l;

final class C1876c extends AsyncTask {
    public final /* synthetic */ C1882i f9596a;
    public final /* synthetic */ boolean f9597b;
    public final /* synthetic */ C1874a f9598c;

    C1876c(C1874a c1874a, C1882i c1882i, boolean z) {
        this.f9598c = c1874a;
        this.f9596a = c1882i;
        this.f9597b = z;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f9598c.m10011a(this.f9596a, (C1823l) obj, this.f9597b);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (isCancelled()) {
            return null;
        }
        return this.f9598c.f9587b.m9847b(this.f9598c.f9586a);
    }
}
