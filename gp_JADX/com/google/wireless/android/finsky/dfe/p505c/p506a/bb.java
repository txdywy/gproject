package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bb extends b {
    public int f37162a;
    public int f37163b;
    public byte[] f37164c;

    public final boolean m35162d() {
        return (this.f37162a & 1) != 0;
    }

    public bb() {
        this.f37162a = 0;
        this.f37163b = 0;
        this.f37164c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35160a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37162a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37163b);
        }
        if ((this.f37162a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37164c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35161b() {
        int b = super.b();
        if ((this.f37162a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37163b);
        }
        if ((this.f37162a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f37164c);
        }
        return b;
    }

    public final /* synthetic */ i m35159a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37163b = c7213a.m33567i();
                    this.f37162a |= 1;
                    continue;
                case 18:
                    this.f37164c = c7213a.m33565g();
                    this.f37162a |= 2;
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
