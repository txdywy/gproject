package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7160i extends b {
    public byte[] f34979a;
    public int[] f34980b;
    public int[] f34981c;

    public C7160i() {
        this.f34979a = C7222l.f35479l;
        this.f34980b = C7222l.f35472e;
        this.f34981c = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m32476a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (!Arrays.equals(this.f34979a, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(1, this.f34979a);
        }
        if (this.f34980b != null && this.f34980b.length > 0) {
            i = 0;
            for (int c : this.f34980b) {
                i += CodedOutputByteBufferNano.m33498c(c);
            }
            codedOutputByteBufferNano.m33539e(18);
            codedOutputByteBufferNano.m33539e(i);
            for (int i3 : this.f34980b) {
                codedOutputByteBufferNano.m33515a(i3);
            }
        }
        if (this.f34981c != null && this.f34981c.length > 0) {
            i3 = 0;
            for (int c2 : this.f34981c) {
                i3 += CodedOutputByteBufferNano.m33498c(c2);
            }
            codedOutputByteBufferNano.m33539e(26);
            codedOutputByteBufferNano.m33539e(i3);
            while (i2 < this.f34981c.length) {
                codedOutputByteBufferNano.m33515a(this.f34981c[i2]);
                i2++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32477b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (!Arrays.equals(this.f34979a, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f34979a);
        }
        if (this.f34980b != null && this.f34980b.length > 0) {
            int i3 = 0;
            for (int c : this.f34980b) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.m33507f(i3);
        }
        if (this.f34981c == null || this.f34981c.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f34981c.length) {
            i += CodedOutputByteBufferNano.m33498c(this.f34981c[i2]);
            i2++;
        }
        return ((b + i) + 1) + CodedOutputByteBufferNano.m33507f(i);
    }

    public final /* synthetic */ i m32475a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34979a = c7213a.m33565g();
                    continue;
                case 16:
                    a2 = C7222l.m33624a(c7213a, 16);
                    if (this.f34980b == null) {
                        a = 0;
                    } else {
                        a = this.f34980b.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34980b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34980b = obj;
                    continue;
                case 18:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34980b == null ? 0 : this.f34980b.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34980b, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34980b = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 24:
                    a2 = C7222l.m33624a(c7213a, 24);
                    if (this.f34981c == null) {
                        a = 0;
                    } else {
                        a = this.f34981c.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34981c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34981c = obj;
                    continue;
                case 26:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34981c == null ? 0 : this.f34981c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34981c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34981c = obj2;
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
