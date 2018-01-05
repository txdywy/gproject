package com.google.android.gms.peerdownloadmanager.common;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.InterruptibleChannel;

public final class C5373c implements InterruptibleChannel {
    public final InputStream f27939a;
    public final OutputStream f27940b;
    public final Object f27941c = new Object();
    public boolean f27942d;

    public C5373c(InputStream inputStream, OutputStream outputStream) {
        this.f27939a = inputStream;
        this.f27940b = outputStream;
        this.f27942d = false;
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.f27941c) {
            z = !this.f27942d;
        }
        return z;
    }

    public final void close() {
        synchronized (this.f27941c) {
            if (this.f27942d) {
                return;
            }
            this.f27942d = true;
            aa.m26135a(this.f27940b);
            aa.m26135a(this.f27939a);
        }
    }
}
