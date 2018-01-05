package com.google.wireless.android.finsky.dfe.p498b.p499a.p500a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p498b.p499a.p501b.p502a.C7405a;
import com.google.wireless.android.finsky.dfe.p498b.p499a.p501b.p502a.C7406b;

public final class C7404a extends b {
    public C7405a f36972a;
    public C7406b f36973b;

    public C7404a() {
        this.f36972a = null;
        this.f36973b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35038a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36972a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36972a);
        }
        if (this.f36973b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36973b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35039b() {
        int b = super.b();
        if (this.f36972a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36972a);
        }
        if (this.f36973b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f36973b);
        }
        return b;
    }

    public final /* synthetic */ i m35037a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36972a == null) {
                        this.f36972a = new C7405a();
                    }
                    c7213a.m33552a(this.f36972a);
                    continue;
                case 18:
                    if (this.f36973b == null) {
                        this.f36973b = new C7406b();
                    }
                    c7213a.m33552a(this.f36973b);
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
