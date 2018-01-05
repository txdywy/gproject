package com.google.android.finsky.am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class com.google.android.finsky.am.d extends BroadcastReceiver
{

    public final com.google.android.finsky.am.c a;

    d(com.google.android.finsky.am.c p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        this.a.f();
        if (this.a.k != 0)
            this.a.e();
        else
            this.a.d();
    }

}
