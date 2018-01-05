package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.C7690w;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.al;
import com.squareup.okhttp.am;
import com.squareup.okhttp.internal.C7600b;
import java.io.IOException;
import java.net.Proxy.Type;
import p526e.C7631z;
import p526e.C7724h;
import p526e.C7725i;
import p526e.C7733p;
import p526e.aa;

public final class C7655f implements C7654v {
    public final ad f39632a;
    public final C7725i f39633b;
    public final C7724h f39634c;
    public C7666q f39635d;
    public int f39636e = 0;

    public C7655f(ad adVar, C7725i c7725i, C7724h c7724h) {
        this.f39632a = adVar;
        this.f39633b = c7725i;
        this.f39634c = c7724h;
    }

    public final void mo6472a(C7666q c7666q) {
        this.f39635d = c7666q;
    }

    public final C7631z mo6469a(ag agVar, long j) {
        if ("chunked".equalsIgnoreCase(agVar.m36630a("Transfer-Encoding"))) {
            if (this.f39636e != 1) {
                throw new IllegalStateException("state: " + this.f39636e);
            }
            this.f39636e = 2;
            return new C7657h(this);
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f39636e != 1) {
            throw new IllegalStateException("state: " + this.f39636e);
        } else {
            this.f39636e = 2;
            return new C7659j(this, j);
        }
    }

    public final void mo6470a(ag agVar) {
        this.f39635d.m36966a();
        Type type = this.f39635d.f39678c.m36912a().mo6460a().f39326b.type();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(agVar.f39289b);
        stringBuilder.append(' ');
        Object obj = (agVar.m36635d() || type != Type.HTTP) ? null : 1;
        if (obj != null) {
            stringBuilder.append(agVar.f39288a);
        } else {
            stringBuilder.append(C7674z.m36993a(agVar.f39288a));
        }
        stringBuilder.append(" HTTP/1.1");
        m36939a(agVar.f39290c, stringBuilder.toString());
    }

    public final al mo6467a() {
        return m36941c();
    }

    public final am mo6468a(ak akVar) {
        aa a;
        if (!C7666q.m36965c(akVar)) {
            a = m36934a(0);
        } else if ("chunked".equalsIgnoreCase(akVar.m36651a("Transfer-Encoding"))) {
            C7666q c7666q = this.f39635d;
            if (this.f39636e != 4) {
                throw new IllegalStateException("state: " + this.f39636e);
            }
            this.f39636e = 5;
            a = new C7658i(this, c7666q);
        } else {
            long a2 = C7671w.m36982a(akVar);
            if (a2 != -1) {
                a = m36934a(a2);
            } else if (this.f39636e != 4) {
                throw new IllegalStateException("state: " + this.f39636e);
            } else if (this.f39632a == null) {
                throw new IllegalStateException("streamAllocation == null");
            } else {
                this.f39636e = 5;
                this.f39632a.m36917a(true, false, false);
                a = new C7661l(this);
            }
        }
        return new C7673y(akVar.f39309f, C7733p.m37442a(a));
    }

    public final void mo6473b() {
        this.f39634c.flush();
    }

    public final void m36939a(C7689v c7689v, String str) {
        if (this.f39636e != 0) {
            throw new IllegalStateException("state: " + this.f39636e);
        }
        this.f39634c.mo6483a(str).mo6483a("\r\n");
        int length = c7689v.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            this.f39634c.mo6483a(c7689v.m37013a(i)).mo6483a(": ").mo6483a(c7689v.m37017b(i)).mo6483a("\r\n");
        }
        this.f39634c.mo6483a("\r\n");
        this.f39636e = 1;
    }

    public final al m36941c() {
        if (this.f39636e == 1 || this.f39636e == 3) {
            al alVar;
            ac a;
            do {
                try {
                    a = ac.m36908a(this.f39633b.mo6504n());
                    alVar = new al();
                    alVar.f39316b = a.f39608a;
                    alVar.f39317c = a.f39609b;
                    alVar.f39318d = a.f39610c;
                    alVar = alVar.m36657a(m36942d());
                } catch (Throwable e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f39632a);
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f39609b == 100);
            this.f39636e = 4;
            return alVar;
        }
        throw new IllegalStateException("state: " + this.f39636e);
    }

    public final C7689v m36942d() {
        C7690w c7690w = new C7690w();
        while (true) {
            String n = this.f39633b.mo6504n();
            if (n.length() == 0) {
                return c7690w.m37021a();
            }
            C7600b.f39287b.mo6413a(c7690w, n);
        }
    }

    public final void mo6471a(aa aaVar) {
        if (this.f39636e != 1) {
            throw new IllegalStateException("state: " + this.f39636e);
        }
        this.f39636e = 3;
        aaVar.m36901a(this.f39634c);
    }

    public final aa m36934a(long j) {
        if (this.f39636e != 4) {
            throw new IllegalStateException("state: " + this.f39636e);
        }
        this.f39636e = 5;
        return new C7660k(this, j);
    }
}
