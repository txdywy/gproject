package com.google.android.finsky.instantapps.appmanagement;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class C3397p extends BroadcastReceiver {
    public final /* synthetic */ Map f17404a;
    public final /* synthetic */ CountDownLatch f17405b;

    C3397p(Map map, CountDownLatch countDownLatch) {
        this.f17404a = map;
        this.f17405b = countDownLatch;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) this.f17404a.remove(intent.getData().getSchemeSpecificPart());
        if (pendingIntent != null) {
            pendingIntent.cancel();
        }
        this.f17405b.countDown();
    }
}
