package com.google.android.finsky.ao;

import java.util.Map;

public final class com.google.android.finsky.ao.e implements Runnable
{

    public final com.google.android.finsky.ao.a a;
    public final com.google.android.finsky.ao.g b;
    public final com.google.android.finsky.ao.k c;

    e(com.google.android.finsky.ao.a p0, com.google.android.finsky.ao.g p1, com.google.android.finsky.ao.k p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void run() {
        this.a.g.remove(Integer.valueOf(this.b.a));
        this.b.c.a(this.c);
        this.a.a();
    }

}
