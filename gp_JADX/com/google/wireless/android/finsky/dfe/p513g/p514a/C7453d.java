package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7453d extends b {
    public int f37849a;
    public String f37850b;
    public ab f37851c;
    public ae f37852d;
    public String f37853e;
    public ai f37854f;
    public ah[] f37855g;
    public int f37856h;
    public ae f37857i;

    public C7453d() {
        this.f37849a = 0;
        this.f37850b = "";
        this.f37851c = null;
        this.f37852d = null;
        this.f37853e = "";
        this.f37854f = null;
        this.f37855g = ah.m35605d();
        this.f37856h = 0;
        this.f37857i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35633a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37849a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37850b);
        }
        if (this.f37852d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37852d);
        }
        if ((this.f37849a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37853e);
        }
        if (this.f37854f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37854f);
        }
        if (this.f37855g != null && this.f37855g.length > 0) {
            for (i iVar : this.f37855g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar);
                }
            }
        }
        if ((this.f37849a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37856h);
        }
        if (this.f37851c != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37851c);
        }
        if (this.f37857i != null) {
            codedOutputByteBufferNano.m33532b(9, this.f37857i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35634b() {
        int b = super.b();
        if ((this.f37849a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37850b);
        }
        if (this.f37852d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37852d);
        }
        if ((this.f37849a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37853e);
        }
        if (this.f37854f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37854f);
        }
        if (this.f37855g != null && this.f37855g.length > 0) {
            int i = b;
            for (i iVar : this.f37855g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(6, iVar);
                }
            }
            b = i;
        }
        if ((this.f37849a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f37856h);
        }
        if (this.f37851c != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37851c);
        }
        if (this.f37857i != null) {
            return b + CodedOutputByteBufferNano.m33503d(9, this.f37857i);
        }
        return b;
    }

    public final /* synthetic */ i m35632a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37850b = c7213a.m33564f();
                    this.f37849a |= 1;
                    continue;
                case 26:
                    if (this.f37852d == null) {
                        this.f37852d = new ae();
                    }
                    c7213a.m33552a(this.f37852d);
                    continue;
                case 34:
                    this.f37853e = c7213a.m33564f();
                    this.f37849a |= 2;
                    continue;
                case 42:
                    if (this.f37854f == null) {
                        this.f37854f = new ai();
                    }
                    c7213a.m33552a(this.f37854f);
                    continue;
                case 50:
                    int a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f37855g == null ? 0 : this.f37855g.length;
                    Object obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37855g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ah();
                    c7213a.m33552a(obj[a]);
                    this.f37855g = obj;
                    continue;
                case 56:
                    this.f37856h = c7213a.m33567i();
                    this.f37849a |= 4;
                    continue;
                case 66:
                    if (this.f37851c == null) {
                        this.f37851c = new ab();
                    }
                    c7213a.m33552a(this.f37851c);
                    continue;
                case 74:
                    if (this.f37857i == null) {
                        this.f37857i = new ae();
                    }
                    c7213a.m33552a(this.f37857i);
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
