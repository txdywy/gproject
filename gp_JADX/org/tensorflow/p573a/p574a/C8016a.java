package org.tensorflow.p573a.p574a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C8016a extends b {
    public byte[][] f41059a;

    public C8016a() {
        this.f41059a = C7222l.f35478k;
        this.aO = null;
        this.aP = -1;
    }

    public final void m38259a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f41059a != null && this.f41059a.length > 0) {
            for (byte[] bArr : this.f41059a) {
                if (bArr != null) {
                    codedOutputByteBufferNano.m33523a(1, bArr);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m38260b() {
        int i = 0;
        int b = super.b();
        if (this.f41059a == null || this.f41059a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f41059a.length) {
            byte[] bArr = this.f41059a[i];
            if (bArr != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33496b(bArr);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ i m38258a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f41059a == null ? 0 : this.f41059a.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f41059a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33565g();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33565g();
                    this.f41059a = obj;
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
