package org.tensorflow.p573a.p574a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C8018c extends b {
    public float[] f41064a;

    public C8018c() {
        this.f41064a = C7222l.f35474g;
        this.aO = null;
        this.aP = -1;
    }

    public final void m38265a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f41064a != null && this.f41064a.length > 0) {
            int length = this.f41064a.length * 4;
            codedOutputByteBufferNano.m33539e(10);
            codedOutputByteBufferNano.m33539e(length);
            for (float a : this.f41064a) {
                codedOutputByteBufferNano.m33514a(a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m38266b() {
        int b = super.b();
        if (this.f41064a == null || this.f41064a.length <= 0) {
            return b;
        }
        int length = this.f41064a.length * 4;
        return ((b + length) + 1) + CodedOutputByteBufferNano.m33507f(length);
    }

    public final /* synthetic */ i m38264a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int c;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = c7213a.m33567i();
                    c = c7213a.m33558c(a);
                    int i = a / 4;
                    a = this.f41064a == null ? 0 : this.f41064a.length;
                    Object obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f41064a, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = Float.intBitsToFloat(c7213a.m33569k());
                        a++;
                    }
                    this.f41064a = obj;
                    c7213a.m33561d(c);
                    continue;
                case 13:
                    c = C7222l.m33624a(c7213a, 13);
                    if (this.f41064a == null) {
                        a = 0;
                    } else {
                        a = this.f41064a.length;
                    }
                    Object obj2 = new float[(c + a)];
                    if (a != 0) {
                        System.arraycopy(this.f41064a, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = Float.intBitsToFloat(c7213a.m33569k());
                        c7213a.m33550a();
                        a++;
                    }
                    obj2[a] = Float.intBitsToFloat(c7213a.m33569k());
                    this.f41064a = obj2;
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
