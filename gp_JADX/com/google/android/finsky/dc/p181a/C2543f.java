package com.google.android.finsky.dc.p181a;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;

final class C2543f extends AsyncTask {
    public final /* synthetic */ C2538b f13616a;

    C2543f(C2538b c2538b) {
        this.f13616a = c2538b;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            C2538b c2538b = this.f13616a;
            if (c2538b.f13596c.mo2294a(12635351)) {
                C0954a.bB.m5763a(ab.m21685a(c2538b.f13604k));
            }
            FinskyLog.m21659a("Self-update ready to be installed, waiting for market to close.", new Object[0]);
            c2538b.f13598e.m16266a(10000, new C2541d(c2538b, uri));
            return;
        }
        this.f13616a.m13509c();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f13616a.mo2936a(((Uri[]) objArr)[0]);
    }
}
