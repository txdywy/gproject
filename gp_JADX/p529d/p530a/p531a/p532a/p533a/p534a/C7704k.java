package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7704k extends b {
    public int[] f40125a;

    public C7704k() {
        this.f40125a = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m37268a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40125a != null && this.f40125a.length > 0) {
            for (int a : this.f40125a) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37269b() {
        int i = 0;
        int b = super.b();
        if (this.f40125a == null || this.f40125a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f40125a.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f40125a[i]);
            i++;
        }
        return (b + i2) + (this.f40125a.length * 1);
    }

    public final /* synthetic */ i m37267a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    if (this.f40125a == null) {
                        a = 0;
                    } else {
                        a = this.f40125a.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40125a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f40125a = obj;
                    continue;
                case 10:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f40125a == null ? 0 : this.f40125a.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f40125a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f40125a = obj2;
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
