package com.google.android.agera;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

final class ao extends Handler {
    public static final ThreadLocal f5668a = new ThreadLocal();
    public final C0911o f5669b = new C0911o();

    static ao m5599a() {
        WeakReference weakReference = (WeakReference) f5668a.get();
        ao aoVar = weakReference != null ? (ao) weakReference.get() : null;
        if (aoVar != null) {
            return aoVar;
        }
        aoVar = new ao();
        f5668a.set(new WeakReference(aoVar));
        return aoVar;
    }

    private ao() {
    }

    final synchronized void m5601a(am amVar, Object obj) {
        this.f5669b.m5631b(amVar, obj);
    }

    private final synchronized void m5600b(am amVar, Object obj) {
        if (this.f5669b.m5630a(amVar, obj)) {
            obtainMessage(3, amVar).sendToTarget();
        }
    }

    public final void handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                ((C0894b) message.obj).mo1158b();
                return;
            case 1:
                ((C0894b) message.obj).mo1159c();
                return;
            case 2:
                C0894b c0894b = (C0894b) message.obj;
                synchronized (c0894b.f5643c) {
                    if (c0894b.f5648h) {
                        if (c0894b.f5644d > 0) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j = elapsedRealtime - c0894b.f5647g;
                            if (j < ((long) c0894b.f5644d)) {
                                c0894b.f5642b.sendMessageDelayed(c0894b.f5642b.obtainMessage(2, c0894b), ((long) c0894b.f5644d) - j);
                                return;
                            }
                            c0894b.f5647g = elapsedRealtime;
                        }
                        c0894b.f5648h = false;
                        for (int i = 0; i < c0894b.f5645e.length; i += 2) {
                            am amVar = (am) c0894b.f5645e[i];
                            ao aoVar = (ao) c0894b.f5645e[i + 1];
                            if (amVar != null) {
                                aoVar.m5600b(amVar, c0894b.f5643c);
                            }
                        }
                        return;
                    }
                    return;
                }
            case 3:
                am amVar2 = (am) message.obj;
                if (this.f5669b.m5629a(amVar2)) {
                    amVar2.ad_();
                    return;
                }
                return;
            case 4:
                ((C0906i) message.obj).m5623e();
                return;
            case 5:
                C0906i c0906i = (C0906i) message.obj;
                Object obj = null;
                synchronized (c0906i) {
                    if (c0906i.f5681q == 2) {
                        c0906i.f5681q = 0;
                        if (c0906i.f5685u != c0906i.f5684t) {
                            obj = c0906i.f5685u;
                            c0906i.f5685u = c0906i.f5684t;
                        }
                        z = c0906i.f5682r;
                    }
                }
                if (obj != null) {
                    c0906i.f5679o.mo1146b(obj);
                }
                if (z) {
                    c0906i.m5623e();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
