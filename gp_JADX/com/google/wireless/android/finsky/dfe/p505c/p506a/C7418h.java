package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7418h extends b {
    public String[] f37571a;
    public String[] f37572b;

    public C7418h() {
        this.f37571a = C7222l.f35477j;
        this.f37572b = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35465a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37571a != null && this.f37571a.length > 0) {
            for (String str : this.f37571a) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f37572b != null && this.f37572b.length > 0) {
            while (i < this.f37572b.length) {
                String str2 = this.f37572b[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(2, str2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35466b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.f37571a == null || this.f37571a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f37571a) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f37572b == null || this.f37572b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.f37572b.length) {
            String str2 = this.f37572b[i4];
            if (str2 != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33495b(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    public final /* synthetic */ i m35464a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37571a == null ? 0 : this.f37571a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37571a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37571a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37572b == null ? 0 : this.f37572b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37572b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37572b = obj;
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
