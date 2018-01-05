package com.google.android.finsky.ah;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class com.google.android.finsky.ah.b extends BroadcastReceiver
{

    public final com.google.android.finsky.ah.a a;

    b(com.google.android.finsky.ah.a p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        enter this.a;
        try {
            this.a.c = 0;
            exit this.a;
            return;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

}
