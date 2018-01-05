package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class C7134h {
    public final Intent f34865a;
    public final PendingResult f34866b;
    public boolean f34867c = false;
    public final ScheduledFuture f34868d;

    C7134h(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f34865a = intent;
        this.f34866b = pendingResult;
        this.f34868d = scheduledExecutorService.schedule(new C7135i(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    final synchronized void m32391a() {
        if (!this.f34867c) {
            this.f34866b.finish();
            this.f34868d.cancel(false);
            this.f34867c = true;
        }
    }
}
