package com.google.android.finsky.billing.p153c;

import android.os.AsyncTask;
import com.google.android.finsky.billing.p131e.C1823l;

final class C1783e extends AsyncTask {
    public final /* synthetic */ boolean f9232a;
    public final /* synthetic */ Runnable f9233b;
    public final /* synthetic */ C1780b f9234c;

    C1783e(C1780b c1780b, boolean z, Runnable runnable) {
        this.f9234c = c1780b;
        this.f9232a = z;
        this.f9233b = runnable;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f9234c.m9731a((C1823l) obj, this.f9232a);
        this.f9233b.run();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f9234c.f9216a.m9847b(this.f9234c.f9217b);
    }
}
