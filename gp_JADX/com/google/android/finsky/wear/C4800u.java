package com.google.android.finsky.wear;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.C4690v;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

final class C4800u extends AsyncTask {
    public final /* synthetic */ C2129c f25055a;
    public final /* synthetic */ Uri f25056b;
    public final /* synthetic */ long f25057c;
    public final /* synthetic */ String f25058d;
    public final /* synthetic */ C4796q f25059e;

    C4800u(C4796q c4796q, C2129c c2129c, Uri uri, long j, String str) {
        this.f25059e = c4796q;
        this.f25055a = c2129c;
        this.f25056b = uri;
        this.f25057c = j;
        this.f25058d = str;
    }

    private final C4689u m22576a() {
        Throwable th;
        C4796q c4796q;
        C4790k c4790k;
        String str;
        C4789j a;
        Closeable closeable = null;
        String str2 = this.f25055a.f10807a;
        Closeable c;
        try {
            Closeable openInputStream = this.f25059e.f25041j.getContentResolver().openInputStream(this.f25056b);
            try {
                c = this.f25059e.m22572c();
            } catch (IOException e) {
                C4796q c4796q2 = this.f25059e;
                C4790k c4790k2 = c4796q2.f25042k;
                String str3 = c4796q2.f25035d;
                C4789j a2 = new C4789j(127, c4796q2.f25048q).m22537b(str2).m22538c("open-IOException").m22533a(963).m22534a(c4796q2.f25038g);
                a2.f24996b = c4796q2.f25035d;
                c4790k2.m22545a(str2, str3, a2.m22536a());
                FinskyLog.m21665c("IOException while copying %s (%s): %s", str2, this.f25059e.f25035d, e);
                C4679j.m21814a(openInputStream);
                C4679j.m21814a(null);
                return null;
            } catch (Throwable th2) {
                th = th2;
                c = openInputStream;
                C4679j.m21814a(c);
                C4679j.m21814a(closeable);
                throw th;
            }
            try {
                OutputStream a3 = C4690v.m21840a(c, this.f25057c);
                C4692x.m21843a(openInputStream, a3);
                C4689u a4 = a3.m21841a();
                try {
                    c.flush();
                    c.close();
                    C4679j.m21814a(openInputStream);
                    C4679j.m21814a(c);
                    return a4;
                } catch (IOException e2) {
                    c4796q = this.f25059e;
                    c4790k = c4796q.f25042k;
                    str = c4796q.f25035d;
                    a = new C4789j(127, c4796q.f25048q).m22537b(str2).m22538c("finish-IOException").m22533a(963).m22534a(c4796q.f25038g);
                    a.f24996b = c4796q.f25035d;
                    c4790k.m22545a(str2, str, a.m22536a());
                    FinskyLog.m21665c("IOException while finishing %s (%s): %s", str2, this.f25059e.f25035d, e2);
                    C4679j.m21814a(openInputStream);
                    C4679j.m21814a(c);
                    return null;
                }
            } catch (IOException e22) {
                c4796q = this.f25059e;
                c4790k = c4796q.f25042k;
                str = c4796q.f25035d;
                a = new C4789j(127, c4796q.f25048q).m22537b(str2).m22538c("copy-IOException").m22533a(963).m22534a(c4796q.f25038g);
                a.f24996b = c4796q.f25035d;
                c4790k.m22545a(str2, str, a.m22536a());
                FinskyLog.m21665c("IOException while copying %s (%s): %s", str2, this.f25059e.f25035d, e22);
                C4679j.m21814a(openInputStream);
                C4679j.m21814a(c);
                return null;
            } catch (Throwable th3) {
                th = th3;
                closeable = c;
                c = openInputStream;
                C4679j.m21814a(c);
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (FileNotFoundException e3) {
            C4796q c4796q3 = this.f25059e;
            C4790k c4790k3 = c4796q3.f25042k;
            String str4 = c4796q3.f25035d;
            C4789j a5 = new C4789j(127, c4796q3.f25048q).m22537b(str2).m22538c("source-FileNotFoundException").m22533a(963).m22534a(c4796q3.f25038g);
            a5.f24996b = c4796q3.f25035d;
            c4790k3.m22545a(str2, str4, a5.m22536a());
            FinskyLog.m21665c("FileNotFoundException %s", this.f25056b);
            C4679j.m21814a(null);
            C4679j.m21814a(null);
            return null;
        } catch (Throwable th4) {
            th = th4;
            c = null;
            C4679j.m21814a(c);
            C4679j.m21814a(closeable);
            throw th;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        int i;
        C4689u c4689u = (C4689u) obj;
        this.f25059e.f25045n.mo3179c(this.f25056b);
        if (c4689u != null) {
            C4796q c4796q = this.f25059e;
            String str = this.f25059e.f25034c;
            long j = this.f25057c;
            String str2 = this.f25058d;
            if (c4689u == null) {
                FinskyLog.m21667d("No digestResult for %s (%s)", str, c4796q.f25035d);
                i = 961;
            } else if (j != c4689u.f24071a) {
                FinskyLog.m21667d("Signature check of %s (%s) failed, size expected=%d actual=%d", str, c4796q.f25035d, Long.valueOf(j), Long.valueOf(c4689u.f24071a));
                i = 919;
            } else if (str2.equals(c4689u.f24073c)) {
                i = 0;
            } else {
                FinskyLog.m21667d("Signature check of %s (%s) failed, hash expected=%s actual=%s", str, c4796q.f25035d, str2, c4689u.f24073c);
                i = 960;
            }
            if (i != 0) {
                C4796q c4796q2 = this.f25059e;
                str2 = this.f25059e.f25034c;
                C4790k c4790k = c4796q2.f25042k;
                String str3 = c4796q2.f25035d;
                C4789j a = new C4789j(127, c4796q2.f25048q).m22537b(str2).m22538c("copy-verification").m22533a(i).m22534a(c4796q2.f25038g);
                a.f24996b = c4796q2.f25035d;
                c4790k.m22545a(str2, str3, a.m22536a());
            }
        } else {
            i = 963;
        }
        if (i != 0) {
            FinskyLog.m21667d("Error while copying download for %s (%s).", this.f25059e.f25034c, this.f25059e.f25035d);
            cancel(false);
            return;
        }
        this.f25059e.m22569b(127, null);
        FinskyLog.m21659a("Successfully copied APK to update %s (%s)", this.f25059e.f25034c, this.f25059e.f25035d);
        this.f25059e.m22564a(60, null);
        this.f25059e.m22568b();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22576a();
    }
}
