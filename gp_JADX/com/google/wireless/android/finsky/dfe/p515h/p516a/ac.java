package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public static volatile ac[] f38005a;
    public int f38006b;
    public String f38007c;
    public bd f38008d;
    public String[] f38009e;
    public String f38010f;
    public String f38011g;
    public String f38012h;
    public C7476a f38013i;
    public long f38014j;
    public String f38015k;
    public String f38016l;
    public cv f38017m;

    public static ac[] m35725d() {
        if (f38005a == null) {
            synchronized (C7219h.f35465b) {
                if (f38005a == null) {
                    f38005a = new ac[0];
                }
            }
        }
        return f38005a;
    }

    public ac() {
        this.f38006b = 0;
        this.f38007c = "";
        this.f38008d = null;
        this.f38009e = C7222l.f35477j;
        this.f38010f = "";
        this.f38011g = "";
        this.f38012h = "";
        this.f38013i = null;
        this.f38014j = 0;
        this.f38015k = "";
        this.f38016l = "";
        this.f38017m = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35727a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38006b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38007c);
        }
        if (this.f38008d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38008d);
        }
        if (this.f38009e != null && this.f38009e.length > 0) {
            for (String str : this.f38009e) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
            }
        }
        if ((this.f38006b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38010f);
        }
        if ((this.f38006b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38011g);
        }
        if ((this.f38006b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38012h);
        }
        if (this.f38013i != null) {
            codedOutputByteBufferNano.m33532b(7, this.f38013i);
        }
        if ((this.f38006b & 16) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f38014j);
        }
        if ((this.f38006b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38015k);
        }
        if ((this.f38006b & 64) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38016l);
        }
        if (this.f38017m != null) {
            codedOutputByteBufferNano.m33532b(11, this.f38017m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35728b() {
        int i = 0;
        int b = super.b();
        if ((this.f38006b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38007c);
        }
        if (this.f38008d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38008d);
        }
        if (this.f38009e != null && this.f38009e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f38009e.length) {
                String str = this.f38009e[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f38006b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38010f);
        }
        if ((this.f38006b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38011g);
        }
        if ((this.f38006b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38012h);
        }
        if (this.f38013i != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38013i);
        }
        if ((this.f38006b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f38014j);
        }
        if ((this.f38006b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38015k);
        }
        if ((this.f38006b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f38016l);
        }
        if (this.f38017m != null) {
            return b + CodedOutputByteBufferNano.m33503d(11, this.f38017m);
        }
        return b;
    }

    public final /* synthetic */ i m35726a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38007c = c7213a.m33564f();
                    this.f38006b |= 1;
                    continue;
                case 18:
                    if (this.f38008d == null) {
                        this.f38008d = new bd();
                    }
                    c7213a.m33552a(this.f38008d);
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38009e == null ? 0 : this.f38009e.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38009e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38009e = obj;
                    continue;
                case 34:
                    this.f38010f = c7213a.m33564f();
                    this.f38006b |= 2;
                    continue;
                case 42:
                    this.f38011g = c7213a.m33564f();
                    this.f38006b |= 4;
                    continue;
                case 50:
                    this.f38012h = c7213a.m33564f();
                    this.f38006b |= 8;
                    continue;
                case 58:
                    if (this.f38013i == null) {
                        this.f38013i = new C7476a();
                    }
                    c7213a.m33552a(this.f38013i);
                    continue;
                case 64:
                    this.f38014j = c7213a.m33568j();
                    this.f38006b |= 16;
                    continue;
                case 74:
                    this.f38015k = c7213a.m33564f();
                    this.f38006b |= 32;
                    continue;
                case 82:
                    this.f38016l = c7213a.m33564f();
                    this.f38006b |= 64;
                    continue;
                case 90:
                    if (this.f38017m == null) {
                        this.f38017m = new cv();
                    }
                    c7213a.m33552a(this.f38017m);
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
