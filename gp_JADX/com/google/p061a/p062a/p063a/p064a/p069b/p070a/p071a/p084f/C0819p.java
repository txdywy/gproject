package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0819p extends C0758b {
    public static volatile C0819p[] f5197b;
    public int f5198a;
    public C0822s f5199c;
    public C0816m f5200d;

    public static C0819p[] m5186a() {
        if (f5197b == null) {
            synchronized (h.b) {
                if (f5197b == null) {
                    f5197b = new C0819p[0];
                }
            }
        }
        return f5197b;
    }

    public final C0822s m5190c() {
        if (this.f5198a == 0) {
            return this.f5199c;
        }
        return null;
    }

    public final C0816m m5191d() {
        if (this.f5198a == 1) {
            return this.f5200d;
        }
        return null;
    }

    public C0819p() {
        this.f5198a = -1;
        this.f5198a = -1;
        this.f5199c = null;
        this.f5198a = -1;
        this.f5200d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5198a == 0) {
            codedOutputByteBufferNano.b(1, this.f5199c);
        }
        if (this.f5198a == 1) {
            codedOutputByteBufferNano.b(2, this.f5200d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5198a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5199c);
        }
        if (this.f5198a == 1) {
            return b + CodedOutputByteBufferNano.d(2, this.f5200d);
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
                    if (this.f5199c == null) {
                        this.f5199c = new C0822s();
                    }
                    aVar.a(this.f5199c);
                    this.f5198a = 0;
                    continue;
                case 18:
                    if (this.f5200d == null) {
                        this.f5200d = new C0816m();
                    }
                    aVar.a(this.f5200d);
                    this.f5198a = 1;
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
