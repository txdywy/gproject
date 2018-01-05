package com.google.android.gms.car;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ac extends BroadcastReceiver {
    public /* synthetic */ C4995j f25489a;

    ac(C4995j c4995j) {
        this.f25489a = c4995j;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f25489a.m23157a("com.google.android.gms.car.CONNECTED".equals(intent.getAction()) ? 1 : 2);
    }
}
