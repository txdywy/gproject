package com.google.android.finsky.cm;

import android.graphics.Bitmap;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.util.HashMap;

public final class com.google.android.finsky.cm.p implements Runnable
{

    public final String a;
    public final long b;
    public final String c;
    public final Bitmap d;
    public final int e;
    public final int f;
    public final com.google.android.finsky.cv.a.es g;
    public final int h;
    public final com.google.android.finsky.cm.e i;

    p(com.google.android.finsky.cm.e p0, String p1, String p2, int p3, int p4, com.google.android.finsky.cv.a.es p5, int p6) {
        this.i = p0;
        this.a = p1;
        this.b = 0;
        this.c = p2;
        this.d = 0;
        this.e = p3;
        this.f = p4;
        this.g = p5;
        this.h = p6;
    }

    public final void run() {
        if (this.i.c.containsKey(this.a)) {
            v1 = new Object[1];
            v1[0] = this.a;
            FinskyLog.c("Cancelling already-existing session for %s", v1);
            this.i.c(this.a);
        }
        try {
            com.google.android.finsky.cm.e.a(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        catch (IOException ex) {
            v2 = new Object[2];
            v2[0] = this.a;
            v2[1] = ex.getMessage();
            FinskyLog.a(ex, "Couldn't create session for %s: %s", v2);
        }
    }

}
