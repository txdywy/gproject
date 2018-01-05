package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public abstract class C5436b implements Runnable {
    public static final AtomicLong f28099a = new AtomicLong(0);
    public final long f28100b;
    public final AtomicBoolean f28101c = new AtomicBoolean(false);
    public final Object f28102d = new Object();
    public final Object f28103e = new Object();
    public final Runnable f28104f;
    public final Runnable f28105g;
    public final Handler f28106h = new Handler(Looper.getMainLooper());
    public volatile C5461e f28107i = null;
    public long f28108j;
    public final AtomicReference f28109k = new AtomicReference();
    public String f28110l;
    public long f28111m;

    public C5436b() {
        this.f28101c.set(false);
        this.f28100b = f28099a.getAndIncrement();
        this.f28111m = 0;
        this.f28104f = new C5459c(this);
        this.f28105g = new C5460d(this);
        this.f28110l = "waiting to be scheduled";
    }

    public abstract void mo5006b();

    public abstract String mo5008d();

    public final void run() {
        this.f28109k.set(Thread.currentThread());
        try {
            synchronized (this) {
                this.f28110l = "running";
            }
            mo5006b();
            mo5007c();
        } catch (Throwable th) {
            try {
                String d = mo5008d();
                String valueOf = String.valueOf(this);
                Log.e("CancelableRunnable", new StringBuilder((String.valueOf(d).length() + 39) + String.valueOf(valueOf).length()).append(d).append("CancelableRunnable: uncaught exception ").append(valueOf).toString(), th);
            } finally {
                mo5007c();
            }
        }
    }

    protected final void m26260a() {
        if (this.f28101c.get()) {
            synchronized (this) {
                long a;
                String str;
                switch (this.f28107i.ordinal()) {
                    case 0:
                        a = m26259a(this.f28108j);
                        str = this.f28110l;
                        throw new TimeoutException(new StringBuilder(String.valueOf(str).length() + 81).append("canceled because overall it ran too long, ").append(a).append(" ms, was on step \"").append(str).append("\"").toString());
                    case 1:
                        a = m26259a(this.f28111m);
                        str = this.f28110l;
                        throw new TimeoutException(new StringBuilder(String.valueOf(str).length() + 79).append("canceled because the step ran too long, ").append(a).append(" ms, was on step \"").append(str).append("\"").toString());
                    case 2:
                        str = this.f28110l;
                        throw new TimeoutException(new StringBuilder(String.valueOf(str).length() + 70).append("canceled because the download manager has been stopped, was on step \"").append(str).append("\"").toString());
                    default:
                }
            }
        }
    }

    public boolean mo5005a(C5461e c5461e) {
        if (this.f28101c.getAndSet(true)) {
            return false;
        }
        this.f28106h.removeCallbacksAndMessages(this.f28103e);
        this.f28106h.removeCallbacksAndMessages(this.f28102d);
        this.f28107i = c5461e;
        synchronized (this) {
            String d;
            if (c5461e == C5461e.TIMEOUT_STEP) {
                d = mo5008d();
                String str = this.f28110l;
                Log.d("CancelableRunnable", new StringBuilder((String.valueOf(d).length() + 64) + String.valueOf(str).length()).append(d).append("canceling step ").append(str).append(", it has been running for ").append(m26259a(this.f28111m)).append(" ms").toString());
            } else if (c5461e == C5461e.TIMEOUT_OVERALL) {
                d = mo5008d();
                Log.d("CancelableRunnable", new StringBuilder(String.valueOf(d).length() + 66).append(d).append("canceling overall, it has been running for ").append(m26259a(this.f28108j)).append(" ms").toString());
            }
        }
        Thread thread = (Thread) this.f28109k.get();
        if (thread != null) {
            thread.interrupt();
        }
        return true;
    }

    private final long m26259a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return elapsedRealtime > this.f28108j ? elapsedRealtime - j : 0;
    }

    protected void mo5007c() {
        this.f28101c.getAndSet(true);
        this.f28106h.removeCallbacksAndMessages(this.f28103e);
        this.f28106h.removeCallbacksAndMessages(this.f28102d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f28100b != ((C5436b) obj).f28100b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) (this.f28100b ^ (this.f28100b >>> 32));
    }

    final void m26261a(int i, Runnable runnable) {
        this.f28106h.removeCallbacksAndMessages(runnable);
        this.f28106h.postAtTime(runnable, runnable, SystemClock.uptimeMillis() + ((long) i));
    }

    protected final void m26262a(int i, String str) {
        synchronized (this) {
            String d;
            String str2;
            if (this.f28110l != null) {
                d = mo5008d();
                str2 = this.f28110l;
                Log.v("CancelableRunnable", new StringBuilder((String.valueOf(d).length() + 57) + String.valueOf(str2).length()).append(d).append("scheduleStepTimeout: step \"").append(str2).append("\" took ").append(m26259a(this.f28111m)).append(" ms").toString());
            }
            this.f28110l = str;
            this.f28111m = SystemClock.elapsedRealtime();
            d = mo5008d();
            str2 = this.f28110l;
            Log.d("CancelableRunnable", new StringBuilder((String.valueOf(d).length() + 45) + String.valueOf(str2).length()).append(d).append("scheduleStepTimeout: delay=").append(i).append(", step=").append(str2).toString());
        }
        m26261a(i, this.f28104f);
    }

    public final String m26267e() {
        String str;
        synchronized (this) {
            if (this.f28111m == 0) {
                str = this.f28110l;
            } else {
                str = String.format(Locale.US, "%2d sec, %s", new Object[]{Long.valueOf(m26259a(this.f28111m) / 1000), this.f28110l});
            }
        }
        return str;
    }
}
