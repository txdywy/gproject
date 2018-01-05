package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class at extends b {
    public static volatile at[] f39910a;
    public String f39911b;
    public long[] f39912c;
    public Long f39913d;

    public static at[] m37123d() {
        if (f39910a == null) {
            synchronized (C7219h.f35465b) {
                if (f39910a == null) {
                    f39910a = new at[0];
                }
            }
        }
        return f39910a;
    }

    public at() {
        this.f39911b = null;
        this.f39912c = C7222l.f35473f;
        this.f39913d = null;
        this.aP = -1;
    }

    public final void m37125a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39911b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39911b);
        }
        if (this.f39913d != null) {
            codedOutputByteBufferNano.m33531b(2, this.f39913d.longValue());
        }
        if (this.f39912c != null && this.f39912c.length > 0) {
            for (long c : this.f39912c) {
                codedOutputByteBufferNano.m33535c(3, c);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37126b() {
        int b = super.b();
        if (this.f39911b != null) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39911b);
        }
        if (this.f39913d != null) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f39913d.longValue());
        }
        if (this.f39912c == null || this.f39912c.length <= 0) {
            return b;
        }
        return (b + (this.f39912c.length * 8)) + (this.f39912c.length * 1);
    }

    public final /* synthetic */ i m37124a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39911b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f39913d = Long.valueOf(c7213a.m33568j());
                    continue;
                case 25:
                    a2 = C7222l.m33624a(c7213a, 25);
                    if (this.f39912c == null) {
                        a = 0;
                    } else {
                        a = this.f39912c.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39912c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33570l();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33570l();
                    this.f39912c = obj;
                    continue;
                case 26:
                    a = c7213a.m33567i();
                    a2 = c7213a.m33558c(a);
                    int i = a / 8;
                    a = this.f39912c == null ? 0 : this.f39912c.length;
                    Object obj2 = new long[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39912c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = c7213a.m33570l();
                        a++;
                    }
                    this.f39912c = obj2;
                    c7213a.m33561d(a2);
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
