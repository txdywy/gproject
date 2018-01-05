package com.google.wireless.android.finsky.dfe.p507d.p508a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7437a extends b {
    public static volatile C7437a[] f37726a;
    public int f37727b;
    public String f37728c;

    public static C7437a[] m35534d() {
        if (f37726a == null) {
            synchronized (C7219h.f35465b) {
                if (f37726a == null) {
                    f37726a = new C7437a[0];
                }
            }
        }
        return f37726a;
    }

    public C7437a() {
        this.f37727b = 0;
        this.f37728c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35536a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37727b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37728c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35537b() {
        int b = super.b();
        if ((this.f37727b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f37728c);
        }
        return b;
    }

    public final /* synthetic */ i m35535a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37728c = c7213a.m33564f();
                    this.f37727b |= 1;
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
