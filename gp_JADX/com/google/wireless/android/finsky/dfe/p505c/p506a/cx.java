package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cx extends b {
    public int f37374a;
    public cy[] f37375b;
    public ee f37376c;
    public byte[] f37377d;
    public bl f37378e;

    public cx() {
        this.f37374a = 0;
        this.f37375b = cy.m35331d();
        this.f37376c = null;
        this.f37377d = C7222l.f35479l;
        this.f37378e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35329a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37375b != null && this.f37375b.length > 0) {
            for (i iVar : this.f37375b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37376c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37376c);
        }
        if ((this.f37374a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37377d);
        }
        if (this.f37378e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37378e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35330b() {
        int b = super.b();
        if (this.f37375b != null && this.f37375b.length > 0) {
            for (i iVar : this.f37375b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f37376c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37376c);
        }
        if ((this.f37374a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37377d);
        }
        if (this.f37378e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37378e);
        }
        return b;
    }

    public final /* synthetic */ i m35328a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37375b == null ? 0 : this.f37375b.length;
                    Object obj = new cy[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37375b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cy();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cy();
                    c7213a.m33552a(obj[a]);
                    this.f37375b = obj;
                    continue;
                case 18:
                    if (this.f37376c == null) {
                        this.f37376c = new ee();
                    }
                    c7213a.m33552a(this.f37376c);
                    continue;
                case 26:
                    this.f37377d = c7213a.m33565g();
                    this.f37374a |= 1;
                    continue;
                case 34:
                    if (this.f37378e == null) {
                        this.f37378e = new bl();
                    }
                    c7213a.m33552a(this.f37378e);
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
