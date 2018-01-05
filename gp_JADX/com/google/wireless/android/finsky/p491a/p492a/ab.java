package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public int f36324a;
    public aa[] f36325b;
    public String f36326c;

    public ab() {
        this.f36324a = 0;
        this.f36325b = aa.m34598d();
        this.f36326c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34603a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36325b != null && this.f36325b.length > 0) {
            for (i iVar : this.f36325b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f36324a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36326c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34604b() {
        int b = super.b();
        if (this.f36325b != null && this.f36325b.length > 0) {
            for (i iVar : this.f36325b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f36324a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36326c);
        }
        return b;
    }

    public final /* synthetic */ i m34602a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36325b == null ? 0 : this.f36325b.length;
                    Object obj = new aa[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36325b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new aa();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new aa();
                    c7213a.m33552a(obj[a]);
                    this.f36325b = obj;
                    continue;
                case 18:
                    this.f36326c = c7213a.m33564f();
                    this.f36324a |= 1;
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
