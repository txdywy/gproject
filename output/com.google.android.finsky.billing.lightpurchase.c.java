package com.google.android.finsky.billing.lightpurchase;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.wallet.ui.common.WebViewLayout;
import java.io.IOException;

public final class com.google.android.finsky.billing.lightpurchase.c extends AsyncTask
{

    public final AuthenticatedWebViewActivity a;

    c(AuthenticatedWebViewActivity p0) {
        this.a = p0;
        AsyncTask();
    }

    private final String a() {
 12:    v0 = String.valueOf(Uri.encode(this.a.c));
 20:    if (v0.length() != 0)
 22:        v0 = "weblogin:continue=".concat(v0);
        else
 83:        v0 = new String("weblogin:continue=");
 37:    this.a.h.a(new com.google.android.finsky.d.c(940));
 40:    v2 = SystemClock.elapsedRealtime();
 54:    v0 = this.a.i.a(this.a, this.a.b, v0);
 77:    this.a.h.a(new com.google.android.finsky.d.c(941).b(SystemClock.elapsedRealtime() - v2));
 80:    return v0;
 87:    v0 = ex;
116:    this.a.h.a(new com.google.android.finsky.d.c(941).b(SystemClock.elapsedRealtime() - v2).a(1).a(v0));
121:    v0 = this.a.c;
123:    return v0;
124:    v0 = ex;
125:    goto 88;
126:    try
            run 44...57
        catch (IOException ex) {
 44:        goto 87;
        }
        catch (GoogleAuthException ex) {
 44:        goto 124;
        }
    }

    public final Object doInBackground(Object[] p0) {
        return this.a();
    }

    public final void onPostExecute(Object p0) {
        this.a.f.a((String)p0, 0);
    }

}
