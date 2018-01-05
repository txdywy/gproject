package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7326h extends b {
    public int f36497a;
    public String f36498b;
    public String f36499c;
    public String f36500d;
    public byte[] f36501e;
    public String f36502f;

    public C7326h() {
        this.f36497a = 0;
        this.f36498b = "";
        this.f36499c = "";
        this.f36500d = "";
        this.f36501e = C7222l.f35479l;
        this.f36502f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34734a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36497a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36498b);
        }
        if ((this.f36497a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36499c);
        }
        if ((this.f36497a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36500d);
        }
        if ((this.f36497a & 8) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f36501e);
        }
        if ((this.f36497a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36502f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34735b() {
        int b = super.b();
        if ((this.f36497a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36498b);
        }
        if ((this.f36497a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36499c);
        }
        if ((this.f36497a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36500d);
        }
        if ((this.f36497a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f36501e);
        }
        if ((this.f36497a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36502f);
        }
        return b;
    }

    public final /* synthetic */ i m34733a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36498b = c7213a.m33564f();
                    this.f36497a |= 1;
                    continue;
                case 18:
                    this.f36499c = c7213a.m33564f();
                    this.f36497a |= 2;
                    continue;
                case 26:
                    this.f36500d = c7213a.m33564f();
                    this.f36497a |= 4;
                    continue;
                case 34:
                    this.f36501e = c7213a.m33565g();
                    this.f36497a |= 8;
                    continue;
                case 42:
                    this.f36502f = c7213a.m33564f();
                    this.f36497a |= 16;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
