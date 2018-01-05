package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class be extends b {
    public int f36461a;
    public String f36462b;
    public String f36463c;
    public String f36464d;
    public int f36465e;
    public String f36466f;
    public int f36467g;

    private static int m34703a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Action");
        }
    }

    public final boolean m34708d() {
        return (this.f36461a & 16) != 0;
    }

    public be() {
        this.f36461a = 0;
        this.f36462b = "";
        this.f36463c = "";
        this.f36464d = "";
        this.f36465e = 0;
        this.f36466f = "";
        this.f36467g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34706a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36461a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36462b);
        }
        if ((this.f36461a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36463c);
        }
        if ((this.f36461a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36464d);
        }
        if ((this.f36461a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36465e);
        }
        if ((this.f36461a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36466f);
        }
        if ((this.f36461a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f36467g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34707b() {
        int b = super.b();
        if ((this.f36461a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36462b);
        }
        if ((this.f36461a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36463c);
        }
        if ((this.f36461a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36464d);
        }
        if ((this.f36461a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36465e);
        }
        if ((this.f36461a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36466f);
        }
        if ((this.f36461a & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f36467g);
        }
        return b;
    }

    private final be m34704b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36462b = c7213a.m33564f();
                    this.f36461a |= 1;
                    continue;
                case 18:
                    this.f36463c = c7213a.m33564f();
                    this.f36461a |= 2;
                    continue;
                case 26:
                    this.f36464d = c7213a.m33564f();
                    this.f36461a |= 4;
                    continue;
                case 40:
                    this.f36461a |= 8;
                    o = c7213a.m33573o();
                    try {
                        this.f36465e = be.m34703a(c7213a.m33567i());
                        this.f36461a |= 8;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 50:
                    this.f36466f = c7213a.m33564f();
                    this.f36461a |= 16;
                    continue;
                case 56:
                    this.f36461a |= 32;
                    o = c7213a.m33573o();
                    try {
                        this.f36467g = be.m34703a(c7213a.m33567i());
                        this.f36461a |= 32;
                        continue;
                    } catch (IllegalArgumentException e2) {
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

    public final /* synthetic */ i m34705a(C7213a c7213a) {
        return m34704b(c7213a);
    }
}
