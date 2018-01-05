package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bu extends b {
    public int f35841a;
    public ce f35842b;
    public ce[] f35843c;
    public long f35844d;

    public bu() {
        m34234d();
    }

    public final bu m34234d() {
        this.f35841a = 0;
        this.f35842b = null;
        this.f35843c = ce.f35926a;
        this.f35844d = 0;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final void m34232a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35842b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35842b);
        }
        if (this.f35843c != null && this.f35843c.length > 0) {
            for (i iVar : this.f35843c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f35841a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35844d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34233b() {
        int b = super.b();
        if (this.f35842b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35842b);
        }
        if (this.f35843c != null && this.f35843c.length > 0) {
            int i = b;
            for (i iVar : this.f35843c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if ((this.f35841a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f35844d);
        }
        return b;
    }

    public final /* synthetic */ i m34231a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35842b == null) {
                        this.f35842b = new ce();
                    }
                    c7213a.m33552a(this.f35842b);
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f35843c == null ? 0 : this.f35843c.length;
                    Object obj = new ce[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35843c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ce();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ce();
                    c7213a.m33552a(obj[a]);
                    this.f35843c = obj;
                    continue;
                case 24:
                    this.f35844d = c7213a.m33568j();
                    this.f35841a |= 1;
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
