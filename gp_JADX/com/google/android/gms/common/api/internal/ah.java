package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class ah extends Handler {
    public /* synthetic */ ac f25677a;

    ah(ac acVar, Looper looper) {
        this.f25677a = acVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ac.m23336b(this.f25677a);
                return;
            case 2:
                ac.m23332a(this.f25677a);
                return;
            default:
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                return;
        }
    }
}
