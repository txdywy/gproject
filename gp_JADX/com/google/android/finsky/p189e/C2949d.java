package com.google.android.finsky.p189e;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

final class C2949d extends AsyncTask {
    public final /* synthetic */ C1518d f15573a;
    public final /* synthetic */ Uri f15574b;
    public final /* synthetic */ t f15575c;
    public final /* synthetic */ boolean f15576d;
    public final /* synthetic */ String f15577e;
    public final /* synthetic */ C2956k f15578f;
    public final /* synthetic */ C2948c f15579g;

    C2949d(C2948c c2948c, C1518d c1518d, Uri uri, t tVar, boolean z, String str, C2956k c2956k) {
        this.f15579g = c2948c;
        this.f15573a = c1518d;
        this.f15574b = uri;
        this.f15575c = tVar;
        this.f15576d = z;
        this.f15577e = str;
        this.f15578f = c2956k;
    }

    private final C2957l m15330a() {
        Closeable openInputStream;
        C2957l a;
        Throwable th;
        Closeable closeable = null;
        String str = this.f15573a.f8208f;
        try {
            openInputStream = this.f15579g.f15567a.getContentResolver().openInputStream(this.f15574b);
            try {
                if (this.f15576d) {
                    int i = this.f15573a.f8213k.b;
                    FinskyLog.m21659a("Decompressing %s (%s) format %d", str, this.f15573a.f8207e, Integer.valueOf(i));
                    if (i == 2) {
                        openInputStream = new GZIPInputStream(openInputStream, 8192);
                    } else if (i == 1) {
                        openInputStream = this.f15579g.f15572f.m15324a(openInputStream);
                    } else {
                        FinskyLog.m21665c("Unknown compression format: %d", Integer.valueOf(i));
                    }
                }
                try {
                    OutputStream e = this.f15573a.mo2280e();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        OutputStream a2 = C2947b.m15325a(this.f15577e, e, this.f15573a);
                        C4692x.m21843a(openInputStream, a2);
                        Object a3 = a2.m21841a();
                        FinskyLog.m21659a("%s (%s) (%d bytes) copied successfully in %d ms", str, this.f15573a.f8207e, Long.valueOf(this.f15573a.f8209g), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        C2958m.m15349a(this.f15579g.f15570d, this.f15579g.f15571e);
                        try {
                            this.f15573a.mo2278a(e);
                            a = C2957l.m15348a(a3);
                            C4679j.m21814a(openInputStream);
                            C4679j.m21814a(e);
                        } catch (Exception e2) {
                            a = this.f15579g.m15327a(this.f15573a, this.f15575c, "finish-IOException", e2);
                            C4679j.m21814a(openInputStream);
                            C4679j.m21814a(e);
                        }
                    } catch (Exception e22) {
                        a = this.f15579g.m15327a(this.f15573a, this.f15575c, "copy-IOException", e22);
                        C4679j.m21814a(openInputStream);
                        C4679j.m21814a(e);
                    }
                } catch (Exception e222) {
                    a = this.f15579g.m15327a(this.f15573a, this.f15575c, "open-IOException", e222);
                    C4679j.m21814a(openInputStream);
                    C4679j.m21814a(closeable);
                }
            } catch (Exception e2222) {
                a = this.f15579g.m15327a(this.f15573a, this.f15575c, "compression-IOException", e2222);
                C4679j.m21814a(openInputStream);
                C4679j.m21814a(closeable);
            } catch (Throwable th2) {
                th = th2;
                C4679j.m21814a(openInputStream);
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (Exception e22222) {
            a = this.f15579g.m15327a(this.f15573a, this.f15575c, "source-FileNotFoundException", e22222);
            C4679j.m21814a(closeable);
            C4679j.m21814a(closeable);
        } catch (Throwable th3) {
            th = th3;
            openInputStream = closeable;
            C4679j.m21814a(openInputStream);
            C4679j.m21814a(closeable);
            throw th;
        }
        return a;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2957l c2957l = (C2957l) obj;
        if (c2957l.f15602a == null) {
            this.f15578f.mo3411a(c2957l.f15603b);
            return;
        }
        int a = C2955j.m15344a(this.f15573a, (C4689u) c2957l.f15602a);
        if (a == 0) {
            this.f15579g.f15568b.m11221a(this.f15573a.f8208f, new C2474c(127).m13231a(this.f15575c).m13236a(this.f15573a.f8208f).f13342a);
            this.f15578f.mo3410a();
            return;
        }
        FinskyLog.m21665c("Copy error (copy-verification) for %s (%s)", this.f15573a.f8208f, this.f15573a.f8207e);
        this.f15579g.f15568b.m11221a(this.f15573a.f8208f, new C2474c(127).m13244b("copy-verification").m13210a(a).m13231a(this.f15575c).m13236a(this.f15573a.f8208f).f13342a);
        this.f15578f.mo3411a(a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15330a();
    }
}
