package com.google.android.finsky.bh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class com.google.android.finsky.bh.e extends BroadcastReceiver
{

    public final com.google.android.finsky.bh.b a;

    e(com.google.android.finsky.bh.b p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        if ("com.google.android.gms.car.CONNECTED".equals(p1.getAction())) {
            this.a.b = 1;
            this.a.a();
        }
        else {
            this.a.b = 0;
            this.a.a();
        }
    }

}
