package com.squareup.okhttp.internal.p527b;

import com.squareup.okhttp.C7599a;
import com.squareup.okhttp.C7607h;
import com.squareup.okhttp.C7640l;
import com.squareup.okhttp.C7682o;
import com.squareup.okhttp.C7688u;
import com.squareup.okhttp.C7691x;
import com.squareup.okhttp.af;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ah;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.al;
import com.squareup.okhttp.an;
import com.squareup.okhttp.internal.C7639a;
import com.squareup.okhttp.internal.C7646f;
import com.squareup.okhttp.internal.http.C7655f;
import com.squareup.okhttp.internal.http.C7671w;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.internal.p525a.C7614e;
import com.squareup.okhttp.internal.p525a.C7623m;
import com.squareup.okhttp.internal.p528c.C7643b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p526e.C7724h;
import p526e.C7725i;
import p526e.C7733p;
import p526e.aa;

public final class C7641a implements C7640l {
    public final an f39559a;
    public Socket f39560b;
    public Socket f39561c;
    public C7688u f39562d;
    public af f39563e;
    public volatile C7614e f39564f;
    public int f39565g;
    public C7725i f39566h;
    public C7724h f39567i;
    public final List f39568j = new ArrayList();
    public boolean f39569k;
    public long f39570l = Long.MAX_VALUE;

    public C7641a(an anVar) {
        this.f39559a = anVar;
    }

    public final void m36861a(int i, int i2, int i3, List list, boolean z) {
        if (this.f39563e != null) {
            throw new IllegalStateException("already connected");
        }
        RouteException routeException = null;
        C7639a c7639a = new C7639a(list);
        Proxy proxy = this.f39559a.f39326b;
        C7599a c7599a = this.f39559a.f39325a;
        if (this.f39559a.f39325a.f39278i != null || list.contains(C7682o.f39779d)) {
            while (this.f39563e == null) {
                Socket createSocket = (proxy.type() == Type.DIRECT || proxy.type() == Type.HTTP) ? c7599a.f39272c.createSocket() : new Socket(proxy);
                this.f39560b = createSocket;
                this.f39560b.setSoTimeout(i2);
                try {
                    C7646f.f39583a.mo6461a(this.f39560b, this.f39559a.f39327c, i);
                    this.f39566h = C7733p.m37442a(C7733p.m37445b(this.f39560b));
                    this.f39567i = C7733p.m37441a(C7733p.m37443a(this.f39560b));
                    if (this.f39559a.f39325a.f39278i != null) {
                        m36859a(i2, i3, c7639a);
                    } else {
                        this.f39563e = af.b;
                        this.f39561c = this.f39560b;
                    }
                    if (this.f39563e == af.c || this.f39563e == af.d) {
                        this.f39561c.setSoTimeout(0);
                        C7623m c7623m = new C7623m();
                        Socket socket = this.f39561c;
                        String str = this.f39559a.f39325a.f39270a.f39799e;
                        C7725i c7725i = this.f39566h;
                        C7724h c7724h = this.f39567i;
                        c7623m.f39491a = socket;
                        c7623m.f39492b = str;
                        c7623m.f39493c = c7725i;
                        c7623m.f39494d = c7724h;
                        c7623m.f39496f = this.f39563e;
                        C7614e c7614e = new C7614e(c7623m);
                        c7614e.f39466t.mo6428a();
                        c7614e.f39466t.mo6437b(c7614e.f39461o);
                        int b = c7614e.f39461o.m36756b();
                        if (b != 65536) {
                            c7614e.f39466t.mo6429a(0, (long) (b - 65536));
                        }
                        this.f39564f = c7614e;
                    }
                } catch (ConnectException e) {
                    throw new ConnectException("Failed to connect to " + this.f39559a.f39327c);
                } catch (IOException e2) {
                    k.a(this.f39561c);
                    k.a(this.f39560b);
                    this.f39561c = null;
                    this.f39560b = null;
                    this.f39566h = null;
                    this.f39567i = null;
                    this.f39562d = null;
                    this.f39563e = null;
                    if (routeException == null) {
                        routeException = new RouteException(e2);
                    } else {
                        IOException iOException = routeException.f39594b;
                        if (RouteException.f39593a != null) {
                            try {
                                RouteException.f39593a.invoke(e2, new Object[]{iOException});
                            } catch (InvocationTargetException e3) {
                            } catch (IllegalAccessException e4) {
                            }
                        }
                        routeException.f39594b = e2;
                    }
                    if (z) {
                        c7639a.f39558d = true;
                        Object obj = (!c7639a.f39557c || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException) || (((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException) || !((e2 instanceof SSLHandshakeException) || (e2 instanceof SSLProtocolException)))) ? null : 1;
                        if (obj == null) {
                        }
                    }
                    throw routeException;
                }
            }
            return;
        }
        throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list));
    }

    private final void m36859a(int i, int i2, C7639a c7639a) {
        Socket socket;
        Throwable th;
        Socket socket2;
        Object obj = 1;
        String str = null;
        an anVar = this.f39559a;
        if (anVar.f39325a.f39278i == null || anVar.f39326b.type() != Type.HTTP) {
            obj = null;
        }
        if (obj != null) {
            ag a = new ah().m36637a(this.f39559a.f39325a.f39270a).m36640a("Host", k.a(this.f39559a.f39325a.f39270a)).m36640a("Proxy-Connection", "Keep-Alive").m36640a("User-Agent", "okhttp/2.7.2").m36636a();
            C7691x c7691x = a.f39288a;
            String str2 = "CONNECT " + c7691x.f39799e + ":" + c7691x.f39800f + " HTTP/1.1";
            do {
                C7655f c7655f = new C7655f(null, this.f39566h, this.f39567i);
                this.f39566h.mo6424a().mo6479a((long) i, TimeUnit.MILLISECONDS);
                this.f39567i.mo6454a().mo6479a((long) i2, TimeUnit.MILLISECONDS);
                c7655f.m36939a(a.f39290c, str2);
                c7655f.mo6473b();
                al c = c7655f.m36941c();
                c.f39315a = a;
                ak a2 = c.m36655a();
                long a3 = C7671w.m36982a(a2);
                if (a3 == -1) {
                    a3 = 0;
                }
                aa a4 = c7655f.m36934a(a3);
                k.a(a4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                a4.close();
                switch (a2.f39306c) {
                    case 200:
                        if (!(this.f39566h.mo6486b().mo6492d() && this.f39567i.mo6486b().mo6492d())) {
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                    case 407:
                        a = C7671w.m36984a(this.f39559a.f39325a.f39273d, a2, this.f39559a.f39326b);
                        break;
                    default:
                        throw new IOException("Unexpected response code for CONNECT: " + a2.f39306c);
                }
            } while (a != null);
            throw new IOException("Failed to authenticate with proxy");
        }
        C7599a c7599a = this.f39559a.f39325a;
        try {
            Socket socket3 = (SSLSocket) c7599a.f39278i.createSocket(this.f39560b, c7599a.f39270a.f39799e, c7599a.f39270a.f39800f, true);
            try {
                C7682o a5 = c7639a.m36857a(socket3);
                if (a5.f39781f) {
                    C7646f.f39583a.mo6462a((SSLSocket) socket3, c7599a.f39270a.f39799e, c7599a.f39274e);
                }
                socket3.startHandshake();
                C7688u a6 = C7688u.m37012a(socket3.getSession());
                if (c7599a.f39279j.verify(c7599a.f39270a.f39799e, socket3.getSession())) {
                    c7599a.f39280k.m36678a(c7599a.f39270a.f39799e, a6.f39791b);
                    if (a5.f39781f) {
                        str = C7646f.f39583a.mo6463b(socket3);
                    }
                    this.f39561c = socket3;
                    this.f39566h = C7733p.m37442a(C7733p.m37445b(this.f39561c));
                    this.f39567i = C7733p.m37441a(C7733p.m37443a(this.f39561c));
                    this.f39562d = a6;
                    this.f39563e = str != null ? af.a(str) : af.b;
                    if (socket3 != null) {
                        C7646f.f39583a.mo6464a(socket3);
                        return;
                    }
                    return;
                }
                Certificate certificate = (X509Certificate) a6.f39791b.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + c7599a.f39270a.f39799e + " not verified:\n    certificate: " + C7607h.m36677a(certificate) + "\n    DN: " + certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C7643b.m36869a(certificate));
            } catch (Throwable e) {
                Throwable th2 = e;
                socket = socket3;
                th = th2;
                try {
                    if (k.a(th)) {
                        throw new IOException(th);
                    }
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    socket2 = socket;
                }
            } catch (Throwable e2) {
                socket2 = socket3;
                th = e2;
                if (socket2 != null) {
                    C7646f.f39583a.mo6464a(socket2);
                }
                k.a(socket2);
                throw th;
            }
        } catch (AssertionError e3) {
            th = e3;
            socket = null;
            if (k.a(th)) {
                throw new IOException(th);
            }
            throw th;
        } catch (Throwable th4) {
            th = th4;
            if (socket2 != null) {
                C7646f.f39583a.mo6464a(socket2);
            }
            k.a(socket2);
            throw th;
        }
    }

    public final an mo6460a() {
        return this.f39559a;
    }

    public final boolean m36862a(boolean z) {
        if (this.f39561c.isClosed() || this.f39561c.isInputShutdown() || this.f39561c.isOutputShutdown()) {
            return false;
        }
        if (this.f39564f != null || !z) {
            return true;
        }
        int soTimeout;
        try {
            soTimeout = this.f39561c.getSoTimeout();
            this.f39561c.setSoTimeout(1);
            if (this.f39566h.mo6492d()) {
                this.f39561c.setSoTimeout(soTimeout);
                return false;
            }
            this.f39561c.setSoTimeout(soTimeout);
            return true;
        } catch (SocketTimeoutException e) {
            return true;
        } catch (IOException e2) {
            return false;
        } catch (Throwable th) {
            this.f39561c.setSoTimeout(soTimeout);
        }
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Connection{").append(this.f39559a.f39325a.f39270a.f39799e).append(":").append(this.f39559a.f39325a.f39270a.f39800f).append(", proxy=").append(this.f39559a.f39326b).append(" hostAddress=").append(this.f39559a.f39327c).append(" cipherSuite=");
        if (this.f39562d != null) {
            str = this.f39562d.f39790a;
        } else {
            str = "none";
        }
        return append.append(str).append(" protocol=").append(this.f39563e).append('}').toString();
    }
}
