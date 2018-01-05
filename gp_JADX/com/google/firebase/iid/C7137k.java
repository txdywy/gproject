package com.google.firebase.iid;

import android.util.Log;

final class C7137k implements Runnable {
    public /* synthetic */ C7134h f34872a;
    public /* synthetic */ C7136j f34873b;

    C7137k(C7136j c7136j, C7134h c7134h) {
        this.f34873b = c7136j;
        this.f34872a = c7134h;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f34873b.f34871a.mo6018b(this.f34872a.f34865a);
        this.f34872a.m32391a();
    }
}
