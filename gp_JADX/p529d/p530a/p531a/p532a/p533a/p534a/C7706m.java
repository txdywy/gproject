package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7706m extends b {
    public static volatile C7706m[] f40127a;
    public Integer f40128b;
    public String f40129c;
    public int[] f40130d;

    public static C7706m[] m37273d() {
        if (f40127a == null) {
            synchronized (C7219h.f35465b) {
                if (f40127a == null) {
                    f40127a = new C7706m[0];
                }
            }
        }
        return f40127a;
    }

    public C7706m() {
        this.f40128b = null;
        this.f40129c = null;
        this.f40130d = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m37275a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40128b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40128b.intValue());
        }
        if (this.f40129c != null) {
            codedOutputByteBufferNano.m33521a(2, this.f40129c);
        }
        if (this.f40130d != null && this.f40130d.length > 0) {
            for (int a : this.f40130d) {
                codedOutputByteBufferNano.m33518a(5, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37276b() {
        int i = 0;
        int b = super.b();
        if (this.f40128b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40128b.intValue());
        }
        if (this.f40129c != null) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f40129c);
        }
        if (this.f40130d == null || this.f40130d.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f40130d.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f40130d[i]);
            i++;
        }
        return (b + i2) + (this.f40130d.length * 1);
    }

    public final /* synthetic */ i m37274a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40128b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 18:
                    this.f40129c = c7213a.m33564f();
                    continue;
                case 40:
                    a2 = C7222l.m33624a(c7213a, 40);
                    if (this.f40130d == null) {
                        a = 0;
                    } else {
                        a = this.f40130d.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40130d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f40130d = obj;
                    continue;
                case 42:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f40130d == null ? 0 : this.f40130d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f40130d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f40130d = obj2;
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
