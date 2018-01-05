package com.google.android.finsky.p189e;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C2953h extends AsyncTask {
    public final /* synthetic */ C1518d f15595a;
    public final /* synthetic */ t f15596b;
    public final /* synthetic */ boolean f15597c;
    public final /* synthetic */ Uri f15598d;
    public final /* synthetic */ C2956k f15599e;
    public final /* synthetic */ C2952g f15600f;

    public C2953h(C2952g c2952g, C1518d c1518d, t tVar, boolean z, Uri uri, C2956k c2956k) {
        this.f15600f = c2952g;
        this.f15595a = c1518d;
        this.f15596b = tVar;
        this.f15597c = z;
        this.f15598d = uri;
        this.f15599e = c2956k;
    }

    private final C2957l m15341a() {
        C2957l a;
        Closeable closeable;
        Throwable th;
        Closeable closeable2 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f15595a.f8208f;
        File b = this.f15595a.mo2275b();
        if (b == null) {
            return this.f15600f.m15337b(this.f15595a, this.f15596b, "source-NoSourceFile", new FileNotFoundException());
        }
        try {
            if (this.f15597c) {
                this.f15600f.f15589a.getPackageManager().getApplicationInfo(str, 0);
            }
            a = this.f15600f.m15339a(this.f15600f.f15589a, this.f15598d, this.f15595a, this.f15596b);
            if (a.f15603b != 0) {
                a = C2957l.m15347a(a.f15603b);
                C4679j.m21814a(null);
                C4679j.m21814a(null);
                return a;
            }
            closeable = (InputStream) a.f15602a;
            try {
                OutputStream e = this.f15595a.mo2280e();
                try {
                    String a2 = C2947b.m15326a(this.f15595a, this.f15600f.f15591c.dj());
                    this.f15596b.b(a2);
                    OutputStream a3 = C2947b.m15325a(a2, e, this.f15595a);
                    a = this.f15600f.m15340a(this.f15595a, b, closeable, a3, this.f15598d.toString(), this.f15596b);
                    if (a.f15603b != 0) {
                        a = C2957l.m15347a(a.f15603b);
                        C4679j.m21814a(closeable);
                        C4679j.m21814a(e);
                        return a;
                    }
                    Object a4 = a3.m21841a();
                    C2958m.m15349a(this.f15600f.f15592d, this.f15600f.f15593e);
                    this.f15595a.mo2278a(e);
                    FinskyLog.m21659a("Patch apply task for %s (%s) (format %d) completed in %d ms", str, this.f15595a.f8207e, Integer.valueOf(this.f15595a.f8214l.f), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    a = C2957l.m15348a(a4);
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(e);
                    return a;
                } catch (Exception e2) {
                    a = this.f15600f.m15334a(this.f15595a, this.f15596b, "finish-IOException", e2);
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(e);
                    return a;
                } catch (Throwable th2) {
                    th = th2;
                    Object obj = e;
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(closeable2);
                    throw th;
                }
            } catch (Exception e22) {
                a = this.f15600f.m15334a(this.f15595a, this.f15596b, "patch-IOException", e22);
                C4679j.m21814a(closeable);
                C4679j.m21814a(null);
                return a;
            } catch (Throwable th3) {
                th = th3;
                C4679j.m21814a(closeable);
                C4679j.m21814a(closeable2);
                throw th;
            }
        } catch (Exception e222) {
            FinskyLog.m21665c("NameNotFoundException %s", this.f15598d);
            a = this.f15600f.m15337b(this.f15595a, this.f15596b, "source-NameNotFoundException", e222);
            C4679j.m21814a(null);
            C4679j.m21814a(null);
            return a;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            C4679j.m21814a(closeable);
            C4679j.m21814a(closeable2);
            throw th;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2957l c2957l = (C2957l) obj;
        C4689u c4689u = (C4689u) c2957l.f15602a;
        if (c4689u == null) {
            this.f15599e.mo3411a(c2957l.f15603b);
            return;
        }
        int a = C2955j.m15344a(this.f15595a, c4689u);
        if (a == 0) {
            this.f15600f.f15590b.m11221a(this.f15595a.f8208f, new C2474c(108).m13236a(this.f15595a.f8208f).m13231a(this.f15596b).f13342a);
            FinskyLog.m21659a("Successfully applied patch to update %s (%s)", this.f15595a.f8208f, this.f15595a.f8207e);
            this.f15599e.mo3410a();
            return;
        }
        this.f15600f.f15590b.m11221a(this.f15595a.f8208f, new C2474c(108).m13244b("gdiff-verification").m13210a(a).m13231a(this.f15596b).m13236a(this.f15595a.f8208f).f13342a);
        this.f15599e.mo3411a(a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15341a();
    }
}
