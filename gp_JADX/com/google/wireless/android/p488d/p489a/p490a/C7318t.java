package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7318t extends b {
    public static volatile C7318t[] f36315a;
    public String f36316b;
    public int f36317c;
    public String f36318d;

    public static C7318t[] m34592d() {
        if (f36315a == null) {
            synchronized (C7219h.f35465b) {
                if (f36315a == null) {
                    f36315a = new C7318t[0];
                }
            }
        }
        return f36315a;
    }

    public C7318t() {
        this.f36316b = "";
        this.f36317c = 0;
        this.f36318d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34594a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36316b == null || this.f36316b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36316b);
        }
        if (this.f36317c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36317c);
        }
        if (!(this.f36318d == null || this.f36318d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36318d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34595b() {
        int b = super.b();
        if (!(this.f36316b == null || this.f36316b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36316b);
        }
        if (this.f36317c != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36317c);
        }
        if (this.f36318d == null || this.f36318d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36318d);
    }

    public final /* synthetic */ i m34593a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36316b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36317c = c7213a.m33567i();
                    continue;
                case 26:
                    this.f36318d = c7213a.m33564f();
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
