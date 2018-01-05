package com.google.android.agera;

import android.os.Looper;
import java.util.Arrays;

public class C0894b implements C0893t {
    public static final Object[] f5641a = new Object[0];
    public final ao f5642b;
    public final Object f5643c;
    public final int f5644d;
    public Object[] f5645e;
    public int f5646f;
    public long f5647g;
    public boolean f5648h;

    protected C0894b() {
        this(0);
    }

    C0894b(int i) {
        this.f5643c = new Object();
        this.f5648h = false;
        C0917x.m5640a(Looper.myLooper() != null, "Can only be created on a Looper thread");
        this.f5644d = i;
        this.f5642b = ao.m5599a();
        this.f5645e = f5641a;
        this.f5646f = 0;
    }

    public final void mo1144a(am amVar) {
        Object obj = null;
        C0917x.m5640a(Looper.myLooper() != null, "Can only be added on a Looper thread");
        C0917x.m5639a(amVar);
        synchronized (this.f5643c) {
            ao a = ao.m5599a();
            int i = -1;
            for (int i2 = 0; i2 < this.f5645e.length; i2 += 2) {
                if (this.f5645e[i2] == amVar) {
                    throw new IllegalStateException("Updatable already added, cannot add.");
                }
                if (this.f5645e[i2] == null) {
                    i = i2;
                }
            }
            if (i == -1) {
                i = this.f5645e.length;
                this.f5645e = Arrays.copyOf(this.f5645e, i < 2 ? 2 : i * 2);
            }
            this.f5645e[i] = amVar;
            this.f5645e[i + 1] = a;
            this.f5646f++;
            if (this.f5646f == 1) {
                if (this.f5642b.hasMessages(1, this)) {
                    this.f5642b.removeMessages(1, this);
                } else if (Looper.myLooper() == this.f5642b.getLooper()) {
                    int i3 = 1;
                } else {
                    this.f5642b.obtainMessage(0, this).sendToTarget();
                }
            }
        }
        if (obj != null) {
            mo1158b();
        }
    }

    public final void mo1145b(am amVar) {
        boolean z = true;
        int i = 0;
        if (Looper.myLooper() == null) {
            z = false;
        }
        C0917x.m5640a(z, "Can only be removed on a Looper thread");
        C0917x.m5639a(amVar);
        synchronized (this.f5643c) {
            while (i < this.f5645e.length) {
                if (this.f5645e[i] == amVar) {
                    ((ao) this.f5645e[i + 1]).m5601a(amVar, this.f5643c);
                    this.f5645e[i] = null;
                    this.f5645e[i + 1] = null;
                    this.f5646f--;
                    if (this.f5646f == 0) {
                        this.f5642b.obtainMessage(1, this).sendToTarget();
                        this.f5642b.removeMessages(2, this);
                        this.f5648h = false;
                    }
                } else {
                    i += 2;
                }
            }
            throw new IllegalStateException("Updatable not added, cannot remove.");
        }
    }

    protected final void m5570a() {
        synchronized (this.f5643c) {
            if (!this.f5648h) {
                this.f5648h = true;
                this.f5642b.obtainMessage(2, this).sendToTarget();
            }
        }
    }

    protected void mo1158b() {
    }

    protected void mo1159c() {
    }
}
