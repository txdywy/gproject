package com.google.android.finsky.contentfilterui;

import android.os.AsyncTask;
import com.android.volley.VolleyError;
import com.google.protobuf.nano.C0757i;

final class C2337b extends AsyncTask {
    public VolleyError f11513a;
    public final /* synthetic */ C2336a f11514b;

    C2337b(C2336a c2336a) {
        this.f11514b = c2336a;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C0757i c0757i = (C0757i) obj;
        if (c0757i == null) {
            super.mo1062a(this.f11513a);
        } else {
            this.f11514b.m11933b(c0757i);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f11513a = ((VolleyError[]) objArr)[0];
        return this.f11514b.m11932b();
    }
}
