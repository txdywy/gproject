package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final class C7135i implements Runnable {
    public /* synthetic */ Intent f34869a;
    public /* synthetic */ C7134h f34870b;

    C7135i(C7134h c7134h, Intent intent) {
        this.f34870b = c7134h;
        this.f34869a = intent;
    }

    public final void run() {
        String action = this.f34869a.getAction();
        Log.w("EnhancedIntentService", new StringBuilder(String.valueOf(action).length() + 61).append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.f34870b.m32391a();
    }
}
