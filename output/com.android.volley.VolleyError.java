package com.android.volley;

public class VolleyError extends Exception
{

    public final com.android.volley.m b;
    public long c;

    VolleyError() {
        Exception();
        this.b = 0;
    }

    VolleyError(com.android.volley.m p0) {
        Exception();
        this.b = p0;
    }

    VolleyError(String p0) {
        Exception(p0);
        this.b = 0;
    }

    VolleyError(String p0, Throwable p1) {
        Exception(p0, p1);
        this.b = 0;
    }

    VolleyError(Throwable p0) {
        Exception(p0);
        this.b = 0;
    }

}
