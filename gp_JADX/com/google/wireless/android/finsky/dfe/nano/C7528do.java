package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7528do extends b {
    public int f38667a;
    public String f38668b;
    public String[] f38669c;
    public String[] f38670d;
    public String[] f38671e;

    public final C7528do m36263a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f38667a |= 1;
        this.f38668b = str;
        return this;
    }

    public C7528do() {
        this.f38667a = 0;
        this.f38668b = "";
        this.f38669c = C7222l.f35477j;
        this.f38670d = C7222l.f35477j;
        this.f38671e = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36264a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38667a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38668b);
        }
        if (this.f38669c != null && this.f38669c.length > 0) {
            for (String str : this.f38669c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
            }
        }
        if (this.f38670d != null && this.f38670d.length > 0) {
            for (String str2 : this.f38670d) {
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(3, str2);
                }
            }
        }
        if (this.f38671e != null && this.f38671e.length > 0) {
            while (i < this.f38671e.length) {
                String str3 = this.f38671e[i];
                if (str3 != null) {
                    codedOutputByteBufferNano.m33521a(4, str3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36265b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if ((this.f38667a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38668b);
        }
        if (this.f38669c != null && this.f38669c.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f38669c) {
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f38670d != null && this.f38670d.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f38670d) {
                if (str2 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.m33495b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f38671e == null || this.f38671e.length <= 0) {
            return b;
        }
        i3 = 0;
        i = 0;
        while (i4 < this.f38671e.length) {
            String str3 = this.f38671e[i4];
            if (str3 != null) {
                i++;
                i3 += CodedOutputByteBufferNano.m33495b(str3);
            }
            i4++;
        }
        return (b + i3) + (i * 1);
    }

    public final /* synthetic */ i m36262a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38668b = c7213a.m33564f();
                    this.f38667a |= 1;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38669c == null ? 0 : this.f38669c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38669c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38669c = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38670d == null ? 0 : this.f38670d.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38670d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38670d = obj;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f38671e == null ? 0 : this.f38671e.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38671e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38671e = obj;
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
