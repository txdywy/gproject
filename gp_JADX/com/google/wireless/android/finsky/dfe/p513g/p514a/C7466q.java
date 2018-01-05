package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7466q extends b {
    public int f37902a;
    public af[] f37903b;
    public String f37904c;
    public ae f37905d;
    public ai f37906e;

    public C7466q() {
        this.f37902a = 0;
        this.f37903b = af.m35597d();
        this.f37904c = "";
        this.f37905d = null;
        this.f37906e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35667a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37902a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37904c);
        }
        if (this.f37905d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37905d);
        }
        if (this.f37903b != null && this.f37903b.length > 0) {
            for (i iVar : this.f37903b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (this.f37906e != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37906e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35668b() {
        int b = super.b();
        if ((this.f37902a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37904c);
        }
        if (this.f37905d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37905d);
        }
        if (this.f37903b != null && this.f37903b.length > 0) {
            int i = b;
            for (i iVar : this.f37903b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if (this.f37906e != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37906e);
        }
        return b;
    }

    public final /* synthetic */ i m35666a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    this.f37904c = c7213a.m33564f();
                    this.f37902a |= 1;
                    continue;
                case 26:
                    if (this.f37905d == null) {
                        this.f37905d = new ae();
                    }
                    c7213a.m33552a(this.f37905d);
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f37903b == null ? 0 : this.f37903b.length;
                    Object obj = new af[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37903b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new af();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new af();
                    c7213a.m33552a(obj[a]);
                    this.f37903b = obj;
                    continue;
                case 50:
                    if (this.f37906e == null) {
                        this.f37906e = new ai();
                    }
                    c7213a.m33552a(this.f37906e);
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
