package com.google.wireless.android.p360b.p361a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7297d extends b {
    public int f36188a;
    public long f36189b;
    public String f36190c;
    public String f36191d;
    public String f36192e;

    public C7297d() {
        this.f36188a = 0;
        this.f36189b = 0;
        this.f36190c = "";
        this.f36191d = "";
        this.f36192e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34512a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36188a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36189b);
        }
        if ((this.f36188a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36190c);
        }
        if ((this.f36188a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36191d);
        }
        if ((this.f36188a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36192e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34513b() {
        int b = super.b();
        if ((this.f36188a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36189b);
        }
        if ((this.f36188a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36190c);
        }
        if ((this.f36188a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36191d);
        }
        if ((this.f36188a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f36192e);
        }
        return b;
    }

    public final /* synthetic */ i m34511a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36189b = c7213a.m33568j();
                    this.f36188a |= 1;
                    continue;
                case 18:
                    this.f36190c = c7213a.m33564f();
                    this.f36188a |= 2;
                    continue;
                case 26:
                    this.f36191d = c7213a.m33564f();
                    this.f36188a |= 4;
                    continue;
                case 34:
                    this.f36192e = c7213a.m33564f();
                    this.f36188a |= 8;
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
