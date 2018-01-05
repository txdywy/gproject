package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public int f38056a;
    public ap[] f38057b;
    public String f38058c;

    public aq() {
        this.f38056a = 0;
        this.f38057b = ap.m35768d();
        this.f38058c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35773a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38057b != null && this.f38057b.length > 0) {
            for (i iVar : this.f38057b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38056a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38058c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35774b() {
        int b = super.b();
        if (this.f38057b != null && this.f38057b.length > 0) {
            for (i iVar : this.f38057b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38056a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38058c);
        }
        return b;
    }

    public final /* synthetic */ i m35772a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38057b == null ? 0 : this.f38057b.length;
                    Object obj = new ap[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38057b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ap();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ap();
                    c7213a.m33552a(obj[a]);
                    this.f38057b = obj;
                    continue;
                case 18:
                    this.f38058c = c7213a.m33564f();
                    this.f38056a |= 1;
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
