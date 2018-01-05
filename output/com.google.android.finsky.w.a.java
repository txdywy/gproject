package com.google.android.finsky.w;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class com.google.android.finsky.w.a extends BroadcastReceiver
{

    public boolean m;

    a() {
        BroadcastReceiver();
    }

    public abstract void a();

    public abstract void a(Context p0, Intent p1);

    public final void onReceive(Context p0, Intent p1) {
        if (this.m == 0) {
            this.m = 1;
            this.a();
        }
        this.a(p0, p1);
    }

}
