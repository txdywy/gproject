package org.tensorflow.p573a.p574a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C8019d extends b {
    public long[] f41065a;

    public C8019d() {
        this.f41065a = C7222l.f35473f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m38268a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f41065a != null && this.f41065a.length > 0) {
            int i2 = 0;
            for (long c : this.f41065a) {
                i2 += CodedOutputByteBufferNano.m33500c(c);
            }
            codedOutputByteBufferNano.m33539e(10);
            codedOutputByteBufferNano.m33539e(i2);
            while (i < this.f41065a.length) {
                codedOutputByteBufferNano.m33533b(this.f41065a[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m38269b() {
        int i = 0;
        int b = super.b();
        if (this.f41065a == null || this.f41065a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f41065a.length) {
            i2 += CodedOutputByteBufferNano.m33500c(this.f41065a[i]);
            i++;
        }
        return ((b + i2) + 1) + CodedOutputByteBufferNano.m33507f(i2);
    }

    public final /* synthetic */ i m38267a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    if (this.f41065a == null) {
                        a = 0;
                    } else {
                        a = this.f41065a.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f41065a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33568j();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33568j();
                    this.f41065a = obj;
                    continue;
                case 10:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33568j();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f41065a == null ? 0 : this.f41065a.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f41065a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33568j();
                        a2++;
                    }
                    this.f41065a = obj2;
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
