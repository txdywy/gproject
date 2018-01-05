package com.google.android.finsky.am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C1230d extends BroadcastReceiver {
    public final /* synthetic */ C1229c f7377a;

    C1230d(C1229c c1229c) {
        this.f7377a = c1229c;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f7377a.m7233f();
        if (this.f7377a.f7374k) {
            this.f7377a.m7232e();
        } else {
            this.f7377a.m7231d();
        }
    }
}
