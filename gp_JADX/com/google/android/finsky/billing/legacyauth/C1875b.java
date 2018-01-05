package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;
import com.google.android.finsky.billing.p131e.C1829r;

final class C1875b extends AsyncTask {
    public final /* synthetic */ String f9591a;
    public final /* synthetic */ boolean f9592b;
    public final /* synthetic */ String f9593c;
    public final /* synthetic */ C1879g f9594d;
    public final /* synthetic */ C1874a f9595e;

    C1875b(C1874a c1874a, String str, boolean z, String str2, C1879g c1879g) {
        this.f9595e = c1874a;
        this.f9591a = str;
        this.f9592b = z;
        this.f9593c = str2;
        this.f9594d = c1879g;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C1829r c1829r = (C1829r) obj;
        C1879g c1879g = this.f9594d;
        int i = c1829r == null ? 900 : c1829r.f9412a;
        if (i == 0) {
            c1879g.mo2491a(c1829r.f9413b);
        } else {
            c1879g.mo2490a(i);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f9595e.f9587b.m9844a(this.f9595e.f9586a, this.f9591a, this.f9592b, this.f9593c);
    }
}
