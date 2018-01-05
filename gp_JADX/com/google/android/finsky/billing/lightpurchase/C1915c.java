package com.google.android.finsky.billing.lightpurchase;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.gms.auth.GoogleAuthException;
import java.io.IOException;

final class C1915c extends AsyncTask {
    public final /* synthetic */ AuthenticatedWebViewActivity f9840a;

    C1915c(AuthenticatedWebViewActivity authenticatedWebViewActivity) {
        this.f9840a = authenticatedWebViewActivity;
    }

    private final String m10263a() {
        Throwable e;
        String str = "weblogin:continue=";
        String valueOf = String.valueOf(Uri.encode(this.f9840a.f9619c));
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        this.f9840a.f9624h.m13367a(new C2474c(940));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            valueOf = this.f9840a.f9625i.mo2539a(this.f9840a, this.f9840a.f9618b, valueOf);
            this.f9840a.f9624h.m13367a(new C2474c(941).m13242b(SystemClock.elapsedRealtime() - elapsedRealtime));
            return valueOf;
        } catch (IOException e2) {
            e = e2;
            this.f9840a.f9624h.m13367a(new C2474c(941).m13242b(SystemClock.elapsedRealtime() - elapsedRealtime).m13210a(1).m13238a(e));
            return this.f9840a.f9619c;
        } catch (GoogleAuthException e3) {
            e = e3;
            this.f9840a.f9624h.m13367a(new C2474c(941).m13242b(SystemClock.elapsedRealtime() - elapsedRealtime).m13210a(1).m13238a(e));
            return this.f9840a.f9619c;
        }
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        this.f9840a.f9622f.a((String) obj, null);
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m10263a();
    }
}
