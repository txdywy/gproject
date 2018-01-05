package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class C7599a {
    public final C7691x f39270a;
    public final C7686s f39271b;
    public final SocketFactory f39272c;
    public final C7601b f39273d;
    public final List f39274e;
    public final List f39275f;
    public final ProxySelector f39276g;
    public final Proxy f39277h;
    public final SSLSocketFactory f39278i;
    public final HostnameVerifier f39279j;
    public final C7607h f39280k;

    public C7599a(String str, int i, C7686s c7686s, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C7607h c7607h, C7601b c7601b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C7692y c7692y = new C7692y();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c7692y.f39804a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            c7692y.f39804a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: " + str2);
        }
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        str2 = C7692y.m37044a(str, 0, str.length());
        if (str2 == null) {
            throw new IllegalArgumentException("unexpected host: " + str);
        }
        c7692y.f39807d = str2;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: " + i);
        }
        c7692y.f39808e = i;
        this.f39270a = c7692y.m37053b();
        if (c7686s == null) {
            throw new IllegalArgumentException("dns == null");
        }
        this.f39271b = c7686s;
        if (socketFactory == null) {
            throw new IllegalArgumentException("socketFactory == null");
        }
        this.f39272c = socketFactory;
        if (c7601b == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        this.f39273d = c7601b;
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.f39274e = k.a(list);
        if (list2 == null) {
            throw new IllegalArgumentException("connectionSpecs == null");
        }
        this.f39275f = k.a(list2);
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.f39276g = proxySelector;
        this.f39277h = proxy;
        this.f39278i = sSLSocketFactory;
        this.f39279j = hostnameVerifier;
        this.f39280k = c7607h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7599a)) {
            return false;
        }
        C7599a c7599a = (C7599a) obj;
        if (this.f39270a.equals(c7599a.f39270a) && this.f39271b.equals(c7599a.f39271b) && this.f39273d.equals(c7599a.f39273d) && this.f39274e.equals(c7599a.f39274e) && this.f39275f.equals(c7599a.f39275f) && this.f39276g.equals(c7599a.f39276g) && k.a(this.f39277h, c7599a.f39277h) && k.a(this.f39278i, c7599a.f39278i) && k.a(this.f39279j, c7599a.f39279j) && k.a(this.f39280k, c7599a.f39280k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        int hashCode2 = (((((((((((this.f39270a.hashCode() + 527) * 31) + this.f39271b.hashCode()) * 31) + this.f39273d.hashCode()) * 31) + this.f39274e.hashCode()) * 31) + this.f39275f.hashCode()) * 31) + this.f39276g.hashCode()) * 31;
        if (this.f39277h != null) {
            hashCode = this.f39277h.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f39278i != null) {
            hashCode = this.f39278i.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f39279j != null) {
            hashCode = this.f39279j.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (this.f39280k != null) {
            i = this.f39280k.hashCode();
        }
        return hashCode + i;
    }
}
