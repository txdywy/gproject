package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class C5118f implements Callback {
    public final C4950g f26030a;
    public final ArrayList f26031b = new ArrayList();
    public ArrayList f26032c = new ArrayList();
    public final ArrayList f26033d = new ArrayList();
    public volatile boolean f26034e = false;
    public final AtomicInteger f26035f = new AtomicInteger(0);
    public boolean f26036g = false;
    public final Handler f26037h;
    public final Object f26038i = new Object();

    public C5118f(Looper looper, C4950g c4950g) {
        this.f26030a = c4950g;
        this.f26037h = new Handler(looper, this);
    }

    public final void m23787a() {
        this.f26034e = false;
        this.f26035f.incrementAndGet();
    }

    public final void m23788a(C1634r c1634r) {
        am.m23733a((Object) c1634r);
        synchronized (this.f26038i) {
            if (this.f26033d.contains(c1634r)) {
                String valueOf = String.valueOf(c1634r);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.f26033d.add(c1634r);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C1632q c1632q = (C1632q) message.obj;
            synchronized (this.f26038i) {
                if (this.f26034e && this.f26030a.mo4565j() && this.f26031b.contains(c1632q)) {
                    this.f26030a.mo4564a();
                    c1632q.mo2363a(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
