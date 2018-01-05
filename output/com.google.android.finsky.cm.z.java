package com.google.android.finsky.cm;

public final class com.google.android.finsky.cm.z implements Runnable
{

    public final String a;
    public final com.google.android.finsky.cm.d b;
    public final com.google.android.finsky.cm.y c;

    z(com.google.android.finsky.cm.y p0, String p1, com.google.android.finsky.cm.d p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.c(this.a);
        this.b.a();
    }

}
