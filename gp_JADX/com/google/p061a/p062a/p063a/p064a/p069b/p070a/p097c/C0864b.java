package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0864b extends C0758b {
    public static volatile C0864b[] f5508a;
    public String f5509b;
    public int f5510c;
    public int f5511d;

    public static C0864b[] m5446a() {
        if (f5508a == null) {
            synchronized (h.b) {
                if (f5508a == null) {
                    f5508a = new C0864b[0];
                }
            }
        }
        return f5508a;
    }

    public C0864b() {
        this.f5509b = "";
        this.f5510c = 0;
        this.f5511d = -1;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5509b == null || this.f5509b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5509b);
        }
        if (this.f5510c != 0) {
            codedOutputByteBufferNano.a(2, this.f5510c);
        }
        if (this.f5511d != -1) {
            codedOutputByteBufferNano.a(3, this.f5511d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5509b == null || this.f5509b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5509b);
        }
        if (this.f5510c != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5510c);
        }
        if (this.f5511d != -1) {
            return b + CodedOutputByteBufferNano.d(3, this.f5511d);
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
                    this.f5509b = aVar.f();
                    continue;
                case 16:
                    this.f5510c = aVar.i();
                    continue;
                case 24:
                    this.f5511d = aVar.i();
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
