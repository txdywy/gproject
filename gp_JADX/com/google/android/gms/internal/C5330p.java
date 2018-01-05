package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.p270c.C4909c;

@C5302b
public final class C5330p extends Handler {
    public C5330p(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            C4909c.m22927a().f25264d.m24772a(e, "AdMobHandler.handleMessage");
        }
    }
}
