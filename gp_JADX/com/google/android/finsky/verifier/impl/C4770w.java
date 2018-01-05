package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.bb;

final class C4770w extends BroadcastReceiver {
    public final /* synthetic */ C4769v f24719a;

    C4770w(C4769v c4769v) {
        this.f24719a = c4769v;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!intent.getBooleanExtra("lite_run", false)) {
            if (intent.getBooleanExtra("success", false)) {
                bb.m21792a(new C4771x(this), new Void[0]);
            } else {
                this.f24719a.m22069l();
            }
        }
    }
}
