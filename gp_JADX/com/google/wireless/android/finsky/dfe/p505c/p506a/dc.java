package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dc extends b {
    public int f37406a;
    public de[] f37407b;
    public String[] f37408c;
    public String f37409d;
    public bl f37410e;

    public dc() {
        this.f37406a = 0;
        this.f37407b = de.m35353d();
        this.f37408c = C7222l.f35477j;
        this.f37409d = "";
        this.f37410e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35348a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37407b != null && this.f37407b.length > 0) {
            for (i iVar : this.f37407b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37408c != null && this.f37408c.length > 0) {
            while (i < this.f37408c.length) {
                String str = this.f37408c[i];
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
                i++;
            }
        }
        if ((this.f37406a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37409d);
        }
        if (this.f37410e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37410e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35349b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f37407b != null && this.f37407b.length > 0) {
            i = b;
            for (i iVar : this.f37407b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i;
        }
        if (this.f37408c != null && this.f37408c.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f37408c.length) {
                String str = this.f37408c[i2];
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if ((this.f37406a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37409d);
        }
        if (this.f37410e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37410e);
        }
        return b;
    }

    public final /* synthetic */ i m35347a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37407b == null ? 0 : this.f37407b.length;
                    obj = new de[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37407b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new de();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new de();
                    c7213a.m33552a(obj[a]);
                    this.f37407b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37408c == null ? 0 : this.f37408c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37408c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37408c = obj;
                    continue;
                case 26:
                    this.f37409d = c7213a.m33564f();
                    this.f37406a |= 1;
                    continue;
                case 34:
                    if (this.f37410e == null) {
                        this.f37410e = new bl();
                    }
                    c7213a.m33552a(this.f37410e);
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
