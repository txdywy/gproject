package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ey extends b {
    public int f38862a;
    public String[] f38863b;
    public String[] f38864c;
    public String[] f38865d;
    public String f38866e;

    public ey() {
        this.f38862a = 0;
        this.f38863b = C7222l.f35477j;
        this.f38864c = C7222l.f35477j;
        this.f38865d = C7222l.f35477j;
        this.f38866e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36384a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38863b != null && this.f38863b.length > 0) {
            for (String str : this.f38863b) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f38864c != null && this.f38864c.length > 0) {
            for (String str2 : this.f38864c) {
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(2, str2);
                }
            }
        }
        if (this.f38865d != null && this.f38865d.length > 0) {
            while (i < this.f38865d.length) {
                String str3 = this.f38865d[i];
                if (str3 != null) {
                    codedOutputByteBufferNano.m33521a(3, str3);
                }
                i++;
            }
        }
        if ((this.f38862a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38866e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36385b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.f38863b == null || this.f38863b.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f38863b) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f38864c != null && this.f38864c.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f38864c) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.m33495b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f38865d != null && this.f38865d.length > 0) {
            i2 = 0;
            i3 = 0;
            while (i4 < this.f38865d.length) {
                String str3 = this.f38865d[i4];
                if (str3 != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str3);
                }
                i4++;
            }
            i = (i + i2) + (i3 * 1);
        }
        if ((this.f38862a & 1) != 0) {
            return i + CodedOutputByteBufferNano.m33493b(4, this.f38866e);
        }
        return i;
    }

    public final /* synthetic */ i m36383a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38863b == null ? 0 : this.f38863b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38863b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38863b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38864c == null ? 0 : this.f38864c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38864c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38864c = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38865d == null ? 0 : this.f38865d.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38865d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38865d = obj;
                    continue;
                case 34:
                    this.f38866e = c7213a.m33564f();
                    this.f38862a |= 1;
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
