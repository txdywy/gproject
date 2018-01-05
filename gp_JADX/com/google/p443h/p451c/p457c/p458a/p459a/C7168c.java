package com.google.p443h.p451c.p457c.p458a.p459a;

import com.google.a.a.a.a.b.a.a.f.a;
import com.google.a.a.a.a.b.a.c.d;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7168c extends b {
    public d f34994a;
    public String f34995b;
    public String f34996c;
    public int f34997d;
    public int f34998e;

    public C7168c() {
        this.f34994a = null;
        this.f34995b = "";
        this.f34996c = "";
        this.f34997d = 3;
        this.f34998e = 0;
        this.aP = -1;
    }

    public final void m32500a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34994a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34994a);
        }
        if (!(this.f34995b == null || this.f34995b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34995b);
        }
        if (!(this.f34996c == null || this.f34996c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f34996c);
        }
        if (this.f34997d != 3) {
            codedOutputByteBufferNano.m33518a(4, this.f34997d);
        }
        if (this.f34998e != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f34998e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32501b() {
        int b = super.b();
        if (this.f34994a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34994a);
        }
        if (!(this.f34995b == null || this.f34995b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34995b);
        }
        if (!(this.f34996c == null || this.f34996c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f34996c);
        }
        if (this.f34997d != 3) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34997d);
        }
        if (this.f34998e != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f34998e);
        }
        return b;
    }

    private final C7168c m32498b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34994a == null) {
                        this.f34994a = new d();
                    }
                    c7213a.m33552a(this.f34994a);
                    continue;
                case 18:
                    this.f34995b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f34996c = c7213a.m33564f();
                    continue;
                case 32:
                    this.f34997d = c7213a.m33567i();
                    continue;
                case 40:
                    int o = c7213a.m33573o();
                    try {
                        this.f34998e = a.a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m32499a(C7213a c7213a) {
        return m32498b(c7213a);
    }
}
