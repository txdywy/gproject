package io.reactivex.internal.p558d;

import io.reactivex.C7814l;
import io.reactivex.internal.p564g.C7851s;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.CountDownLatch;

public final class C7815b extends CountDownLatch implements C7814l {
    public Object f40321a;
    public Throwable f40322b;
    public C7756b f40323c;
    public volatile boolean f40324d;

    public C7815b() {
        super(1);
    }

    public final void mo6545a(C7756b c7756b) {
        this.f40323c = c7756b;
        if (this.f40324d) {
            c7756b.mo6530a();
        }
    }

    public final void mo6546a(Object obj) {
        this.f40321a = obj;
        countDown();
    }

    public final void mo6547a(Throwable th) {
        this.f40322b = th;
        countDown();
    }

    public final Object m37620a() {
        if (getCount() != 0) {
            try {
                if (C7773a.f40298o && ((Thread.currentThread() instanceof C7851s) || C7773a.m37568a())) {
                    throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
                }
                await();
            } catch (Throwable e) {
                this.f40324d = true;
                C7756b c7756b = this.f40323c;
                if (c7756b != null) {
                    c7756b.mo6530a();
                }
                throw ExceptionHelper.m37735a(e);
            }
        }
        Throwable e2 = this.f40322b;
        if (e2 == null) {
            return this.f40321a;
        }
        throw ExceptionHelper.m37735a(e2);
    }
}
