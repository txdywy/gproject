package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C7670u;

public final class ah {
    public C7691x f39295a;
    public String f39296b;
    public C7690w f39297c;
    public ai f39298d;
    public Object f39299e;

    public ah() {
        this.f39296b = "GET";
        this.f39297c = new C7690w();
    }

    ah(ag agVar) {
        this.f39295a = agVar.f39288a;
        this.f39296b = agVar.f39289b;
        this.f39298d = agVar.f39291d;
        this.f39299e = agVar.f39292e;
        this.f39297c = agVar.f39290c.m37016b();
    }

    public final ah m36637a(C7691x c7691x) {
        if (c7691x == null) {
            throw new IllegalArgumentException("url == null");
        }
        this.f39295a = c7691x;
        return this;
    }

    public final ah m36638a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else {
            if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
        }
        C7691x c = C7691x.m37037c(str);
        if (c != null) {
            return m36637a(c);
        }
        throw new IllegalArgumentException("unexpected url: " + str);
    }

    public final ah m36640a(String str, String str2) {
        this.f39297c.m37025c(str, str2);
        return this;
    }

    public final ah m36642b(String str, String str2) {
        this.f39297c.m37023a(str, str2);
        return this;
    }

    public final ah m36641b(String str) {
        this.f39297c.m37022a(str);
        return this;
    }

    public final ah m36639a(String str, ai aiVar) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        } else if (aiVar != null && !C7670u.m36980b(str)) {
            throw new IllegalArgumentException("method " + str + " must not have a request body.");
        } else if (aiVar == null && C7670u.m36979a(str)) {
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        } else {
            this.f39296b = str;
            this.f39298d = aiVar;
            return this;
        }
    }

    public final ag m36636a() {
        if (this.f39295a != null) {
            return new ag(this);
        }
        throw new IllegalStateException("url == null");
    }
}
