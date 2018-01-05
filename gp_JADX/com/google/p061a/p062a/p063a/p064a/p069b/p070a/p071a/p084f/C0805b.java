package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0805b extends C0758b {
    public static volatile C0805b[] f5115a;
    public int f5116b;
    public String f5117c;

    public static C0805b[] m5124a() {
        if (f5115a == null) {
            synchronized (h.b) {
                if (f5115a == null) {
                    f5115a = new C0805b[0];
                }
            }
        }
        return f5115a;
    }

    public C0805b() {
        this.f5116b = 0;
        this.f5117c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5116b != 0) {
            codedOutputByteBufferNano.a(1, this.f5116b);
        }
        if (!(this.f5117c == null || this.f5117c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5117c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5116b != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5116b);
        }
        if (this.f5117c == null || this.f5117c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(2, this.f5117c);
    }

    private final C0805b m5125b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int o = aVar.o();
                    try {
                        this.f5116b = C0804a.m5118a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    this.f5117c = aVar.f();
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5125b(aVar);
    }
}
