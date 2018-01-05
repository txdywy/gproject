package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0825a extends C0758b {
    public static volatile C0825a[] f5221b;
    public int f5222a;
    public String f5223c;
    public String f5224d;
    public String f5225e;

    public static C0825a[] m5209a() {
        if (f5221b == null) {
            synchronized (h.b) {
                if (f5221b == null) {
                    f5221b = new C0825a[0];
                }
            }
        }
        return f5221b;
    }

    public final String m5213c() {
        if (this.f5222a == 1) {
            return this.f5225e;
        }
        return "";
    }

    public C0825a() {
        this.f5222a = -1;
        this.f5223c = "";
        this.f5222a = -1;
        this.f5222a = -1;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5223c == null || this.f5223c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5223c);
        }
        if (this.f5222a == 0) {
            codedOutputByteBufferNano.a(2, this.f5224d);
        }
        if (this.f5222a == 1) {
            codedOutputByteBufferNano.a(3, this.f5225e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5223c == null || this.f5223c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5223c);
        }
        if (this.f5222a == 0) {
            b += CodedOutputByteBufferNano.b(2, this.f5224d);
        }
        if (this.f5222a == 1) {
            return b + CodedOutputByteBufferNano.b(3, this.f5225e);
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
                    this.f5223c = aVar.f();
                    continue;
                case 18:
                    this.f5224d = aVar.f();
                    this.f5222a = 0;
                    continue;
                case 26:
                    this.f5225e = aVar.f();
                    this.f5222a = 1;
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
