package com.google.android.finsky.cm;

import android.graphics.Bitmap;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.util.HashMap;

public final class com.google.android.finsky.cm.q implements Runnable
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

    q(com.google.android.finsky.cm.e p0, String p1, long p2, String p4, int p5, int p6, com.google.android.finsky.cv.a.es p7, int p8) {
        this.i = p0;
        this.a = p1;
        this.b = p2;
        this.c = p4;
        this.d = 0;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
    }

    public final void run() {
        try {
            if (this.i.c.containsKey(this.a)) {
                v1 = new Object[1];
                v1[0] = this.a;
                FinskyLog.a("Session for %s already exists, skipping creation", v1);
            }
            else
                com.google.android.finsky.cm.e.a(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            return;
        }
        catch (IOException ex) {
            v2 = new Object[2];
            v2[0] = this.a;
            v2[1] = ex.getMessage();
            FinskyLog.a(ex, "Couldn't create session for %s: %s", v2);
            return;
        }
    }

}
