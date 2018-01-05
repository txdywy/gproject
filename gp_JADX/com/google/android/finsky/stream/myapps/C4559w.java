package com.google.android.finsky.stream.myapps;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C4559w extends BroadcastReceiver {
    public final String f23305a;
    public final Application f23306b;

    C4559w(String str, Application application) {
        this.f23305a = str;
        this.f23306b = application;
    }

    public final void onReceive(Context context, Intent intent) {
        C4552s.f23274a.remove(this.f23305a);
        this.f23306b.unregisterReceiver(this);
    }
}
