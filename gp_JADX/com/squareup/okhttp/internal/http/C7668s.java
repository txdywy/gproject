package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p526e.C7724h;
import p526e.C7725i;
import p526e.C7726f;
import p526e.aa;
import p526e.ab;

public final class C7668s implements aa {
    public boolean f39694a;
    public final /* synthetic */ C7725i f39695b;
    public final /* synthetic */ C7650b f39696c;
    public final /* synthetic */ C7724h f39697d;

    public C7668s(C7725i c7725i, C7650b c7650b, C7724h c7724h) {
        this.f39695b = c7725i;
        this.f39696c = c7650b;
        this.f39697d = c7724h;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        try {
            long a = this.f39695b.mo6423a(c7726f, j);
            if (a == -1) {
                if (!this.f39694a) {
                    this.f39694a = true;
                    this.f39697d.close();
                }
                return -1;
            }
            c7726f.m37376a(this.f39697d.mo6486b(), c7726f.f40188c - a, a);
            this.f39697d.mo6507r();
            return a;
        } catch (IOException e) {
            if (!this.f39694a) {
                this.f39694a = true;
                this.f39696c.m36919b();
            }
            throw e;
        }
    }

    public final ab mo6424a() {
        return this.f39695b.mo6424a();
    }

    public final void close() {
        if (!(this.f39694a || k.a(this, TimeUnit.MILLISECONDS))) {
            this.f39694a = true;
            this.f39696c.m36919b();
        }
        this.f39695b.close();
    }
}
