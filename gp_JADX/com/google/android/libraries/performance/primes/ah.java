package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import com.google.android.libraries.performance.primes.p336h.C6004c;
import com.google.android.libraries.performance.primes.p339f.C5995b;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.ba;
import d.a.a.a.a.a.bb;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.r;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.atomic.AtomicBoolean;

final class ah extends C5949a implements dy {
    public static volatile ah f29641e;
    public final boolean f29642f;
    public final int f29643g;
    public final AtomicBoolean f29644h = new AtomicBoolean();
    public final C6018r f29645i;
    public volatile cc f29646j;
    public volatile ak f29647k;
    public final boolean f29648l;

    static ah m27606a(C5984a c5984a, Application application, eo eoVar, cz czVar, boolean z) {
        if (f29641e == null) {
            synchronized (ah.class) {
                if (f29641e == null) {
                    ag agVar = czVar.f29934f;
                    C6004c c6004c = czVar.f29933e;
                    boolean z2 = czVar.f29932d;
                    f29641e = new ah(c5984a, c6004c, eoVar, application, czVar.f29931c, z);
                }
            }
        }
        return f29641e;
    }

    private ah(C5984a c5984a, C6004c c6004c, eo eoVar, Application application, float f, boolean z) {
        boolean z2 = false;
        super(c5984a, application, eoVar, bv.SAME_THREAD);
        C5916a.m27406a((Object) c6004c);
        boolean z3 = f > 0.0f && f <= 100.0f;
        C5916a.m27409a(z3, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.f29645i = C6018r.m27894a(application);
        C5995b c5995b = new C5995b(f / 100.0f);
        if (c5995b.f30055a == 1.0f || c5995b.f30056b.nextFloat() <= c5995b.f30055a) {
            z2 = true;
        }
        this.f29642f = z2;
        this.f29643g = (int) (100.0f / f);
        this.f29648l = z;
    }

    private final r m27608f() {
        C5917b.m27414b();
        File file = new File(this.f29613b.getFilesDir(), "primes_crash");
        try {
            if (file.exists()) {
                C5989do.m27824a(3, "CrashMetricService", "found persisted crash", new Object[0]);
                r rVar = new r();
                if (m27607a(file, rVar)) {
                    return rVar;
                }
                C5989do.m27824a(5, "CrashMetricService", "could not delete crash file", new Object[0]);
            }
        } catch (Throwable e) {
            C5989do.m27826a("CrashMetricService", "IO failure", e, new Object[0]);
        } catch (Throwable e2) {
            C5989do.m27826a("CrashMetricService", "Unexpected SecurityException", e2, new Object[0]);
        }
        return null;
    }

    private static boolean m27607a(File file, r rVar) {
        Throwable th;
        FileInputStream fileInputStream;
        try {
            long length = file.length();
            if (length <= 0 || length >= 2147483647L) {
                rVar.a = Boolean.valueOf(true);
                fileInputStream = null;
            } else {
                int i = (int) length;
                byte[] bArr = new byte[i];
                fileInputStream = new FileInputStream(file);
                int i2 = 0;
                while (i2 < i) {
                    try {
                        i2 += fileInputStream.read(bArr, i2, i - i2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C0757i.m4905a((C0757i) rVar, bArr);
            }
            boolean delete = file.delete();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return delete;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public final void mo5223d() {
        C5989do.m27824a(3, "CrashMetricService", "onPrimesInitialize", new Object[0]);
        r rVar = null;
        if (this.f29648l) {
            C5989do.m27824a(3, "CrashMetricService", "persistent crash enabled.", new Object[0]);
            try {
                rVar = m27608f();
            } catch (Throwable e) {
                C5989do.m27828b("CrashMetricService", "Unexpected failure: ", e, new Object[0]);
            }
        }
        if (!m27580a() || (rVar == null && !this.f29642f)) {
            C5989do.m27824a(4, "CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new Object[0]);
        } else {
            m27609a(2, rVar);
        }
    }

    final void m27610a(cc ccVar) {
        String str = "CrashMetricService";
        String str2 = "activeComponentName: ";
        String valueOf = String.valueOf(cc.m27771a(ccVar));
        C5989do.m27824a(3, str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        this.f29646j = ccVar;
    }

    public final void mo5224e() {
        C5989do.m27824a(3, "CrashMetricService", "onFirstActivityCreated", new Object[0]);
        if (m27580a() && this.f29642f) {
            m27581b().submit(new aj(this));
        } else {
            C5989do.m27824a(4, "CrashMetricService", "Startup metric for 'PRIMES_FIRST_ACTIVITY_LAUNCHED' dropped.", new Object[0]);
        }
        this.f29647k = new ai(this);
        this.f29645i.m27896a(this.f29647k);
    }

    final void m27609a(int i, r rVar) {
        bp bpVar = new bp();
        bpVar.h = new ba();
        bpVar.h.b = Integer.valueOf(this.f29643g);
        bpVar.h.a = i;
        if (rVar != null) {
            bpVar.h.c = new bb();
            bpVar.h.c.a = rVar;
        }
        m27577a(bpVar);
    }

    protected final void mo5222c() {
        if (this.f29647k != null) {
            this.f29645i.m27897b(this.f29647k);
            this.f29647k = null;
        }
        if (this.f29644h.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof al)) {
            Thread.setDefaultUncaughtExceptionHandler(((al) Thread.getDefaultUncaughtExceptionHandler()).f29651a);
        }
    }
}
