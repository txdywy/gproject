package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7457h extends b {
    public int f37867a;
    public String f37868b;
    public ab f37869c;
    public ae f37870d;
    public ai f37871e;
    public ae[] f37872f;

    public C7457h() {
        this.f37867a = 0;
        this.f37868b = "";
        this.f37869c = null;
        this.f37870d = null;
        this.f37871e = null;
        this.f37872f = ae.m35591d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35644a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37867a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37868b);
        }
        if (this.f37869c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37869c);
        }
        if (this.f37870d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37870d);
        }
        if (this.f37871e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37871e);
        }
        if (this.f37872f != null && this.f37872f.length > 0) {
            for (i iVar : this.f37872f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35645b() {
        int b = super.b();
        if ((this.f37867a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37868b);
        }
        if (this.f37869c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37869c);
        }
        if (this.f37870d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37870d);
        }
        if (this.f37871e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37871e);
        }
        if (this.f37872f == null || this.f37872f.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f37872f) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(5, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35643a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37868b = c7213a.m33564f();
                    this.f37867a |= 1;
                    continue;
                case 18:
                    if (this.f37869c == null) {
                        this.f37869c = new ab();
                    }
                    c7213a.m33552a(this.f37869c);
                    continue;
                case 26:
                    if (this.f37870d == null) {
                        this.f37870d = new ae();
                    }
                    c7213a.m33552a(this.f37870d);
                    continue;
                case 34:
                    if (this.f37871e == null) {
                        this.f37871e = new ai();
                    }
                    c7213a.m33552a(this.f37871e);
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f37872f == null ? 0 : this.f37872f.length;
                    Object obj = new ae[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37872f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ae();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ae();
                    c7213a.m33552a(obj[a]);
                    this.f37872f = obj;
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
