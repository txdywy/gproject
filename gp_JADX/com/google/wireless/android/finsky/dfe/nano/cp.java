package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.cv.a.iv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cp extends b {
    public int f38587a;
    public iu[] f38588b;
    public iv f38589c;
    public long f38590d;

    public cp() {
        this.f38587a = 0;
        this.f38588b = iu.br_();
        this.f38589c = null;
        this.f38590d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36182a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38588b != null && this.f38588b.length > 0) {
            for (i iVar : this.f38588b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38587a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f38590d);
        }
        if (this.f38589c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38589c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36183b() {
        int b = super.b();
        if (this.f38588b != null && this.f38588b.length > 0) {
            for (i iVar : this.f38588b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38587a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f38590d);
        }
        if (this.f38589c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38589c);
        }
        return b;
    }

    public final /* synthetic */ i m36181a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38588b == null ? 0 : this.f38588b.length;
                    Object obj = new iu[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38588b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new iu();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new iu();
                    c7213a.m33552a(obj[a]);
                    this.f38588b = obj;
                    continue;
                case 16:
                    this.f38590d = c7213a.m33568j();
                    this.f38587a |= 1;
                    continue;
                case 26:
                    if (this.f38589c == null) {
                        this.f38589c = new iv();
                    }
                    c7213a.m33552a(this.f38589c);
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
