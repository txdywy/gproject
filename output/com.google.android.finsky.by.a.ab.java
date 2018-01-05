package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import android.util.Log;
import com.google.android.finsky.api.h;
import com.google.android.finsky.by.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class com.google.android.finsky.by.a.ab implements com.google.android.finsky.by.l
{

    public final com.google.android.finsky.api.h a;
    public final com.google.android.finsky.by.a.al b;
    public final com.google.android.finsky.by.a.f c;
    public final Handler d;
    public final Handler e;
    public final Map f;
    public final List g;
    public final boolean h;

    ab(com.google.android.finsky.api.h p0, com.google.android.finsky.by.a.al p1, com.google.android.finsky.by.a.f p2, Handler p3, Handler p4, boolean p5) {
        this.f = new HashMap();
        this.g = new ArrayList();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.h = p5;
        this.a();
    }

    public final synchronized void a() {
        enter this;
        try {
            this.f.clear();
            v7 = this.c.l().iterator();
            while (v7.hasNext()) {
                v3 = (com.google.android.finsky.by.a.a)v7.next();
                v0 = new com.google.android.finsky.by.a.r(this.a.a(v3.f.name), this.b, v3, this.d, this.e, this.h);
                v0.a(new com.google.android.finsky.by.a.ac(this));
                this.f.put(v3.f, v0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(Account p0, String p1, Runnable p2, w[] p3) {
        this.c.a(new com.google.android.finsky.by.a.ag(this, p0, p1, p3, p2));
    }

    public final void a(Account p0, String[] p1, Runnable p2, String p3) {
        this.c.a(new com.google.android.finsky.by.a.af(this, p0, p1, p2, p3));
    }

    public final synchronized void a(com.google.android.finsky.by.m p0) {
        enter this;
        try {
            this.g.add(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(Runnable p0, String p1) {
        this.c.a(new com.google.android.finsky.by.a.ad(this, p0, p1));
    }

    final synchronized void a(String p0) {
        enter this;
        try {
            v1 = this.g.iterator();
            while (v1.hasNext())
                ((com.google.android.finsky.by.m)v1.next()).a(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void b() {
  4:    Log.d("FinskyLibrary", "| LibraryReplicators {");
 13:    v1 = this.f.values().iterator();
 21:    if (!v1.hasNext()) {
238:        Log.d("FinskyLibrary", "| }");
241:        return;
        }
 27:    v0 = (com.google.android.finsky.by.a.r)v1.next();
 37:    v3 = FinskyLog.a(v0.g.f.name);
 91:    Log.d("FinskyLibrary", (String.valueOf("|   ").length() + 30 + String.valueOf(v3).length()) + "|   " + "LibraryReplicator (account=" + v3 + ") {");
 96:    if (v0.m == 0) goto 164;
139:    Log.d("FinskyLibrary", (String.valueOf("|   ").length() + 25) + "|   " + "  eventsCount=" + v0.m.size());
144:    v4 = v0.m.iterator();
148:    while (v4.hasNext())
160:        ((com.google.android.finsky.by.a.v)v4.next()).a("|   ");
163:    goto 179;
176:    Log.d("FinskyLibrary", String.valueOf("|   ").concat("  eventsCount=0"));
229:    Log.d("FinskyLibrary", (String.valueOf("|   ").length() + 12 + String.valueOf(v3).length()) + "|   " + "} (account=" + v3 + ")");
232:    goto 17;
    }

}
