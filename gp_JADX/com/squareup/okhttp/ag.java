package com.squareup.okhttp;

import java.io.IOException;
import java.net.URI;
import java.util.List;

public final class ag {
    public final C7691x f39288a;
    public final String f39289b;
    public final C7689v f39290c;
    public final ai f39291d;
    public final Object f39292e;
    public volatile URI f39293f;
    public volatile C7603d f39294g;

    ag(ah ahVar) {
        Object obj;
        this.f39288a = ahVar.f39295a;
        this.f39289b = ahVar.f39296b;
        this.f39290c = ahVar.f39297c.m37021a();
        this.f39291d = ahVar.f39298d;
        if (ahVar.f39299e != null) {
            obj = ahVar.f39299e;
        } else {
            ag agVar = this;
        }
        this.f39292e = obj;
    }

    public final URI m36631a() {
        try {
            URI uri = this.f39293f;
            if (uri == null) {
                uri = this.f39288a.m37039b();
                this.f39293f = uri;
            }
            return uri;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String m36630a(String str) {
        return this.f39290c.m37014a(str);
    }

    public final List m36633b(String str) {
        return this.f39290c.m37019c(str);
    }

    public final ah m36632b() {
        return new ah(this);
    }

    public final C7603d m36634c() {
        C7603d c7603d = this.f39294g;
        if (c7603d != null) {
            return c7603d;
        }
        c7603d = C7603d.m36670a(this.f39290c);
        this.f39294g = c7603d;
        return c7603d;
    }

    public final boolean m36635d() {
        return this.f39288a.f39796b.equals("https");
    }

    public final String toString() {
        return "Request{method=" + this.f39289b + ", url=" + this.f39288a + ", tag=" + (this.f39292e != this ? this.f39292e : null) + '}';
    }
}
