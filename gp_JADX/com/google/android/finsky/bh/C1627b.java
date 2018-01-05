package com.google.android.finsky.bh;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.car.C1629k;
import com.google.android.gms.car.C4987a;
import com.google.android.gms.car.C4995j;
import com.google.android.gms.common.api.C5058o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class C1627b {
    public final C1629k f8543a = new C1630d(this);
    public volatile boolean f8544b = false;
    public final List f8545c = new ArrayList();
    public final List f8546d = new ArrayList();
    public final Handler f8547e;
    public volatile boolean f8548f = false;
    public CountDownLatch f8549g = new CountDownLatch(1);
    public Context f8550h;
    public C1503a f8551i;
    public C5058o f8552j = null;
    public C1461c f8553k;
    public C4995j f8554l;

    public C1627b(Context context, C1503a c1503a, C1461c c1461c, Handler handler) {
        this.f8550h = context;
        this.f8551i = c1503a;
        this.f8553k = c1461c;
        this.f8547e = handler;
    }

    public final synchronized void m9310a(Runnable runnable) {
        if (!m9313c()) {
            runnable.run();
        } else if (this.f8549g.getCount() == 0) {
            runnable.run();
        } else {
            synchronized (this.f8545c) {
                this.f8545c.add(runnable);
            }
            if (this.f8553k.dj().mo2294a(12641200)) {
                if (this.f8554l == null) {
                    this.f8554l = new C4995j(this.f8550h, this.f8543a);
                }
            } else if (!this.f8548f) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.car.CONNECTED");
                intentFilter.addAction("com.google.android.gms.car.DISCONNECTED");
                this.f8550h.registerReceiver(new C1631e(this), intentFilter, "com.google.android.gms.permission.CAR", null);
                this.f8552j = C4987a.m23135a(this.f8550h, new C1633f(this), new C1635g(this), new C1637h(this));
                this.f8548f = true;
                this.f8552j.mo4557e();
            }
        }
    }

    final void m9309a() {
        new Object[1][0] = Boolean.valueOf(this.f8544b);
        this.f8549g.countDown();
        synchronized (this.f8545c) {
            while (!this.f8545c.isEmpty()) {
                ((Runnable) this.f8545c.remove(0)).run();
            }
        }
        m9311a(this.f8544b);
    }

    public final boolean m9312b() {
        if (!m9313c()) {
            return false;
        }
        try {
            this.f8549g.await();
            return this.f8544b;
        } catch (InterruptedException e) {
            FinskyLog.m21665c("Interrupted while awaiting projection result!", new Object[0]);
            return false;
        }
    }

    public final boolean m9313c() {
        return C4671b.m21787d() && !this.f8551i.f8183g;
    }

    final void m9311a(boolean z) {
        ArrayList arrayList;
        synchronized (this.f8546d) {
            arrayList = new ArrayList(this.f8546d);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.f8547e.post(new C1628c((C1638i) obj, z));
        }
    }
}
