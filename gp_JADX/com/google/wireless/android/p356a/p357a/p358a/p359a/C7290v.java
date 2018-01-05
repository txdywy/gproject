package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7290v extends b {
    public static volatile C7290v[] f36164a;
    public int f36165b;
    public String f36166c;
    public int f36167d;
    public long f36168e;

    public static C7290v[] m34475d() {
        if (f36164a == null) {
            synchronized (C7219h.f35465b) {
                if (f36164a == null) {
                    f36164a = new C7290v[0];
                }
            }
        }
        return f36164a;
    }

    public final C7290v m34479a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36165b |= 1;
        this.f36166c = str;
        return this;
    }

    public final C7290v m34477a(int i) {
        this.f36165b |= 2;
        this.f36167d = i;
        return this;
    }

    public final C7290v m34478a(long j) {
        this.f36165b |= 4;
        this.f36168e = j;
        return this;
    }

    public C7290v() {
        this.f36165b = 0;
        this.f36166c = "";
        this.f36167d = 0;
        this.f36168e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34480a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36165b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36166c);
        }
        if ((this.f36165b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36167d);
        }
        if ((this.f36165b & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36168e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34481b() {
        int b = super.b();
        if ((this.f36165b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36166c);
        }
        if ((this.f36165b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36167d);
        }
        if ((this.f36165b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f36168e);
        }
        return b;
    }

    public final /* synthetic */ i m34476a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36166c = c7213a.m33564f();
                    this.f36165b |= 1;
                    continue;
                case 16:
                    this.f36167d = c7213a.m33567i();
                    this.f36165b |= 2;
                    continue;
                case 24:
                    this.f36168e = c7213a.m33568j();
                    this.f36165b |= 4;
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
