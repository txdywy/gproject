package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7599a;
import com.squareup.okhttp.C7691x;
import com.squareup.okhttp.an;
import com.squareup.okhttp.internal.C7676j;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class ab {
    public final C7599a f39599a;
    public final C7676j f39600b;
    public Proxy f39601c;
    public InetSocketAddress f39602d;
    public List f39603e = Collections.emptyList();
    public int f39604f;
    public List f39605g = Collections.emptyList();
    public int f39606h;
    public final List f39607i = new ArrayList();

    public ab(C7599a c7599a, C7676j c7676j) {
        this.f39599a = c7599a;
        this.f39600b = c7676j;
        C7691x c7691x = c7599a.f39270a;
        Proxy proxy = c7599a.f39277h;
        if (proxy != null) {
            this.f39603e = Collections.singletonList(proxy);
        } else {
            this.f39603e = new ArrayList();
            Collection select = this.f39599a.f39276g.select(c7691x.m37039b());
            if (select != null) {
                this.f39603e.addAll(select);
            }
            this.f39603e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f39603e.add(Proxy.NO_PROXY);
        }
        this.f39604f = 0;
    }

    public final boolean m36906a() {
        return m36904d() || m36903c() || m36905e();
    }

    public final an m36907b() {
        while (true) {
            if (!m36904d()) {
                if (!m36903c()) {
                    break;
                } else if (m36903c()) {
                    List list = this.f39603e;
                    int i = this.f39604f;
                    this.f39604f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    m36902a(proxy);
                    this.f39601c = proxy;
                } else {
                    throw new SocketException("No route to " + this.f39599a.f39270a.f39799e + "; exhausted proxy configurations: " + this.f39603e);
                }
            }
            if (m36904d()) {
                list = this.f39605g;
                i = this.f39606h;
                this.f39606h = i + 1;
                this.f39602d = (InetSocketAddress) list.get(i);
                an anVar = new an(this.f39599a, this.f39601c, this.f39602d);
                if (!this.f39600b.m36996c(anVar)) {
                    return anVar;
                }
                this.f39607i.add(anVar);
            } else {
                throw new SocketException("No route to " + this.f39599a.f39270a.f39799e + "; exhausted inet socket addresses: " + this.f39605g);
            }
        }
        if (m36905e()) {
            return (an) this.f39607i.remove(0);
        }
        throw new NoSuchElementException();
    }

    private final boolean m36903c() {
        return this.f39604f < this.f39603e.size();
    }

    private final void m36902a(Proxy proxy) {
        String str;
        int i;
        this.f39605g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f39599a.f39270a.f39799e;
            i = this.f39599a.f39270a.f39800f;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i <= 0 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        }
        if (proxy.type() == Type.SOCKS) {
            this.f39605g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List a = this.f39599a.f39271b.mo6477a(str);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f39605g.add(new InetSocketAddress((InetAddress) a.get(i2), i));
            }
        }
        this.f39606h = 0;
    }

    private final boolean m36904d() {
        return this.f39606h < this.f39605g.size();
    }

    private final boolean m36905e() {
        return !this.f39607i.isEmpty();
    }
}
