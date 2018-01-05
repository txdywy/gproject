package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public int f37991a;
    public String f37992b;
    public String f37993c;
    public long f37994d;
    public ae[] f37995e;
    public ae f37996f;

    public aa() {
        this.f37991a = 0;
        this.f37992b = "";
        this.f37993c = "";
        this.f37994d = 0;
        this.f37995e = ae.m35734d();
        this.f37996f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35720a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37991a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37992b);
        }
        if ((this.f37991a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37993c);
        }
        if ((this.f37991a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f37994d);
        }
        if (this.f37995e != null && this.f37995e.length > 0) {
            for (i iVar : this.f37995e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f37996f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37996f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35721b() {
        int b = super.b();
        if ((this.f37991a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37992b);
        }
        if ((this.f37991a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37993c);
        }
        if ((this.f37991a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f37994d);
        }
        if (this.f37995e != null && this.f37995e.length > 0) {
            int i = b;
            for (i iVar : this.f37995e) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i;
        }
        if (this.f37996f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37996f);
        }
        return b;
    }

    public final /* synthetic */ i m35719a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37992b = c7213a.m33564f();
                    this.f37991a |= 1;
                    continue;
                case 18:
                    this.f37993c = c7213a.m33564f();
                    this.f37991a |= 2;
                    continue;
                case 24:
                    this.f37994d = c7213a.m33568j();
                    this.f37991a |= 4;
                    continue;
                case 34:
                    int a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f37995e == null ? 0 : this.f37995e.length;
                    Object obj = new ae[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37995e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ae();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ae();
                    c7213a.m33552a(obj[a]);
                    this.f37995e = obj;
                    continue;
                case 42:
                    if (this.f37996f == null) {
                        this.f37996f = new ae();
                    }
                    c7213a.m33552a(this.f37996f);
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
