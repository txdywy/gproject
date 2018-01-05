package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C4703g extends C0758b {
    public static volatile C4703g[] f24189a;
    public int f24190b;
    public byte[] f24191c;
    public boolean f24192d;
    public byte[] f24193e;
    public byte[] f24194f;
    public byte[] f24195g;
    public long f24196h;
    public long f24197i;

    public static C4703g[] cm_() {
        if (f24189a == null) {
            synchronized (h.b) {
                if (f24189a == null) {
                    f24189a = new C4703g[0];
                }
            }
        }
        return f24189a;
    }

    public C4703g() {
        this.f24190b = 0;
        this.f24191c = l.l;
        this.f24192d = false;
        this.f24193e = l.l;
        this.f24194f = l.l;
        this.f24195g = l.l;
        this.f24196h = 0;
        this.f24197i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24190b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24191c);
        }
        if ((this.f24190b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24192d);
        }
        if ((this.f24190b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24193e);
        }
        if ((this.f24190b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24194f);
        }
        if ((this.f24190b & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24195g);
        }
        if ((this.f24190b & 32) != 0) {
            codedOutputByteBufferNano.b(6, this.f24196h);
        }
        if ((this.f24190b & 64) != 0) {
            codedOutputByteBufferNano.b(7, this.f24197i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24190b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24191c);
        }
        if ((this.f24190b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f24190b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24193e);
        }
        if ((this.f24190b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f24194f);
        }
        if ((this.f24190b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f24195g);
        }
        if ((this.f24190b & 32) != 0) {
            b += CodedOutputByteBufferNano.f(6, this.f24196h);
        }
        if ((this.f24190b & 64) != 0) {
            return b + CodedOutputByteBufferNano.f(7, this.f24197i);
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
                    this.f24191c = aVar.g();
                    this.f24190b |= 1;
                    continue;
                case 16:
                    this.f24192d = aVar.e();
                    this.f24190b |= 2;
                    continue;
                case 26:
                    this.f24193e = aVar.g();
                    this.f24190b |= 4;
                    continue;
                case 34:
                    this.f24194f = aVar.g();
                    this.f24190b |= 8;
                    continue;
                case 42:
                    this.f24195g = aVar.g();
                    this.f24190b |= 16;
                    continue;
                case 48:
                    this.f24196h = aVar.j();
                    this.f24190b |= 32;
                    continue;
                case 56:
                    this.f24197i = aVar.j();
                    this.f24190b |= 64;
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
