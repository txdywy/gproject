package com.google.android.libraries.performance.primes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;

final class el extends BroadcastReceiver {
    el() {
    }

    public final void onReceive(Context context, Intent intent) {
        C5989do.m27824a(3, "PrimesShutdown", "onReceive, action = %s", intent.getAction());
        if (ek.f30037a.f30040d) {
            context.unregisterReceiver(this);
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            eo b = cm.f29878b.f29879c.mo5218b();
            if (b != null && b.mo5221a() != null) {
                ((ScheduledExecutorService) b.mo5221a()).submit(new em(context));
            }
        }
    }
}
