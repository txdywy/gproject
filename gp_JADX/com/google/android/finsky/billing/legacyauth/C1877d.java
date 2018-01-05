package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.p131e.C1822k;

final class C1877d extends AsyncTask {
    public final /* synthetic */ C1884l f9599a;
    public final /* synthetic */ C1874a f9600b;

    C1877d(C1874a c1874a, C1884l c1884l) {
        this.f9600b = c1874a;
        this.f9599a = c1884l;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (str == null) {
            this.f9599a.mo2502c();
        } else if (str.isEmpty()) {
            this.f9599a.mo2501b();
        } else {
            this.f9599a.mo2500a(str);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C1822k c1822k = this.f9600b.f9587b;
        return c1822k.m9845a(c1822k.m9848c(this.f9600b.f9586a), "phone");
    }
}
