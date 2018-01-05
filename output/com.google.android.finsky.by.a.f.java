package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.d;
import com.google.android.finsky.by.f;
import com.google.android.finsky.by.g;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final synchronized class com.google.android.finsky.by.a.f implements com.google.android.finsky.by.c
{

    public final com.google.android.finsky.accounts.c a;
    public final com.google.android.finsky.by.a.al b;
    public final Handler c;
    public final Handler d;
    public final Map e;
    public List f;
    public List g;
    public List h;
    public final List i;
    public final List j;
    public int k;
    public boolean l;

    f(com.google.android.finsky.accounts.c p0, com.google.android.finsky.by.a.al p1, Handler p2, Handler p3) {
        this.e = new HashMap();
        this.f = 0;
        this.g = Collections.unmodifiableList(new ArrayList());
        this.h = Collections.unmodifiableList(new ArrayList());
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.l = 0;
        this.a = p0;
        this.b = p1;
        this.d = p3;
        this.c = p2;
    }

    private static int a(List p0) {
        v2 = p0.iterator();
        v1 = 0;
        while (v2.hasNext())
            v1 = ((Account)v2.next()).hashCode() + v1;
        return v1;
    }

    public final synchronized com.google.android.finsky.by.a a(Account p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (com.google.android.finsky.by.a)this.e.get(p0);
    }

    public final synchronized List a(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a(p0, com.google.android.finsky.by.f.a);
    }

    public final synchronized List a(String p0, String[] p1) {
        enter this;
        v2 = 0;
        try {
            v3 = 0;
            while (v3 < this.f.size()) {
                v0 = (Account)this.f.get(v3);
                v1 = ((com.google.android.finsky.by.a.a)this.e.get(v0)).i(p0);
                if (v1 != 0 && v1.a(p1)) {
                    if (v2 == 0)
                        v1 = new ArrayList();
                    else
                        v1 = v2;
                    v1.add(v0);
                    v0 = v1;
                }
                else
                    v0 = v2;
                v3 = v3 + 1;
                v2 = v0;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        if (v2 == 0) {
            try {
                v2 = Collections.emptyList();
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
        return v2;
    }

    public final void a(com.google.android.finsky.by.d p0) {
        enter this.j;
        try {
            if (!this.j.contains(p0))
                this.j.add(p0);
            exit this.j;
            return;
            exit this.j;
        }
        catch (Throwable ex) {
            exit this.j;
            throw ex;
        }
    }

    public final synchronized void a(Runnable p0) {
  2:    enter this;
  5:    if (this.l == 0) goto 30;
 19:    if (this.k != com.google.android.finsky.by.a.f.a(this.a.cX())) goto 30;
 21:    if (p0 != 0)
 25:        this.c.post(p0);
 28:    exit this;
 29:    return;
 30:    try {
 32:        this.i.add(p0);
 41:        if (this.i.size() > 1) {
 28:            exit this;
 29:            return;
            }
 49:        this.f = this.a.cX();
 53:        v6 = com.google.android.finsky.by.a.f.a(this.f);
 57:        v2 = 0;
 64:        v4 = this.e.keySet().iterator();
 68:        while (v4.hasNext()) {
 78:            v1 = (Account)v4.next();
 80:            if (v2 == 0)
 84:                v2 = new ArrayList();
 93:            if (this.f.contains(v1))
 93:                continue;
 95:            v2.add(v1);
            }
        }
        catch (Throwable ex) {
100:        exit this;
101:        throw ex;
        }
 98:    goto 102;
100:    exit this;
101:    throw ex;
102:    if (v2 == 0) goto 146;
112:    v4 = 0;
113:    while (v4 < ((ArrayList)v2).size()) {
115:        v2 = ((ArrayList)v2).get(v4);
119:        v4 = v4 + 1;
126:        v8 = new Object[1];
135:        v8[0] = FinskyLog.a(((Account)v2).name);
137:        FinskyLog.a("Unloading AccountLibrary for account: %s", v8);
142:        this.e.remove((Account)v2);
        }
148:    v5 = new ArrayList();
153:    v2 = this.f.iterator();
157:    while (v2.hasNext()) {
167:        v1 = (Account)v2.next();
175:        if (this.e.containsKey(v1))
175:            continue;
177:        v5.add(v1);
184:        v4 = new com.google.android.finsky.by.a.a(v1, this.c);
192:        v4.a(new com.google.android.finsky.by.a.j(this, v4));
197:        this.e.put(v1, v4);
        }
216:    this.g = Collections.unmodifiableList(new ArrayList(this.e.values()));
233:    this.h = Collections.unmodifiableList(new ArrayList(this.e.values()));
239:    if (v5.size() == 0) {
241:        this.i();
244:        this.k();
247:        this.k = v6;
250:        this.l = 1;
        }
        else {
255:        v4 = new int[1];
259:        v4[0] = 0;
269:        v1 = 0;
270:        while (v1 < ((ArrayList)v5).size()) {
278:            v3 = (Account)((ArrayList)v5).get(v1);
305:            new com.google.android.finsky.by.a.p(this.b, (com.google.android.finsky.by.a.a)this.e.get(v3), this.c, this.d).a(new com.google.android.finsky.by.a.h(this, v3, v4, v5, v6));
308:            v1 = v1 + 1;
            }
311:        this.l = 1;
        }
252:    goto 28;
314:    try
            run 104...313
        catch (Throwable ex) {
104:        goto 99;
        }
316:    try
            run 3...28
        catch (Throwable ex) {
  3:        goto 99;
        }
    }

    public final synchronized boolean a() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.l;
    }

    public final synchronized boolean a(com.google.android.finsky.by.g p0) {
  1:    enter this;
  8:    v2 = 0;
  9:    if (v2 >= this.g.size()) goto 32;
 23:    if (!((com.google.android.finsky.by.a.a)this.g.get(v2)).a(p0)) goto 28;
 25:    v0 = 1;
 26:    exit this;
 27:    return v0;
 30:    v2 = v2 + 1;
 31:    goto 9;
 32:    v0 = 0;
 33:    goto 26;
 35:    exit this;
 36:    throw ex;
 37:    try
            run 2...22
        catch (Throwable ex) {
  2:        goto 34;
        }
    }

    public final synchronized int b() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.k;
    }

    public final synchronized com.google.android.finsky.by.g b(com.google.android.finsky.by.g p0) {
  0:    enter this;
  8:    v1 = 0;
  9:    if (v1 >= this.g.size()) goto 31;
 19:    v0 = ((com.google.android.finsky.by.a.a)this.g.get(v1)).b(p0);
 23:    if (v0 == 0) goto 27;
 25:    exit this;
 26:    return v0;
 29:    v1 = v1 + 1;
 30:    goto 9;
 31:    v0 = 0;
 32:    goto 25;
 34:    exit this;
 35:    throw ex;
 36:    try
            run 1...22
        catch (Throwable ex) {
  1:        goto 33;
        }
    }

    public final synchronized List b(String p0, String[] p1) {
        enter this;
        try {
            v2 = new ArrayList();
            v1 = 0;
            while (v1 < this.g.size()) {
                v0 = ((com.google.android.finsky.by.a.a)this.g.get(v1)).i(p0);
                if (v0 != 0) {
                    if (v0.a(p1))
                        v2.add(v0);
                }
                v1 = v1 + 1;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v2;
    }

    public final void b(com.google.android.finsky.by.d p0) {
        enter this.j;
        try {
            this.j.remove(p0);
            exit this.j;
            return;
            exit this.j;
        }
        catch (Throwable ex) {
            exit this.j;
            throw ex;
        }
    }

    public final void c() {
        if (Looper.myLooper() == this.c.getLooper() || Looper.myLooper() == this.d.getLooper())
            throw new IllegalStateException();
        v0 = new CountDownLatch(1);
        this.a(new com.google.android.finsky.by.a.g(v0));
        try {
            v0.await();
        }
        catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public final void c(com.google.android.finsky.by.g p0) {
        throw new UnsupportedOperationException();
    }

    public final synchronized void d() {
        enter this;
        try {
            this.d.post(new com.google.android.finsky.by.a.i(this));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized List e() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.h;
    }

    public final void f() {
        Log.d("FinskyLibrary", "| Libraries {");
        v3 = this.e.values().iterator();
        while (v3.hasNext()) {
            v0 = (com.google.android.finsky.by.a.a)v3.next();
            v5 = FinskyLog.a(v0.f.name);
            Log.d("FinskyLibrary", (String.valueOf("|   ").length() + 27 + String.valueOf(v5).length()) + "|   " + "AccountLibrary (account=" + v5 + ") {");
            v6 = v0.a.keySet().iterator();
            while (v6.hasNext()) {
                v1 = (String)v6.next();
                v2 = v0.a.get(v1);
                v1 = String.valueOf(v1);
                if (v1.length() != 0)
                    v1 = "library=".concat(v1);
                else
                    v1 = new String("library=");
                ((com.google.android.finsky.by.a.e)v2).a(v1, String.valueOf("|   ").concat("  "));
            }
            Log.d("FinskyLibrary", (String.valueOf("|   ").length() + 12 + String.valueOf(v5).length()) + "|   " + "} (account=" + v5 + ")");
        }
        Log.d("FinskyLibrary", "| }");
    }

    public final synchronized int g() {
        enter this;
        try {
            v1 = 0;
            v2 = 0;
            while (v1 < this.g.size()) {
                v2 = v2 + ((com.google.android.finsky.by.a.a)this.g.get(v1)).g();
                v1 = v1 + 1;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v2;
    }

    public final long h() {
        throw new UnsupportedOperationException();
    }

    final void i() {
        this.c.post(new com.google.android.finsky.by.a.l(this));
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    final List j() {
        enter this.j;
        try {
            exit this.j;
            return new ArrayList(this.j);
            exit this.j;
        }
        catch (Throwable ex) {
            exit this.j;
            throw ex;
        }
    }

    final synchronized void k() {
        enter this;
        try {
            v1 = this.i.iterator();
            while (v1.hasNext()) {
                v0 = (Runnable)v1.next();
                if (v0 == 0)
                    continue;
                this.c.post(v0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            this.i.clear();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized List l() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.g;
    }

}
