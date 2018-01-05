package com.google.android.finsky.billing.p151a;

import android.content.Context;
import com.android.volley.C0684b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.du;
import com.google.wireless.android.finsky.dfe.c.a.h;
import java.io.File;

public final class C1648a {
    public static final long f8585a = an.f24044g.mo4319a(2);
    public final File f8586b;
    public final C1661n f8587c;
    public C1652e f8588d;

    public C1648a(Context context, C1661n c1661n) {
        this.f8586b = context.getDir("commerce_acquire_cache", 0);
        this.f8587c = c1661n;
    }

    final synchronized void m9359a(String str, du duVar, long j, C2495w c2495w) {
        m9360a(str, C0757i.m4909a((C0757i) duVar), j, c2495w);
    }

    final synchronized void m9358a(String str, ae aeVar, long j, C2495w c2495w) {
        m9360a(str, C0757i.m4909a((C0757i) aeVar), j, c2495w);
    }

    final synchronized void m9360a(String str, byte[] bArr, long j, C2495w c2495w) {
        m9354a(c2495w, null);
        C0684b c0684b = new C0684b();
        c0684b.f4131a = bArr;
        c0684b.f4135e = C4678i.m21812a() + j;
        this.f8588d.mo1066a(str, c0684b);
    }

    final synchronized void m9356a(C1651d c1651d) {
        C1648a.m9355a(this.f8586b);
        if (c1651d != null) {
            c1651d.mo2439e();
        }
    }

    public final synchronized void m9357a(String str, C1651d c1651d) {
        m9354a(null, c1651d);
        this.f8588d.mo1069b(str);
        c1651d.mo2440f();
    }

    final synchronized boolean m9361a(String str) {
        return this.f8588d.m9397c(str);
    }

    public final synchronized ae m9362b(String str, C1651d c1651d) {
        ae aeVar;
        m9354a(null, c1651d);
        C0684b a = this.f8588d.mo1064a(str);
        if (a == null) {
            c1651d.mo2436c(2);
            aeVar = null;
        } else if (a.m4487a()) {
            c1651d.mo2436c(3);
            aeVar = null;
        } else {
            try {
                aeVar = (ae) C0757i.m4905a(new ae(), a.f4131a);
                c1651d.mo2438d();
            } catch (InvalidProtocolBufferNanoException e) {
                c1651d.mo2436c(4);
                FinskyLog.m21665c("Got an exception trying to parse the response: %s", e.toString());
                aeVar = null;
            }
        }
        return aeVar;
    }

    public final synchronized du m9363c(String str, C1651d c1651d) {
        du duVar;
        m9354a(null, c1651d);
        C0684b a = this.f8588d.mo1064a(str);
        if (a == null) {
            c1651d.mo2434b(2);
            duVar = null;
        } else if (a.m4487a()) {
            c1651d.mo2434b(3);
            duVar = null;
        } else {
            try {
                duVar = (du) C0757i.m4905a(new du(), a.f4131a);
                c1651d.mo2435c();
            } catch (InvalidProtocolBufferNanoException e) {
                c1651d.mo2434b(4);
                FinskyLog.m21665c("Got an exception trying to parse the response: %s", e.toString());
                duVar = null;
            }
        }
        return duVar;
    }

    final synchronized h m9364d(String str, C1651d c1651d) {
        h hVar;
        m9354a(null, c1651d);
        C0684b a = this.f8588d.mo1064a(str);
        if (a == null) {
            if (c1651d != null) {
                c1651d.mo2430a(2);
            }
            hVar = null;
        } else if (a.m4487a()) {
            if (c1651d != null) {
                c1651d.mo2430a(3);
            }
            hVar = null;
        } else {
            try {
                hVar = (h) C0757i.m4905a(new h(), a.f4131a);
                if (c1651d != null) {
                    c1651d.mo2433b();
                }
            } catch (InvalidProtocolBufferNanoException e) {
                if (c1651d != null) {
                    c1651d.mo2430a(4);
                }
                FinskyLog.m21665c("Got an exception trying to parse the response: %s", e.toString());
                hVar = null;
            }
        }
        return hVar;
    }

    static void m9355a(File file) {
        if (file.listFiles() != null) {
            for (File delete : file.listFiles()) {
                if (!delete.delete()) {
                    FinskyLog.m21665c("Couldn't delete the file: %s", r2[r0].getAbsolutePath());
                }
            }
        } else {
            FinskyLog.m21665c("Got null list of files for directory: %s", file.getAbsolutePath());
        }
        FinskyLog.m21659a("Commerce cache was cleared.", new Object[0]);
    }

    private final void m9354a(C2495w c2495w, C1651d c1651d) {
        if (this.f8588d == null) {
            this.f8588d = new C1652e(this.f8586b, f8585a);
            this.f8588d.mo1065a();
            if (c2495w != null) {
                c2495w.m13367a(new C2474c(2030));
            }
            if (c1651d != null) {
                c1651d.mo2429a();
            }
        }
    }
}
