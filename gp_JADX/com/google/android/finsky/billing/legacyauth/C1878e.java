package com.google.android.finsky.billing.legacyauth;

import android.os.AsyncTask;

public final class C1878e extends AsyncTask {
    public final /* synthetic */ boolean f9601a;
    public final /* synthetic */ C1874a f9602b;

    public C1878e(C1874a c1874a, boolean z) {
        this.f9602b = c1874a;
        this.f9601a = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (!isCancelled()) {
            this.f9602b.f9587b.m9846a(this.f9602b.f9586a, this.f9601a, "prefetch");
        }
        return null;
    }
}
