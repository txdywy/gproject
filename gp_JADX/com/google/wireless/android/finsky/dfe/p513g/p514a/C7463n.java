package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7463n extends b {
    public int f37885a;
    public String f37886b;
    public ab f37887c;
    public ae f37888d;
    public ai f37889e;
    public ah[] f37890f;
    public aj f37891g;
    public String f37892h;

    public C7463n() {
        this.f37885a = 0;
        this.f37886b = "";
        this.f37887c = null;
        this.f37888d = null;
        this.f37889e = null;
        this.f37890f = ah.m35605d();
        this.f37891g = null;
        this.f37892h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35660a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37885a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37886b);
        }
        if (this.f37888d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37888d);
        }
        if (this.f37889e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37889e);
        }
        if (this.f37890f != null && this.f37890f.length > 0) {
            for (i iVar : this.f37890f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (this.f37891g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37891g);
        }
        if (this.f37887c != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37887c);
        }
        if ((this.f37885a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f37892h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35661b() {
        int b = super.b();
        if ((this.f37885a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37886b);
        }
        if (this.f37888d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37888d);
        }
        if (this.f37889e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37889e);
        }
        if (this.f37890f != null && this.f37890f.length > 0) {
            int i = b;
            for (i iVar : this.f37890f) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if (this.f37891g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37891g);
        }
        if (this.f37887c != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37887c);
        }
        if ((this.f37885a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f37892h);
        }
        return b;
    }

    public final /* synthetic */ i m35659a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37886b = c7213a.m33564f();
                    this.f37885a |= 1;
                    continue;
                case 26:
                    if (this.f37888d == null) {
                        this.f37888d = new ae();
                    }
                    c7213a.m33552a(this.f37888d);
                    continue;
                case 34:
                    if (this.f37889e == null) {
                        this.f37889e = new ai();
                    }
                    c7213a.m33552a(this.f37889e);
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f37890f == null ? 0 : this.f37890f.length;
                    Object obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37890f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ah();
                    c7213a.m33552a(obj[a]);
                    this.f37890f = obj;
                    continue;
                case 50:
                    if (this.f37891g == null) {
                        this.f37891g = new aj();
                    }
                    c7213a.m33552a(this.f37891g);
                    continue;
                case 58:
                    if (this.f37887c == null) {
                        this.f37887c = new ab();
                    }
                    c7213a.m33552a(this.f37887c);
                    continue;
                case 66:
                    this.f37892h = c7213a.m33564f();
                    this.f37885a |= 2;
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
