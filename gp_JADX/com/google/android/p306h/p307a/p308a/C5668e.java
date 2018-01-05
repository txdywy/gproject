package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C5668e extends C0758b {
    public static volatile C5668e[] f28744a;
    public String f28745b;
    public Integer f28746c;
    public String f28747d;

    public static C5668e[] m26866a() {
        if (f28744a == null) {
            synchronized (h.b) {
                if (f28744a == null) {
                    f28744a = new C5668e[0];
                }
            }
        }
        return f28744a;
    }

    public C5668e() {
        this.f28745b = null;
        this.f28746c = null;
        this.f28747d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28745b != null) {
            codedOutputByteBufferNano.a(1, this.f28745b);
        }
        if (this.f28746c != null) {
            codedOutputByteBufferNano.a(2, this.f28746c.intValue());
        }
        if (this.f28747d != null) {
            codedOutputByteBufferNano.a(3, this.f28747d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28745b != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28745b);
        }
        if (this.f28746c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28746c.intValue());
        }
        if (this.f28747d != null) {
            return b + CodedOutputByteBufferNano.b(3, this.f28747d);
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
                    this.f28745b = aVar.f();
                    continue;
                case 16:
                    this.f28746c = Integer.valueOf(aVar.i());
                    continue;
                case 26:
                    this.f28747d = aVar.f();
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
