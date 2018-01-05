package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ay;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bi extends b {
    public static volatile bi[] f38437a;
    public int f38438b;
    public int[] f38439c;
    public int f38440d;
    public bh[] f38441e;
    public String f38442f;
    public bd f38443g;
    public String f38444h;
    public String f38445i;
    public String f38446j;
    public boolean f38447k;
    public String f38448l;
    public int f38449m;

    public static bi[] m36079d() {
        if (f38437a == null) {
            synchronized (C7219h.f35465b) {
                if (f38437a == null) {
                    f38437a = new bi[0];
                }
            }
        }
        return f38437a;
    }

    public final boolean m36083e() {
        return (this.f38438b & 1) != 0;
    }

    public bi() {
        this.f38438b = 0;
        this.f38439c = C7222l.f35472e;
        this.f38440d = 0;
        this.f38441e = bh.m36073d();
        this.f38442f = "";
        this.f38443g = null;
        this.f38444h = "";
        this.f38445i = "";
        this.f38446j = "";
        this.f38447k = false;
        this.f38448l = "";
        this.f38449m = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36081a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38439c != null && this.f38439c.length > 0) {
            for (int a : this.f38439c) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if ((this.f38438b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38440d);
        }
        if (this.f38441e != null && this.f38441e.length > 0) {
            while (i < this.f38441e.length) {
                i iVar = this.f38441e[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
                i++;
            }
        }
        if ((this.f38438b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38442f);
        }
        if (this.f38443g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f38443g);
        }
        if ((this.f38438b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38444h);
        }
        if ((this.f38438b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38445i);
        }
        if ((this.f38438b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38446j);
        }
        if ((this.f38438b & 32) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f38447k);
        }
        if ((this.f38438b & 64) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38448l);
        }
        if ((this.f38438b & 128) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f38449m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36082b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f38439c == null || this.f38439c.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            for (int c : this.f38439c) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            i = (b + i3) + (this.f38439c.length * 1);
        }
        if ((this.f38438b & 1) != 0) {
            i += CodedOutputByteBufferNano.m33502d(2, this.f38440d);
        }
        if (this.f38441e != null && this.f38441e.length > 0) {
            while (i2 < this.f38441e.length) {
                i iVar = this.f38441e[i2];
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
                i2++;
            }
        }
        if ((this.f38438b & 2) != 0) {
            i += CodedOutputByteBufferNano.m33493b(4, this.f38442f);
        }
        if (this.f38443g != null) {
            i += CodedOutputByteBufferNano.m33503d(5, this.f38443g);
        }
        if ((this.f38438b & 4) != 0) {
            i += CodedOutputByteBufferNano.m33493b(6, this.f38444h);
        }
        if ((this.f38438b & 8) != 0) {
            i += CodedOutputByteBufferNano.m33493b(7, this.f38445i);
        }
        if ((this.f38438b & 16) != 0) {
            i += CodedOutputByteBufferNano.m33493b(8, this.f38446j);
        }
        if ((this.f38438b & 32) != 0) {
            i += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f38438b & 64) != 0) {
            i += CodedOutputByteBufferNano.m33493b(10, this.f38448l);
        }
        if ((this.f38438b & 128) != 0) {
            return i + CodedOutputByteBufferNano.m33502d(11, this.f38449m);
        }
        return i;
    }

    private final bi m36078b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            int i;
            int i2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    Object obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        int o = c7213a.m33573o();
                        try {
                            obj[i] = ay.a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f38439c == null ? 0 : this.f38439c.length;
                        if (i2 != 0 || i != obj.length) {
                            Object obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f38439c, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f38439c = obj2;
                            break;
                        }
                        this.f38439c = obj;
                        break;
                    }
                    continue;
                    break;
                case 10:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            ay.a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f38439c == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f38439c.length;
                        }
                        Object obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f38439c, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = ay.a(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a2);
                                a(c7213a, 8);
                            }
                        }
                        this.f38439c = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 16:
                    this.f38440d = c7213a.m33567i();
                    this.f38438b |= 1;
                    continue;
                case 26:
                    i2 = C7222l.m33624a(c7213a, 26);
                    i = this.f38441e == null ? 0 : this.f38441e.length;
                    Object obj4 = new bh[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(this.f38441e, 0, obj4, 0, i);
                    }
                    while (i < obj4.length - 1) {
                        obj4[i] = new bh();
                        c7213a.m33552a(obj4[i]);
                        c7213a.m33550a();
                        i++;
                    }
                    obj4[i] = new bh();
                    c7213a.m33552a(obj4[i]);
                    this.f38441e = obj4;
                    continue;
                case 34:
                    this.f38442f = c7213a.m33564f();
                    this.f38438b |= 2;
                    continue;
                case 42:
                    if (this.f38443g == null) {
                        this.f38443g = new bd();
                    }
                    c7213a.m33552a(this.f38443g);
                    continue;
                case 50:
                    this.f38444h = c7213a.m33564f();
                    this.f38438b |= 4;
                    continue;
                case 58:
                    this.f38445i = c7213a.m33564f();
                    this.f38438b |= 8;
                    continue;
                case 66:
                    this.f38446j = c7213a.m33564f();
                    this.f38438b |= 16;
                    continue;
                case 72:
                    this.f38447k = c7213a.m33563e();
                    this.f38438b |= 32;
                    continue;
                case 82:
                    this.f38448l = c7213a.m33564f();
                    this.f38438b |= 64;
                    continue;
                case 88:
                    this.f38449m = c7213a.m33567i();
                    this.f38438b |= 128;
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

    public final /* synthetic */ i m36080a(C7213a c7213a) {
        return m36078b(c7213a);
    }
}
