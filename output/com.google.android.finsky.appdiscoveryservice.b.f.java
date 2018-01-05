package com.google.android.finsky.appdiscoveryservice.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings$Secure;
import android.support.v4.os.a;
import com.android.vending.a.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.appdiscoveryservice.b.f implements Runnable
{

    public boolean A;
    public boolean B;
    public boolean C;
    public Context r;
    public com.google.android.finsky.appdiscoveryservice.b.h s;
    public com.android.vending.a.a t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public volatile boolean z;

    f(Context p0, com.google.android.finsky.appdiscoveryservice.b.h p1, int p2, int p3, int p4, String p5, com.android.vending.a.a p6) {
        this.r = p0;
        this.s = p1;
        this.v = p2;
        this.w = p3;
        this.x = p4;
        this.u = p5;
        this.t = p6;
        this.z = p6.asBinder().isBinderAlive();
        try {
            this.t.asBinder().linkToDeath(new com.google.android.finsky.appdiscoveryservice.b.g(this), 0);
        }
        catch (RemoteException ex) {
            FinskyLog.b("IAppDiscoveryReceiver has already died, no results will be delivered.", new Object[0]);
        }
    }

    private final void a(int p0) {
        if (this.z != 0 && this.t.asBinder().pingBinder()) {
            try {
                this.t.a(this.w, p0);
            }
            catch (Throwable ex) {
                v2 = new Object[1];
                v2[0] = ex;
                FinskyLog.d("Exception encountered while attempting to call onRequestComplete: %s", v2);
            }
        }
        this.s.a(this.w);
    }

    protected abstract void a(Context p0, String p1);

    protected final synchronized void a(Bundle p0) {
  0:    enter this;
  1:    try {
  3:        if (this.A != 0) {
 11:            exit this;
 12:            return;
            }
        }
        catch (Throwable ex) {
 32:        exit this;
 33:        throw ex;
        }
  9:    if (this.y < this.x) {
 13:        try {
 17:            this.y = this.y + 1;
 21:            if (this.B != 0)
 30:                throw new IllegalStateException("Attempting to call onResultReady after request marked as in error");
            }
            catch (Throwable ex) {
 32:            exit this;
 33:            throw ex;
            }
 34:        try {
 36:            if (this.C != 0)
 45:                throw new IllegalStateException("Attempting to call onResultReady after request has been marked as a success");
            }
            catch (Throwable ex) {
 32:            exit this;
 33:            throw ex;
            }
 48:        if (this.z != 0) {
 50:            try {
 54:                this.t.a(this.w, p0);
                }
                catch (Throwable ex) {
 32:                exit this;
 33:                throw ex;
                }
            }
        }
 11:    exit this;
 12:    return;
 59:    try {
 62:        v2 = new Object[1];
 65:        v2[0] = ex;
 67:        FinskyLog.d("Exception encountered while attempting to call onReceiveResult: %s", v2);
        }
        catch (Throwable ex) {
 32:        exit this;
 33:        throw ex;
        }
 70:    goto 11;
    }

    protected abstract void b();

    public final synchronized void c() {
        enter this;
        try {
            this.A = 1;
            this.b();
            this.a(2);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    protected final synchronized boolean d() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.A;
    }

    protected final synchronized void e() {
        enter this;
        try {
            if (this.C == 0) {
                try {
                    this.B = 1;
                    this.a(4);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return;
            }
            throw new IllegalStateException("Calling onError after request has been marked successful");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    protected final synchronized void f() {
        enter this;
        try {
            if (this.B == 0) {
                try {
                    this.C = 1;
                    this.a(1);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return;
            }
            throw new IllegalStateException("Calling onSuccess after previously calling onError");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    protected final boolean g() {
        v0 = 1;
        if (!android.support.v4.os.a.b() || Settings$Secure.getInt(this.r.getContentResolver(), "web_action_enabled", 1) != 1)
            v0 = 0;
        return v0;
    }

    public final void run() {
        this.a(this.r, this.u);
        enter this;
        try {
            if (this.A != 0 || this.B != 0 || this.C != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                try {
                    exit this;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                return;
            }
            throw new IllegalStateException("This task must be cancelled or marked as either success or error");
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

}
