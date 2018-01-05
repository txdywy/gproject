package com.google.p443h.p447b.p448a.p449a.p450a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7149a extends b {
    public byte[] f34920a;
    public C7150b[] f34921b;
    public String f34922c;

    public C7149a() {
        this.f34920a = C7222l.f35479l;
        this.f34921b = C7150b.m32428d();
        this.f34922c = "";
        this.aP = -1;
    }

    public final void m32426a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f34920a, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(1, this.f34920a);
        }
        if (this.f34921b != null && this.f34921b.length > 0) {
            for (i iVar : this.f34921b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (!(this.f34922c == null || this.f34922c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f34922c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32427b() {
        int b = super.b();
        if (!Arrays.equals(this.f34920a, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f34920a);
        }
        if (this.f34921b != null && this.f34921b.length > 0) {
            int i = b;
            for (i iVar : this.f34921b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f34922c == null || this.f34922c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f34922c);
    }

    public final /* synthetic */ i m32425a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34920a = c7213a.m33565g();
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f34921b == null ? 0 : this.f34921b.length;
                    Object obj = new C7150b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34921b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7150b();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7150b();
                    c7213a.m33552a(obj[a]);
                    this.f34921b = obj;
                    continue;
                case 26:
                    this.f34922c = c7213a.m33564f();
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
