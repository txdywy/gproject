package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class C7481f extends b {
    public int f38087a;
    public C7367w[] f38088b;
    public String f38089c;
    public String f38090d;

    public final boolean m35795d() {
        return (this.f38087a & 1) != 0;
    }

    public C7481f() {
        this.f38087a = 0;
        this.f38088b = C7367w.m34905d();
        this.f38089c = "";
        this.f38090d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35793a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38088b != null && this.f38088b.length > 0) {
            for (i iVar : this.f38088b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38087a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38089c);
        }
        if ((this.f38087a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38090d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35794b() {
        int b = super.b();
        if (this.f38088b != null && this.f38088b.length > 0) {
            for (i iVar : this.f38088b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38087a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38089c);
        }
        if ((this.f38087a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38090d);
        }
        return b;
    }

    public final /* synthetic */ i m35792a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38088b == null ? 0 : this.f38088b.length;
                    Object obj = new C7367w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38088b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7367w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7367w();
                    c7213a.m33552a(obj[a]);
                    this.f38088b = obj;
                    continue;
                case 18:
                    this.f38089c = c7213a.m33564f();
                    this.f38087a |= 1;
                    continue;
                case 26:
                    this.f38090d = c7213a.m33564f();
                    this.f38087a |= 2;
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
