package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class am extends Handler {
    public /* synthetic */ ak f25695a;

    am(ak akVar, Looper looper) {
        this.f25695a = akVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                al alVar = (al) message.obj;
                ak akVar = this.f25695a;
                akVar.f25679a.lock();
                try {
                    if (akVar.f25689k == alVar.f25694c) {
                        alVar.mo4606a();
                        akVar.f25679a.unlock();
                        return;
                    }
                    return;
                } finally {
                    akVar.f25679a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", "Unknown message id: " + message.what);
                return;
        }
    }
}
