package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7504c extends b {
    public int f38186a;
    public String f38187b;
    public String f38188c;
    public bd f38189d;

    public C7504c() {
        this.f38186a = 0;
        this.f38187b = "";
        this.f38188c = "";
        this.f38189d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35880a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38186a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38187b);
        }
        if ((this.f38186a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38188c);
        }
        if (this.f38189d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38189d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35881b() {
        int b = super.b();
        if ((this.f38186a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38187b);
        }
        if ((this.f38186a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38188c);
        }
        if (this.f38189d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38189d);
        }
        return b;
    }

    public final /* synthetic */ i m35879a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38187b = c7213a.m33564f();
                    this.f38186a |= 1;
                    continue;
                case 18:
                    this.f38188c = c7213a.m33564f();
                    this.f38186a |= 2;
                    continue;
                case 26:
                    if (this.f38189d == null) {
                        this.f38189d = new bd();
                    }
                    c7213a.m33552a(this.f38189d);
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
