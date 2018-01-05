package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C4705i extends C0758b {
    public static volatile C4705i[] f24202a;
    public int f24203b;
    public String f24204c;
    public C4704h f24205d;
    public int f24206e;

    public static C4705i[] cn_() {
        if (f24202a == null) {
            synchronized (h.b) {
                if (f24202a == null) {
                    f24202a = new C4705i[0];
                }
            }
        }
        return f24202a;
    }

    public C4705i() {
        this.f24203b = 0;
        this.f24204c = "";
        this.f24205d = null;
        this.f24206e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24203b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24204c);
        }
        if (this.f24205d != null) {
            codedOutputByteBufferNano.b(2, this.f24205d);
        }
        if ((this.f24203b & 2) != 0) {
            codedOutputByteBufferNano.c(3, this.f24206e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24203b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24204c);
        }
        if (this.f24205d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f24205d);
        }
        if ((this.f24203b & 2) != 0) {
            return b + CodedOutputByteBufferNano.e(3, this.f24206e);
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
                    this.f24204c = aVar.f();
                    this.f24203b |= 1;
                    continue;
                case 18:
                    if (this.f24205d == null) {
                        this.f24205d = new C4704h();
                    }
                    aVar.a(this.f24205d);
                    continue;
                case 24:
                    this.f24206e = aVar.i();
                    this.f24203b |= 2;
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
