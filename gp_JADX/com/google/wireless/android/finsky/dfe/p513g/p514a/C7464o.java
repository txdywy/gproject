package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7464o extends b {
    public int f37893a;
    public String f37894b;
    public ab f37895c;
    public ae f37896d;
    public String f37897e;
    public af[] f37898f;
    public ai f37899g;
    public ah[] f37900h;
    public ae f37901i;

    public C7464o() {
        this.f37893a = 0;
        this.f37894b = "";
        this.f37895c = null;
        this.f37896d = null;
        this.f37897e = "";
        this.f37898f = af.m35597d();
        this.f37899g = null;
        this.f37900h = ah.m35605d();
        this.f37901i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35663a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f37893a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37894b);
        }
        if (this.f37896d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37896d);
        }
        if ((this.f37893a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37897e);
        }
        if (this.f37899g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37899g);
        }
        if (this.f37900h != null && this.f37900h.length > 0) {
            for (i iVar : this.f37900h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar);
                }
            }
        }
        if (this.f37901i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37901i);
        }
        if (this.f37895c != null) {
            codedOutputByteBufferNano.m33532b(9, this.f37895c);
        }
        if (this.f37898f != null && this.f37898f.length > 0) {
            while (i < this.f37898f.length) {
                i iVar2 = this.f37898f[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(10, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35664b() {
        int i = 0;
        int b = super.b();
        if ((this.f37893a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37894b);
        }
        if (this.f37896d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37896d);
        }
        if ((this.f37893a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37897e);
        }
        if (this.f37899g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37899g);
        }
        if (this.f37900h != null && this.f37900h.length > 0) {
            int i2 = b;
            for (i iVar : this.f37900h) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(7, iVar);
                }
            }
            b = i2;
        }
        if (this.f37901i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37901i);
        }
        if (this.f37895c != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f37895c);
        }
        if (this.f37898f != null && this.f37898f.length > 0) {
            while (i < this.f37898f.length) {
                i iVar2 = this.f37898f[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(10, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m35662a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37894b = c7213a.m33564f();
                    this.f37893a |= 1;
                    continue;
                case 26:
                    if (this.f37896d == null) {
                        this.f37896d = new ae();
                    }
                    c7213a.m33552a(this.f37896d);
                    continue;
                case 34:
                    this.f37897e = c7213a.m33564f();
                    this.f37893a |= 2;
                    continue;
                case 50:
                    if (this.f37899g == null) {
                        this.f37899g = new ai();
                    }
                    c7213a.m33552a(this.f37899g);
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f37900h == null ? 0 : this.f37900h.length;
                    obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37900h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ah();
                    c7213a.m33552a(obj[a]);
                    this.f37900h = obj;
                    continue;
                case 66:
                    if (this.f37901i == null) {
                        this.f37901i = new ae();
                    }
                    c7213a.m33552a(this.f37901i);
                    continue;
                case 74:
                    if (this.f37895c == null) {
                        this.f37895c = new ab();
                    }
                    c7213a.m33552a(this.f37895c);
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f37898f == null ? 0 : this.f37898f.length;
                    obj = new af[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37898f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new af();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new af();
                    c7213a.m33552a(obj[a]);
                    this.f37898f = obj;
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
