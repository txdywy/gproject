package com.google.android.finsky.billing.lightpurchase;

import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.p111d.C2495w;

final class C1951j extends AsyncTask {
    public final /* synthetic */ C2495w f9945a;
    public final /* synthetic */ C1950i f9946b;

    C1951j(C1950i c1950i, C2495w c2495w) {
        this.f9946b = c1950i;
        this.f9945a = c2495w;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (!isCancelled()) {
            this.f9946b.at = str;
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C1867w c1867w = this.f9946b.f9938a;
        String a = C1867w.m9986a(this.f9946b.f9942e.f9285a.f11833b);
        String str = this.f9946b.f9942e.f9298n.c;
        C1950i c1950i = this.f9946b;
        if (c1950i.au == null) {
            c1950i.au = new C1962u();
        }
        C1962u c1962u = c1950i.au;
        byte[] a2 = C1962u.m10413a(C1473m.f7980a.f7981b, str, a, this.f9946b.f9944g.h, this.f9945a.m13365a());
        if (a2 == null) {
            return null;
        }
        return Base64.encodeToString(a2, 10);
    }
}
