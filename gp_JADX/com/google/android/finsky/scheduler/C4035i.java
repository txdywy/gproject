package com.google.android.finsky.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class C4035i extends BroadcastReceiver {
    public final /* synthetic */ C4034h f20300a;

    C4035i(C4034h c4034h) {
        this.f20300a = c4034h;
    }

    public final void onReceive(Context context, Intent intent) {
        FinskyLog.m21662b("onStateChange %s", intent.getAction());
        this.f20300a.m18920a();
    }
}
