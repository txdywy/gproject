package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class as extends b {
    public Long f39899a;
    public Long f39900b;
    public Long f39901c;
    public Long f39902d;
    public Long f39903e;
    public Long f39904f;
    public Long f39905g;
    public Long f39906h;
    public String f39907i;
    public at[] f39908j;
    public Long f39909k;

    public as() {
        this.f39899a = null;
        this.f39900b = null;
        this.f39901c = null;
        this.f39902d = null;
        this.f39903e = null;
        this.f39904f = null;
        this.f39905g = null;
        this.f39906h = null;
        this.f39907i = null;
        this.f39908j = at.m37123d();
        this.f39909k = null;
        this.aP = -1;
    }

    public final void m37121a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39899a != null) {
            codedOutputByteBufferNano.m33531b(1, this.f39899a.longValue());
        }
        if (this.f39900b != null) {
            codedOutputByteBufferNano.m33531b(2, this.f39900b.longValue());
        }
        if (this.f39901c != null) {
            codedOutputByteBufferNano.m33531b(3, this.f39901c.longValue());
        }
        if (this.f39902d != null) {
            codedOutputByteBufferNano.m33531b(4, this.f39902d.longValue());
        }
        if (this.f39903e != null) {
            codedOutputByteBufferNano.m33531b(5, this.f39903e.longValue());
        }
        if (this.f39904f != null) {
            codedOutputByteBufferNano.m33531b(6, this.f39904f.longValue());
        }
        if (this.f39905g != null) {
            codedOutputByteBufferNano.m33531b(7, this.f39905g.longValue());
        }
        if (this.f39906h != null) {
            codedOutputByteBufferNano.m33531b(8, this.f39906h.longValue());
        }
        if (this.f39907i != null) {
            codedOutputByteBufferNano.m33521a(9, this.f39907i);
        }
        if (this.f39908j != null && this.f39908j.length > 0) {
            for (i iVar : this.f39908j) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(10, iVar);
                }
            }
        }
        if (this.f39909k != null) {
            codedOutputByteBufferNano.m33531b(11, this.f39909k.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37122b() {
        int b = super.b();
        if (this.f39899a != null) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f39899a.longValue());
        }
        if (this.f39900b != null) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f39900b.longValue());
        }
        if (this.f39901c != null) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f39901c.longValue());
        }
        if (this.f39902d != null) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f39902d.longValue());
        }
        if (this.f39903e != null) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f39903e.longValue());
        }
        if (this.f39904f != null) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f39904f.longValue());
        }
        if (this.f39905g != null) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f39905g.longValue());
        }
        if (this.f39906h != null) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f39906h.longValue());
        }
        if (this.f39907i != null) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f39907i);
        }
        if (this.f39908j != null && this.f39908j.length > 0) {
            int i = b;
            for (i iVar : this.f39908j) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(10, iVar);
                }
            }
            b = i;
        }
        if (this.f39909k != null) {
            return b + CodedOutputByteBufferNano.m33508f(11, this.f39909k.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37120a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39899a = Long.valueOf(c7213a.m33568j());
                    continue;
                case 16:
                    this.f39900b = Long.valueOf(c7213a.m33568j());
                    continue;
                case 24:
                    this.f39901c = Long.valueOf(c7213a.m33568j());
                    continue;
                case 32:
                    this.f39902d = Long.valueOf(c7213a.m33568j());
                    continue;
                case 40:
                    this.f39903e = Long.valueOf(c7213a.m33568j());
                    continue;
                case 48:
                    this.f39904f = Long.valueOf(c7213a.m33568j());
                    continue;
                case 56:
                    this.f39905g = Long.valueOf(c7213a.m33568j());
                    continue;
                case 64:
                    this.f39906h = Long.valueOf(c7213a.m33568j());
                    continue;
                case 74:
                    this.f39907i = c7213a.m33564f();
                    continue;
                case 82:
                    int a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f39908j == null ? 0 : this.f39908j.length;
                    Object obj = new at[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39908j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new at();
                    c7213a.m33552a(obj[a]);
                    this.f39908j = obj;
                    continue;
                case 88:
                    this.f39909k = Long.valueOf(c7213a.m33568j());
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
