package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7527d extends b {
    public int f38621a;
    public String f38622b;
    public String f38623c;
    public String f38624d;
    public boolean f38625e;
    public bd f38626f;
    public String f38627g;

    public C7527d() {
        this.f38621a = 0;
        this.f38622b = "";
        this.f38623c = "";
        this.f38624d = "";
        this.f38625e = true;
        this.f38626f = null;
        this.f38627g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36216a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38621a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38622b);
        }
        if ((this.f38621a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38623c);
        }
        if ((this.f38621a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38624d);
        }
        if ((this.f38621a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f38625e);
        }
        if (this.f38626f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f38626f);
        }
        if ((this.f38621a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38627g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36217b() {
        int b = super.b();
        if ((this.f38621a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38622b);
        }
        if ((this.f38621a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38623c);
        }
        if ((this.f38621a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38624d);
        }
        if ((this.f38621a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if (this.f38626f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f38626f);
        }
        if ((this.f38621a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f38627g);
        }
        return b;
    }

    public final /* synthetic */ i m36215a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38622b = c7213a.m33564f();
                    this.f38621a |= 1;
                    continue;
                case 18:
                    this.f38623c = c7213a.m33564f();
                    this.f38621a |= 2;
                    continue;
                case 26:
                    this.f38624d = c7213a.m33564f();
                    this.f38621a |= 4;
                    continue;
                case 32:
                    this.f38625e = c7213a.m33563e();
                    this.f38621a |= 8;
                    continue;
                case 42:
                    if (this.f38626f == null) {
                        this.f38626f = new bd();
                    }
                    c7213a.m33552a(this.f38626f);
                    continue;
                case 50:
                    this.f38627g = c7213a.m33564f();
                    this.f38621a |= 16;
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
