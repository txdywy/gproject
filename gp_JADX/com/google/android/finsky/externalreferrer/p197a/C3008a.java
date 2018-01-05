package com.google.android.finsky.externalreferrer.p197a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C3008a extends C0758b {
    public int f15759a;
    public String f15760b;
    public String f15761c;
    public String f15762d;
    public long f15763e;

    public C3008a() {
        this.f15759a = 0;
        this.f15760b = "";
        this.f15761c = "";
        this.f15762d = "";
        this.f15763e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f15759a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f15760b);
        }
        if ((this.f15759a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f15761c);
        }
        if ((this.f15759a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f15762d);
        }
        if ((this.f15759a & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f15763e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f15759a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f15760b);
        }
        if ((this.f15759a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f15761c);
        }
        if ((this.f15759a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f15762d);
        }
        if ((this.f15759a & 8) != 0) {
            return b + CodedOutputByteBufferNano.f(4, this.f15763e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f15760b = aVar.f();
                    this.f15759a |= 1;
                    continue;
                case 18:
                    this.f15761c = aVar.f();
                    this.f15759a |= 2;
                    continue;
                case 26:
                    this.f15762d = aVar.f();
                    this.f15759a |= 4;
                    continue;
                case 32:
                    this.f15763e = aVar.j();
                    this.f15759a |= 8;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
