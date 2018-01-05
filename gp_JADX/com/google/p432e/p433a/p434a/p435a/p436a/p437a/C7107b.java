package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7107b extends b {
    public static volatile C7107b[] f34766a;
    public String f34767b;

    public static C7107b[] m32296d() {
        if (f34766a == null) {
            synchronized (C7219h.f35465b) {
                if (f34766a == null) {
                    f34766a = new C7107b[0];
                }
            }
        }
        return f34766a;
    }

    public C7107b() {
        this.f34767b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m32298a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34767b == null || this.f34767b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34767b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32299b() {
        int b = super.b();
        if (this.f34767b == null || this.f34767b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(1, this.f34767b);
    }

    public final /* synthetic */ i m32297a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34767b = c7213a.m33564f();
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
