package com.google.android.finsky.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.activities.dt extends BroadcastReceiver
{

    public final InlineAppDetailsDialog a;

    dt(InlineAppDetailsDialog p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        if (this.a.G != 0 && "homekey".equals(p1.getStringExtra("reason")))
            this.a.C.b(new com.google.android.finsky.d.d(this.a.G).a(604));
    }

}
