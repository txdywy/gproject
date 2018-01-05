package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gl extends b {
    public int f39100a;
    public String f39101b;
    public String f39102c;
    public String f39103d;

    public gl() {
        this.f39100a = 0;
        this.f39101b = "";
        this.f39102c = "";
        this.f39103d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36511a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39100a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39101b);
        }
        if ((this.f39100a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39102c);
        }
        if ((this.f39100a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39103d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36512b() {
        int b = super.b();
        if ((this.f39100a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39101b);
        }
        if ((this.f39100a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39102c);
        }
        if ((this.f39100a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f39103d);
        }
        return b;
    }

    public final /* synthetic */ i m36510a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39101b = c7213a.m33564f();
                    this.f39100a |= 1;
                    continue;
                case 18:
                    this.f39102c = c7213a.m33564f();
                    this.f39100a |= 2;
                    continue;
                case 26:
                    this.f39103d = c7213a.m33564f();
                    this.f39100a |= 4;
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
