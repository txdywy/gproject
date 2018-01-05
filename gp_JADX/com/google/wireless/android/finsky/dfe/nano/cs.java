package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cs extends b {
    public int f38598a;
    public cr[] f38599b;
    public byte[] f38600c;
    public int f38601d;
    public int f38602e;

    public cs() {
        this.f38598a = 0;
        this.f38599b = cr.m36187d();
        this.f38600c = C7222l.f35479l;
        this.f38601d = 0;
        this.f38602e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36193a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38599b != null && this.f38599b.length > 0) {
            for (i iVar : this.f38599b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38598a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38600c);
        }
        if ((this.f38598a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38601d);
        }
        if ((this.f38598a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38602e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36194b() {
        int b = super.b();
        if (this.f38599b != null && this.f38599b.length > 0) {
            for (i iVar : this.f38599b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38598a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f38600c);
        }
        if ((this.f38598a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38601d);
        }
        if ((this.f38598a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38602e);
        }
        return b;
    }

    private final cs m36191b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38599b == null ? 0 : this.f38599b.length;
                    Object obj = new cr[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38599b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cr();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cr();
                    c7213a.m33552a(obj[a]);
                    this.f38599b = obj;
                    continue;
                case 18:
                    this.f38600c = c7213a.m33565g();
                    this.f38598a |= 1;
                    continue;
                case 24:
                    this.f38601d = c7213a.m33567i();
                    this.f38598a |= 2;
                    continue;
                case 32:
                    this.f38598a |= 4;
                    a2 = c7213a.m33573o();
                    try {
                        this.f38602e = aw.a(c7213a.m33567i());
                        this.f38598a |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a2);
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

    public final /* synthetic */ i m36192a(C7213a c7213a) {
        return m36191b(c7213a);
    }
}
