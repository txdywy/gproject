package com.google.android.libraries.play.entertainment.p192l.p350a;

import com.google.android.libraries.play.entertainment.p351m.C6116b;

public final class C6103c {
    public final C6102b f30261a;
    public final int f30262b = 1;
    public final int f30263c = 2;

    public C6103c(C6102b c6102b) {
        this.f30261a = (C6102b) C6116b.m28100a((Object) c6102b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6103c)) {
            return false;
        }
        C6103c c6103c = (C6103c) obj;
        if (this.f30261a.equals(c6103c.f30261a) && this.f30262b == c6103c.f30262b && this.f30263c == c6103c.f30263c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f30261a.hashCode() * 31) + this.f30262b) * 31) + this.f30263c;
    }
}
