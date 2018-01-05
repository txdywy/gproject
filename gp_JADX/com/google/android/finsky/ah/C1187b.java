package com.google.android.finsky.ah;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C1187b extends BroadcastReceiver {
    public final /* synthetic */ C1186a f7264a;

    C1187b(C1186a c1186a) {
        this.f7264a = c1186a;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (this.f7264a) {
            this.f7264a.f7262c = null;
        }
    }
}
