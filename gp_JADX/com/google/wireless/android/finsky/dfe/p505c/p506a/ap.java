package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ap extends b {
    public int f37104a;
    public du[] f37105b;
    public long f37106c;
    public byte[] f37107d;
    public C7418h f37108e;
    public ae f37109f;

    public ap() {
        this.f37104a = 0;
        this.f37105b = du.m35405d();
        this.f37106c = 0;
        this.f37107d = C7222l.f35479l;
        this.f37108e = null;
        this.f37109f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35120a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37105b != null && this.f37105b.length > 0) {
            for (i iVar : this.f37105b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f37104a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f37106c);
        }
        if ((this.f37104a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37107d);
        }
        if (this.f37108e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37108e);
        }
        if (this.f37109f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37109f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35121b() {
        int b = super.b();
        if (this.f37105b != null && this.f37105b.length > 0) {
            for (i iVar : this.f37105b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f37104a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f37106c);
        }
        if ((this.f37104a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37107d);
        }
        if (this.f37108e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37108e);
        }
        if (this.f37109f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37109f);
        }
        return b;
    }

    public final /* synthetic */ i m35119a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37105b == null ? 0 : this.f37105b.length;
                    Object obj = new du[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37105b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new du();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new du();
                    c7213a.m33552a(obj[a]);
                    this.f37105b = obj;
                    continue;
                case 16:
                    this.f37106c = c7213a.m33568j();
                    this.f37104a |= 1;
                    continue;
                case 26:
                    this.f37107d = c7213a.m33565g();
                    this.f37104a |= 2;
                    continue;
                case 34:
                    if (this.f37108e == null) {
                        this.f37108e = new C7418h();
                    }
                    c7213a.m33552a(this.f37108e);
                    continue;
                case 42:
                    if (this.f37109f == null) {
                        this.f37109f = new ae();
                    }
                    c7213a.m33552a(this.f37109f);
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
