package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dk.C2830g;

final class C4601o extends AsyncTask {
    public long f23646a;
    public final /* synthetic */ C4597k f23647b;

    C4601o(C4597k c4597k) {
        this.f23647b = c4597k;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        if (this.f23646a > this.f23647b.f23630f) {
            this.f23647b.f23630f = this.f23646a;
            this.f23647b.f23632h = l.longValue();
        }
        this.f23647b.f23626b = true;
        this.f23647b.m21407b();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f23646a = System.currentTimeMillis();
        C1473m.f7980a.bD();
        return Long.valueOf(C2830g.m14970d());
    }
}
