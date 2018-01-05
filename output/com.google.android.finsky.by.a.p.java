package com.google.android.finsky.by.a;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final synchronized class com.google.android.finsky.by.a.p
{

    public final Handler a;
    public final Handler b;
    public final com.google.android.finsky.by.a.al c;
    public final com.google.android.finsky.by.a.a d;
    public final List e;
    public int f;

    p(com.google.android.finsky.by.a.al p0, com.google.android.finsky.by.a.a p1, Handler p2, Handler p3) {
        this.e = new ArrayList();
        this.f = 0;
        this.c = p0;
        this.d = p1;
        this.a = p3;
        this.b = p2;
    }

    public final synchronized void a(Runnable p0) {
        enter this;
        try {
            this.e.add(p0);
            this.a.post(new com.google.android.finsky.by.a.q(this));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
