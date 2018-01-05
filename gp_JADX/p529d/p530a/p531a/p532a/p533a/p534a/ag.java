package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ag extends b {
    public Integer f39835a;
    public Integer f39836b;
    public Integer f39837c;
    public Integer f39838d;
    public ab[] f39839e;
    public Integer f39840f;

    public ag() {
        this.f39835a = null;
        this.f39836b = null;
        this.f39837c = null;
        this.f39838d = null;
        this.f39839e = ab.m37060d();
        this.f39840f = null;
        this.aP = -1;
    }

    public final void m37077a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39835a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39835a.intValue());
        }
        if (this.f39836b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39836b.intValue());
        }
        if (this.f39837c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39837c.intValue());
        }
        if (this.f39838d != null) {
            codedOutputByteBufferNano.m33518a(4, this.f39838d.intValue());
        }
        if (this.f39839e != null && this.f39839e.length > 0) {
            for (i iVar : this.f39839e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (this.f39840f != null) {
            codedOutputByteBufferNano.m33518a(6, this.f39840f.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37078b() {
        int b = super.b();
        if (this.f39835a != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39835a.intValue());
        }
        if (this.f39836b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39836b.intValue());
        }
        if (this.f39837c != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39837c.intValue());
        }
        if (this.f39838d != null) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f39838d.intValue());
        }
        if (this.f39839e != null && this.f39839e.length > 0) {
            int i = b;
            for (i iVar : this.f39839e) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if (this.f39840f != null) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f39840f.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37076a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39835a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f39836b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39837c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 32:
                    this.f39838d = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f39839e == null ? 0 : this.f39839e.length;
                    Object obj = new ab[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39839e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ab();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ab();
                    c7213a.m33552a(obj[a]);
                    this.f39839e = obj;
                    continue;
                case 48:
                    this.f39840f = Integer.valueOf(c7213a.m33567i());
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
