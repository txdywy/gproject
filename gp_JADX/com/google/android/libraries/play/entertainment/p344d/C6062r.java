package com.google.android.libraries.play.entertainment.p344d;

import com.google.android.libraries.play.entertainment.p351m.C6116b;

public class C6062r extends C6056i {
    public C6061h f30195j;

    public final void m27980b(C6061h c6061h) {
        synchronized (this.c) {
            this.f30195j = (C6061h) C6116b.m28100a((Object) c6061h);
            m27969e();
        }
    }

    protected final C6061h mo5271a() {
        C6061h c6061h;
        synchronized (this.c) {
            C6116b.m28104a(this.f30195j != null, "SettablePending is not complete");
            c6061h = this.f30195j;
        }
        return c6061h;
    }
}
