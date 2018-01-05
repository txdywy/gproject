package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7365u extends b {
    public static final C7214c f36815a = C7214c.m33574a(C7365u.class, 1178950882);
    public static final C7365u[] f36816b = new C7365u[0];
    public int f36817c;
    public String f36818d;
    public String f36819e;
    public C7368x f36820f;

    public C7365u() {
        this.f36817c = 0;
        this.f36818d = "";
        this.f36819e = "";
        this.f36820f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34899a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36817c & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36818d);
        }
        if ((this.f36817c & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36819e);
        }
        if (this.f36820f != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36820f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34900b() {
        int b = super.b();
        if ((this.f36817c & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36818d);
        }
        if ((this.f36817c & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36819e);
        }
        if (this.f36820f != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f36820f);
        }
        return b;
    }

    public final /* synthetic */ i m34898a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36818d = c7213a.m33564f();
                    this.f36817c |= 1;
                    continue;
                case 18:
                    this.f36819e = c7213a.m33564f();
                    this.f36817c |= 2;
                    continue;
                case 26:
                    if (this.f36820f == null) {
                        this.f36820f = new C7368x();
                    }
                    c7213a.m33552a(this.f36820f);
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
