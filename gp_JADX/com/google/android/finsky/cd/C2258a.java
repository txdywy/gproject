package com.google.android.finsky.cd;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2258a extends C0758b {
    public int f11201a;
    public String f11202b;
    public int f11203c;
    public C2262e f11204d;

    public C2258a() {
        this.f11201a = 0;
        this.f11202b = "";
        this.f11203c = 0;
        this.f11204d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11201a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11202b);
        }
        if ((this.f11201a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11203c);
        }
        if (this.f11204d != null) {
            codedOutputByteBufferNano.b(3, this.f11204d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11201a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11202b);
        }
        if ((this.f11201a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f11203c);
        }
        if (this.f11204d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f11204d);
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
                    this.f11202b = aVar.f();
                    this.f11201a |= 1;
                    continue;
                case 16:
                    this.f11203c = aVar.i();
                    this.f11201a |= 2;
                    continue;
                case 26:
                    if (this.f11204d == null) {
                        this.f11204d = new C2262e();
                    }
                    aVar.a(this.f11204d);
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
