package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bg extends b {
    public static volatile bg[] f38424a;
    public int f38425b;
    public int[] f38426c;
    public int f38427d;
    public int f38428e;

    public static bg[] m36069d() {
        if (f38424a == null) {
            synchronized (C7219h.f35465b) {
                if (f38424a == null) {
                    f38424a = new bg[0];
                }
            }
        }
        return f38424a;
    }

    public bg() {
        this.f38425b = 0;
        this.f38426c = C7222l.f35472e;
        this.f38427d = 0;
        this.f38428e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36071a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38426c != null && this.f38426c.length > 0) {
            for (int a : this.f38426c) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if ((this.f38425b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38427d);
        }
        if ((this.f38425b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38428e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36072b() {
        int i = 0;
        int b = super.b();
        if (this.f38426c == null || this.f38426c.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f38426c.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f38426c[i]);
                i++;
            }
            i = (b + i2) + (this.f38426c.length * 1);
        }
        if ((this.f38425b & 1) != 0) {
            i += CodedOutputByteBufferNano.m33502d(2, this.f38427d);
        }
        if ((this.f38425b & 2) != 0) {
            return i + CodedOutputByteBufferNano.m33502d(3, this.f38428e);
        }
        return i;
    }

    public final /* synthetic */ i m36070a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    if (this.f38426c == null) {
                        a = 0;
                    } else {
                        a = this.f38426c.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38426c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f38426c = obj;
                    continue;
                case 10:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f38426c == null ? 0 : this.f38426c.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38426c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f38426c = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 16:
                    this.f38427d = c7213a.m33567i();
                    this.f38425b |= 1;
                    continue;
                case 24:
                    this.f38428e = c7213a.m33567i();
                    this.f38425b |= 2;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
