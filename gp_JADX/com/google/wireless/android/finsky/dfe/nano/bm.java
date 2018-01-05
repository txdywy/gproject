package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.eu;
import com.google.android.finsky.cv.a.iu;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bm extends b {
    public int f38454a;
    public String f38455b;
    public bd f38456c;
    public int f38457d;
    public int f38458e;
    public String f38459f;
    public eu f38460g;
    public iu[] f38461h;

    public bm() {
        this.f38454a = 0;
        this.f38455b = "";
        this.f38456c = null;
        this.f38457d = 0;
        this.f38458e = 0;
        this.f38459f = "";
        this.f38460g = null;
        this.f38461h = iu.br_();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36089a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38454a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38455b);
        }
        if (this.f38456c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38456c);
        }
        if ((this.f38454a & 2) != 0) {
            codedOutputByteBufferNano.m33534c(3, this.f38457d);
        }
        if ((this.f38454a & 4) != 0) {
            codedOutputByteBufferNano.m33534c(4, this.f38458e);
        }
        if ((this.f38454a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38459f);
        }
        if (this.f38460g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38460g);
        }
        if (this.f38461h != null && this.f38461h.length > 0) {
            for (i iVar : this.f38461h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36090b() {
        int b = super.b();
        if ((this.f38454a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38455b);
        }
        if (this.f38456c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38456c);
        }
        if ((this.f38454a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33504e(3, this.f38457d);
        }
        if ((this.f38454a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33504e(4, this.f38458e);
        }
        if ((this.f38454a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38459f);
        }
        if (this.f38460g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38460g);
        }
        if (this.f38461h == null || this.f38461h.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38461h) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(7, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m36088a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38455b = c7213a.m33564f();
                    this.f38454a |= 1;
                    continue;
                case 18:
                    if (this.f38456c == null) {
                        this.f38456c = new bd();
                    }
                    c7213a.m33552a(this.f38456c);
                    continue;
                case 24:
                    this.f38457d = c7213a.m33567i();
                    this.f38454a |= 2;
                    continue;
                case 32:
                    this.f38458e = c7213a.m33567i();
                    this.f38454a |= 4;
                    continue;
                case 42:
                    this.f38459f = c7213a.m33564f();
                    this.f38454a |= 8;
                    continue;
                case 50:
                    if (this.f38460g == null) {
                        this.f38460g = new eu();
                    }
                    c7213a.m33552a(this.f38460g);
                    continue;
                case 58:
                    int a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f38461h == null ? 0 : this.f38461h.length;
                    Object obj = new iu[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38461h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new iu();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new iu();
                    c7213a.m33552a(obj[a]);
                    this.f38461h = obj;
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
