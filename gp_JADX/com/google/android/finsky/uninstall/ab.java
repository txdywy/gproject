package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dk.C2830g;

final class ab extends AsyncTask {
    public long f23442a;
    public final /* synthetic */ C4605t f23443b;

    ab(C4605t c4605t) {
        this.f23443b = c4605t;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        if (this.f23442a > this.f23443b.f23661f) {
            this.f23443b.f23661f = this.f23442a;
            this.f23443b.f23663h = l.longValue();
        }
        this.f23443b.f23657b = true;
        this.f23443b.m21424f();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f23442a = System.currentTimeMillis();
        C1473m.f7980a.bD();
        return Long.valueOf(C2830g.m14970d());
    }
}
