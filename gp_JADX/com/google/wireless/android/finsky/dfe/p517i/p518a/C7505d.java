package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7505d extends b {
    public static volatile C7505d[] f38190a;
    public ax f38191b;
    public C7503b f38192c;

    public static C7505d[] m35882d() {
        if (f38190a == null) {
            synchronized (C7219h.f35465b) {
                if (f38190a == null) {
                    f38190a = new C7505d[0];
                }
            }
        }
        return f38190a;
    }

    public C7505d() {
        this.f38191b = null;
        this.f38192c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35884a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38191b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38191b);
        }
        if (this.f38192c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38192c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35885b() {
        int b = super.b();
        if (this.f38191b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38191b);
        }
        if (this.f38192c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38192c);
        }
        return b;
    }

    public final /* synthetic */ i m35883a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38191b == null) {
                        this.f38191b = new ax();
                    }
                    c7213a.m33552a(this.f38191b);
                    continue;
                case 18:
                    if (this.f38192c == null) {
                        this.f38192c = new C7503b();
                    }
                    c7213a.m33552a(this.f38192c);
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
