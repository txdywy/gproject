package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dx extends b {
    public static volatile dx[] f38713a;
    public int f38714b;
    public int f38715c;

    public static int m36294a(int i) {
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Type");
        }
    }

    public static dx[] m36296d() {
        if (f38713a == null) {
            synchronized (C7219h.f35465b) {
                if (f38713a == null) {
                    f38713a = new dx[0];
                }
            }
        }
        return f38713a;
    }

    public dx() {
        this.f38714b = 0;
        this.f38715c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36298a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38714b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38715c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36299b() {
        int b = super.b();
        if ((this.f38714b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f38715c);
        }
        return b;
    }

    private final dx m36295b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38714b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f38715c = m36294a(c7213a.m33567i());
                        this.f38714b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m36297a(C7213a c7213a) {
        return m36295b(c7213a);
    }
}
