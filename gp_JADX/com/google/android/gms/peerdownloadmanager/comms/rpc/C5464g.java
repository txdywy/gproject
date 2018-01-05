package com.google.android.gms.peerdownloadmanager.comms.rpc;

import com.google.android.gms.peerdownloadmanager.common.C5363f;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5404f;
import com.google.android.gms.peerdownloadmanager.p301e.C5485a;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class C5464g implements C5463u {
    public final ThreadPoolExecutor f28190a;
    public final C5476v f28191b;
    public final C5485a f28192c;
    public final C5366t f28193d;
    public final C5354j f28194e;
    public final C5404f f28195f;
    public final C5363f f28196g;
    public final Object f28197h = new Object();
    public final String f28198i;
    public final C5462f f28199j;
    public final ReentrantReadWriteLock f28200k = new ReentrantReadWriteLock(true);
    public boolean f28201l = false;

    public C5464g(C5485a c5485a, String str, C5366t c5366t, C5354j c5354j, C5404f c5404f, C5363f c5363f, ThreadPoolExecutor threadPoolExecutor, C5462f c5462f) {
        this.f28192c = c5485a;
        this.f28193d = c5366t;
        this.f28194e = c5354j;
        this.f28195f = c5404f;
        this.f28196g = c5363f;
        this.f28198i = str;
        this.f28190a = threadPoolExecutor;
        this.f28199j = c5462f;
        C5436b c5476v = new C5476v(c5404f, this.f28198i, this, c5462f);
        c5462f.m26328a(c5476v);
        this.f28191b = c5476v;
    }

    public final CommsRunnable m26331a(C5400g c5400g) {
        CommsRunnable commsRunnable = null;
        synchronized (this.f28197h) {
            if (this.f28201l) {
            } else if (this.f28200k.isWriteLocked()) {
                this.f28194e.mo4968a(c5400g);
            } else {
                C5485a c5485a = this.f28192c;
                ReentrantReadWriteLock reentrantReadWriteLock = this.f28200k;
                C5366t c5366t = this.f28193d;
                C5404f c5404f = this.f28195f;
                C5363f c5363f = this.f28196g;
                String str = this.f28198i;
                C5354j c5354j = this.f28194e;
                C5478x c5478x = new C5478x();
                C5462f c5462f = this.f28199j;
                commsRunnable = new CommsRunnable(c5485a, reentrantReadWriteLock, c5366t, c5400g, null, c5404f, c5363f, str, c5354j, true, c5462f);
                commsRunnable.m26285f();
                c5462f.m26328a(commsRunnable);
                this.f28190a.execute(commsRunnable);
            }
        }
        return commsRunnable;
    }

    public final void mo5014a(C5403e c5403e) {
        synchronized (this.f28197h) {
            if (this.f28201l) {
                aa.m26135a(c5403e);
                return;
            }
            C5485a c5485a = this.f28192c;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f28200k;
            C5366t c5366t = this.f28193d;
            C5404f c5404f = this.f28195f;
            C5363f c5363f = this.f28196g;
            String str = this.f28198i;
            C5354j c5354j = this.f28194e;
            C5478x c5478x = new C5478x();
            C5462f c5462f = this.f28199j;
            Runnable commsRunnable = new CommsRunnable(c5485a, reentrantReadWriteLock, c5366t, c5403e.mo5021d(), c5403e, c5404f, c5363f, str, c5354j, false, c5462f);
            commsRunnable.m26285f();
            c5462f.m26328a(commsRunnable);
            this.f28194e.mo4970a(commsRunnable, c5403e.mo5021d());
            this.f28190a.execute(commsRunnable);
        }
    }
}
