package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C7671w;
import java.util.Collections;
import java.util.List;

public final class ak {
    public final ag f39304a;
    public final af f39305b;
    public final int f39306c;
    public final String f39307d;
    public final C7688u f39308e;
    public final C7689v f39309f;
    public final am f39310g;
    public ak f39311h;
    public ak f39312i;
    public final ak f39313j;
    public volatile C7603d f39314k;

    ak(al alVar) {
        this.f39304a = alVar.f39315a;
        this.f39305b = alVar.f39316b;
        this.f39306c = alVar.f39317c;
        this.f39307d = alVar.f39318d;
        this.f39308e = alVar.f39319e;
        this.f39309f = alVar.f39320f.m37021a();
        this.f39310g = alVar.f39321g;
        this.f39311h = alVar.f39322h;
        this.f39312i = alVar.f39323i;
        this.f39313j = alVar.f39324j;
    }

    public final String m36651a(String str) {
        String a = this.f39309f.m37014a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    public final al m36650a() {
        return new al(this);
    }

    public final List m36652b() {
        String str;
        if (this.f39306c == 401) {
            str = "WWW-Authenticate";
        } else if (this.f39306c != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C7671w.m36985a(this.f39309f, str);
    }

    public final C7603d m36653c() {
        C7603d c7603d = this.f39314k;
        if (c7603d != null) {
            return c7603d;
        }
        c7603d = C7603d.m36670a(this.f39309f);
        this.f39314k = c7603d;
        return c7603d;
    }

    public final String toString() {
        return "Response{protocol=" + this.f39305b + ", code=" + this.f39306c + ", message=" + this.f39307d + ", url=" + this.f39304a.f39288a.toString() + '}';
    }
}
