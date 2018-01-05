package com.google.android.finsky.installqueue;

import com.google.android.finsky.installer.p208b.p209a.C3317g;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.j;
import java.util.Arrays;

public final class C3367k {
    public static final C3367k f17267a = new C3367k(true, false, true);
    public static final C3367k f17268b = new C3367k(true, false, false);
    public static final C3367k f17269c = new C3367k(false, false, false);
    public final C3317g f17270d;

    C3367k(C3317g c3317g) {
        this.f17270d = c3317g;
    }

    private C3367k(boolean z, boolean z2, boolean z3) {
        this.f17270d = new C3317g();
        this.f17270d.m16675a(z);
        this.f17270d.m16679b(z2);
        this.f17270d.m16680c(z3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3367k)) {
            return false;
        }
        return C0757i.m4908a(this.f17270d, ((C3367k) obj).f17270d);
    }

    public final int hashCode() {
        return Arrays.hashCode(C0757i.m4909a(this.f17270d));
    }

    public final String toString() {
        return j.a(this.f17270d);
    }

    static {
        C3367k c3367k = new C3367k(true, true, true);
    }
}
