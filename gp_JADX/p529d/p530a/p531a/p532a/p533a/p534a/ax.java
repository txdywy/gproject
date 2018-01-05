package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ax extends b {
    public C7706m[] f39920a;
    public C7707n[] f39921b;
    public C7699f[] f39922c;
    public bd[] f39923d;
    public Integer f39924e;

    public ax() {
        this.f39920a = C7706m.m37273d();
        this.f39921b = C7707n.m37277d();
        this.f39922c = C7699f.m37249d();
        this.f39923d = bd.m37159d();
        this.f39924e = null;
        this.aP = -1;
    }

    public final void m37136a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39920a != null && this.f39920a.length > 0) {
            for (i iVar : this.f39920a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f39921b != null && this.f39921b.length > 0) {
            for (i iVar2 : this.f39921b) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
            }
        }
        if (this.f39922c != null && this.f39922c.length > 0) {
            for (i iVar22 : this.f39922c) {
                if (iVar22 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar22);
                }
            }
        }
        if (this.f39923d != null && this.f39923d.length > 0) {
            while (i < this.f39923d.length) {
                i iVar3 = this.f39923d[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar3);
                }
                i++;
            }
        }
        if (this.f39924e != null) {
            codedOutputByteBufferNano.m33518a(5, this.f39924e.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37137b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f39920a != null && this.f39920a.length > 0) {
            i = b;
            for (i iVar : this.f39920a) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i;
        }
        if (this.f39921b != null && this.f39921b.length > 0) {
            i = b;
            for (i iVar2 : this.f39921b) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
            }
            b = i;
        }
        if (this.f39922c != null && this.f39922c.length > 0) {
            i = b;
            for (i iVar22 : this.f39922c) {
                if (iVar22 != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar22);
                }
            }
            b = i;
        }
        if (this.f39923d != null && this.f39923d.length > 0) {
            while (i2 < this.f39923d.length) {
                i iVar3 = this.f39923d[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(4, iVar3);
                }
                i2++;
            }
        }
        if (this.f39924e != null) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f39924e.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37135a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39920a == null ? 0 : this.f39920a.length;
                    obj = new C7706m[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39920a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7706m();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7706m();
                    c7213a.m33552a(obj[a]);
                    this.f39920a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f39921b == null ? 0 : this.f39921b.length;
                    obj = new C7707n[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39921b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7707n();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7707n();
                    c7213a.m33552a(obj[a]);
                    this.f39921b = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f39922c == null ? 0 : this.f39922c.length;
                    obj = new C7699f[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39922c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7699f();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7699f();
                    c7213a.m33552a(obj[a]);
                    this.f39922c = obj;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f39923d == null ? 0 : this.f39923d.length;
                    obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39923d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bd();
                    c7213a.m33552a(obj[a]);
                    this.f39923d = obj;
                    continue;
                case 40:
                    this.f39924e = Integer.valueOf(c7213a.m33567i());
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
