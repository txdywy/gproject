package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class an {
    public final C7599a f39325a;
    public final Proxy f39326b;
    public final InetSocketAddress f39327c;

    public an(C7599a c7599a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c7599a == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        } else {
            this.f39325a = c7599a;
            this.f39326b = proxy;
            this.f39327c = inetSocketAddress;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (this.f39325a.equals(anVar.f39325a) && this.f39326b.equals(anVar.f39326b) && this.f39327c.equals(anVar.f39327c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f39325a.hashCode() + 527) * 31) + this.f39326b.hashCode()) * 31) + this.f39327c.hashCode();
    }
}
