package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5673j extends C0758b {
    public String f28762a;
    public String f28763b;
    public Boolean f28764c;

    public C5673j() {
        this.f28762a = null;
        this.f28763b = null;
        this.f28764c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28762a != null) {
            codedOutputByteBufferNano.a(1, this.f28762a);
        }
        if (this.f28763b != null) {
            codedOutputByteBufferNano.a(2, this.f28763b);
        }
        if (this.f28764c != null) {
            codedOutputByteBufferNano.a(3, this.f28764c.booleanValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28762a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28762a);
        }
        if (this.f28763b != null) {
            b += CodedOutputByteBufferNano.b(2, this.f28763b);
        }
        if (this.f28764c == null) {
            return b;
        }
        this.f28764c.booleanValue();
        return b + (CodedOutputByteBufferNano.d(3) + 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28762a = aVar.f();
                    continue;
                case 18:
                    this.f28763b = aVar.f();
                    continue;
                case 24:
                    this.f28764c = Boolean.valueOf(aVar.e());
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
