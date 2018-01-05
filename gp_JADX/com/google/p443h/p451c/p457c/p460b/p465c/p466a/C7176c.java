package com.google.p443h.p451c.p457c.p460b.p465c.p466a;

import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7176c extends b {
    public String[] f35020a;
    public ae f35021b;
    public ae f35022c;

    public C7176c() {
        this.f35020a = C7222l.f35477j;
        this.f35021b = null;
        this.f35022c = null;
        this.aP = -1;
    }

    public final void m32527a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35020a != null && this.f35020a.length > 0) {
            for (String str : this.f35020a) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f35021b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35021b);
        }
        if (this.f35022c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35022c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32528b() {
        int i = 0;
        int b = super.b();
        if (this.f35020a == null || this.f35020a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f35020a.length) {
                String str = this.f35020a[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f35021b != null) {
            i += CodedOutputByteBufferNano.m33503d(2, this.f35021b);
        }
        if (this.f35022c != null) {
            return i + CodedOutputByteBufferNano.m33503d(3, this.f35022c);
        }
        return i;
    }

    public final /* synthetic */ i m32526a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f35020a == null ? 0 : this.f35020a.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35020a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f35020a = obj;
                    continue;
                case 18:
                    if (this.f35021b == null) {
                        this.f35021b = new ae();
                    }
                    c7213a.m33552a(this.f35021b);
                    continue;
                case 26:
                    if (this.f35022c == null) {
                        this.f35022c = new ae();
                    }
                    c7213a.m33552a(this.f35022c);
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
