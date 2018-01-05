package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7360p extends b {
    public static volatile C7360p[] f36782a;
    public int f36783b;
    public int f36784c;
    public String f36785d;
    public byte[] f36786e;
    public long f36787f;
    public int f36788g;

    public static C7360p[] m34879d() {
        if (f36782a == null) {
            synchronized (C7219h.f35465b) {
                if (f36782a == null) {
                    f36782a = new C7360p[0];
                }
            }
        }
        return f36782a;
    }

    public C7360p() {
        this.f36783b = 0;
        this.f36784c = 0;
        this.f36785d = "";
        this.f36786e = C7222l.f35479l;
        this.f36787f = 0;
        this.f36788g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34881a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36784c);
        if ((this.f36783b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f36786e);
        }
        codedOutputByteBufferNano.m33531b(3, this.f36787f);
        if ((this.f36783b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36788g);
        }
        if ((this.f36783b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36785d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34882b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36784c);
        if ((this.f36783b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f36786e);
        }
        b += CodedOutputByteBufferNano.m33508f(3, this.f36787f);
        if ((this.f36783b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f36788g);
        }
        if ((this.f36783b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36785d);
        }
        return b;
    }

    private final C7360p m34878b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int o = c7213a.m33573o();
                    try {
                        this.f36784c = aw.a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    this.f36786e = c7213a.m33565g();
                    this.f36783b |= 2;
                    continue;
                case 24:
                    this.f36787f = c7213a.m33568j();
                    continue;
                case 32:
                    this.f36788g = c7213a.m33567i();
                    this.f36783b |= 4;
                    continue;
                case 42:
                    this.f36785d = c7213a.m33564f();
                    this.f36783b |= 1;
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

    public final /* synthetic */ i m34880a(C7213a c7213a) {
        return m34878b(c7213a);
    }
}
