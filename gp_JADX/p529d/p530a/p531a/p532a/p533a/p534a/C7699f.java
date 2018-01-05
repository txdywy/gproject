package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7699f extends b {
    public static volatile C7699f[] f40106a;
    public Integer f40107b;
    public int[] f40108c;

    public static C7699f[] m37249d() {
        if (f40106a == null) {
            synchronized (C7219h.f35465b) {
                if (f40106a == null) {
                    f40106a = new C7699f[0];
                }
            }
        }
        return f40106a;
    }

    public C7699f() {
        this.f40107b = null;
        this.f40108c = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m37251a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40107b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40107b.intValue());
        }
        if (this.f40108c != null && this.f40108c.length > 0) {
            for (int a : this.f40108c) {
                codedOutputByteBufferNano.m33518a(2, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37252b() {
        int i = 0;
        int b = super.b();
        if (this.f40107b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40107b.intValue());
        }
        if (this.f40108c == null || this.f40108c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f40108c.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f40108c[i]);
            i++;
        }
        return (b + i2) + (this.f40108c.length * 1);
    }

    public final /* synthetic */ i m37250a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40107b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    a2 = C7222l.m33624a(c7213a, 16);
                    if (this.f40108c == null) {
                        a = 0;
                    } else {
                        a = this.f40108c.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40108c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f40108c = obj;
                    continue;
                case 18:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f40108c == null ? 0 : this.f40108c.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f40108c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f40108c = obj2;
                    c7213a.m33561d(c);
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
