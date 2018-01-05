package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7346b extends b {
    public static volatile C7346b[] f36717a;
    public int f36718b;
    public String f36719c;
    public long f36720d;
    public String f36721e;
    public long f36722f;
    public String f36723g;
    public String f36724h;
    public C7350f f36725i;
    public C7348d f36726j;
    public C7356l[] f36727k;

    public static C7346b[] m34825d() {
        if (f36717a == null) {
            synchronized (C7219h.f35465b) {
                if (f36717a == null) {
                    f36717a = new C7346b[0];
                }
            }
        }
        return f36717a;
    }

    public C7346b() {
        this.f36718b = 0;
        this.f36719c = "";
        this.f36720d = 0;
        this.f36721e = "";
        this.f36722f = 0;
        this.f36723g = "";
        this.f36724h = "";
        this.f36725i = null;
        this.f36726j = null;
        this.f36727k = C7356l.m34867d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34827a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36718b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36719c);
        }
        if ((this.f36718b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36722f);
        }
        if ((this.f36718b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36723g);
        }
        if ((this.f36718b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36724h);
        }
        if (this.f36727k != null && this.f36727k.length > 0) {
            for (i iVar : this.f36727k) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if ((this.f36718b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f36720d);
        }
        if ((this.f36718b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36721e);
        }
        if (this.f36726j != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36726j);
        }
        if (this.f36725i != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36725i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34828b() {
        int b = super.b();
        if ((this.f36718b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36719c);
        }
        if ((this.f36718b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36722f);
        }
        if ((this.f36718b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36723g);
        }
        if ((this.f36718b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36724h);
        }
        if (this.f36727k != null && this.f36727k.length > 0) {
            int i = b;
            for (i iVar : this.f36727k) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if ((this.f36718b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f36720d);
        }
        if ((this.f36718b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36721e);
        }
        if (this.f36726j != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36726j);
        }
        if (this.f36725i != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f36725i);
        }
        return b;
    }

    public final /* synthetic */ i m34826a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36719c = c7213a.m33564f();
                    this.f36718b |= 1;
                    continue;
                case 16:
                    this.f36722f = c7213a.m33568j();
                    this.f36718b |= 8;
                    continue;
                case 26:
                    this.f36723g = c7213a.m33564f();
                    this.f36718b |= 16;
                    continue;
                case 34:
                    this.f36724h = c7213a.m33564f();
                    this.f36718b |= 32;
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36727k == null ? 0 : this.f36727k.length;
                    Object obj = new C7356l[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36727k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7356l();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7356l();
                    c7213a.m33552a(obj[a]);
                    this.f36727k = obj;
                    continue;
                case 48:
                    this.f36720d = c7213a.m33568j();
                    this.f36718b |= 2;
                    continue;
                case 66:
                    this.f36721e = c7213a.m33564f();
                    this.f36718b |= 4;
                    continue;
                case 74:
                    if (this.f36726j == null) {
                        this.f36726j = new C7348d();
                    }
                    c7213a.m33552a(this.f36726j);
                    continue;
                case 82:
                    if (this.f36725i == null) {
                        this.f36725i = new C7350f();
                    }
                    c7213a.m33552a(this.f36725i);
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
