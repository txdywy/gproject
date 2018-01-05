package com.google.android.finsky.p148b;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0697m;
import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dfemodel.C1466f;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.externalreferrer.C3012d;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class C1537a implements C0657w {
    public final C1466f f8274a;
    public final C1287h f8275b;
    public final C1463g f8276c;
    public final C3012d f8277d;
    public final Document f8278e;
    public final String f8279f;
    public final int f8280g;

    C1537a(Document document, String str, int i, C1466f c1466f, C1287h c1287h, C1463g c1463g, C3012d c3012d) {
        this.f8278e = document;
        this.f8279f = str;
        this.f8280g = i;
        this.f8274a = c1466f;
        this.f8275b = c1287h;
        this.f8276c = c1463g;
        this.f8277d = c3012d;
    }

    public final void mo1062a(VolleyError volleyError) {
        C0697m c0697m = volleyError.f4022b;
        if (c0697m != null && c0697m.f4166a == 302 && c0697m.f4168c.containsKey("Location")) {
            String str = (String) c0697m.f4168c.get("Location");
            C2474c a = new C2474c(1100).m13236a(this.f8278e.f14885a.f12096c);
            if (TextUtils.isEmpty(str)) {
                FinskyLog.m21667d("Empty Location header from 302 URL: %s", FinskyLog.m21655a(this.f8279f));
            } else {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                a.m13251e(queryParameter);
                if (TextUtils.isEmpty(queryParameter)) {
                    FinskyLog.m21665c("Missing referrer in location header field for URL[%s]", FinskyLog.m21655a(this.f8279f));
                } else {
                    C2713b dk = this.f8274a.dk();
                    if (dk != null) {
                        dk.m14713b(str, this.f8280g);
                    }
                    this.f8277d.m15596a(queryParameter, null, this.f8278e.m14646d(), "adclick");
                }
                this.f8275b.mo2015a().mo1625b(this.f8278e.f14885a.f12096c, queryParameter, new C1538b(this, queryParameter), new C1539c(this));
            }
            this.f8276c.dc().m13327a(a.f13342a);
            return;
        }
        if ((volleyError instanceof NoConnectionError) || (volleyError instanceof TimeoutError)) {
            FinskyLog.m21665c("No connection error or timeout error", new Object[0]);
        } else {
            FinskyLog.m21667d("Unexpected error response for URL[%s], docid[%s]: %s", FinskyLog.m21655a(this.f8279f), this.f8278e.f14885a.f12096c, volleyError.getMessage());
        }
        this.f8276c.dc().m13327a(new C2474c(1107).m13236a(this.f8278e.f14885a.f12096c).m13210a(1).m13238a((Throwable) volleyError).f13342a);
    }
}
