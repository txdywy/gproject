package com.google.android.finsky.by.a;

import android.os.Handler;
import com.google.android.finsky.by.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class com.google.android.finsky.by.a.ad implements Runnable
{

    public final Runnable a;
    public final String b;
    public final com.google.android.finsky.by.a.ab c;

    ad(com.google.android.finsky.by.a.ab p0, Runnable p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        enter this.c;
        try {
            v0 = this.c.f.values();
            if (v0.isEmpty()) {
                if (this.a != 0)
                    this.c.d.post(this.a);
                exit this.c;
                return;
            }
            v3 = v0.iterator();
            while (v3.hasNext())
                ((com.google.android.finsky.by.a.r)v3.next()).a(com.google.android.finsky.by.h.g, new com.google.android.finsky.by.a.ae(this, v0), this.b);
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
        try {
            exit this.c;
        }
        catch (Throwable ex) {
            exit this.c;
            throw ex;
        }
    }

}
