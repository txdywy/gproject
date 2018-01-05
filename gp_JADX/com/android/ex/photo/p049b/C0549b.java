package com.android.ex.photo.p049b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class C0549b extends BroadcastReceiver {
    public final /* synthetic */ C0548a f3748a;

    C0549b(C0548a c0548a) {
        this.f3748a = c0548a;
    }

    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f3748a.ao = false;
        } else if (!this.f3748a.ao && !this.f3748a.mo968W()) {
            if (!this.f3748a.an) {
                this.f3748a.m613o().mo312a(2, this.f3748a);
            }
            this.f3748a.m613o().mo312a(3, this.f3748a);
            this.f3748a.ao = true;
            this.f3748a.ag.m4186a(0);
        }
    }
}
