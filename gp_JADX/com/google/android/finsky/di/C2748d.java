package com.google.android.finsky.di;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.os.C0327a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5107g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C2748d {
    public final C2296c f14982a;
    public C2747c f14983b;
    public C1461c f14984c;
    public C4819c f14985d;
    public C5107g f14986e;

    public C2748d(Context context, C2296c c2296c, C1461c c1461c, C4817d c4817d) {
        this.f14982a = c2296c;
        this.f14984c = c1461c;
        File file = new File(context.getCacheDir(), "splits");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f14983b = new C2747c(file);
        this.f14985d = c4817d.mo4399a(Executors.newSingleThreadExecutor());
        this.f14986e = C5107g.m23705a(context);
    }

    public final Bundle m14803a(String str) {
        if (!C0327a.m1721a()) {
            return new C2745a().m14795a(-4).m14796a("Installing splits not supported.").m14794a();
        }
        boolean a = this.f14984c.dj().mo2294a(12637133);
        boolean a2 = this.f14984c.dj().mo2294a(12639086);
        if (!a && !a2) {
            return new C2745a().m14795a(-3).m14794a();
        }
        if (a || !a2 || this.f14986e.m23710a(str)) {
            return new C2745a().m14795a(0).m14794a();
        }
        return new C2745a().m14795a(-4).m14796a("Signature verification failed").m14794a();
    }

    final Bundle m14802a(C2746b c2746b) {
        boolean z = false;
        String str = c2746b.f14978a;
        String str2 = c2746b.f14979b;
        InputStream a = this.f14983b.m14799a(str, str2);
        if (a != null) {
            z = C2756l.m14812a(a);
        }
        if (!z) {
            return new C2745a().m14795a(-4).m14796a("Verification error").m14794a();
        }
        m14804b(str);
        try {
            Bundle a2;
            if (!m14801a(str, str2)) {
                FinskyLog.m21667d("Error streaming apk.", new Object[0]);
                a2 = new C2745a().m14795a(-4).m14796a("Session error").m14794a();
                return a2;
            } else if (m14805c(str)) {
                a2 = new C2745a().m14795a(0).m14794a();
                this.f14982a.mo2841a(str);
                return a2;
            } else {
                FinskyLog.m21667d("Error committing install session.", new Object[0]);
                a2 = new C2745a().m14795a(-4).m14796a("Session error").m14794a();
                this.f14982a.mo2841a(str);
                return a2;
            }
        } finally {
            this.f14982a.mo2841a(str);
        }
    }

    final void m14804b(String str) {
        this.f14982a.mo2847a(str, null, 0, 4, null, 2);
    }

    private final boolean m14801a(String str, String str2) {
        Closeable a;
        Throwable e;
        Throwable th;
        Object obj;
        Closeable closeable = null;
        InputStream a2 = this.f14983b.m14799a(str, str2);
        if (a2 == null) {
            FinskyLog.m21667d("Error getting stream from cache: %s %s", str, str2);
            return false;
        }
        try {
            a = this.f14982a.mo2839a(str, str2, -1);
            try {
                C4692x.m21843a(a2, a);
                try {
                    this.f14982a.mo2840a((OutputStream) a);
                    C4679j.m21814a(null);
                    C4679j.m21814a(a);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        FinskyLog.m21660a(e, "Error copying split to PackageInstaller. %s, %s", str, str2);
                        C4679j.m21814a(closeable);
                        C4679j.m21814a(a);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        C4679j.m21814a(closeable);
                        C4679j.m21814a(a);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                obj = a2;
                FinskyLog.m21660a(e, "Error copying split to PackageInstaller. %s, %s", str, str2);
                C4679j.m21814a(closeable);
                C4679j.m21814a(a);
                return false;
            } catch (Throwable th3) {
                th = th3;
                obj = a2;
                C4679j.m21814a(closeable);
                C4679j.m21814a(a);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            a = null;
            closeable = a2;
            FinskyLog.m21660a(e, "Error copying split to PackageInstaller. %s, %s", str, str2);
            C4679j.m21814a(closeable);
            C4679j.m21814a(a);
            return false;
        } catch (Throwable th4) {
            th = th4;
            a = null;
            closeable = a2;
            C4679j.m21814a(closeable);
            C4679j.m21814a(a);
            throw th;
        }
    }

    final boolean m14805c(String str) {
        boolean z = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f14982a.mo2850a(str, true, new C2751g(atomicBoolean, countDownLatch));
            countDownLatch.await();
            z = atomicBoolean.get();
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error waiting for countdown latch", new Object[z]);
        }
        return z;
    }
}
