package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public int f37041a;
    public af[] f37042b;
    public ee f37043c;
    public ag f37044d;
    public byte[] f37045e;
    public C7424n f37046f;
    public ee f37047g;
    public bl f37048h;
    public boolean f37049i;

    public ae() {
        this.f37041a = 0;
        this.f37042b = af.m35079d();
        this.f37043c = null;
        this.f37044d = null;
        this.f37045e = C7222l.f35479l;
        this.f37046f = null;
        this.f37047g = null;
        this.f37048h = null;
        this.f37049i = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35077a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37042b != null && this.f37042b.length > 0) {
            for (i iVar : this.f37042b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37043c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37043c);
        }
        if (this.f37044d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37044d);
        }
        if ((this.f37041a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f37045e);
        }
        if (this.f37046f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37046f);
        }
        if (this.f37047g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37047g);
        }
        if (this.f37048h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37048h);
        }
        if ((this.f37041a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f37049i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35078b() {
        int b = super.b();
        if (this.f37042b != null && this.f37042b.length > 0) {
            for (i iVar : this.f37042b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f37043c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37043c);
        }
        if (this.f37044d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37044d);
        }
        if ((this.f37041a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f37045e);
        }
        if (this.f37046f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37046f);
        }
        if (this.f37047g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37047g);
        }
        if (this.f37048h != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37048h);
        }
        if ((this.f37041a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(9) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35076a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37042b == null ? 0 : this.f37042b.length;
                    Object obj = new af[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37042b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new af();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new af();
                    c7213a.m33552a(obj[a]);
                    this.f37042b = obj;
                    continue;
                case 18:
                    if (this.f37043c == null) {
                        this.f37043c = new ee();
                    }
                    c7213a.m33552a(this.f37043c);
                    continue;
                case 26:
                    if (this.f37044d == null) {
                        this.f37044d = new ag();
                    }
                    c7213a.m33552a(this.f37044d);
                    continue;
                case 34:
                    this.f37045e = c7213a.m33565g();
                    this.f37041a |= 1;
                    continue;
                case 42:
                    if (this.f37046f == null) {
                        this.f37046f = new C7424n();
                    }
                    c7213a.m33552a(this.f37046f);
                    continue;
                case 50:
                    if (this.f37047g == null) {
                        this.f37047g = new ee();
                    }
                    c7213a.m33552a(this.f37047g);
                    continue;
                case 66:
                    if (this.f37048h == null) {
                        this.f37048h = new bl();
                    }
                    c7213a.m33552a(this.f37048h);
                    continue;
                case 72:
                    this.f37049i = c7213a.m33563e();
                    this.f37041a |= 2;
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
