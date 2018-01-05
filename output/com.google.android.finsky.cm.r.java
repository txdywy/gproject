package com.google.android.finsky.cm;

public final class com.google.android.finsky.cm.r implements Runnable
{

    public final String a;
    public final com.google.android.finsky.cm.e b;

    r(com.google.android.finsky.cm.e p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.c(this.a);
    }

}
