package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5669f extends C0758b {
    public String f28748a;
    public String f28749b;
    public Integer f28750c;
    public String f28751d;

    public C5669f() {
        this.f28748a = null;
        this.f28749b = null;
        this.f28750c = null;
        this.f28751d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28748a != null) {
            codedOutputByteBufferNano.a(1, this.f28748a);
        }
        if (this.f28749b != null) {
            codedOutputByteBufferNano.a(2, this.f28749b);
        }
        if (this.f28750c != null) {
            codedOutputByteBufferNano.a(3, this.f28750c.intValue());
        }
        if (this.f28751d != null) {
            codedOutputByteBufferNano.a(4, this.f28751d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28748a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28748a);
        }
        if (this.f28749b != null) {
            b += CodedOutputByteBufferNano.b(2, this.f28749b);
        }
        if (this.f28750c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f28750c.intValue());
        }
        if (this.f28751d != null) {
            return b + CodedOutputByteBufferNano.b(4, this.f28751d);
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
                    this.f28748a = aVar.f();
                    continue;
                case 18:
                    this.f28749b = aVar.f();
                    continue;
                case 24:
                    this.f28750c = Integer.valueOf(aVar.i());
                    continue;
                case 34:
                    this.f28751d = aVar.f();
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
