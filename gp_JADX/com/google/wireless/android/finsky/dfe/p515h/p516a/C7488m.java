package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7488m extends b {
    public static volatile C7488m[] f38108a;
    public int f38109b;
    public ax f38110c;
    public int f38111d;

    public static C7488m[] m35820d() {
        if (f38108a == null) {
            synchronized (C7219h.f35465b) {
                if (f38108a == null) {
                    f38108a = new C7488m[0];
                }
            }
        }
        return f38108a;
    }

    public final C7488m m35822a(int i) {
        this.f38111d = i;
        this.f38109b |= 1;
        return this;
    }

    public C7488m() {
        this.f38109b = 0;
        this.f38110c = null;
        this.f38111d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35823a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38110c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38110c);
        }
        if ((this.f38109b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38111d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35824b() {
        int b = super.b();
        if (this.f38110c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38110c);
        }
        if ((this.f38109b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38111d);
        }
        return b;
    }

    private final C7488m m35819b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38110c == null) {
                        this.f38110c = new ax();
                    }
                    c7213a.m33552a(this.f38110c);
                    continue;
                case 16:
                    this.f38109b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f38111d = ah.m35745a(c7213a.m33567i());
                        this.f38109b |= 1;
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

    public final /* synthetic */ i m35821a(C7213a c7213a) {
        return m35819b(c7213a);
    }
}
