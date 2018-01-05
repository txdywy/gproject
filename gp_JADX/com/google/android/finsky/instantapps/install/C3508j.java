package com.google.android.finsky.instantapps.install;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C3508j extends BroadcastReceiver {
    public final /* synthetic */ PendingIntent f17739a;

    C3508j(PendingIntent pendingIntent) {
        this.f17739a = pendingIntent;
    }

    public final void onReceive(Context context, Intent intent) {
        context.unregisterReceiver(this);
        this.f17739a.cancel();
    }
}
