package com.android.volley.a;

import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import java.io.UnsupportedEncodingException;

public final class com.android.volley.a.ah extends com.android.volley.n
{

    public final Object e;
    public com.android.volley.x q;

    ah(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        com.android.volley.n(0, p0, p2);
        this.e = new Object();
        this.q = p1;
    }

    ah(String p0, com.android.volley.x p1, com.android.volley.w p2, byte p3) {
        com.android.volley.a.ah(p0, p1, p2);
    }

    protected final com.android.volley.v a(com.android.volley.m p0) {
        try {
            v0 = new String(p0.b, com.android.volley.a.n.a(p0.c));
        }
        catch (UnsupportedEncodingException ex) {
            v0 = new String(p0.b);
        }
        return com.android.volley.v.a(v0, com.android.volley.a.n.a(p0));
    }

    protected final void a(Object p0) {
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
        if (this.q != 0)
            this.q.b_((String)p0);
    }

    public final void f() {
        super.f();
        enter this.e;
        try {
            this.q = 0;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

}
