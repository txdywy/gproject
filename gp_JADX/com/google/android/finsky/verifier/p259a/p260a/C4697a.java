package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4697a extends C0758b {
    public int f24088a;
    public byte[] f24089b;
    public String f24090c;
    public int f24091d;
    public String f24092e;
    public String f24093f;

    public C4697a() {
        this.f24088a = 0;
        this.f24089b = l.l;
        this.f24090c = "";
        this.f24091d = 0;
        this.f24092e = "";
        this.f24093f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24088a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24089b);
        }
        if ((this.f24088a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24090c);
        }
        if ((this.f24088a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24091d);
        }
        if ((this.f24088a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24092e);
        }
        if ((this.f24088a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24093f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24088a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24089b);
        }
        if ((this.f24088a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f24090c);
        }
        if ((this.f24088a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f24091d);
        }
        if ((this.f24088a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f24092e);
        }
        if ((this.f24088a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f24093f);
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
                    this.f24089b = aVar.g();
                    this.f24088a |= 1;
                    continue;
                case 18:
                    this.f24090c = aVar.f();
                    this.f24088a |= 2;
                    continue;
                case 24:
                    this.f24091d = aVar.i();
                    this.f24088a |= 4;
                    continue;
                case 34:
                    this.f24092e = aVar.f();
                    this.f24088a |= 8;
                    continue;
                case 42:
                    this.f24093f = aVar.f();
                    this.f24088a |= 16;
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
