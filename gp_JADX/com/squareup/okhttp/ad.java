package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6334k;
import com.squareup.okhttp.internal.b;
import com.squareup.okhttp.internal.c;
import com.squareup.okhttp.internal.j;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class ad implements Cloneable {
    public static final List f31784a = C6334k.m29029a(af.HTTP_2, af.SPDY_3, af.HTTP_1_1);
    public static final List f31785b = C6334k.m29029a(o.b, o.c, o.d);
    public static SSLSocketFactory f31786c;
    public int f31787A;
    public final j f31788d;
    public r f31789e;
    public Proxy f31790f;
    public List f31791g;
    public List f31792h;
    public final List f31793i;
    public final List f31794j;
    public ProxySelector f31795k;
    public CookieHandler f31796l;
    public c f31797m;
    public c f31798n;
    public SocketFactory f31799o;
    public SSLSocketFactory f31800p;
    public HostnameVerifier f31801q;
    public h f31802r;
    public b f31803s;
    public m f31804t;
    public s f31805u;
    public boolean f31806v;
    public boolean f31807w;
    public boolean f31808x;
    public int f31809y;
    public int f31810z;

    public ad() {
        this.f31793i = new ArrayList();
        this.f31794j = new ArrayList();
        this.f31806v = true;
        this.f31807w = true;
        this.f31808x = true;
        this.f31809y = 10000;
        this.f31810z = 10000;
        this.f31787A = 10000;
        this.f31788d = new j();
        this.f31789e = new r();
    }

    ad(ad adVar) {
        this.f31793i = new ArrayList();
        this.f31794j = new ArrayList();
        this.f31806v = true;
        this.f31807w = true;
        this.f31808x = true;
        this.f31809y = 10000;
        this.f31810z = 10000;
        this.f31787A = 10000;
        this.f31788d = adVar.f31788d;
        this.f31789e = adVar.f31789e;
        this.f31790f = adVar.f31790f;
        this.f31791g = adVar.f31791g;
        this.f31792h = adVar.f31792h;
        this.f31793i.addAll(adVar.f31793i);
        this.f31794j.addAll(adVar.f31794j);
        this.f31795k = adVar.f31795k;
        this.f31796l = adVar.f31796l;
        this.f31798n = adVar.f31798n;
        this.f31797m = this.f31798n != null ? this.f31798n.a : adVar.f31797m;
        this.f31799o = adVar.f31799o;
        this.f31800p = adVar.f31800p;
        this.f31801q = adVar.f31801q;
        this.f31802r = adVar.f31802r;
        this.f31803s = adVar.f31803s;
        this.f31804t = adVar.f31804t;
        this.f31805u = adVar.f31805u;
        this.f31806v = adVar.f31806v;
        this.f31807w = adVar.f31807w;
        this.f31808x = adVar.f31808x;
        this.f31809y = adVar.f31809y;
        this.f31810z = adVar.f31810z;
        this.f31787A = adVar.f31787A;
    }

    public final void m29023a(TimeUnit timeUnit) {
        if (5000 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(5000);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || 5000 <= 0) {
                this.f31809y = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    public final void m29022a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || j <= 0) {
                this.f31810z = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    public final void m29024b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (toMillis != 0 || j <= 0) {
                this.f31787A = (int) toMillis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        }
    }

    public final ad m29019a(List list) {
        this.f31792h = C6334k.m29028a(list);
        return this;
    }

    public final f m29020a(ag agVar) {
        return new f(this, agVar);
    }

    final synchronized SSLSocketFactory m29021a() {
        if (f31786c == null) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                f31786c = instance.getSocketFactory();
            } catch (GeneralSecurityException e) {
                throw new AssertionError();
            }
        }
        return f31786c;
    }

    public /* synthetic */ Object clone() {
        return new ad(this);
    }

    static {
        b.b = new ae();
    }
}
