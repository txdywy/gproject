package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C4973u;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5068t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5127r;
import com.google.android.gms.common.internal.am;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ct extends C4954s {
    public static final ThreadLocal f25438d = new cu();
    public final Object f25439e;
    public cv f25440f;
    public WeakReference f25441g;
    public final CountDownLatch f25442h;
    public final ArrayList f25443i;
    public C1643x f25444j;
    public final AtomicReference f25445k;
    public C4980w f25446l;
    public Status f25447m;
    public volatile boolean f25448n;
    public boolean f25449o;
    public boolean f25450p;
    public C5127r f25451q;
    public Integer f25452r;
    public volatile by f25453s;
    public boolean f25454t;

    @Deprecated
    ct() {
        this.f25439e = new Object();
        this.f25442h = new CountDownLatch(1);
        this.f25443i = new ArrayList();
        this.f25445k = new AtomicReference();
        this.f25454t = false;
        this.f25440f = new cv(Looper.getMainLooper());
        this.f25441g = new WeakReference(null);
    }

    @Deprecated
    protected ct(Looper looper) {
        this.f25439e = new Object();
        this.f25442h = new CountDownLatch(1);
        this.f25443i = new ArrayList();
        this.f25445k = new AtomicReference();
        this.f25454t = false;
        this.f25440f = new cv(looper);
        this.f25441g = new WeakReference(null);
    }

    protected ct(C5058o c5058o) {
        this.f25439e = new Object();
        this.f25442h = new CountDownLatch(1);
        this.f25443i = new ArrayList();
        this.f25445k = new AtomicReference();
        this.f25454t = false;
        this.f25440f = new cv(c5058o != null ? c5058o.mo4555c() : Looper.getMainLooper());
        this.f25441g = new WeakReference(c5058o);
    }

    public static void m23063b(C4980w c4980w) {
        if (c4980w instanceof C4973u) {
            try {
                ((C4973u) c4980w).mo4500a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(c4980w);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    private final void m23064c(C4980w c4980w) {
        this.f25446l = c4980w;
        this.f25451q = null;
        this.f25442h.countDown();
        this.f25447m = this.f25446l.mo4505b();
        if (this.f25449o) {
            this.f25444j = null;
        } else if (this.f25444j != null) {
            this.f25440f.removeMessages(2);
            this.f25440f.m23550a(this.f25444j, m23065h());
        } else if (this.f25446l instanceof C4973u) {
            cw cwVar = new cw(this);
        }
        ArrayList arrayList = this.f25443i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C5068t) obj).mo4604a(this.f25447m);
        }
        this.f25443i.clear();
    }

    private final C4980w m23065h() {
        C4980w c4980w;
        boolean z = true;
        synchronized (this.f25439e) {
            if (this.f25448n) {
                z = false;
            }
            am.m23739a(z, (Object) "Result has already been consumed.");
            am.m23739a(m23077e(), (Object) "Result is not ready.");
            c4980w = this.f25446l;
            this.f25446l = null;
            this.f25444j = null;
            this.f25448n = true;
        }
        cc ccVar = (cc) this.f25445k.getAndSet(null);
        if (ccVar != null) {
            ccVar.mo4591a(this);
        }
        return c4980w;
    }

    public final C4980w mo4487a() {
        boolean z = true;
        am.m23739a(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        am.m23739a(!this.f25448n, (Object) "Result has already been consumed");
        if (this.f25453s != null) {
            z = false;
        }
        am.m23739a(z, (Object) "Cannot await if then() has been called.");
        try {
            this.f25442h.await();
        } catch (InterruptedException e) {
            m23074c(Status.f25626b);
        }
        am.m23739a(m23077e(), (Object) "Result is not ready.");
        return m23065h();
    }

    public final C4980w mo4488a(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        am.m23739a(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        am.m23739a(!this.f25448n, (Object) "Result has already been consumed.");
        if (this.f25453s != null) {
            z = false;
        }
        am.m23739a(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f25442h.await(j, timeUnit)) {
                m23074c(Status.f25628d);
            }
        } catch (InterruptedException e) {
            m23074c(Status.f25626b);
        }
        am.m23739a(m23077e(), (Object) "Result is not ready.");
        return m23065h();
    }

    public abstract C4980w mo4495a(Status status);

    public final void m23069a(cc ccVar) {
        this.f25445k.set(ccVar);
    }

    public final void mo4489a(C5068t c5068t) {
        am.m23743b(true, "Callback cannot be null.");
        synchronized (this.f25439e) {
            if (m23077e()) {
                c5068t.mo4604a(this.f25447m);
            } else {
                this.f25443i.add(c5068t);
            }
        }
    }

    public final void m23071a(C4980w c4980w) {
        boolean z = true;
        synchronized (this.f25439e) {
            if (this.f25450p || this.f25449o) {
                m23063b(c4980w);
                return;
            }
            if (m23077e()) {
            }
            am.m23739a(!m23077e(), (Object) "Results have already been set");
            if (this.f25448n) {
                z = false;
            }
            am.m23739a(z, (Object) "Result has already been consumed");
            m23064c(c4980w);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4490a(com.google.android.gms.common.api.C1643x r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r3 = r5.f25439e;
        monitor-enter(r3);
        if (r6 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r5.f25444j = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r5.f25448n;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.am.m23739a(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r5.f25453s;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.am.m23739a(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r5.mo4492c();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r5.m23077e();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.f25440f;	 Catch:{ all -> 0x0027 }
        r1 = r5.m23065h();	 Catch:{ all -> 0x0027 }
        r0.m23550a(r6, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r5.f25444j = r6;	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ct.a(com.google.android.gms.common.api.x):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4491b() {
        /*
        r2 = this;
        r1 = r2.f25439e;
        monitor-enter(r1);
        r0 = r2.f25449o;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f25448n;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.f25451q;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.f25451q;	 Catch:{ RemoteException -> 0x002c }
        r0.m23811a();	 Catch:{ RemoteException -> 0x002c }
    L_0x0016:
        r0 = r2.f25446l;	 Catch:{ all -> 0x0029 }
        m23063b(r0);	 Catch:{ all -> 0x0029 }
        r0 = 1;
        r2.f25449o = r0;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.gms.common.api.Status.f25629e;	 Catch:{ all -> 0x0029 }
        r0 = r2.mo4495a(r0);	 Catch:{ all -> 0x0029 }
        r2.m23064c(r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        goto L_0x000c;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ct.b():void");
    }

    public final void m23074c(Status status) {
        synchronized (this.f25439e) {
            if (!m23077e()) {
                m23071a(mo4495a(status));
                this.f25450p = true;
            }
        }
    }

    public final boolean mo4492c() {
        boolean z;
        synchronized (this.f25439e) {
            z = this.f25449o;
        }
        return z;
    }

    public final Integer mo4493d() {
        return this.f25452r;
    }

    public final boolean m23077e() {
        return this.f25442h.getCount() == 0;
    }

    public final boolean m23078f() {
        boolean c;
        synchronized (this.f25439e) {
            if (((C5058o) this.f25441g.get()) == null || !this.f25454t) {
                mo4491b();
            }
            c = mo4492c();
        }
        return c;
    }

    public final void m23079g() {
        boolean z = this.f25454t || ((Boolean) f25438d.get()).booleanValue();
        this.f25454t = z;
    }
}
