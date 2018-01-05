package com.google.android.gms.internal;

final class ii implements Runnable {
    public /* synthetic */ ij f26993a;
    public /* synthetic */ ig f26994b;

    ii(ig igVar, ij ijVar) {
        this.f26994b = igVar;
        this.f26993a = ijVar;
    }

    public final void run() {
        ig.m24797a(this.f26994b, this.f26993a);
        this.f26994b.f26983a = null;
        this.f26994b.mo4733g().m24827a(null);
    }
}
