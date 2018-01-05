package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7388b extends b {
    public int f36919a;
    public C7389c[] f36920b;
    public byte[] f36921c;

    public C7388b() {
        this.f36919a = 0;
        this.f36920b = C7389c.m34987d();
        this.f36921c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34985a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36920b != null && this.f36920b.length > 0) {
            for (i iVar : this.f36920b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f36919a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f36921c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34986b() {
        int b = super.b();
        if (this.f36920b != null && this.f36920b.length > 0) {
            for (i iVar : this.f36920b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f36919a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f36921c);
        }
        return b;
    }

    public final /* synthetic */ i m34984a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36920b == null ? 0 : this.f36920b.length;
                    Object obj = new C7389c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36920b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7389c();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7389c();
                    c7213a.m33552a(obj[a]);
                    this.f36920b = obj;
                    continue;
                case 18:
                    this.f36921c = c7213a.m33565g();
                    this.f36919a |= 1;
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
