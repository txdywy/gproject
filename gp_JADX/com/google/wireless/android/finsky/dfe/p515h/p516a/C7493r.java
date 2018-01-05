package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7493r extends b {
    public int f38131a;
    public String f38132b;
    public String f38133c;
    public C7494s[] f38134d;

    public C7493r() {
        this.f38131a = 0;
        this.f38132b = "";
        this.f38133c = "";
        this.f38134d = C7494s.m35843d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35841a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38131a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38132b);
        }
        if ((this.f38131a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38133c);
        }
        if (this.f38134d != null && this.f38134d.length > 0) {
            for (i iVar : this.f38134d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35842b() {
        int b = super.b();
        if ((this.f38131a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38132b);
        }
        if ((this.f38131a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38133c);
        }
        if (this.f38134d == null || this.f38134d.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38134d) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(3, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35840a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38132b = c7213a.m33564f();
                    this.f38131a |= 1;
                    continue;
                case 18:
                    this.f38133c = c7213a.m33564f();
                    this.f38131a |= 2;
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38134d == null ? 0 : this.f38134d.length;
                    Object obj = new C7494s[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38134d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7494s();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7494s();
                    c7213a.m33552a(obj[a]);
                    this.f38134d = obj;
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
