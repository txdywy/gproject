package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cs extends b {
    public int f36007a;
    public long f36008b;
    public int f36009c;
    public String f36010d;
    public cr[] f36011e;

    public cs() {
        this.f36007a = 0;
        this.f36008b = 0;
        this.f36009c = 0;
        this.f36010d = "";
        this.f36011e = cr.m34359d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34364a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36007a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36008b);
        }
        if ((this.f36007a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36009c);
        }
        if ((this.f36007a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36010d);
        }
        if (this.f36011e != null && this.f36011e.length > 0) {
            for (i iVar : this.f36011e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34365b() {
        int b = super.b();
        if ((this.f36007a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36008b);
        }
        if ((this.f36007a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36009c);
        }
        if ((this.f36007a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36010d);
        }
        if (this.f36011e == null || this.f36011e.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36011e) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(4, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m34363a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36008b = c7213a.m33568j();
                    this.f36007a |= 1;
                    continue;
                case 16:
                    this.f36009c = c7213a.m33567i();
                    this.f36007a |= 2;
                    continue;
                case 26:
                    this.f36010d = c7213a.m33564f();
                    this.f36007a |= 4;
                    continue;
                case 34:
                    int a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f36011e == null ? 0 : this.f36011e.length;
                    Object obj = new cr[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36011e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cr();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cr();
                    c7213a.m33552a(obj[a]);
                    this.f36011e = obj;
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
