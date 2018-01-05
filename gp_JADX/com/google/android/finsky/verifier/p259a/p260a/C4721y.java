package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4721y extends C0758b {
    public int f24284a;
    public String f24285b;
    public int f24286c;
    public byte[] f24287d;
    public boolean f24288e;
    public String f24289f;
    public boolean f24290g;

    public C4721y() {
        this.f24284a = 0;
        this.f24285b = "";
        this.f24286c = 0;
        this.f24287d = l.l;
        this.f24288e = false;
        this.f24289f = "";
        this.f24290g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24284a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24285b);
        }
        if ((this.f24284a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24286c);
        }
        if ((this.f24284a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24287d);
        }
        if ((this.f24284a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24288e);
        }
        if ((this.f24284a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24289f);
        }
        if ((this.f24284a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f24290g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24284a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24285b);
        }
        if ((this.f24284a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24286c);
        }
        if ((this.f24284a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24287d);
        }
        if ((this.f24284a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f24284a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f24289f);
        }
        if ((this.f24284a & 32) != 0) {
            return b + (CodedOutputByteBufferNano.d(6) + 1);
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
                    this.f24285b = aVar.f();
                    this.f24284a |= 1;
                    continue;
                case 16:
                    this.f24286c = aVar.i();
                    this.f24284a |= 2;
                    continue;
                case 26:
                    this.f24287d = aVar.g();
                    this.f24284a |= 4;
                    continue;
                case 32:
                    this.f24288e = aVar.e();
                    this.f24284a |= 8;
                    continue;
                case 42:
                    this.f24289f = aVar.f();
                    this.f24284a |= 16;
                    continue;
                case 48:
                    this.f24290g = aVar.e();
                    this.f24284a |= 32;
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
