package com.google.android.finsky.cr;

public final class com.google.android.finsky.cr.d implements Runnable
{

    public final String a;
    public final com.google.android.finsky.cr.c b;

    d(com.google.android.finsky.cr.c p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.a.a(this.a);
    }

}
