package com.google.android.gms.wearable;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class C5656s extends Handler {
    public boolean f28713a;
    public final C5655r f28714b = new C5655r();
    public /* synthetic */ C4779q f28715c;

    C5656s(C4779q c4779q, Looper looper) {
        this.f28715c = c4779q;
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        m26839a();
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                m26840a("dispatch");
            }
        }
    }

    @SuppressLint({"UntrackedBindService"})
    private final synchronized void m26839a() {
        if (!this.f28713a) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.f28715c.f24747a);
                Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 13).append("bindService: ").append(valueOf).toString());
            }
            this.f28715c.bindService(this.f28715c.f24750d, this.f28714b, 1);
            this.f28713a = true;
        }
    }

    @SuppressLint({"UntrackedBindService"})
    final synchronized void m26840a(String str) {
        if (this.f28713a) {
            if (Log.isLoggable("WearableLS", 2)) {
                String valueOf = String.valueOf(this.f28715c.f24747a);
                Log.v("WearableLS", new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(valueOf).length()).append("unbindService: ").append(str).append(", ").append(valueOf).toString());
            }
            try {
                this.f28715c.unbindService(this.f28714b);
            } catch (Throwable e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.f28713a = false;
        }
    }
}
