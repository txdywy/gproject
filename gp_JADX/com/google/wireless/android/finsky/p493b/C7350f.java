package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.jt;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7350f extends b {
    public int f36750a;
    public int f36751b;
    public long f36752c;
    public String f36753d;

    public final C7350f m34848d() {
        this.f36751b = 2;
        this.f36750a |= 1;
        return this;
    }

    public final C7350f m34844a(long j) {
        this.f36750a |= 2;
        this.f36752c = j;
        return this;
    }

    public final C7350f m34845a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36750a |= 4;
        this.f36753d = str;
        return this;
    }

    public C7350f() {
        this.f36750a = 0;
        this.f36751b = 0;
        this.f36752c = 0;
        this.f36753d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34846a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36750a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36751b);
        }
        if ((this.f36750a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36752c);
        }
        if ((this.f36750a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36753d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34847b() {
        int b = super.b();
        if ((this.f36750a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36751b);
        }
        if ((this.f36750a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36752c);
        }
        if ((this.f36750a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f36753d);
        }
        return b;
    }

    private final C7350f m34842b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36750a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f36751b = jt.a(c7213a.m33567i());
                        this.f36750a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f36752c = c7213a.m33568j();
                    this.f36750a |= 2;
                    continue;
                case 26:
                    this.f36753d = c7213a.m33564f();
                    this.f36750a |= 4;
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

    public final /* synthetic */ i m34843a(C7213a c7213a) {
        return m34842b(c7213a);
    }
}
