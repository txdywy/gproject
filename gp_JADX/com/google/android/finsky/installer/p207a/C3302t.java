package com.google.android.finsky.installer.p207a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C3302t extends BroadcastReceiver {
    public final /* synthetic */ C3301s f17097a;

    C3302t(C3301s c3301s) {
        this.f17097a = c3301s;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f17097a.f17088r.m14775a() && this.f17097a.f17075e.m11721c()) {
            this.f17097a.m16607a(false);
        }
    }
}
