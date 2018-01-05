package com.google.android.finsky.billing.p153c;

import android.os.AsyncTask;
import com.google.android.finsky.billing.p131e.C1829r;
import com.google.wireless.android.finsky.dfe.c.a.ea;

public final class C1781c extends AsyncTask {
    public final /* synthetic */ ea f9228a;
    public final /* synthetic */ C1684f f9229b;
    public final /* synthetic */ C1780b f9230c;

    public C1781c(C1780b c1780b, ea eaVar, C1684f c1684f) {
        this.f9230c = c1780b;
        this.f9228a = eaVar;
        this.f9229b = c1684f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C1829r c1829r = (C1829r) obj;
        this.f9230c.f9223h = c1829r.f9412a;
        if (c1829r.f9412a == 0) {
            this.f9230c.f9221f = c1829r.f9413b;
            this.f9230c.f9220e = Boolean.TRUE;
            this.f9230c.f9219d.mo2386b();
            this.f9229b.mo2389a(this.f9230c.f9221f);
            return;
        }
        C1780b c1780b = this.f9230c;
        c1780b.f9222g++;
        this.f9230c.f9220e = Boolean.FALSE;
        this.f9229b.mo2390a(this.f9230c.f9222g < this.f9228a.b);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        String str = null;
        if (((this.f9228a.a & 8) != 0 ? 1 : 0) != 0) {
            str = this.f9230c.f9218c.m14872b(this.f9228a.e);
            if (str == null && this.f9228a.d()) {
                str = this.f9228a.d;
                this.f9230c.f9218c.m14870a(this.f9228a.e, str);
            }
        }
        return this.f9230c.f9216a.m9844a(this.f9230c.f9217b, strArr[0], this.f9228a.c, str);
    }
}
