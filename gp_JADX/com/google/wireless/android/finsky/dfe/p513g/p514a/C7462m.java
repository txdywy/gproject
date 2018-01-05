package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7462m extends b {
    public int f37879a;
    public String f37880b;
    public ab f37881c;
    public ae f37882d;
    public ai f37883e;
    public ah[] f37884f;

    public C7462m() {
        this.f37879a = 0;
        this.f37880b = "";
        this.f37881c = null;
        this.f37882d = null;
        this.f37883e = null;
        this.f37884f = ah.m35605d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35657a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37879a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37880b);
        }
        if (this.f37882d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37882d);
        }
        if (this.f37883e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37883e);
        }
        if (this.f37884f != null && this.f37884f.length > 0) {
            for (i iVar : this.f37884f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (this.f37881c != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37881c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35658b() {
        int b = super.b();
        if ((this.f37879a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37880b);
        }
        if (this.f37882d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37882d);
        }
        if (this.f37883e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37883e);
        }
        if (this.f37884f != null && this.f37884f.length > 0) {
            int i = b;
            for (i iVar : this.f37884f) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if (this.f37881c != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37881c);
        }
        return b;
    }

    public final /* synthetic */ i m35656a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37880b = c7213a.m33564f();
                    this.f37879a |= 1;
                    continue;
                case 26:
                    if (this.f37882d == null) {
                        this.f37882d = new ae();
                    }
                    c7213a.m33552a(this.f37882d);
                    continue;
                case 34:
                    if (this.f37883e == null) {
                        this.f37883e = new ai();
                    }
                    c7213a.m33552a(this.f37883e);
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f37884f == null ? 0 : this.f37884f.length;
                    Object obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37884f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ah();
                    c7213a.m33552a(obj[a]);
                    this.f37884f = obj;
                    continue;
                case 50:
                    if (this.f37881c == null) {
                        this.f37881c = new ab();
                    }
                    c7213a.m33552a(this.f37881c);
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
