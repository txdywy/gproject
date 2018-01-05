package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fu extends b {
    public static volatile fu[] f39024a;
    public int f39025b;
    public String f39026c;
    public String f39027d;
    public long f39028e;
    public String f39029f;
    public boolean f39030g;
    public boolean f39031h;

    public static fu[] m36457d() {
        if (f39024a == null) {
            synchronized (C7219h.f35465b) {
                if (f39024a == null) {
                    f39024a = new fu[0];
                }
            }
        }
        return f39024a;
    }

    public fu() {
        this.f39025b = 0;
        this.f39026c = "";
        this.f39027d = "";
        this.f39028e = 0;
        this.f39029f = "";
        this.f39030g = false;
        this.f39031h = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36459a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39025b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39026c);
        }
        if ((this.f39025b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39027d);
        }
        if ((this.f39025b & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f39028e);
        }
        if ((this.f39025b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39029f);
        }
        if ((this.f39025b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f39030g);
        }
        if ((this.f39025b & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f39031h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36460b() {
        int b = super.b();
        if ((this.f39025b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39026c);
        }
        if ((this.f39025b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39027d);
        }
        if ((this.f39025b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f39028e);
        }
        if ((this.f39025b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39029f);
        }
        if ((this.f39025b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f39025b & 32) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(6) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36458a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39026c = c7213a.m33564f();
                    this.f39025b |= 1;
                    continue;
                case 18:
                    this.f39027d = c7213a.m33564f();
                    this.f39025b |= 2;
                    continue;
                case 24:
                    this.f39028e = c7213a.m33568j();
                    this.f39025b |= 4;
                    continue;
                case 34:
                    this.f39029f = c7213a.m33564f();
                    this.f39025b |= 8;
                    continue;
                case 40:
                    this.f39030g = c7213a.m33563e();
                    this.f39025b |= 16;
                    continue;
                case 48:
                    this.f39031h = c7213a.m33563e();
                    this.f39025b |= 32;
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
