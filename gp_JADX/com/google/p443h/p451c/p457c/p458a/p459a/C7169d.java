package com.google.p443h.p451c.p457c.p458a.p459a;

import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.h;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7169d extends b {
    public h f34999a;
    public e f35000b;
    public C7167b[] f35001c;

    public C7169d() {
        this.f34999a = null;
        this.f35000b = null;
        this.f35001c = C7167b.m32494d();
        this.aP = -1;
    }

    public final void m32503a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34999a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34999a);
        }
        if (this.f35000b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35000b);
        }
        if (this.f35001c != null && this.f35001c.length > 0) {
            for (i iVar : this.f35001c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32504b() {
        int b = super.b();
        if (this.f34999a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34999a);
        }
        if (this.f35000b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35000b);
        }
        if (this.f35001c == null || this.f35001c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f35001c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(3, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m32502a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34999a == null) {
                        this.f34999a = new h();
                    }
                    c7213a.m33552a(this.f34999a);
                    continue;
                case 18:
                    if (this.f35000b == null) {
                        this.f35000b = new e();
                    }
                    c7213a.m33552a(this.f35000b);
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f35001c == null ? 0 : this.f35001c.length;
                    Object obj = new C7167b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35001c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7167b();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7167b();
                    c7213a.m33552a(obj[a]);
                    this.f35001c = obj;
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
