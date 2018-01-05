package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.bb;

final class bu extends BroadcastReceiver {
    public final /* synthetic */ br f24482a;

    bu(br brVar) {
        this.f24482a = brVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!intent.getBooleanExtra("lite_run", false)) {
            if (intent.getBooleanExtra("success", false)) {
                bb.m21792a(new bv(this), new Void[0]);
            } else {
                this.f24482a.m22069l();
            }
        }
    }
}
