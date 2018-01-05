package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7489n extends b {
    public int f38112a;
    public C7486k[] f38113b;
    public byte[] f38114c;

    public C7489n() {
        this.f38112a = 0;
        this.f38113b = C7486k.m35811d();
        this.f38114c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35826a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38113b != null && this.f38113b.length > 0) {
            for (i iVar : this.f38113b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38112a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38114c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35827b() {
        int b = super.b();
        if (this.f38113b != null && this.f38113b.length > 0) {
            for (i iVar : this.f38113b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38112a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f38114c);
        }
        return b;
    }

    public final /* synthetic */ i m35825a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38113b == null ? 0 : this.f38113b.length;
                    Object obj = new C7486k[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38113b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7486k();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7486k();
                    c7213a.m33552a(obj[a]);
                    this.f38113b = obj;
                    continue;
                case 18:
                    this.f38114c = c7213a.m33565g();
                    this.f38112a |= 1;
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
