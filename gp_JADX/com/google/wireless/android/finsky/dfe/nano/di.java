package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class di extends b {
    public String[] f38648a;

    public di() {
        this.f38648a = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36244a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38648a != null && this.f38648a.length > 0) {
            for (String str : this.f38648a) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36245b() {
        int i = 0;
        int b = super.b();
        if (this.f38648a == null || this.f38648a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f38648a.length) {
            String str = this.f38648a[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33495b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ i m36243a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38648a == null ? 0 : this.f38648a.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38648a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38648a = obj;
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
