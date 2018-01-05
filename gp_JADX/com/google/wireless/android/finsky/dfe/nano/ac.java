package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public int f38306a;
    public String f38307b;
    public String f38308c;
    public bd[] f38309d;

    public ac() {
        this.f38306a = 0;
        this.f38307b = "";
        this.f38308c = "";
        this.f38309d = bd.aH_();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35973a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38306a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38307b);
        }
        if ((this.f38306a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38308c);
        }
        if (this.f38309d != null && this.f38309d.length > 0) {
            for (i iVar : this.f38309d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35974b() {
        int b = super.b();
        if ((this.f38306a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38307b);
        }
        if ((this.f38306a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38308c);
        }
        if (this.f38309d == null || this.f38309d.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38309d) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(3, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35972a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38307b = c7213a.m33564f();
                    this.f38306a |= 1;
                    continue;
                case 18:
                    this.f38308c = c7213a.m33564f();
                    this.f38306a |= 2;
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38309d == null ? 0 : this.f38309d.length;
                    Object obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38309d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bd();
                    c7213a.m33552a(obj[a]);
                    this.f38309d = obj;
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
