package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7480e extends b {
    public int f38082a;
    public String f38083b;
    public String f38084c;
    public String f38085d;
    public String f38086e;

    public C7480e() {
        this.f38082a = 0;
        this.f38083b = "";
        this.f38084c = "";
        this.f38085d = "";
        this.f38086e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35790a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38082a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38084c);
        }
        if ((this.f38082a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38083b);
        }
        if ((this.f38082a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38085d);
        }
        if ((this.f38082a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38086e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35791b() {
        int b = super.b();
        if ((this.f38082a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38084c);
        }
        if ((this.f38082a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38083b);
        }
        if ((this.f38082a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38085d);
        }
        if ((this.f38082a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f38086e);
        }
        return b;
    }

    public final /* synthetic */ i m35789a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38084c = c7213a.m33564f();
                    this.f38082a |= 2;
                    continue;
                case 18:
                    this.f38083b = c7213a.m33564f();
                    this.f38082a |= 1;
                    continue;
                case 26:
                    this.f38085d = c7213a.m33564f();
                    this.f38082a |= 4;
                    continue;
                case 34:
                    this.f38086e = c7213a.m33564f();
                    this.f38082a |= 8;
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
