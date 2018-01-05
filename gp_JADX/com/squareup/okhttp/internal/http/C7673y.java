package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.am;
import p526e.C7725i;

public final class C7673y extends am {
    public final C7689v f39706a;
    public final C7725i f39707b;

    public C7673y(C7689v c7689v, C7725i c7725i) {
        this.f39706a = c7689v;
        this.f39707b = c7725i;
    }

    public final ac mo6474a() {
        String a = this.f39706a.m37014a("Content-Type");
        return a != null ? ac.m36615a(a) : null;
    }

    public final long mo6475b() {
        return C7671w.m36983a(this.f39706a);
    }

    public final C7725i mo6476d() {
        return this.f39707b;
    }
}
