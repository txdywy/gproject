package com.google.wireless.android.finsky.dfe.p498b.p503b.p504a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7409c extends b {
    public int f36984a;
    public String f36985b;
    public C7407a[] f36986c;

    public C7409c() {
        this.f36984a = 0;
        this.f36985b = "";
        this.f36986c = C7407a.m35046d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35054a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36984a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36985b);
        }
        if (this.f36986c != null && this.f36986c.length > 0) {
            for (i iVar : this.f36986c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35055b() {
        int b = super.b();
        if ((this.f36984a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36985b);
        }
        if (this.f36986c == null || this.f36986c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36986c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35053a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36985b = c7213a.m33564f();
                    this.f36984a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36986c == null ? 0 : this.f36986c.length;
                    Object obj = new C7407a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36986c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7407a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7407a();
                    c7213a.m33552a(obj[a]);
                    this.f36986c = obj;
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
