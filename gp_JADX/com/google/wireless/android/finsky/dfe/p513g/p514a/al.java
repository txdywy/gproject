package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public int f37829a;
    public ak[] f37830b;
    public String f37831c;
    public String f37832d;
    public String f37833e;
    public int f37834f;

    public al() {
        this.f37829a = 0;
        this.f37830b = ak.m35615d();
        this.f37831c = "";
        this.f37832d = "";
        this.f37833e = "";
        this.f37834f = 1;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35620a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37830b != null && this.f37830b.length > 0) {
            for (i iVar : this.f37830b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if ((this.f37829a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37831c);
        }
        if ((this.f37829a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37832d);
        }
        if ((this.f37829a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37833e);
        }
        if ((this.f37829a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f37834f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35621b() {
        int b = super.b();
        if (this.f37830b != null && this.f37830b.length > 0) {
            for (i iVar : this.f37830b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
        }
        if ((this.f37829a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37831c);
        }
        if ((this.f37829a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37832d);
        }
        if ((this.f37829a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37833e);
        }
        if ((this.f37829a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(8, this.f37834f);
        }
        return b;
    }

    public final /* synthetic */ i m35619a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f37830b == null ? 0 : this.f37830b.length;
                    Object obj = new ak[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37830b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ak();
                    c7213a.m33552a(obj[a]);
                    this.f37830b = obj;
                    continue;
                case 34:
                    this.f37831c = c7213a.m33564f();
                    this.f37829a |= 1;
                    continue;
                case 42:
                    this.f37832d = c7213a.m33564f();
                    this.f37829a |= 2;
                    continue;
                case 50:
                    this.f37833e = c7213a.m33564f();
                    this.f37829a |= 4;
                    continue;
                case 64:
                    this.f37834f = c7213a.m33567i();
                    this.f37829a |= 8;
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
