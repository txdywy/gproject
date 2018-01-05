package com.squareup.okhttp.internal.p525a;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p526e.C7634a;

final class C7635w extends C7634a {
    public final /* synthetic */ C7630t f39537a;

    C7635w(C7630t c7630t) {
        this.f39537a = c7630t;
    }

    protected final void mo6459a() {
        this.f39537a.m36825b(C7609a.CANCEL);
    }

    protected final IOException mo6458a(IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void m36854b() {
        if (cW_()) {
            throw mo6458a(null);
        }
    }
}
