package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p498b.p499a.p500a.C7404a;
import com.google.wireless.android.finsky.dfe.p498b.p503b.p504a.C7407a;

public final class C7398l extends b {
    public C7404a f36953a;
    public C7407a[] f36954b;

    public C7398l() {
        this.f36953a = null;
        this.f36954b = C7407a.m35046d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35016a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36953a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36953a);
        }
        if (this.f36954b != null && this.f36954b.length > 0) {
            for (i iVar : this.f36954b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35017b() {
        int b = super.b();
        if (this.f36953a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36953a);
        }
        if (this.f36954b == null || this.f36954b.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36954b) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35015a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36953a == null) {
                        this.f36953a = new C7404a();
                    }
                    c7213a.m33552a(this.f36953a);
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36954b == null ? 0 : this.f36954b.length;
                    Object obj = new C7407a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36954b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7407a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7407a();
                    c7213a.m33552a(obj[a]);
                    this.f36954b = obj;
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
