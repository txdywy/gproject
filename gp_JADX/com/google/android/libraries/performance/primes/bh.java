package com.google.android.libraries.performance.primes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class bh extends BroadcastReceiver {
    public final /* synthetic */ be f29786a;

    bh(be beVar) {
        this.f29786a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.f29786a.m27729d();
            this.f29786a.f29781m = ((ScheduledExecutorService) this.f29786a.f29773c.mo5221a()).schedule(new bi(this, context), 5, TimeUnit.SECONDS);
        } else if (this.f29786a.f29780l.get()) {
            this.f29786a.m27729d();
        }
    }
}
