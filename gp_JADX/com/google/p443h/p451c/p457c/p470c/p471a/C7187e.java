package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.a.a.a.a.b.a.a.c.a.e;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7187e extends b {
    public e f35055a;
    public byte[] f35056b;
    public com.google.a.a.a.a.b.a.a.i.a.b f35057c;

    public C7187e() {
        this.f35055a = null;
        this.f35056b = C7222l.f35479l;
        this.f35057c = null;
        this.aP = -1;
    }

    public final void m32557a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35055a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35055a);
        }
        if (!Arrays.equals(this.f35056b, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f35056b);
        }
        if (this.f35057c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35057c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32558b() {
        int b = super.b();
        if (this.f35055a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35055a);
        }
        if (!Arrays.equals(this.f35056b, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f35056b);
        }
        if (this.f35057c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f35057c);
        }
        return b;
    }

    public final /* synthetic */ i m32556a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35055a == null) {
                        this.f35055a = new e();
                    }
                    c7213a.m33552a(this.f35055a);
                    continue;
                case 18:
                    this.f35056b = c7213a.m33565g();
                    continue;
                case 26:
                    if (this.f35057c == null) {
                        this.f35057c = new com.google.a.a.a.a.b.a.a.i.a.b();
                    }
                    c7213a.m33552a(this.f35057c);
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
