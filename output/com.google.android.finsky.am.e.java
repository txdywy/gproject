package com.google.android.finsky.am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.d.x;

public final class com.google.android.finsky.am.e extends BroadcastReceiver
{

    public final com.google.android.finsky.am.c a;

    e(com.google.android.finsky.am.c p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        if (this.a.h != 0)
            v0 = this.a.h;
        else
            v0 = this.a.e.dd();
        v0.b(new com.google.android.finsky.d.d(this.a.b));
        this.a.c();
    }

}
