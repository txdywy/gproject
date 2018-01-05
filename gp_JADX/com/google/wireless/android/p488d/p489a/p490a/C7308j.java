package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7308j extends b {
    public static volatile C7308j[] f36273a;
    public String f36274b;
    public String f36275c;
    public String f36276d;

    public static C7308j[] m34555d() {
        if (f36273a == null) {
            synchronized (C7219h.f35465b) {
                if (f36273a == null) {
                    f36273a = new C7308j[0];
                }
            }
        }
        return f36273a;
    }

    public C7308j() {
        this.f36274b = "";
        this.f36275c = "";
        this.f36276d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34557a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36274b == null || this.f36274b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36274b);
        }
        if (!(this.f36275c == null || this.f36275c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36275c);
        }
        if (!(this.f36276d == null || this.f36276d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36276d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34558b() {
        int b = super.b();
        if (!(this.f36274b == null || this.f36274b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36274b);
        }
        if (!(this.f36275c == null || this.f36275c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36275c);
        }
        if (this.f36276d == null || this.f36276d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36276d);
    }

    public final /* synthetic */ i m34556a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36274b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36275c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36276d = c7213a.m33564f();
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
