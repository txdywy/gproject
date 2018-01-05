package com.google.wireless.android.finsky.dfe.p507d.p508a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7439c extends b {
    public int f37730a;
    public long f37731b;
    public C7440d[] f37732c;

    public C7439c() {
        this.f37730a = 0;
        this.f37731b = 0;
        this.f37732c = C7440d.m35544d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35542a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37730a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f37731b);
        }
        if (this.f37732c != null && this.f37732c.length > 0) {
            for (i iVar : this.f37732c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35543b() {
        int b = super.b();
        if ((this.f37730a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f37731b);
        }
        if (this.f37732c == null || this.f37732c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f37732c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35541a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37731b = c7213a.m33568j();
                    this.f37730a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37732c == null ? 0 : this.f37732c.length;
                    Object obj = new C7440d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37732c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7440d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7440d();
                    c7213a.m33552a(obj[a]);
                    this.f37732c = obj;
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
