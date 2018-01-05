package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fh extends b {
    public static volatile fh[] f38914a;
    public int f38915b;
    public String f38916c;
    public String f38917d;
    public String f38918e;

    public static fh[] m36414d() {
        if (f38914a == null) {
            synchronized (C7219h.f35465b) {
                if (f38914a == null) {
                    f38914a = new fh[0];
                }
            }
        }
        return f38914a;
    }

    public final fh m36416a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f38915b |= 1;
        this.f38916c = str;
        return this;
    }

    public fh() {
        this.f38915b = 0;
        this.f38916c = "";
        this.f38917d = "";
        this.f38918e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36417a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38915b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38916c);
        }
        if ((this.f38915b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38917d);
        }
        if ((this.f38915b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38918e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36418b() {
        int b = super.b();
        if ((this.f38915b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38916c);
        }
        if ((this.f38915b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38917d);
        }
        if ((this.f38915b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38918e);
        }
        return b;
    }

    public final /* synthetic */ i m36415a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38916c = c7213a.m33564f();
                    this.f38915b |= 1;
                    continue;
                case 18:
                    this.f38917d = c7213a.m33564f();
                    this.f38915b |= 2;
                    continue;
                case 26:
                    this.f38918e = c7213a.m33564f();
                    this.f38915b |= 4;
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
