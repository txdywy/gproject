package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.io.DataInputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

final class C6916x {
    public final BitSet f34245a;
    public final byte[] f34246b;
    public final List f34247c;

    C6916x(DataInputStream dataInputStream) {
        C6937m.m31635b(dataInputStream.readInt() == 1296389185);
        dataInputStream.readInt();
        this.f34246b = new byte[2];
        dataInputStream.readFully(this.f34246b);
        this.f34245a = C6908p.m31548a(dataInputStream);
        this.f34247c = C6909q.m31549a(dataInputStream);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6916x)) {
            return false;
        }
        C6916x c6916x = (C6916x) obj;
        if (c6916x.f34245a.equals(this.f34245a) && Arrays.equals(c6916x.f34246b, this.f34246b) && c6916x.f34247c.equals(this.f34247c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f34245a.hashCode() + 527) * 31) + Arrays.hashCode(this.f34246b)) * 31) + this.f34247c.hashCode();
    }
}
