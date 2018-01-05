package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7600b;
import com.squareup.okhttp.internal.C7615d;
import java.io.IOException;
import java.util.logging.Level;

final class C7627q extends C7615d {
    public final /* synthetic */ C7630t f39502b;
    public final /* synthetic */ C7626p f39503c;

    C7627q(C7626p c7626p, String str, Object[] objArr, C7630t c7630t) {
        this.f39503c = c7626p;
        this.f39502b = c7630t;
        super(str, objArr);
    }

    public final void mo6443a() {
        try {
            this.f39503c.f39501c.f39450d.mo6444a(this.f39502b);
        } catch (Throwable e) {
            C7600b.f39286a.log(Level.INFO, "FramedConnection.Listener failure for " + this.f39503c.f39501c.f39452f, e);
            try {
                this.f39502b.m36823a(C7609a.PROTOCOL_ERROR);
            } catch (IOException e2) {
            }
        }
    }
}
