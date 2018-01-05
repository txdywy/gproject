package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.by.b;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.f;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.i;
import com.google.android.finsky.by.j;
import com.google.android.finsky.by.n;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.by.a.a implements com.google.android.finsky.by.a
{

    public final Map a;
    public final Map b;
    public final List c;
    public final Handler d;
    public boolean e;
    public final Account f;

    a(Account p0, Handler p1) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        this.e = 1;
        this.f = p0;
        this.d = p1;
        this.a.put(com.google.android.finsky.by.h.a, new com.google.android.finsky.by.a.c(new com.google.android.finsky.by.a.ao()));
        this.a.put(com.google.android.finsky.by.h.d, new com.google.android.finsky.by.a.ak(new com.google.android.finsky.by.a.ao()));
        this.a.put(com.google.android.finsky.by.h.b, new com.google.android.finsky.by.a.d(1, new com.google.android.finsky.by.a.ao()));
        this.a.put(com.google.android.finsky.by.h.c, new com.google.android.finsky.by.a.d(4, new com.google.android.finsky.by.a.ao()));
        this.a.put(com.google.android.finsky.by.h.e, new com.google.android.finsky.by.a.aj(new com.google.android.finsky.by.a.ao()));
        this.a.put(com.google.android.finsky.by.h.f, new com.google.android.finsky.by.a.d(10, new com.google.android.finsky.by.a.ao()));
        this.a.put("u-wl", new com.google.android.finsky.by.a.d(0, new com.google.android.finsky.by.a.ao()));
        this.a.put("u-pl", new com.google.android.finsky.by.a.d(0, new com.google.android.finsky.by.a.ao()));
        this.a.put("u-tpl", new com.google.android.finsky.by.a.d(0, new com.google.android.finsky.by.a.ao()));
    }

    private final void f() {
        if (this.e != 0)
            this.d.post(new com.google.android.finsky.by.a.b(new ArrayList(this.c)));
    }

    public final Account a() {
        return this.f;
    }

    public final synchronized com.google.android.finsky.by.i a(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return ((com.google.android.finsky.by.a.c)this.a.get(com.google.android.finsky.by.h.a)).a(p0);
    }

    public final synchronized void a(com.google.android.finsky.by.b p0) {
        enter this;
        try {
            this.c.add(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, byte[] p1) {
        enter this;
        try {
            this.b.put(p0, p1);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(Collection p0) {
        enter this;
        try {
            v1 = p0.iterator();
            while (v1.hasNext())
                this.d((com.google.android.finsky.by.g)v1.next());
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean a(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            v0 = this.a.get(p0.i);
            if ((com.google.android.finsky.by.e)v0 != 0)
                v0 = ((com.google.android.finsky.by.e)v0).a(p0);
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized com.google.android.finsky.by.e b() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (com.google.android.finsky.by.e)this.a.get("u-tpl");
    }

    public final synchronized com.google.android.finsky.by.g b(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            v0 = this.a.get(p0.i);
            if ((com.google.android.finsky.by.e)v0 != 0)
                v0 = ((com.google.android.finsky.by.e)v0).b(p0);
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized List b(String p0) {
        enter this;
        try {
            v0 = (com.google.android.finsky.by.e)this.a.get(p0);
            v1 = new ArrayList(v0.g());
            v2 = v0.iterator();
            while (v2.hasNext())
                v1.add(((com.google.android.finsky.by.g)v2.next()).k);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v1;
    }

    public final synchronized List c() {
        enter this;
        try {
            v0 = (com.google.android.finsky.by.a.ak)this.a.get(com.google.android.finsky.by.h.d);
            v2 = new ArrayList(v0.g());
            v3 = v0.iterator();
            while (v3.hasNext()) {
                v1 = (com.google.android.finsky.by.g)v3.next();
                if (v0.e(v1))
                    continue;
                v2.add((com.google.android.finsky.by.n)v1);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v2;
    }

    public final synchronized List c(String p0) {
        enter this;
        try {
            v0 = (com.google.android.finsky.by.a.c)this.a.get(com.google.android.finsky.by.h.a);
            v2 = new ArrayList();
            v3 = v0.b.iterator();
            while (v3.hasNext()) {
                v1 = (String)v3.next();
                if (!TextUtils.equals(com.google.android.finsky.dfemodel.q.a(v1), p0))
                    continue;
                v2.add(v0.a(v1));
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v2;
    }

    public final synchronized void c(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            if (this.f.name.equals(p0.h)) {
                try {
                    v0 = this.a.get(p0.i);
                    if ((com.google.android.finsky.by.e)v0 != 0) {
                        ((com.google.android.finsky.by.e)v0).c(p0);
                        this.f();
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return;
            }
            throw new IllegalArgumentException();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final synchronized List d(String p0) {
        enter this;
        try {
            v8 = (com.google.android.finsky.by.a.c)this.a.get(com.google.android.finsky.by.h.a);
            v9 = new ArrayList();
            v10 = v8.a.iterator();
            while (v10.hasNext()) {
                v5 = (String)v10.next();
                if (!TextUtils.equals(com.google.android.finsky.dfemodel.q.b(v5), p0))
                    continue;
                v1 = v8.b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.a, 3, v5, 15, 1));
                if (v1 == 0)
                    v1 = v8.b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.a, 3, v5, 67, 1));
                v9.add((com.google.android.finsky.by.j)v1);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v9;
    }

    public final synchronized void d() {
        enter this;
        try {
            this.e = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            if (this.f.name.equals(p0.h)) {
                try {
                    v0 = this.a.get(p0.i);
                    if ((com.google.android.finsky.by.a.e)v0 != 0) {
                        ((com.google.android.finsky.by.a.e)v0).d(p0);
                        this.f();
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
                exit this;
                return;
            }
            throw new IllegalArgumentException("Invalid account.");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final synchronized com.google.android.finsky.by.n e(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (com.google.android.finsky.by.n)((com.google.android.finsky.by.a.aj)this.a.get(com.google.android.finsky.by.h.e)).b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.e, 6, p0, 15, 1));
    }

    public final synchronized void e() {
        enter this;
        try {
            this.e = 1;
            this.f();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized byte[] f(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (byte[])this.b.get(p0);
    }

    public final synchronized int g() {
        enter this;
        try {
            v2 = this.a.values().iterator();
            v1 = 0;
            while (v2.hasNext())
                v1 = ((com.google.android.finsky.by.a.e)v2.next()).g() + v1;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v1;
    }

    public final com.google.android.finsky.by.e g(String p0) {
        return (com.google.android.finsky.by.a.e)this.a.get(p0);
    }

    public final long h() {
        throw new UnsupportedOperationException();
    }

    public final boolean h(String p0) {
        return this.a.containsKey(p0);
    }

    public final synchronized com.google.android.finsky.by.f i(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return (com.google.android.finsky.by.f)((com.google.android.finsky.by.a.c)this.a.get(com.google.android.finsky.by.h.a)).b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.a, 3, p0, 1, 1));
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final synchronized void j(String p0) {
        enter this;
        try {
            v0 = this.a.get(p0);
            if ((com.google.android.finsky.by.a.e)v0 == 0) {
                v1 = new Object[1];
                v1[0] = p0;
                FinskyLog.c("Cannot reset: %s", v1);
            }
            else {
                try {
                    ((com.google.android.finsky.by.a.e)v0).a();
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            this.f();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final String toString() {
        v2 = new Object[2];
        v2[0] = FinskyLog.a(this.f.name);
        v2[1] = Integer.valueOf(((com.google.android.finsky.by.a.e)this.a.get(com.google.android.finsky.by.h.a)).g());
        return String.format("{account=%s numapps=%d}", v2);
    }

}
