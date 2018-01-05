package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bs extends b {
    public int f37236a;
    public cu[] f37237b;
    public String f37238c;
    public int f37239d;
    public String f37240e;
    public boolean f37241f;

    public bs() {
        this.f37236a = 0;
        this.f37237b = cu.m35318d();
        this.f37238c = "";
        this.f37239d = 0;
        this.f37240e = "";
        this.f37241f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35215a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37237b != null && this.f37237b.length > 0) {
            for (i iVar : this.f37237b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f37236a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37238c);
        }
        if ((this.f37236a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37239d);
        }
        if ((this.f37236a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37240e);
        }
        if ((this.f37236a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37241f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35216b() {
        int b = super.b();
        if (this.f37237b != null && this.f37237b.length > 0) {
            for (i iVar : this.f37237b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f37236a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37238c);
        }
        if ((this.f37236a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37239d);
        }
        if ((this.f37236a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37240e);
        }
        if ((this.f37236a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35214a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37237b == null ? 0 : this.f37237b.length;
                    Object obj = new cu[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37237b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cu();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cu();
                    c7213a.m33552a(obj[a]);
                    this.f37237b = obj;
                    continue;
                case 18:
                    this.f37238c = c7213a.m33564f();
                    this.f37236a |= 1;
                    continue;
                case 24:
                    this.f37239d = c7213a.m33567i();
                    this.f37236a |= 2;
                    continue;
                case 34:
                    this.f37240e = c7213a.m33564f();
                    this.f37236a |= 4;
                    continue;
                case 40:
                    this.f37241f = c7213a.m33563e();
                    this.f37236a |= 8;
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
