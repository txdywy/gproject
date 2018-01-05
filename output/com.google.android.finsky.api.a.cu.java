package com.google.android.finsky.api.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.b;
import com.android.volley.g;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.v;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class com.google.android.finsky.api.a.cu implements com.android.volley.y
{

    public final com.android.volley.g a;
    public final Handler b;

    cu() {
        this.b = new Handler(Looper.getMainLooper());
        this.a = new com.android.volley.g(this.b);
    }

    private final void b(com.android.volley.n p0, com.android.volley.v p1, Runnable p2) {
        enter p0;
        try {
            this.a.a(p0, p1, p2);
            exit p0;
            return;
            exit p0;
        }
        catch (Throwable ex) {
            exit p0;
            throw ex;
        }
    }

    public final void a(com.android.volley.n p0, VolleyError p1) {
  2:    enter p0;
  3:    if (p0.n == 0) goto 21;
  5:    try {
  9:        if ((p0.n.a()) || (!(p0 instanceof com.google.android.finsky.api.a.cp)) || p0.q()) {
 23:            this.a.a(p0, p1);
 26:            exit p0;
            }
            else {
 28:            exit p0;
 31:            p0.a("error-on-firmttl");
 51:            this.b(p0, ((com.google.android.finsky.api.a.cp)p0).a(new com.android.volley.m(p0.n.a, p0.n.g)), 0);
            }
 27:        return;
        }
        catch (Throwable ex) {
 56:        try {
 56:            exit p0;
            }
            catch (Throwable ex) {
 56:            exit p0;
 57:            throw ex;
            }
 57:        throw ex;
        }
    }

    public final void a(com.android.volley.n p0, com.android.volley.v p1) {
        this.b(p0, p1, 0);
    }

    public final void a(com.android.volley.n p0, com.android.volley.v p1, Runnable p2) {
        if (!(p0 instanceof com.google.android.finsky.api.a.cp))
            this.b(p0, p1, p2);
        else if (p2 == 0)
            this.b(p0, p1, p2);
        else if (p0.n == 0 || p0.n.g == 0) {
            FinskyLog.e("Soft/Firm TTL request posted response without cache entry.", new Object[0]);
            this.b(p0, p1, p2);
        }
        else {
            v0 = (String)p0.n.g.get("Cache-Firm-TTL");
            v1 = (String)p0.n.g.get("X-DFE-Firm-Rpc-Timeout");
            if ((TextUtils.isEmpty(v0)) || TextUtils.isEmpty(v1)) {
                ((com.google.android.finsky.api.a.cp)p0).a(2);
                this.b(p0, p1, p2);
            }
            else {
                v2 = Long.parseLong(v0);
                v4 = Long.parseLong(v1);
                if (v2 != 0 && v2 < System.currentTimeMillis() && v4 > 0) {
                    p0.a("firm-ttl-hit");
                    p1.d = 0;
                    ((com.google.android.finsky.api.a.cp)p0).U = 1;
                    this.b.post(p2);
                    this.b.postDelayed(new com.google.android.finsky.api.a.cv(this, p0, p1), v4);
                }
                else {
                    ((com.google.android.finsky.api.a.cp)p0).a(2);
                    this.b(p0, p1, p2);
                }
            }
        }
    }

}
