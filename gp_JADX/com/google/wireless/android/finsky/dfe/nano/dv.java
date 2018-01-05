package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.dm;
import com.google.android.finsky.cv.a.hr;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dv extends b {
    public static volatile dv[] f38694a;
    public int f38695b;
    public ax f38696c;
    public ax f38697d;
    public ax f38698e;
    public String f38699f;
    public String f38700g;
    public dw[] f38701h;
    public bl f38702i;
    public bl[] f38703j;
    public dm f38704k;
    public bd[] f38705l;
    public dv[] f38706m;
    public hr f38707n;

    private static dv[] m36286d() {
        if (f38694a == null) {
            synchronized (C7219h.f35465b) {
                if (f38694a == null) {
                    f38694a = new dv[0];
                }
            }
        }
        return f38694a;
    }

    public dv() {
        this.f38695b = 0;
        this.f38696c = null;
        this.f38697d = null;
        this.f38698e = null;
        this.f38699f = "";
        this.f38700g = "";
        this.f38701h = dw.m36290d();
        this.f38702i = null;
        this.f38703j = bl.aK_();
        this.f38704k = null;
        this.f38705l = bd.aH_();
        this.f38706m = m36286d();
        this.f38707n = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36288a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38696c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38696c);
        }
        if (this.f38697d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38697d);
        }
        if (this.f38698e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38698e);
        }
        if ((this.f38695b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38699f);
        }
        if ((this.f38695b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38700g);
        }
        if (this.f38702i != null) {
            codedOutputByteBufferNano.m33532b(7, this.f38702i);
        }
        if (this.f38704k != null) {
            codedOutputByteBufferNano.m33532b(9, this.f38704k);
        }
        if (this.f38705l != null && this.f38705l.length > 0) {
            for (i iVar : this.f38705l) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(10, iVar);
                }
            }
        }
        if (this.f38706m != null && this.f38706m.length > 0) {
            for (i iVar2 : this.f38706m) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(11, iVar2);
                }
            }
        }
        if (this.f38707n != null) {
            codedOutputByteBufferNano.m33532b(13, this.f38707n);
        }
        if (this.f38703j != null && this.f38703j.length > 0) {
            for (i iVar22 : this.f38703j) {
                if (iVar22 != null) {
                    codedOutputByteBufferNano.m33532b(14, iVar22);
                }
            }
        }
        if (this.f38701h != null && this.f38701h.length > 0) {
            while (i < this.f38701h.length) {
                i iVar3 = this.f38701h[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(15, iVar3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36289b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f38696c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38696c);
        }
        if (this.f38697d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38697d);
        }
        if (this.f38698e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38698e);
        }
        if ((this.f38695b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38699f);
        }
        if ((this.f38695b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38700g);
        }
        if (this.f38702i != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38702i);
        }
        if (this.f38704k != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f38704k);
        }
        if (this.f38705l != null && this.f38705l.length > 0) {
            i = b;
            for (i iVar : this.f38705l) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(10, iVar);
                }
            }
            b = i;
        }
        if (this.f38706m != null && this.f38706m.length > 0) {
            i = b;
            for (i iVar2 : this.f38706m) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(11, iVar2);
                }
            }
            b = i;
        }
        if (this.f38707n != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f38707n);
        }
        if (this.f38703j != null && this.f38703j.length > 0) {
            i = b;
            for (i iVar22 : this.f38703j) {
                if (iVar22 != null) {
                    i += CodedOutputByteBufferNano.m33503d(14, iVar22);
                }
            }
            b = i;
        }
        if (this.f38701h != null && this.f38701h.length > 0) {
            while (i2 < this.f38701h.length) {
                i iVar3 = this.f38701h[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(15, iVar3);
                }
                i2++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36287a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38696c == null) {
                        this.f38696c = new ax();
                    }
                    c7213a.m33552a(this.f38696c);
                    continue;
                case 18:
                    if (this.f38697d == null) {
                        this.f38697d = new ax();
                    }
                    c7213a.m33552a(this.f38697d);
                    continue;
                case 26:
                    if (this.f38698e == null) {
                        this.f38698e = new ax();
                    }
                    c7213a.m33552a(this.f38698e);
                    continue;
                case 34:
                    this.f38699f = c7213a.m33564f();
                    this.f38695b |= 1;
                    continue;
                case 42:
                    this.f38700g = c7213a.m33564f();
                    this.f38695b |= 2;
                    continue;
                case 58:
                    if (this.f38702i == null) {
                        this.f38702i = new bl();
                    }
                    c7213a.m33552a(this.f38702i);
                    continue;
                case 74:
                    if (this.f38704k == null) {
                        this.f38704k = new dm();
                    }
                    c7213a.m33552a(this.f38704k);
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f38705l == null ? 0 : this.f38705l.length;
                    obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38705l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bd();
                    c7213a.m33552a(obj[a]);
                    this.f38705l = obj;
                    continue;
                case 90:
                    a2 = C7222l.m33624a(c7213a, 90);
                    a = this.f38706m == null ? 0 : this.f38706m.length;
                    obj = new dv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38706m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dv();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dv();
                    c7213a.m33552a(obj[a]);
                    this.f38706m = obj;
                    continue;
                case 106:
                    if (this.f38707n == null) {
                        this.f38707n = new hr();
                    }
                    c7213a.m33552a(this.f38707n);
                    continue;
                case 114:
                    a2 = C7222l.m33624a(c7213a, 114);
                    a = this.f38703j == null ? 0 : this.f38703j.length;
                    obj = new bl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38703j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bl();
                    c7213a.m33552a(obj[a]);
                    this.f38703j = obj;
                    continue;
                case 122:
                    a2 = C7222l.m33624a(c7213a, 122);
                    a = this.f38701h == null ? 0 : this.f38701h.length;
                    obj = new dw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38701h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dw();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dw();
                    c7213a.m33552a(obj[a]);
                    this.f38701h = obj;
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
