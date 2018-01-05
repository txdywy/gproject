package com.google.android.finsky.aa;

public final class com.google.android.finsky.aa.m
{

    public com.google.android.finsky.aa.c b;
    public final String c;
    public final Object d;

    m(com.google.android.finsky.aa.c p0, String p1, Object p2) {
        this.b = p0;
        this.c = p1;
        this.d = p2;
    }

    protected abstract com.google.android.finsky.aa.n a(String p0);

    public final com.google.android.finsky.aa.n b(String p0) {
        v1 = String.valueOf(this.c);
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = v1.concat(v0);
        else
            v0 = new String(v1);
        v0 = this.a(v0);
        v0.a = this.b;
        return v0;
    }

}
