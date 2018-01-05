package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7479d extends b {
    public int f38073a;
    public bd f38074b;
    public String f38075c;
    public String f38076d;
    public C7478c[] f38077e;
    public String f38078f;
    public String f38079g;
    public cv f38080h;
    public String f38081i;

    public C7479d() {
        this.f38073a = 0;
        this.f38074b = null;
        this.f38075c = "";
        this.f38076d = "";
        this.f38077e = C7478c.m35782d();
        this.f38078f = "";
        this.f38079g = "";
        this.f38080h = null;
        this.f38081i = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35787a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38074b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38074b);
        }
        if ((this.f38073a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38075c);
        }
        if ((this.f38073a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38076d);
        }
        if (this.f38077e != null && this.f38077e.length > 0) {
            for (i iVar : this.f38077e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if ((this.f38073a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38078f);
        }
        if ((this.f38073a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38079g);
        }
        if (this.f38080h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f38080h);
        }
        if ((this.f38073a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38081i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35788b() {
        int b = super.b();
        if (this.f38074b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38074b);
        }
        if ((this.f38073a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38075c);
        }
        if ((this.f38073a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38076d);
        }
        if (this.f38077e != null && this.f38077e.length > 0) {
            int i = b;
            for (i iVar : this.f38077e) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i;
        }
        if ((this.f38073a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38078f);
        }
        if ((this.f38073a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38079g);
        }
        if (this.f38080h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38080h);
        }
        if ((this.f38073a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f38081i);
        }
        return b;
    }

    public final /* synthetic */ i m35786a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38074b == null) {
                        this.f38074b = new bd();
                    }
                    c7213a.m33552a(this.f38074b);
                    continue;
                case 18:
                    this.f38075c = c7213a.m33564f();
                    this.f38073a |= 1;
                    continue;
                case 26:
                    this.f38076d = c7213a.m33564f();
                    this.f38073a |= 2;
                    continue;
                case 34:
                    int a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f38077e == null ? 0 : this.f38077e.length;
                    Object obj = new C7478c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38077e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7478c();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7478c();
                    c7213a.m33552a(obj[a]);
                    this.f38077e = obj;
                    continue;
                case 42:
                    this.f38078f = c7213a.m33564f();
                    this.f38073a |= 4;
                    continue;
                case 50:
                    this.f38079g = c7213a.m33564f();
                    this.f38073a |= 8;
                    continue;
                case 58:
                    if (this.f38080h == null) {
                        this.f38080h = new cv();
                    }
                    c7213a.m33552a(this.f38080h);
                    continue;
                case 66:
                    this.f38081i = c7213a.m33564f();
                    this.f38073a |= 16;
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
