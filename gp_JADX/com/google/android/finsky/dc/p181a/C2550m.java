package com.google.android.finsky.dc.p181a;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller.Session;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.C4690v;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.Closeable;
import java.io.OutputStream;

final class C2550m extends AsyncTask {
    public final /* synthetic */ Uri f13631a;
    public final /* synthetic */ C2297d f13632b;
    public final /* synthetic */ C2549l f13633c;

    C2550m(C2549l c2549l, Uri uri, C2297d c2297d) {
        this.f13633c = c2549l;
        this.f13631a = uri;
        this.f13632b = c2297d;
    }

    private final C2552o m13525a() {
        Closeable a;
        Closeable closeable;
        Exception exception;
        Throwable th;
        Closeable closeable2 = null;
        C2552o c2552o;
        try {
            long j = this.f13633c.f13627a.f13605l;
            OutputStream openWrite = this.f13633c.f13630d.openWrite(this.f13633c.f13627a.f13600g, 0, j);
            a = C4690v.m21840a(openWrite, j);
            try {
                closeable2 = this.f13633c.f13627a.f13594a.getContentResolver().openInputStream(this.f13631a);
                C4692x.m21843a(closeable2, a);
                a.flush();
                this.f13633c.f13630d.fsync(openWrite);
                C4689u a2 = a.m21841a();
                if (this.f13633c.f13627a.f13605l != a2.f24071a) {
                    FinskyLog.m21665c("Signature check of %s failed, size expected=%d actual=%d", this.f13633c.f13627a.f13600g, Long.valueOf(this.f13633c.f13627a.f13605l), Long.valueOf(a2.f24071a));
                    c2552o = new C2552o(919, null);
                    C4679j.m21814a(a);
                    C4679j.m21814a(closeable2);
                    return c2552o;
                } else if (this.f13633c.f13627a.f13606m.equals(a2.f24073c)) {
                    C4679j.m21814a(a);
                    C4679j.m21814a(closeable2);
                    return C2552o.f13636c;
                } else {
                    FinskyLog.m21665c("Signature check of %s failed, hash expected=%s actual=%s", this.f13633c.f13627a.f13600g, this.f13633c.f13627a.f13606m, a2.f24073c);
                    c2552o = new C2552o(960, null);
                    C4679j.m21814a(a);
                    C4679j.m21814a(closeable2);
                    return c2552o;
                }
            } catch (Exception e) {
                closeable = a;
                exception = e;
                try {
                    c2552o = new C2552o(973, exception);
                    C4679j.m21814a(closeable);
                    C4679j.m21814a(closeable2);
                    return c2552o;
                } catch (Throwable th2) {
                    th = th2;
                    a = closeable;
                    C4679j.m21814a(a);
                    C4679j.m21814a(closeable2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4679j.m21814a(a);
                C4679j.m21814a(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            exception = e2;
            closeable = null;
            c2552o = new C2552o(973, exception);
            C4679j.m21814a(closeable);
            C4679j.m21814a(closeable2);
            return c2552o;
        } catch (Throwable th4) {
            th = th4;
            a = null;
            C4679j.m21814a(a);
            C4679j.m21814a(closeable2);
            throw th;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2552o c2552o = (C2552o) obj;
        Object obj2 = (c2552o.f13637a == 0 && c2552o.f13638b == null) ? 1 : null;
        if (obj2 == null) {
            this.f13633c.f13627a.m13504a(c2552o.f13637a, c2552o.f13638b);
            return;
        }
        Session session = this.f13633c.f13630d;
        C2549l c2549l = this.f13633c;
        BroadcastReceiver c2551n = new C2551n(c2549l, this.f13632b);
        String valueOf = String.valueOf("com.android.vending.selfupdate.INTENT_PACKAGE_INSTALL_COMMIT.");
        String valueOf2 = String.valueOf(c2549l.f13627a.f13600g);
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(valueOf2);
        c2549l.f13627a.f13594a.registerReceiver(c2551n, intentFilter);
        session.commit(PendingIntent.getBroadcast(c2549l.f13627a.f13594a, c2549l.f13627a.f13600g.hashCode(), new Intent(valueOf2), 1207959552).getIntentSender());
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m13525a();
    }
}
