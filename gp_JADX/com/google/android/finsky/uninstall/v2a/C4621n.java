package com.google.android.finsky.uninstall.v2a;

import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dk.C2830g;

final class C4621n extends AsyncTask {
    public long f23788a;
    public final /* synthetic */ C4613f f23789b;

    C4621n(C4613f c4613f) {
        this.f23789b = c4613f;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        if (this.f23788a > this.f23789b.f23763f) {
            this.f23789b.f23763f = this.f23788a;
            this.f23789b.f23765h = l.longValue();
        }
        this.f23789b.f23759b = true;
        this.f23789b.m21548g();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f23788a = System.currentTimeMillis();
        C1473m.f7980a.bD();
        return Long.valueOf(C2830g.m14970d());
    }
}
