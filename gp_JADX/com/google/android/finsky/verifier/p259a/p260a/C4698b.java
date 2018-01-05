package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C4698b extends C0758b {
    public int f24126a;
    public int f24127b;
    public int f24128c;
    public int f24129d;
    public int f24130e;
    public int f24131f;
    public int f24132g;
    public int f24133h;

    public C4698b() {
        this.f24126a = 0;
        this.f24127b = 0;
        this.f24128c = 0;
        this.f24129d = 0;
        this.f24130e = 0;
        this.f24131f = 0;
        this.f24132g = 0;
        this.f24133h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24126a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24127b);
        }
        if ((this.f24126a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24128c);
        }
        if ((this.f24126a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24129d);
        }
        if ((this.f24126a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24130e);
        }
        if ((this.f24126a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24131f);
        }
        if ((this.f24126a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f24132g);
        }
        if ((this.f24126a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f24133h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24126a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f24127b);
        }
        if ((this.f24126a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24128c);
        }
        if ((this.f24126a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f24129d);
        }
        if ((this.f24126a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f24130e);
        }
        if ((this.f24126a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f24131f);
        }
        if ((this.f24126a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f24132g);
        }
        if ((this.f24126a & 64) != 0) {
            return b + CodedOutputByteBufferNano.d(7, this.f24133h);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24127b = aVar.i();
                    this.f24126a |= 1;
                    continue;
                case 16:
                    this.f24128c = aVar.i();
                    this.f24126a |= 2;
                    continue;
                case 24:
                    this.f24129d = aVar.i();
                    this.f24126a |= 4;
                    continue;
                case 32:
                    this.f24130e = aVar.i();
                    this.f24126a |= 8;
                    continue;
                case 40:
                    this.f24131f = aVar.i();
                    this.f24126a |= 16;
                    continue;
                case 48:
                    this.f24132g = aVar.i();
                    this.f24126a |= 32;
                    continue;
                case 56:
                    this.f24133h = aVar.i();
                    this.f24126a |= 64;
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
