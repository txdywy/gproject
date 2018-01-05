package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7360p;

public final class cu extends b {
    public int f38605a;
    public C7360p[] f38606b;
    public int f38607c;

    public cu() {
        this.f38605a = 0;
        this.f38606b = C7360p.m34879d();
        this.f38607c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36199a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38606b != null && this.f38606b.length > 0) {
            for (i iVar : this.f38606b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38605a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38607c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36200b() {
        int b = super.b();
        if (this.f38606b != null && this.f38606b.length > 0) {
            for (i iVar : this.f38606b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38605a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38607c);
        }
        return b;
    }

    public final /* synthetic */ i m36198a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38606b == null ? 0 : this.f38606b.length;
                    Object obj = new C7360p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38606b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7360p();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7360p();
                    c7213a.m33552a(obj[a]);
                    this.f38606b = obj;
                    continue;
                case 16:
                    this.f38607c = c7213a.m33567i();
                    this.f38605a |= 1;
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
