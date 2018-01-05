package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C4707k extends C0758b {
    public static volatile C4707k[] f24211a;
    public int f24212b;
    public String f24213c;
    public C4704h f24214d;

    public static C4707k[] co_() {
        if (f24211a == null) {
            synchronized (h.b) {
                if (f24211a == null) {
                    f24211a = new C4707k[0];
                }
            }
        }
        return f24211a;
    }

    public final C4707k m21911a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f24212b |= 1;
        this.f24213c = str;
        return this;
    }

    public C4707k() {
        this.f24212b = 0;
        this.f24213c = "";
        this.f24214d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24212b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24213c);
        }
        if (this.f24214d != null) {
            codedOutputByteBufferNano.b(2, this.f24214d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24212b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24213c);
        }
        if (this.f24214d != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f24214d);
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
                    this.f24213c = aVar.f();
                    this.f24212b |= 1;
                    continue;
                case 18:
                    if (this.f24214d == null) {
                        this.f24214d = new C4704h();
                    }
                    aVar.a(this.f24214d);
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
