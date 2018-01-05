package com.google.android.finsky.az;

import com.google.android.finsky.utils.FinskyLog;

final class C1536b implements Runnable {
    public final /* synthetic */ String f8272a;
    public final /* synthetic */ C1535a f8273b;

    C1536b(C1535a c1535a, String str) {
        this.f8273b = c1535a;
        this.f8272a = str;
    }

    public final void run() {
        FinskyLog.m21659a("Request cache cleared.", new Object[0]);
        synchronized (this.f8273b) {
            this.f8273b.f8271b.put(this.f8272a, Boolean.valueOf(true));
        }
    }
}
