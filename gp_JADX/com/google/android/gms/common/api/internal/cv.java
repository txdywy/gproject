package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.Status;

public final class cv extends Handler {
    public cv() {
        this(Looper.getMainLooper());
    }

    public cv(Looper looper) {
        super(looper);
    }

    public final void m23550a(C1643x c1643x, C4980w c4980w) {
        sendMessage(obtainMessage(1, new Pair(c1643x, c4980w)));
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                C1643x c1643x = (C1643x) pair.first;
                C4980w c4980w = (C4980w) pair.second;
                try {
                    c1643x.mo2367a(c4980w);
                    return;
                } catch (RuntimeException e) {
                    ct.m23063b(c4980w);
                    throw e;
                }
            case 2:
                ((ct) message.obj).m23074c(Status.f25628d);
                return;
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
        }
    }
}
