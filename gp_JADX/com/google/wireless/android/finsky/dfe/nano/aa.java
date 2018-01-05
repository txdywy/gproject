package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public int f38288a;
    public C7550z[] f38289b;
    public int f38290c;

    public aa() {
        this.f38288a = 0;
        this.f38289b = C7550z.m36603d();
        this.f38290c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35963a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38289b != null && this.f38289b.length > 0) {
            for (i iVar : this.f38289b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38288a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38290c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35964b() {
        int b = super.b();
        if (this.f38289b != null && this.f38289b.length > 0) {
            for (i iVar : this.f38289b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38288a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38290c);
        }
        return b;
    }

    public final /* synthetic */ i m35962a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38289b == null ? 0 : this.f38289b.length;
                    Object obj = new C7550z[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38289b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7550z();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7550z();
                    c7213a.m33552a(obj[a]);
                    this.f38289b = obj;
                    continue;
                case 16:
                    this.f38290c = c7213a.m33567i();
                    this.f38288a |= 1;
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
