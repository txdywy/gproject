package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.dk.C2830g;

final class ak extends AsyncTask {
    public long f23482a;
    public final /* synthetic */ ae f23483b;

    ak(ae aeVar) {
        this.f23483b = aeVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Long l = (Long) obj;
        if (this.f23482a > this.f23483b.f23454f) {
            this.f23483b.f23454f = this.f23482a;
            this.f23483b.f23456h = l.longValue();
        }
        this.f23483b.f23453e = true;
        this.f23483b.m21288i();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f23482a = System.currentTimeMillis();
        return Long.valueOf(C2830g.m14970d());
    }
}
