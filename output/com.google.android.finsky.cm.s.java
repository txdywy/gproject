package com.google.android.finsky.cm;

public final class com.google.android.finsky.cm.s implements Runnable
{

    public final int a;
    public final String b;
    public final com.google.android.finsky.cm.e c;

    s(com.google.android.finsky.cm.e p0, int p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }

}
