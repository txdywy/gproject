package com.google.android.finsky.bh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C1631e extends BroadcastReceiver {
    public final /* synthetic */ C1627b f8558a;

    C1631e(C1627b c1627b) {
        this.f8558a = c1627b;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.car.CONNECTED".equals(intent.getAction())) {
            this.f8558a.f8544b = true;
            this.f8558a.m9309a();
            return;
        }
        this.f8558a.f8544b = false;
        this.f8558a.m9309a();
    }
}
