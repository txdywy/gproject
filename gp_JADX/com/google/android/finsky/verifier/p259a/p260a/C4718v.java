package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C4718v extends C0758b {
    public static volatile C4718v[] f24266a;
    public int f24267b;
    public String f24268c;
    public int f24269d;
    public byte[] f24270e;
    public String f24271f;

    public static C4718v[] cs_() {
        if (f24266a == null) {
            synchronized (h.b) {
                if (f24266a == null) {
                    f24266a = new C4718v[0];
                }
            }
        }
        return f24266a;
    }

    public C4718v() {
        this.f24267b = 0;
        this.f24268c = "";
        this.f24269d = 0;
        this.f24270e = l.l;
        this.f24271f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24267b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24268c);
        }
        if ((this.f24267b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24269d);
        }
        if ((this.f24267b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24270e);
        }
        if ((this.f24267b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24271f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24267b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24268c);
        }
        if ((this.f24267b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24269d);
        }
        if ((this.f24267b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24270e);
        }
        if ((this.f24267b & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f24271f);
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
                    this.f24268c = aVar.f();
                    this.f24267b |= 1;
                    continue;
                case 16:
                    this.f24269d = aVar.i();
                    this.f24267b |= 2;
                    continue;
                case 26:
                    this.f24270e = aVar.g();
                    this.f24267b |= 4;
                    continue;
                case 34:
                    this.f24271f = aVar.f();
                    this.f24267b |= 8;
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
