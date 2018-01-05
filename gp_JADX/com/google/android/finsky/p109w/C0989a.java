package com.google.android.finsky.p109w;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class C0989a extends BroadcastReceiver {
    public boolean f5966m;

    public abstract void mo1179a();

    public abstract void mo1180a(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        if (!this.f5966m) {
            this.f5966m = true;
            mo1179a();
        }
        mo1180a(context, intent);
    }
}
