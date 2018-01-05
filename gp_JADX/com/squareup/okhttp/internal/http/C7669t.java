package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7599a;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.ab;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import java.net.ProtocolException;
import p526e.C7724h;
import p526e.C7733p;

public final class C7669t implements ab {
    public final int f39698a;
    public final ag f39699b;
    public int f39700c;
    public final /* synthetic */ C7666q f39701d;

    public C7669t(C7666q c7666q, int i, ag agVar) {
        this.f39701d = c7666q;
        this.f39698a = i;
        this.f39699b = agVar;
    }

    public final ag mo6419a() {
        return this.f39699b;
    }

    public final ak mo6420a(ag agVar) {
        aa aaVar;
        this.f39700c++;
        if (this.f39698a > 0) {
            aaVar = (aa) this.f39701d.f39677b.j.get(this.f39698a - 1);
            C7599a c7599a = this.f39701d.f39678c.m36912a().mo6460a().f39325a;
            if (!agVar.f39288a.f39799e.equals(c7599a.f39270a.f39799e) || agVar.f39288a.f39800f != c7599a.f39270a.f39800f) {
                throw new IllegalStateException("network interceptor " + aaVar + " must retain the same host and port");
            } else if (this.f39700c > 1) {
                throw new IllegalStateException("network interceptor " + aaVar + " must call proceed() exactly once");
            }
        }
        if (this.f39698a < this.f39701d.f39677b.j.size()) {
            Object c7669t = new C7669t(this.f39701d, this.f39698a + 1, agVar);
            aaVar = (aa) this.f39701d.f39677b.j.get(this.f39698a);
            ak a = aaVar.a(c7669t);
            if (c7669t.f39700c != 1) {
                throw new IllegalStateException("network interceptor " + aaVar + " must call proceed() exactly once");
            } else if (a != null) {
                return a;
            } else {
                throw new NullPointerException("network interceptor " + aaVar + " returned null");
            }
        }
        this.f39701d.f39680e.mo6470a(agVar);
        this.f39701d.f39685j = agVar;
        if (C7666q.m36963a(agVar) && agVar.f39291d != null) {
            C7724h a2 = C7733p.m37441a(this.f39701d.f39680e.mo6469a(agVar, agVar.f39291d.mo6418b()));
            agVar.f39291d.mo6417a(a2);
            a2.close();
        }
        ak c = this.f39701d.m36971c();
        int i = c.f39306c;
        if ((i != 204 && i != 205) || c.f39310g.mo6475b() <= 0) {
            return c;
        }
        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c.f39310g.mo6475b());
    }
}
