package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0800b extends C0758b {
    public static volatile C0800b[] f5070a;
    public String f5071b;
    public C0799a f5072c;

    public static C0800b[] m5105a() {
        if (f5070a == null) {
            synchronized (h.b) {
                if (f5070a == null) {
                    f5070a = new C0800b[0];
                }
            }
        }
        return f5070a;
    }

    public C0800b() {
        this.f5071b = "";
        this.f5072c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5071b == null || this.f5071b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5071b);
        }
        if (this.f5072c != null) {
            codedOutputByteBufferNano.b(2, this.f5072c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5071b == null || this.f5071b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5071b);
        }
        if (this.f5072c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5072c);
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
                    this.f5071b = aVar.f();
                    continue;
                case 18:
                    if (this.f5072c == null) {
                        this.f5072c = new C0799a();
                    }
                    aVar.a(this.f5072c);
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
