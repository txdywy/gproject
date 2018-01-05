package com.google.android.finsky.cr;

import java.util.HashMap;

public final class com.google.android.finsky.cr.e implements Runnable
{

    public final String a;
    public final HashMap b;
    public final com.google.android.finsky.cr.c c;

    e(com.google.android.finsky.cr.c p0, String p1, HashMap p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }

}
