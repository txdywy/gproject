package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7115j extends b {
    public static volatile C7115j[] f34809a;
    public String f34810b;
    public String f34811c;
    public long f34812d;
    public byte[] f34813e;
    public boolean f34814f;
    public String[] f34815g;
    public int[] f34816h;

    public static C7115j[] m32323d() {
        if (f34809a == null) {
            synchronized (C7219h.f35465b) {
                if (f34809a == null) {
                    f34809a = new C7115j[0];
                }
            }
        }
        return f34809a;
    }

    public C7115j() {
        this.f34810b = "";
        this.f34811c = "";
        this.f34812d = 0;
        this.f34813e = C7222l.f35479l;
        this.f34814f = false;
        this.f34815g = C7222l.f35477j;
        this.f34816h = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32325a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f34810b == null || this.f34810b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34810b);
        }
        if (!(this.f34811c == null || this.f34811c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34811c);
        }
        if (this.f34812d != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f34812d);
        }
        if (this.f34815g != null && this.f34815g.length > 0) {
            for (String str : this.f34815g) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(4, str);
                }
            }
        }
        if (!Arrays.equals(this.f34813e, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(5, this.f34813e);
        }
        if (this.f34814f) {
            codedOutputByteBufferNano.m33522a(6, this.f34814f);
        }
        if (this.f34816h != null && this.f34816h.length > 0) {
            while (i < this.f34816h.length) {
                codedOutputByteBufferNano.m33518a(7, this.f34816h[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32326b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (!(this.f34810b == null || this.f34810b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34810b);
        }
        if (!(this.f34811c == null || this.f34811c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34811c);
        }
        if (this.f34812d != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f34812d);
        }
        if (this.f34815g != null && this.f34815g.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f34815g) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (!Arrays.equals(this.f34813e, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f34813e);
        }
        if (this.f34814f) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f34816h == null || this.f34816h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f34816h.length) {
            i += CodedOutputByteBufferNano.m33498c(this.f34816h[i2]);
            i2++;
        }
        return (b + i) + (this.f34816h.length * 1);
    }

    public final /* synthetic */ i m32324a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34810b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f34811c = c7213a.m33564f();
                    continue;
                case 24:
                    this.f34812d = c7213a.m33568j();
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f34815g == null ? 0 : this.f34815g.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34815g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34815g = obj;
                    continue;
                case 42:
                    this.f34813e = c7213a.m33565g();
                    continue;
                case 48:
                    this.f34814f = c7213a.m33563e();
                    continue;
                case 56:
                    a2 = C7222l.m33624a(c7213a, 56);
                    if (this.f34816h == null) {
                        a = 0;
                    } else {
                        a = this.f34816h.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34816h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34816h = obj;
                    continue;
                case 58:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34816h == null ? 0 : this.f34816h.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34816h, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34816h = obj2;
                    c7213a.m33561d(c);
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
