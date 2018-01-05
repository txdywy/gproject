package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7344z extends b {
    public int f36642a;
    public String f36643b;
    public C7343y[] f36644c;

    public C7344z() {
        this.f36642a = 0;
        this.f36643b = "";
        this.f36644c = C7343y.m34788d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34793a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36642a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36643b);
        }
        if (this.f36644c != null && this.f36644c.length > 0) {
            for (i iVar : this.f36644c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34794b() {
        int b = super.b();
        if ((this.f36642a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36643b);
        }
        if (this.f36644c == null || this.f36644c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36644c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m34792a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36643b = c7213a.m33564f();
                    this.f36642a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36644c == null ? 0 : this.f36644c.length;
                    Object obj = new C7343y[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36644c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7343y();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7343y();
                    c7213a.m33552a(obj[a]);
                    this.f36644c = obj;
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
