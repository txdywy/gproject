package org.chromium.net.impl;

final class C7956p implements Runnable {
    public final /* synthetic */ CronetUrlRequest f40929a;

    C7956p(CronetUrlRequest cronetUrlRequest) {
        this.f40929a = cronetUrlRequest;
    }

    public final void run() {
        this.f40929a.m38022f();
        synchronized (this.f40929a.f40713f) {
            if (this.f40929a.m38021e()) {
                return;
            }
            this.f40929a.f40712e = true;
            try {
                this.f40929a.f40718k.mo6580a(this.f40929a, this.f40929a.f40726s);
            } catch (Exception e) {
                this.f40929a.m38012a(e);
            }
        }
    }
}
