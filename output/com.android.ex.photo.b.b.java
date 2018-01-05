package com.android.ex.photo.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.Fragment;
import android.support.v4.app.bw;
import com.android.ex.photo.views.f;

public final class com.android.ex.photo.b.b extends BroadcastReceiver
{

    public final com.android.ex.photo.b.a a;

    b(com.android.ex.photo.b.a p0) {
        this.a = p0;
        BroadcastReceiver();
    }

    public final void onReceive(Context p0, Intent p1) {
        v0 = ((ConnectivityManager)p0.getSystemService("connectivity")).getActiveNetworkInfo();
        if (v0 == 0 || !v0.isConnected())
            this.a.ao = 0;
        else if (this.a.ao == 0 && !this.a.W()) {
            if (this.a.an == 0)
                this.a.o().a(2, this.a);
            this.a.o().a(3, this.a);
            this.a.ao = 1;
            this.a.ag.a(0);
        }
    }

}
