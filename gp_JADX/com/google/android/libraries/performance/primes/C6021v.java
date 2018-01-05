package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p332a.C5946j;
import com.google.android.libraries.performance.primes.p332a.C5948l;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

final class C6021v extends C5949a implements dy, C5952o, C5974p {
    public static volatile C6021v f30089e;
    public final C5986u f30090f;
    public boolean f30091g = false;
    public final ReentrantLock f30092h = new ReentrantLock(true);
    public final C5946j f30093i;
    public final C5948l f30094j;
    public final eo f30095k;
    public final C6022z f30096l;
    public final C6022z f30097m;

    static C6021v m27900a(C5984a c5984a, Application application, eo eoVar, SharedPreferences sharedPreferences, ct ctVar) {
        C5916a.m27410b(VERSION.SDK_INT >= 24);
        if (f30089e == null) {
            synchronized (C6021v.class) {
                if (f30089e == null) {
                    f30089e = new C6021v(c5984a, application, eoVar, new C5948l(), new C6023w(), new C6024x(), sharedPreferences, ctVar.f29899d);
                }
            }
        }
        return f30089e;
    }

    private C6021v(C5984a c5984a, Application application, eo eoVar, C5948l c5948l, C6022z c6022z, C6022z c6022z2, SharedPreferences sharedPreferences, C5986u c5986u) {
        super(c5984a, application, eoVar, bv.SAME_THREAD);
        this.f30094j = c5948l;
        this.f30093i = new C5946j(sharedPreferences);
        this.f30095k = bw.m27748b(application);
        this.f30096l = c6022z;
        this.f30097m = c6022z2;
        this.f30090f = c5986u;
    }

    public final void mo5223d() {
        this.f30092h.lock();
        try {
            if (!this.f30091g) {
                C6018r.m27894a(this.f29613b).m27896a((C5950g) this);
                this.f30091g = true;
            }
            this.f30092h.unlock();
        } catch (Throwable th) {
            this.f30092h.unlock();
        }
    }

    public final void mo5224e() {
    }

    public final void mo5226b(Activity activity) {
        m27902b(1);
    }

    public final void mo5240a(Activity activity) {
        m27902b(2);
    }

    private final Future m27902b(int i) {
        return m27581b().submit(new C6025y(this, i));
    }

    static final String m27901a(int i) {
        switch (i) {
            case 0:
                return "UNKNOWN/MANUAL";
            case 1:
                return "FG_BG";
            case 2:
                return "BG_FG";
            case 3:
                return "FG_SRV_START";
            case 4:
                return "FG_SRV_STOP";
            default:
                return "UNEXPECTED";
        }
    }

    final void mo5222c() {
        this.f30092h.lock();
        try {
            if (this.f30091g) {
                C6018r.m27894a(this.f29613b).m27897b((C5950g) this);
                this.f30091g = false;
                this.f30093i.f29601a.f30014a.edit().remove("primes.battery.snapshot").commit();
            }
            this.f30092h.unlock();
        } catch (Throwable th) {
            this.f30092h.unlock();
        }
    }
}
