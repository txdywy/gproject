package com.squareup.okhttp;

public final class al {
    public ag f39315a;
    public af f39316b;
    public int f39317c;
    public String f39318d;
    public C7688u f39319e;
    public C7690w f39320f;
    public am f39321g;
    public ak f39322h;
    public ak f39323i;
    public ak f39324j;

    public al() {
        this.f39317c = -1;
        this.f39320f = new C7690w();
    }

    al(ak akVar) {
        this.f39317c = -1;
        this.f39315a = akVar.f39304a;
        this.f39316b = akVar.f39305b;
        this.f39317c = akVar.f39306c;
        this.f39318d = akVar.f39307d;
        this.f39319e = akVar.f39308e;
        this.f39320f = akVar.f39309f.m37016b();
        this.f39321g = akVar.f39310g;
        this.f39322h = akVar.f39311h;
        this.f39323i = akVar.f39312i;
        this.f39324j = akVar.f39313j;
    }

    public final al m36658a(String str, String str2) {
        this.f39320f.m37025c(str, str2);
        return this;
    }

    public final al m36660b(String str, String str2) {
        this.f39320f.m37023a(str, str2);
        return this;
    }

    public final al m36657a(C7689v c7689v) {
        this.f39320f = c7689v.m37016b();
        return this;
    }

    public final al m36656a(ak akVar) {
        if (akVar != null) {
            m36654a("networkResponse", akVar);
        }
        this.f39322h = akVar;
        return this;
    }

    public final al m36659b(ak akVar) {
        if (akVar != null) {
            m36654a("cacheResponse", akVar);
        }
        this.f39323i = akVar;
        return this;
    }

    private static void m36654a(String str, ak akVar) {
        if (akVar.f39310g != null) {
            throw new IllegalArgumentException(str + ".body != null");
        } else if (akVar.f39311h != null) {
            throw new IllegalArgumentException(str + ".networkResponse != null");
        } else if (akVar.f39312i != null) {
            throw new IllegalArgumentException(str + ".cacheResponse != null");
        } else if (akVar.f39313j != null) {
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }
    }

    public final al m36661c(ak akVar) {
        if (akVar == null || akVar.f39310g == null) {
            this.f39324j = akVar;
            return this;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    public final ak m36655a() {
        if (this.f39315a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.f39316b == null) {
            throw new IllegalStateException("protocol == null");
        } else if (this.f39317c >= 0) {
            return new ak(this);
        } else {
            throw new IllegalStateException("code < 0: " + this.f39317c);
        }
    }
}
