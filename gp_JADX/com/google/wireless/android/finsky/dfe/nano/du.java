package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class du extends b {
    public int f38691a;
    public boolean f38692b;
    public eh[] f38693c;

    public du() {
        this.f38691a = 0;
        this.f38692b = false;
        this.f38693c = eh.m36328d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36284a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38691a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f38692b);
        }
        if (this.f38693c != null && this.f38693c.length > 0) {
            for (i iVar : this.f38693c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36285b() {
        int b = super.b();
        if ((this.f38691a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f38693c == null || this.f38693c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38693c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m36283a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38692b = c7213a.m33563e();
                    this.f38691a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38693c == null ? 0 : this.f38693c.length;
                    Object obj = new eh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38693c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new eh();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new eh();
                    c7213a.m33552a(obj[a]);
                    this.f38693c = obj;
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
