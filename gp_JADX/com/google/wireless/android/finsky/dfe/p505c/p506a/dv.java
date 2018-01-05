package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dv extends b {
    public int f37502a;
    public byte[] f37503b;
    public dw[] f37504c;

    public dv() {
        this.f37502a = 0;
        this.f37503b = C7222l.f35479l;
        this.f37504c = dw.m35412d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35410a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37502a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f37503b);
        }
        if (this.f37504c != null && this.f37504c.length > 0) {
            for (i iVar : this.f37504c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35411b() {
        int b = super.b();
        if ((this.f37502a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f37503b);
        }
        if (this.f37504c == null || this.f37504c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f37504c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35409a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37503b = c7213a.m33565g();
                    this.f37502a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37504c == null ? 0 : this.f37504c.length;
                    Object obj = new dw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37504c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dw();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dw();
                    c7213a.m33552a(obj[a]);
                    this.f37504c = obj;
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
