package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.is;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aj extends b {
    public int f37071a;
    public int[] f37072b;
    public String f37073c;
    public String f37074d;
    public String f37075e;
    public is f37076f;
    public int f37077g;
    public String f37078h;
    public boolean f37079i;
    public boolean f37080j;
    public boolean f37081k;

    private static int m35093a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Id");
        }
    }

    public final boolean m35098d() {
        return (this.f37071a & 4) != 0;
    }

    public aj() {
        this.f37071a = 0;
        this.f37072b = C7222l.f35472e;
        this.f37073c = "";
        this.f37074d = "";
        this.f37075e = "";
        this.f37076f = null;
        this.f37077g = 0;
        this.f37078h = "";
        this.f37079i = false;
        this.f37080j = false;
        this.f37081k = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35096a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37072b != null && this.f37072b.length > 0) {
            for (int a : this.f37072b) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if ((this.f37071a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37073c);
        }
        if ((this.f37071a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37074d);
        }
        if ((this.f37071a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37075e);
        }
        if (this.f37076f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37076f);
        }
        if ((this.f37071a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37077g);
        }
        if ((this.f37071a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37078h);
        }
        if ((this.f37071a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f37079i);
        }
        if ((this.f37071a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f37080j);
        }
        if ((this.f37071a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f37081k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35097b() {
        int i = 0;
        int b = super.b();
        if (this.f37072b == null || this.f37072b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            while (i < this.f37072b.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f37072b[i]);
                i++;
            }
            i = (b + i2) + (this.f37072b.length * 1);
        }
        if ((this.f37071a & 1) != 0) {
            i += CodedOutputByteBufferNano.m33493b(2, this.f37073c);
        }
        if ((this.f37071a & 2) != 0) {
            i += CodedOutputByteBufferNano.m33493b(3, this.f37074d);
        }
        if ((this.f37071a & 4) != 0) {
            i += CodedOutputByteBufferNano.m33493b(4, this.f37075e);
        }
        if (this.f37076f != null) {
            i += CodedOutputByteBufferNano.m33503d(5, this.f37076f);
        }
        if ((this.f37071a & 8) != 0) {
            i += CodedOutputByteBufferNano.m33502d(6, this.f37077g);
        }
        if ((this.f37071a & 16) != 0) {
            i += CodedOutputByteBufferNano.m33493b(7, this.f37078h);
        }
        if ((this.f37071a & 32) != 0) {
            i += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f37071a & 64) != 0) {
            i += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f37071a & 128) != 0) {
            return i + (CodedOutputByteBufferNano.m33501d(10) + 1);
        }
        return i;
    }

    private final aj m35094b(C7213a c7213a) {
        int a;
        while (true) {
            int a2 = c7213a.m33550a();
            int i;
            int i2;
            switch (a2) {
                case 0:
                    break;
                case 8:
                    a = C7222l.m33624a(c7213a, 8);
                    Object obj = new int[a];
                    i = 0;
                    for (i2 = 0; i2 < a; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        int o = c7213a.m33573o();
                        try {
                            obj[i] = aj.m35093a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a2);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f37072b == null ? 0 : this.f37072b.length;
                        if (i2 != 0 || i != obj.length) {
                            Object obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f37072b, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f37072b = obj2;
                            break;
                        }
                        this.f37072b = obj;
                        break;
                    }
                    continue;
                    break;
                case 10:
                    a2 = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            aj.m35093a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f37072b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f37072b.length;
                        }
                        Object obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f37072b, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a = c7213a.m33573o();
                            try {
                                obj3[i2] = aj.m35093a(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a);
                                a(c7213a, 8);
                            }
                        }
                        this.f37072b = obj3;
                    }
                    c7213a.m33561d(a2);
                    continue;
                case 18:
                    this.f37073c = c7213a.m33564f();
                    this.f37071a |= 1;
                    continue;
                case 26:
                    this.f37074d = c7213a.m33564f();
                    this.f37071a |= 2;
                    continue;
                case 34:
                    this.f37075e = c7213a.m33564f();
                    this.f37071a |= 4;
                    continue;
                case 42:
                    if (this.f37076f == null) {
                        this.f37076f = new is();
                    }
                    c7213a.m33552a(this.f37076f);
                    continue;
                case 48:
                    this.f37077g = c7213a.m33567i();
                    this.f37071a |= 8;
                    continue;
                case 58:
                    this.f37078h = c7213a.m33564f();
                    this.f37071a |= 16;
                    continue;
                case 64:
                    this.f37079i = c7213a.m33563e();
                    this.f37071a |= 32;
                    continue;
                case 72:
                    this.f37080j = c7213a.m33563e();
                    this.f37071a |= 64;
                    continue;
                case 80:
                    this.f37081k = c7213a.m33563e();
                    this.f37071a |= 128;
                    continue;
                default:
                    if (!super.a(c7213a, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m35095a(C7213a c7213a) {
        return m35094b(c7213a);
    }
}
