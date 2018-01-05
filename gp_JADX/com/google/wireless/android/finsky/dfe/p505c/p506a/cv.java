package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cv extends b {
    public int f37362a;
    public cu[] f37363b;
    public String f37364c;
    public int f37365d;
    public String f37366e;

    public cv() {
        this.f37362a = 0;
        this.f37363b = cu.m35318d();
        this.f37364c = "";
        this.f37365d = 0;
        this.f37366e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35323a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37363b != null && this.f37363b.length > 0) {
            for (i iVar : this.f37363b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f37362a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37364c);
        }
        if ((this.f37362a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37365d);
        }
        if ((this.f37362a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37366e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35324b() {
        int b = super.b();
        if (this.f37363b != null && this.f37363b.length > 0) {
            for (i iVar : this.f37363b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f37362a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37364c);
        }
        if ((this.f37362a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37365d);
        }
        if ((this.f37362a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37366e);
        }
        return b;
    }

    public final /* synthetic */ i m35322a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37363b == null ? 0 : this.f37363b.length;
                    Object obj = new cu[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37363b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cu();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cu();
                    c7213a.m33552a(obj[a]);
                    this.f37363b = obj;
                    continue;
                case 18:
                    this.f37364c = c7213a.m33564f();
                    this.f37362a |= 1;
                    continue;
                case 24:
                    this.f37365d = c7213a.m33567i();
                    this.f37362a |= 2;
                    continue;
                case 34:
                    this.f37366e = c7213a.m33564f();
                    this.f37362a |= 4;
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
