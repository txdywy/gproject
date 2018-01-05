package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dw extends b {
    public static volatile dw[] f38708a;
    public int f38709b;
    public String f38710c;
    public String f38711d;
    public String f38712e;

    public static dw[] m36290d() {
        if (f38708a == null) {
            synchronized (C7219h.f35465b) {
                if (f38708a == null) {
                    f38708a = new dw[0];
                }
            }
        }
        return f38708a;
    }

    public dw() {
        this.f38709b = 0;
        this.f38710c = "";
        this.f38711d = "";
        this.f38712e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36292a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38709b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38710c);
        }
        codedOutputByteBufferNano.m33521a(2, this.f38711d);
        codedOutputByteBufferNano.m33521a(3, this.f38712e);
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36293b() {
        int b = super.b();
        if ((this.f38709b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38710c);
        }
        return (b + CodedOutputByteBufferNano.m33493b(2, this.f38711d)) + CodedOutputByteBufferNano.m33493b(3, this.f38712e);
    }

    public final /* synthetic */ i m36291a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38710c = c7213a.m33564f();
                    this.f38709b |= 1;
                    continue;
                case 18:
                    this.f38711d = c7213a.m33564f();
                    continue;
                case 26:
                    this.f38712e = c7213a.m33564f();
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
