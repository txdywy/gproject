package com.android.volley.a;

import android.util.Log;
import com.android.volley.aa;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;
import java.io.UnsupportedEncodingException;

public final class com.android.volley.a.aa extends com.android.volley.n
{

    public static final String q;
    public final Object e;
    public com.android.volley.x r;
    public final String s;

    static {
        v1 = new Object[1];
        v1[0] = "utf-8";
        com.android.volley.a.aa.q = String.format("application/json; charset=%s", v1);
    }

    aa(int p0, String p1, String p2, com.android.volley.x p3, com.android.volley.w p4) {
        com.android.volley.n(p0, p1, p4);
        this.e = new Object();
        this.r = p3;
        this.s = p2;
    }

    public abstract com.android.volley.v a(com.android.volley.m p0);

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
        if (this.r != 0)
            this.r.b_(p0);
    }

    public final void f() {
        super.f();
        enter this.e;
        try {
            this.r = 0;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public final String i() {
        return this.l();
    }

    public final byte[] j() {
        return this.m();
    }

    public final String l() {
        return com.android.volley.a.aa.q;
    }

    public final byte[] m() {
        v0 = 0;
        try {
            if (this.s != 0)
                v0 = this.s.getBytes("utf-8");
            return v0;
        }
        catch (UnsupportedEncodingException ex) {
            v2 = new Object[2];
            v2[0] = this.s;
            v2[1] = "utf-8";
            Log.wtf(com.android.volley.aa.a, com.android.volley.aa.d("Unsupported Encoding while trying to get the bytes of %s using %s", v2));
            return v0;
        }
    }

}
