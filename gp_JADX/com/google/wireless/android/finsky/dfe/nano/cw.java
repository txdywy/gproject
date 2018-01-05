package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cw extends b {
    public ai[] f38610a;
    public cv[] f38611b;

    public cw() {
        this.f38610a = ai.m35995d();
        this.f38611b = cv.aS_();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36205a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38610a != null && this.f38610a.length > 0) {
            for (i iVar : this.f38610a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f38611b != null && this.f38611b.length > 0) {
            while (i < this.f38611b.length) {
                i iVar2 = this.f38611b[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36206b() {
        int i = 0;
        int b = super.b();
        if (this.f38610a != null && this.f38610a.length > 0) {
            int i2 = b;
            for (i iVar : this.f38610a) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f38611b != null && this.f38611b.length > 0) {
            while (i < this.f38611b.length) {
                i iVar2 = this.f38611b[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36204a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38610a == null ? 0 : this.f38610a.length;
                    obj = new ai[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38610a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ai();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ai();
                    c7213a.m33552a(obj[a]);
                    this.f38610a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38611b == null ? 0 : this.f38611b.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38611b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cv();
                    c7213a.m33552a(obj[a]);
                    this.f38611b = obj;
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
