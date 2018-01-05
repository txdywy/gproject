package com.google.wireless.android.finsky.dfe.p505c.p506a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class dm extends b {
    public int f37453a;
    public String f37454b;
    public float f37455c;
    public float f37456d;
    public float f37457e;
    public float f37458f;
    public float f37459g;
    public float f37460h;
    public float f37461i;
    public float f37462j;
    public float f37463k;
    public float f37464l;
    public int f37465m;
    public String[] f37466n;
    public String f37467o;
    public boolean f37468p;
    public float f37469q;
    public float f37470r;
    public boolean f37471s;
    public float f37472t;
    public bl f37473u;
    public boolean f37474v;
    public int[] f37475w;
    public int f37476x;
    public int f37477y;

    public final boolean m35383d() {
        return (this.f37453a & 1) != 0;
    }

    public dm() {
        this.f37453a = 0;
        this.f37454b = "";
        this.f37455c = 0.0f;
        this.f37456d = 0.0f;
        this.f37457e = 0.0f;
        this.f37458f = 0.0f;
        this.f37459g = 0.0f;
        this.f37460h = 0.0f;
        this.f37461i = 0.0f;
        this.f37462j = 0.0f;
        this.f37463k = 0.0f;
        this.f37464l = 0.0f;
        this.f37465m = 0;
        this.f37466n = C7222l.f35477j;
        this.f37467o = "";
        this.f37468p = false;
        this.f37469q = 0.0f;
        this.f37470r = 0.0f;
        this.f37471s = false;
        this.f37472t = 0.0f;
        this.f37473u = null;
        this.f37474v = true;
        this.f37475w = C7222l.f35472e;
        this.f37476x = 0;
        this.f37477y = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35381a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f37453a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37454b);
        }
        if ((this.f37453a & 2) != 0) {
            codedOutputByteBufferNano.m33517a(2, this.f37455c);
        }
        if ((this.f37453a & 4) != 0) {
            codedOutputByteBufferNano.m33517a(3, this.f37456d);
        }
        if ((this.f37453a & 8) != 0) {
            codedOutputByteBufferNano.m33517a(4, this.f37457e);
        }
        if ((this.f37453a & 16) != 0) {
            codedOutputByteBufferNano.m33517a(5, this.f37458f);
        }
        if ((this.f37453a & 32) != 0) {
            codedOutputByteBufferNano.m33517a(6, this.f37459g);
        }
        if ((this.f37453a & 64) != 0) {
            codedOutputByteBufferNano.m33517a(7, this.f37460h);
        }
        if ((this.f37453a & 128) != 0) {
            codedOutputByteBufferNano.m33517a(8, this.f37461i);
        }
        if ((this.f37453a & 256) != 0) {
            codedOutputByteBufferNano.m33517a(9, this.f37462j);
        }
        if ((this.f37453a & 512) != 0) {
            codedOutputByteBufferNano.m33517a(10, this.f37463k);
        }
        if ((this.f37453a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33517a(11, this.f37464l);
        }
        if ((this.f37453a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f37465m);
        }
        if (this.f37466n != null && this.f37466n.length > 0) {
            for (String str : this.f37466n) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(13, str);
                }
            }
        }
        if ((this.f37453a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f37467o);
        }
        if ((this.f37453a & 16384) != 0) {
            codedOutputByteBufferNano.m33517a(15, this.f37469q);
        }
        if ((this.f37453a & 32768) != 0) {
            codedOutputByteBufferNano.m33517a(16, this.f37470r);
        }
        if ((this.f37453a & 8192) != 0) {
            codedOutputByteBufferNano.m33522a(17, this.f37468p);
        }
        if ((this.f37453a & 65536) != 0) {
            codedOutputByteBufferNano.m33522a(18, this.f37471s);
        }
        if ((this.f37453a & 131072) != 0) {
            codedOutputByteBufferNano.m33517a(19, this.f37472t);
        }
        if (this.f37473u != null) {
            codedOutputByteBufferNano.m33532b(20, this.f37473u);
        }
        if ((this.f37453a & 262144) != 0) {
            codedOutputByteBufferNano.m33522a(21, this.f37474v);
        }
        if (this.f37475w != null && this.f37475w.length > 0) {
            while (i < this.f37475w.length) {
                codedOutputByteBufferNano.m33518a(22, this.f37475w[i]);
                i++;
            }
        }
        if ((this.f37453a & 524288) != 0) {
            codedOutputByteBufferNano.m33518a(23, this.f37476x);
        }
        if ((this.f37453a & 1048576) != 0) {
            codedOutputByteBufferNano.m33518a(24, this.f37477y);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35382b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f37453a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37454b);
        }
        if ((this.f37453a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 4;
        }
        if ((this.f37453a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 4;
        }
        if ((this.f37453a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 4;
        }
        if ((this.f37453a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 4;
        }
        if ((this.f37453a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 4;
        }
        if ((this.f37453a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 4;
        }
        if ((this.f37453a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 4;
        }
        if ((this.f37453a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 4;
        }
        if ((this.f37453a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 4;
        }
        if ((this.f37453a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 4;
        }
        if ((this.f37453a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f37465m);
        }
        if (this.f37466n != null && this.f37466n.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f37466n) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if ((this.f37453a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f37467o);
        }
        if ((this.f37453a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 4;
        }
        if ((this.f37453a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33501d(16) + 4;
        }
        if ((this.f37453a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33501d(17) + 1;
        }
        if ((this.f37453a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33501d(18) + 1;
        }
        if ((this.f37453a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33501d(19) + 4;
        }
        if (this.f37473u != null) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f37473u);
        }
        if ((this.f37453a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33501d(21) + 1;
        }
        if (this.f37475w != null && this.f37475w.length > 0) {
            i = 0;
            while (i2 < this.f37475w.length) {
                i += CodedOutputByteBufferNano.m33498c(this.f37475w[i2]);
                i2++;
            }
            b = (b + i) + (this.f37475w.length * 2);
        }
        if ((this.f37453a & 524288) != 0) {
            b += CodedOutputByteBufferNano.m33502d(23, this.f37476x);
        }
        if ((this.f37453a & 1048576) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(24, this.f37477y);
        }
        return b;
    }

    private final dm m35379b(C7213a c7213a) {
        int length;
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            int a3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37454b = c7213a.m33564f();
                    this.f37453a |= 1;
                    continue;
                case 21:
                    this.f37455c = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 2;
                    continue;
                case 29:
                    this.f37456d = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 4;
                    continue;
                case 37:
                    this.f37457e = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 8;
                    continue;
                case 45:
                    this.f37458f = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 16;
                    continue;
                case 53:
                    this.f37459g = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 32;
                    continue;
                case 61:
                    this.f37460h = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 64;
                    continue;
                case 69:
                    this.f37461i = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 128;
                    continue;
                case 77:
                    this.f37462j = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 256;
                    continue;
                case 85:
                    this.f37463k = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 512;
                    continue;
                case 93:
                    this.f37464l = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 96:
                    this.f37465m = c7213a.m33567i();
                    this.f37453a |= eq.FLAG_MOVED;
                    continue;
                case 106:
                    a2 = C7222l.m33624a(c7213a, 106);
                    length = this.f37466n == null ? 0 : this.f37466n.length;
                    Object obj = new String[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f37466n, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = c7213a.m33564f();
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = c7213a.m33564f();
                    this.f37466n = obj;
                    continue;
                case 114:
                    this.f37467o = c7213a.m33564f();
                    this.f37453a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 125:
                    this.f37469q = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 16384;
                    continue;
                case 133:
                    this.f37470r = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 32768;
                    continue;
                case 136:
                    this.f37468p = c7213a.m33563e();
                    this.f37453a |= 8192;
                    continue;
                case HprofParser.ROOT_UNREACHABLE /*144*/:
                    this.f37471s = c7213a.m33563e();
                    this.f37453a |= 65536;
                    continue;
                case 157:
                    this.f37472t = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37453a |= 131072;
                    continue;
                case 162:
                    if (this.f37473u == null) {
                        this.f37473u = new bl();
                    }
                    c7213a.m33552a(this.f37473u);
                    continue;
                case 168:
                    this.f37474v = c7213a.m33563e();
                    this.f37453a |= 262144;
                    continue;
                case 176:
                    a3 = C7222l.m33624a(c7213a, 176);
                    Object obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            c7213a.m33550a();
                        }
                        int o = c7213a.m33573o();
                        try {
                            obj2[length] = dk.m35375a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f37475w == null ? 0 : this.f37475w.length;
                        if (a2 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f37475w, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f37475w = obj3;
                            break;
                        }
                        this.f37475w = obj2;
                        break;
                    }
                    continue;
                case 178:
                    a = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            dk.m35375a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a2);
                        if (this.f37475w == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f37475w.length;
                        }
                        Object obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f37475w, 0, obj4, 0, a2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a3 = c7213a.m33573o();
                            try {
                                obj4[a2] = dk.m35375a(c7213a.m33567i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a3);
                                a(c7213a, 176);
                            }
                        }
                        this.f37475w = obj4;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 184:
                    this.f37453a |= 524288;
                    length = c7213a.m33573o();
                    try {
                        this.f37476x = dh.m35367a(c7213a.m33567i());
                        this.f37453a |= 524288;
                        continue;
                    } catch (IllegalArgumentException e4) {
                        c7213a.m33562e(length);
                        a(c7213a, a);
                        break;
                    }
                case 192:
                    this.f37453a |= 1048576;
                    length = c7213a.m33573o();
                    try {
                        this.f37477y = dh.m35367a(c7213a.m33567i());
                        this.f37453a |= 1048576;
                        continue;
                    } catch (IllegalArgumentException e5) {
                        c7213a.m33562e(length);
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

    public final /* synthetic */ i m35380a(C7213a c7213a) {
        return m35379b(c7213a);
    }
}
