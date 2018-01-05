package com.google.android.finsky.cr;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class com.google.android.finsky.cr.c implements com.google.android.finsky.cr.b
{

    public static final ExecutorService b;
    public final com.google.android.finsky.cr.b a;
    public Map c;
    public List d;
    public final Handler e;

    static {
        com.google.android.finsky.cr.c.b = Executors.newSingleThreadExecutor(new com.google.android.finsky.utils.e());
    }

    c(com.google.android.finsky.cr.b p0) {
        this.c = 0;
        this.d = new ArrayList();
        this.a = p0;
        this.e = new Handler(Looper.getMainLooper());
    }

    private static void c() {
        if (Looper.myLooper() != Looper.getMainLooper())
            throw new IllegalStateException("Tried to access data off of the main thread.");
    }

    private final void d() {
        if (!this.b())
            throw new IllegalStateException("Tried to access data before initializing.");
        com.google.android.finsky.cr.c.c();
    }

    public final Map a() {
        this.d();
        if (this.c.isEmpty())
            v0 = Collections.emptyMap();
        else {
            v2 = new HashMap();
            v3 = this.c.keySet().iterator();
            while (v3.hasNext()) {
                v0 = (String)v3.next();
                v2.put(v0, Collections.unmodifiableMap((Map)this.c.get(v0)));
            }
            v0 = Collections.unmodifiableMap(v2);
        }
        return v0;
    }

    public final void a(Runnable p0) {
        com.google.android.finsky.cr.c.c();
        if (this.b())
            this.e.post(p0);
        else {
            this.d.add(p0);
            if (this.d.size() == 1)
                com.google.android.finsky.cr.c.b.submit(new com.google.android.finsky.cr.f(this));
        }
    }

    public final void a(String p0) {
        this.d();
        this.c.remove(p0);
        com.google.android.finsky.cr.c.b.submit(new com.google.android.finsky.cr.d(this, p0));
    }

    public final void a(String p0, Map p1) {
        this.d();
        this.c.put(p0, p1);
        com.google.android.finsky.cr.c.b.submit(new com.google.android.finsky.cr.e(this, p0, new HashMap(p1)));
    }

    public final boolean b() {
        if (this.c != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
