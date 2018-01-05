package com.squareup.okhttp.internal;

import com.squareup.okhttp.C7682o;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class C7639a {
    public final List f39555a;
    public int f39556b = 0;
    public boolean f39557c;
    public boolean f39558d;

    public C7639a(List list) {
        this.f39555a = list;
    }

    public final C7682o m36857a(SSLSocket sSLSocket) {
        C7682o c7682o;
        int i = this.f39556b;
        int size = this.f39555a.size();
        for (int i2 = i; i2 < size; i2++) {
            c7682o = (C7682o) this.f39555a.get(i2);
            if (c7682o.m37000a(sSLSocket)) {
                this.f39556b = i2 + 1;
                break;
            }
        }
        c7682o = null;
        if (c7682o == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f39558d + ", modes=" + this.f39555a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.f39557c = m36856b(sSLSocket);
        C7600b.f39287b.mo6412a(c7682o, sSLSocket, this.f39558d);
        return c7682o;
    }

    private final boolean m36856b(SSLSocket sSLSocket) {
        for (int i = this.f39556b; i < this.f39555a.size(); i++) {
            if (((C7682o) this.f39555a.get(i)).m37000a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
