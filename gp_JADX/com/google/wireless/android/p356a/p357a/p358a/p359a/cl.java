package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cl extends b {
    public int f35963a;
    public int f35964b;
    public int f35965c;
    public boolean f35966d;
    public int f35967e;
    public cq[] f35968f;

    public cl() {
        this.f35963a = 0;
        this.f35964b = 0;
        this.f35965c = 0;
        this.f35966d = false;
        this.f35967e = 0;
        this.f35968f = cq.m34355d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34324a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35963a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35964b);
        }
        if ((this.f35963a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35965c);
        }
        if ((this.f35963a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f35966d);
        }
        if ((this.f35963a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35967e);
        }
        if (this.f35968f != null && this.f35968f.length > 0) {
            for (i iVar : this.f35968f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34325b() {
        int b = super.b();
        if ((this.f35963a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35964b);
        }
        if ((this.f35963a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35965c);
        }
        if ((this.f35963a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f35963a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35967e);
        }
        if (this.f35968f == null || this.f35968f.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f35968f) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(5, iVar);
            }
        }
        return i;
    }

    private final cl m34322b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35963a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f35964b = ce.m34285a(c7213a.m33567i());
                        this.f35963a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35965c = c7213a.m33567i();
                    this.f35963a |= 2;
                    continue;
                case 24:
                    this.f35966d = c7213a.m33563e();
                    this.f35963a |= 4;
                    continue;
                case 32:
                    this.f35967e = c7213a.m33567i();
                    this.f35963a |= 8;
                    continue;
                case 42:
                    o = C7222l.m33624a(c7213a, 42);
                    a = this.f35968f == null ? 0 : this.f35968f.length;
                    Object obj = new cq[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35968f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cq();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cq();
                    c7213a.m33552a(obj[a]);
                    this.f35968f = obj;
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

    public final /* synthetic */ i m34323a(C7213a c7213a) {
        return m34322b(c7213a);
    }
}
