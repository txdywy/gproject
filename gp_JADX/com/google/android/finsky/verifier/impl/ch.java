package com.google.android.finsky.verifier.impl;

import android.os.AsyncTask;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class ch extends AsyncTask {
    public final /* synthetic */ VolleyError f24536a;
    public final /* synthetic */ int f24537b;
    public final /* synthetic */ Integer f24538c;
    public final /* synthetic */ cg f24539d;

    ch(cg cgVar, VolleyError volleyError, int i, Integer num) {
        this.f24539d = cgVar;
        this.f24536a = volleyError;
        this.f24537b = i;
        this.f24538c = num;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean a = this.f24539d.f24535a.f24534b.m22246a(this.f24539d.f24535a.f24533a);
        if (a) {
            this.f24539d.f24535a.f24534b.m22258i();
        }
        FinskyLog.m21667d("Verification id=%d error response %s", Integer.valueOf(this.f24539d.f24535a.f24534b.f24506o), this.f24536a);
        this.f24539d.f24535a.f24534b.m22242a(this.f24539d.f24535a.f24533a, this.f24537b, this.f24538c, a);
        if (a) {
            this.f24539d.f24535a.f24534b.m22069l();
        }
        return null;
    }
}
