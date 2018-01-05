package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class hr extends hz {
    public static final AtomicLong f26905h = new AtomicLong(Long.MIN_VALUE);
    public hu f26906a;
    public hu f26907b;
    public final PriorityBlockingQueue f26908c = new PriorityBlockingQueue();
    public final UncaughtExceptionHandler f26909d;
    public final Object f26910e = new Object();
    public final Semaphore f26911f = new Semaphore(2);
    public volatile boolean f26912g;

    hr(hv hvVar) {
        super(hvVar);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f26909d = new hs(this, "Thread death: Uncaught exception on worker thread");
        hs hsVar = new hs(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final void m24733a(Runnable runnable) {
        m24432x();
        am.m23733a((Object) runnable);
        ht htVar = new ht(this, runnable, "Task exception on worker thread");
        synchronized (this.f26910e) {
            this.f26908c.add(htVar);
            if (this.f26906a == null) {
                this.f26906a = new hu(this, "Measurement Worker", this.f26908c);
                this.f26906a.setUncaughtExceptionHandler(this.f26909d);
                this.f26906a.start();
            } else {
                hu huVar = this.f26906a;
                synchronized (huVar.f26919a) {
                    huVar.f26919a.notifyAll();
                }
            }
        }
    }

    public final void mo4728b() {
        if (Thread.currentThread() != this.f26906a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }
}
