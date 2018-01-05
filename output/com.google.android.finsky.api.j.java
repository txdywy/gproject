package com.google.android.finsky.api;

import com.android.volley.n;
import com.android.volley.w;

public final synchronized class com.google.android.finsky.api.j extends com.android.volley.n
{

    j(int p0, String p1, com.android.volley.w p2) {
        com.android.volley.n(p0, p1, p2);
    }

    public abstract boolean a();

    public abstract long b();

    public final synchronized void p() {
        enter this;
        try {
            super.p();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean q() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return super.q();
    }

}
