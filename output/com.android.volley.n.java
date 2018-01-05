package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public class com.android.volley.n implements Comparable
{

    public final com.android.volley.ab a;
    public final int b;
    public final String c;
    public final int d;
    public final Object e;
    public com.android.volley.w f;
    public Integer g;
    public com.android.volley.r h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public com.android.volley.z m;
    public com.android.volley.b n;
    public Object o;
    public com.android.volley.p p;

    n(int p0, String p1, com.android.volley.w p2) {
  7:    if (com.android.volley.ab.a != 0)
 11:        v0 = new com.android.volley.ab();
        else
 72:        v0 = 0;
 14:    this.a = v0;
 21:    this.e = new Object();
 24:    this.i = 1;
 26:    this.j = 0;
 28:    this.k = 0;
 30:    this.l = 0;
 32:    this.n = 0;
 34:    this.b = p0;
 36:    this.c = p1;
 38:    this.f = p2;
 45:    this.m = new com.android.volley.f();
 51:    if (TextUtils.isEmpty(p1)) goto 74;
 53:    v0 = Uri.parse(p1);
 57:    if (v0 == 0) goto 74;
 59:    v0 = v0.getHost();
 63:    if (v0 == 0) goto 74;
 65:    v0 = v0.hashCode();
 69:    this.d = v0;
 71:    return;
 74:    v0 = 0;
 75:    goto 69;
    }

    private static byte[] a(Map p0, String p1) {
        v2 = new StringBuilder();
        try {
            v3 = p0.entrySet().iterator();
            while (v3.hasNext()) {
                v0 = (Map$Entry)v3.next();
                v2.append(URLEncoder.encode((String)v0.getKey(), p1));
                v2.append(61);
                v2.append(URLEncoder.encode((String)v0.getValue(), p1));
                v2.append(38);
            }
        }
        catch (UnsupportedEncodingException ex) {
            v0 = String.valueOf(p1);
            if (v0.length() != 0)
                v0 = "Encoding not supported: ".concat(v0);
            else
                v0 = new String("Encoding not supported: ");
            throw new RuntimeException(v0, ex);
        }
        try {
            return v2.toString().getBytes(p1);
        }
        catch (UnsupportedEncodingException ex) {
            v0 = String.valueOf(p1);
            if (v0.length() != 0)
                v0 = "Encoding not supported: ".concat(v0);
            else
                v0 = new String("Encoding not supported: ");
            throw new RuntimeException(v0, ex);
        }
    }

    public com.android.volley.n a(com.android.volley.r p0) {
        this.h = p0;
        return this;
    }

    public abstract com.android.volley.v a(com.android.volley.m p0);

    final void a(com.android.volley.p p0) {
        enter this.e;
        try {
            this.p = p0;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public abstract void a(Object p0);

    public final void a(String p0) {
        if (com.android.volley.ab.a != 0)
            this.a.a(p0, Thread.currentThread().getId());
    }

    public VolleyError b(VolleyError p0) {
        return p0;
    }

    final void b(String p0) {
        if (this.h == 0) {
            if (com.android.volley.ab.a != 0) {
                v0 = Thread.currentThread().getId();
                if (Looper.myLooper() != Looper.getMainLooper())
                    new Handler(Looper.getMainLooper()).post(new com.android.volley.o(this, p0, v0));
                else {
                    this.a.a(p0, v0);
                    this.a.a(this.toString());
                }
            }
            return;
        }
        enter this.h.b;
        try {
            this.h.b.remove(this);
            exit this.h.b;
        }
        catch (Throwable ex) {
            try {
                exit this.h.b;
            }
            catch (Throwable ex) {
                exit this.h.b;
                throw ex;
            }
            throw ex;
        }
        enter this.h.j;
        try {
            v2 = this.h.j.iterator();
            while (v2.hasNext())
                ((com.android.volley.u)v2.next()).a();
            exit this.h.j;
        }
        catch (Throwable ex) {
            exit this.h.j;
            throw ex;
        }
        try {
            exit this.h.j;
        }
        catch (Throwable ex) {
            exit this.h.j;
            throw ex;
        }
        if (com.android.volley.ab.a != 0) {
            v0 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper())
                new Handler(Looper.getMainLooper()).post(new com.android.volley.o(this, p0, v0));
            else {
                this.a.a(p0, v0);
                this.a.a(this.toString());
            }
        }
    }

    public final int c() {
        if (this.g == 0)
            throw new IllegalStateException("getSequence called before setSequence");
        return this.g.intValue();
    }

    public void c(VolleyError p0) {
        enter this.e;
        try {
            exit this.e;
        }
        catch (Throwable ex) {
            try {
                exit this.e;
            }
            catch (Throwable ex) {
                exit this.e;
                throw ex;
            }
            throw ex;
        }
        if (this.f != 0)
            this.f.a(p0);
    }

    public int compareTo(Object p0) {
        v0 = this.n();
        v1 = ((com.android.volley.n)p0).n();
        if (v0 == v1)
            v0 = this.g.intValue() - ((com.android.volley.n)p0).g.intValue();
        else
            v0 = v1.ordinal() - v0.ordinal();
        return v0;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d();
    }

    public void f() {
        enter this.e;
        try {
            this.j = 1;
            this.f = 0;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public boolean g() {
        enter this.e;
        try {
            exit this.e;
            return this.j;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public Map h() {
        return Collections.emptyMap();
    }

    public String i() {
        return this.l();
    }

    public byte[] j() {
        v0 = this.k();
        if (v0 != 0 && v0.size() > 0)
            v0 = com.android.volley.n.a(v0, "UTF-8");
        else
            v0 = 0;
        return v0;
    }

    public Map k() {
        return 0;
    }

    public String l() {
        v0 = String.valueOf("UTF-8");
        if (v0.length() != 0)
            v0 = "application/x-www-form-urlencoded; charset=".concat(v0);
        else
            v0 = new String("application/x-www-form-urlencoded; charset=");
        return v0;
    }

    public byte[] m() {
        v0 = this.k();
        if (v0 != 0 && v0.size() > 0)
            v0 = com.android.volley.n.a(v0, "UTF-8");
        else
            v0 = 0;
        return v0;
    }

    public com.android.volley.q n() {
        return com.android.volley.q.b;
    }

    public final int o() {
        return this.m.a();
    }

    public void p() {
        enter this.e;
        try {
            this.k = 1;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public boolean q() {
        enter this.e;
        try {
            exit this.e;
            return this.k;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    final void r() {
        enter this.e;
        try {
            exit this.e;
        }
        catch (Throwable ex) {
            try {
                exit this.e;
            }
            catch (Throwable ex) {
                exit this.e;
                throw ex;
            }
            throw ex;
        }
        if (this.p != 0)
            this.p.a(this);
    }

    public String toString() {
        v0 = String.valueOf(Integer.toHexString(this.d));
        if (v0.length() != 0)
            v0 = "0x".concat(v0);
        else
            v0 = new String("0x");
        if (this.j != 0)
            v1 = "[X] ";
        else
            v1 = "[ ] ";
        v2 = this.d();
        v3 = String.valueOf(this.n());
        v4 = String.valueOf(this.g);
        return (String.valueOf(v1).length() + 3 + String.valueOf(v2).length() + String.valueOf(v0).length() + String.valueOf(v3).length() + String.valueOf(v4).length()) + v1 + v2 + " " + v0 + " " + v3 + " " + v4;
    }

}
