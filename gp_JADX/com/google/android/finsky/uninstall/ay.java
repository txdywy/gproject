package com.google.android.finsky.uninstall;

import android.os.AsyncTask;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.p111d.C2474c;

final class ay extends AsyncTask {
    public final /* synthetic */ at f23520a;

    ay(at atVar) {
        this.f23520a = atVar;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f23520a.bw.m13367a((C2474c) obj);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C2474c c2474c = new C2474c(193);
        C2830g c2830g = this.f23520a.as;
        return c2474c.m13228a(C2830g.m14965a(false));
    }
}
