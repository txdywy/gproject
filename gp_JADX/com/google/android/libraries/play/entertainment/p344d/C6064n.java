package com.google.android.libraries.play.entertainment.p344d;

public abstract class C6064n extends C6062r implements C6048p, C6063v {
    public C6055u f30196i;

    protected C6064n() {
    }

    public final void mo5273d() {
        synchronized (this.c) {
            if (this.f30196i != null) {
                this.f30196i.mo5270c();
            }
        }
    }

    public final void mo5272a(C6055u c6055u) {
        synchronized (this.c) {
            if (mo5269b()) {
                c6055u.mo5270c();
            } else {
                this.f30196i = c6055u;
            }
        }
    }
}
