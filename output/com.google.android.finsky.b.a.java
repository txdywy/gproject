package com.google.android.finsky.b;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.NoConnectionError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.m;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.dfemodel.f;
import com.google.android.finsky.externalreferrer.d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class com.google.android.finsky.b.a implements com.android.volley.w
{

    public final com.google.android.finsky.dfemodel.f a;
    public final com.google.android.finsky.api.h b;
    public final com.google.android.finsky.d.g c;
    public final com.google.android.finsky.externalreferrer.d d;
    public final Document e;
    public final String f;
    public final int g;

    a(Document p0, String p1, int p2, com.google.android.finsky.dfemodel.f p3, com.google.android.finsky.api.h p4, com.google.android.finsky.d.g p5, com.google.android.finsky.externalreferrer.d p6) {
        this.e = p0;
        this.f = p1;
        this.g = p2;
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
    }

    public final void a(VolleyError p0) {
        if (p0.b != 0 && p0.b.a == 302 && p0.b.c.containsKey("Location")) {
            v0 = (String)p0.b.c.get("Location");
            v1 = new com.google.android.finsky.d.c(1100).a(this.e.a.c);
            if (TextUtils.isEmpty(v0)) {
                v2 = new Object[1];
                v2[0] = FinskyLog.a(this.f);
                FinskyLog.d("Empty Location header from 302 URL: %s", v2);
            }
            else {
                v2 = Uri.parse(v0).getQueryParameter("referrer");
                v1.e(v2);
                if (!TextUtils.isEmpty(v2)) {
                    v3 = this.a.dk();
                    if (v3 != 0)
                        v3.b(v0, this.g);
                    this.d.a(v2, 0, this.e.d(), "adclick");
                }
                else {
                    v3 = new Object[1];
                    v3[0] = FinskyLog.a(this.f);
                    FinskyLog.c("Missing referrer in location header field for URL[%s]", v3);
                }
                this.b.a().b(this.e.a.c, v2, new com.google.android.finsky.b.b(this, v2), new com.google.android.finsky.b.c(this));
            }
            this.c.dc().a(v1.a);
        }
        else {
            if ((p0 instanceof NoConnectionError) || p0 instanceof TimeoutError)
                FinskyLog.c("No connection error or timeout error", new Object[0]);
            else {
                v1 = new Object[3];
                v1[0] = FinskyLog.a(this.f);
                v1[1] = this.e.a.c;
                v1[2] = p0.getMessage();
                FinskyLog.d("Unexpected error response for URL[%s], docid[%s]: %s", v1);
            }
            this.c.dc().a(new com.google.android.finsky.d.c(1107).a(this.e.a.c).a(1).a(p0).a);
        }
    }

}
