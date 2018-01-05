package com.google.android.finsky.appdiscoveryservice.p128b;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import com.android.vending.p055a.C0625a;
import com.google.android.finsky.utils.FinskyLog;

public abstract class C1308f implements Runnable {
    public boolean f7759A;
    public boolean f7760B;
    public boolean f7761C;
    public Context f7762r;
    public C1316h f7763s;
    public C0625a f7764t;
    public String f7765u;
    public int f7766v;
    public int f7767w;
    public int f7768x;
    public int f7769y;
    public volatile boolean f7770z;

    protected C1308f(Context context, C1316h c1316h, int i, int i2, int i3, String str, C0625a c0625a) {
        this.f7762r = context;
        this.f7763s = c1316h;
        this.f7766v = i;
        this.f7767w = i2;
        this.f7768x = i3;
        this.f7765u = str;
        this.f7764t = c0625a;
        this.f7770z = c0625a.asBinder().isBinderAlive();
        try {
            this.f7764t.asBinder().linkToDeath(new C1315g(this), 0);
        } catch (RemoteException e) {
            FinskyLog.m21662b("IAppDiscoveryReceiver has already died, no results will be delivered.", new Object[0]);
        }
    }

    protected abstract void mo1682a(Context context, String str);

    protected abstract void mo1683b();

    public final void run() {
        mo1682a(this.f7762r, this.f7765u);
        synchronized (this) {
            Object obj = (this.f7759A || this.f7760B || this.f7761C) ? 1 : null;
            if (obj == null) {
                throw new IllegalStateException("This task must be cancelled or marked as either success or error");
            }
        }
    }

    public final synchronized void m7771c() {
        this.f7759A = true;
        mo1683b();
        m7767a(2);
    }

    protected final synchronized boolean m7772d() {
        return this.f7759A;
    }

    protected final synchronized void m7769a(Bundle bundle) {
        if (!this.f7759A && this.f7769y < this.f7768x) {
            this.f7769y++;
            if (this.f7760B) {
                throw new IllegalStateException("Attempting to call onResultReady after request marked as in error");
            } else if (this.f7761C) {
                throw new IllegalStateException("Attempting to call onResultReady after request has been marked as a success");
            } else if (this.f7770z) {
                try {
                    this.f7764t.mo1050a(this.f7767w, bundle);
                } catch (Throwable th) {
                    FinskyLog.m21667d("Exception encountered while attempting to call onReceiveResult: %s", th);
                }
            }
        }
    }

    protected final synchronized void m7773e() {
        if (this.f7761C) {
            throw new IllegalStateException("Calling onError after request has been marked successful");
        }
        this.f7760B = true;
        m7767a(4);
    }

    protected final synchronized void m7774f() {
        if (this.f7760B) {
            throw new IllegalStateException("Calling onSuccess after previously calling onError");
        }
        this.f7761C = true;
        m7767a(1);
    }

    protected final boolean m7775g() {
        if (C0327a.m1722b() && Secure.getInt(this.f7762r.getContentResolver(), "web_action_enabled", 1) == 1) {
            return true;
        }
        return false;
    }

    private final void m7767a(int i) {
        if (this.f7770z && this.f7764t.asBinder().pingBinder()) {
            try {
                this.f7764t.mo1049a(this.f7767w, i);
            } catch (Throwable th) {
                FinskyLog.m21667d("Exception encountered while attempting to call onRequestComplete: %s", th);
            }
        }
        this.f7763s.mo1688a(this.f7767w);
    }
}
