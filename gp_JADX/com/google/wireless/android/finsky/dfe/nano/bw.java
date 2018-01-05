package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bw extends b {
    public static volatile bw[] f38493b;
    public int f38494a;
    public int f38495c;
    public String f38496d;
    public int f38497e;
    public boolean f38498f;
    public int f38499g;
    public long f38500h;
    public String[] f38501i;
    public ca f38502j;

    public static bw[] m36120d() {
        if (f38493b == null) {
            synchronized (C7219h.f35465b) {
                if (f38493b == null) {
                    f38493b = new bw[0];
                }
            }
        }
        return f38493b;
    }

    public bw() {
        this.f38494a = -1;
        this.f38495c = 0;
        this.f38496d = "";
        this.f38497e = 0;
        this.f38498f = false;
        this.f38499g = 0;
        this.f38500h = 0;
        this.f38501i = C7222l.f35477j;
        this.f38494a = -1;
        this.f38502j = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36122a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38495c & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38496d);
        }
        if ((this.f38495c & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38497e);
        }
        if ((this.f38495c & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f38498f);
        }
        if ((this.f38495c & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38499g);
        }
        if (this.f38494a == 0) {
            codedOutputByteBufferNano.m33532b(7, this.f38502j);
        }
        if ((this.f38495c & 16) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f38500h);
        }
        if (this.f38501i != null && this.f38501i.length > 0) {
            for (String str : this.f38501i) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(9, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36123b() {
        int i = 0;
        int b = super.b();
        if ((this.f38495c & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38496d);
        }
        if ((this.f38495c & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38497e);
        }
        if ((this.f38495c & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f38495c & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f38499g);
        }
        if (this.f38494a == 0) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38502j);
        }
        if ((this.f38495c & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f38500h);
        }
        if (this.f38501i == null || this.f38501i.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f38501i.length) {
            String str = this.f38501i[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33495b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ i m36121a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38496d = c7213a.m33564f();
                    this.f38495c |= 1;
                    continue;
                case 16:
                    this.f38497e = c7213a.m33567i();
                    this.f38495c |= 2;
                    continue;
                case 24:
                    this.f38498f = c7213a.m33563e();
                    this.f38495c |= 4;
                    continue;
                case 32:
                    this.f38499g = c7213a.m33567i();
                    this.f38495c |= 8;
                    continue;
                case 58:
                    if (this.f38502j == null) {
                        this.f38502j = new ca();
                    }
                    c7213a.m33552a(this.f38502j);
                    this.f38494a = 0;
                    continue;
                case 64:
                    this.f38500h = c7213a.m33568j();
                    this.f38495c |= 16;
                    continue;
                case 74:
                    int a2 = C7222l.m33624a(c7213a, 74);
                    a = this.f38501i == null ? 0 : this.f38501i.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38501i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38501i = obj;
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
