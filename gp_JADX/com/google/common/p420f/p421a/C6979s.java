package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import com.google.common.p415b.ar;
import com.google.common.p415b.ce;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

abstract class C6979s extends C6978u implements Runnable {
    public ar f34377a;
    public final boolean f34378b = true;
    public final boolean f34379c = true;
    public final /* synthetic */ C6981r f34380d;

    C6979s(C6981r c6981r, ar arVar) {
        this.f34380d = c6981r;
        super(arVar.size());
        this.f34377a = (ar) C6937m.m31623a((Object) arVar);
    }

    abstract void mo5929a(boolean z, int i, Object obj);

    abstract void mo5931c();

    public final void run() {
        m31848a();
    }

    private final void m31846a(Throwable th) {
        boolean a;
        int i;
        int i2 = 1;
        C6937m.m31623a((Object) th);
        if (this.f34378b) {
            a = this.f34380d.mo5943a(th);
            if (a) {
                mo5930b();
                i = 1;
            } else {
                Set set = this.seenExceptions;
                if (set == null) {
                    set = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo5928a(set);
                    C6978u.f34375e.mo5955a(this, set);
                    set = this.seenExceptions;
                }
                i = C6981r.m31858a(set, th);
            }
        } else {
            i = 1;
            a = false;
        }
        boolean z = th instanceof Error;
        boolean z2 = this.f34378b;
        if (a) {
            i2 = 0;
        }
        if (((i & (i2 & z2)) | z) != 0) {
            String str;
            if (th instanceof Error) {
                str = "Input Future failed with Error";
            } else {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            C6981r.f34383e.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture$RunningState", "handleException", str, th);
        }
    }

    final void mo5928a(Set set) {
        if (!this.f34380d.isCancelled()) {
            C6981r.m31858a(set, ((C6987d) this.f34380d.value).f34419b);
        }
    }

    final void m31849a(int i, Future future) {
        boolean z = false;
        if (this.f34378b || !this.f34380d.isDone() || this.f34380d.isCancelled()) {
            z = true;
        }
        C6937m.m31631a(z, (Object) "Future was done before all dependencies completed");
        try {
            C6937m.m31631a(future.isDone(), (Object) "Tried to set value from future which is not done");
            if (this.f34378b) {
                if (future.isCancelled()) {
                    this.f34380d.f34384f = null;
                    this.f34380d.cancel(false);
                    return;
                }
                Object a = ak.m31879a(future);
                if (this.f34379c) {
                    mo5929a(this.f34378b, i, a);
                }
            } else if (this.f34379c && !future.isCancelled()) {
                mo5929a(this.f34378b, i, ak.m31879a(future));
            }
        } catch (ExecutionException e) {
            m31846a(e.getCause());
        } catch (Throwable th) {
            m31846a(th);
        }
    }

    final void m31848a() {
        int i = 1;
        int i2 = 0;
        int a = C6978u.f34375e.mo5954a(this);
        C6937m.m31631a(a >= 0, (Object) "Less than 0 remaining futures");
        if (a == 0) {
            boolean z = this.f34379c;
            if (this.f34378b) {
                i = 0;
            }
            if ((z & i) != 0) {
                ce ceVar = (ce) this.f34377a.iterator();
                while (ceVar.hasNext()) {
                    a = i2 + 1;
                    m31849a(i2, (au) ceVar.next());
                    i2 = a;
                }
            }
            mo5931c();
        }
    }

    void mo5930b() {
        this.f34377a = null;
    }

    static void m31847d() {
    }
}
