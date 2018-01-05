package com.google.android.finsky.ct;

import android.content.Context;
import android.os.AsyncTask;

final class C2413b extends AsyncTask {
    public final /* synthetic */ Context f11714a;
    public final /* synthetic */ Runnable f11715b;
    public final /* synthetic */ C2412a f11716c;

    C2413b(C2412a c2412a, Context context, Runnable runnable) {
        this.f11716c = c2412a;
        this.f11714a = context;
        this.f11715b = runnable;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.f11715b != null) {
            this.f11715b.run();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f11716c.m12121b(this.f11714a);
        return null;
    }
}
