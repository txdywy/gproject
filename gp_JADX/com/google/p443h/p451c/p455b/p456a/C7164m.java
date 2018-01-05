package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7164m extends b {
    public String f34986a;
    public boolean f34987b;
    public int f34988c;
    public String f34989d;

    public C7164m() {
        this.f34986a = "";
        this.f34987b = false;
        this.f34988c = 0;
        this.f34989d = "";
        this.aP = -1;
    }

    public final void m32489a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34986a == null || this.f34986a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34986a);
        }
        if (this.f34987b) {
            codedOutputByteBufferNano.m33522a(2, this.f34987b);
        }
        if (this.f34988c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34988c);
        }
        if (!(this.f34989d == null || this.f34989d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f34989d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32490b() {
        int b = super.b();
        if (!(this.f34986a == null || this.f34986a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34986a);
        }
        if (this.f34987b) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f34988c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34988c);
        }
        if (this.f34989d == null || this.f34989d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(4, this.f34989d);
    }

    public final /* synthetic */ i m32488a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34986a = c7213a.m33564f();
                    continue;
                case 16:
                    this.f34987b = c7213a.m33563e();
                    continue;
                case 24:
                    this.f34988c = c7213a.m33567i();
                    continue;
                case 34:
                    this.f34989d = c7213a.m33564f();
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
