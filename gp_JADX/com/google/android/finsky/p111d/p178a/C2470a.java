package com.google.android.finsky.p111d.p178a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C2470a extends C0758b {
    public static volatile C2470a[] f13305a;
    public int f13306b;
    public long f13307c;
    public String f13308d;
    public String f13309e;
    public boolean f13310f;

    public static C2470a[] R_() {
        if (f13305a == null) {
            synchronized (h.b) {
                if (f13305a == null) {
                    f13305a = new C2470a[0];
                }
            }
        }
        return f13305a;
    }

    public final C2470a m13172a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f13306b |= 2;
        this.f13308d = str;
        return this;
    }

    public final C2470a m13177b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f13306b |= 4;
        this.f13309e = str;
        return this;
    }

    public final C2470a m13173a(boolean z) {
        this.f13306b |= 8;
        this.f13310f = z;
        return this;
    }

    public C2470a() {
        this.f13306b = 0;
        this.f13307c = -1;
        this.f13308d = "";
        this.f13309e = "";
        this.f13310f = true;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13306b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f13307c);
        }
        if ((this.f13306b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13308d);
        }
        if ((this.f13306b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13309e);
        }
        if ((this.f13306b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f13310f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13306b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f13307c);
        }
        if ((this.f13306b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13308d);
        }
        if ((this.f13306b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f13309e);
        }
        if ((this.f13306b & 8) != 0) {
            return b + (CodedOutputByteBufferNano.d(4) + 1);
        }
        return b;
    }

    public static C2470a m13171a(byte[] bArr) {
        return (C2470a) C0757i.m4905a(new C2470a(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f13307c = aVar.j();
                    this.f13306b |= 1;
                    continue;
                case 18:
                    this.f13308d = aVar.f();
                    this.f13306b |= 2;
                    continue;
                case 26:
                    this.f13309e = aVar.f();
                    this.f13306b |= 4;
                    continue;
                case 32:
                    this.f13310f = aVar.e();
                    this.f13306b |= 8;
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
