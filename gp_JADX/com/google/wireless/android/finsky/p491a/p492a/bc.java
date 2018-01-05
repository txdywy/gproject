package com.google.wireless.android.finsky.p491a.p492a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bc extends b {
    public int f36449a;
    public int f36450b;
    public byte[] f36451c;
    public long f36452d;
    public boolean f36453e;
    public ax f36454f;
    public byte[] f36455g;
    public int f36456h;

    public static int m34694a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Rank");
        }
    }

    public bc() {
        this.f36449a = -1;
        this.f36450b = 0;
        this.f36449a = -1;
        this.f36451c = C7222l.f35479l;
        this.f36449a = -1;
        this.f36452d = 0;
        this.f36449a = -1;
        this.f36453e = false;
        this.f36454f = null;
        this.f36455g = C7222l.f35479l;
        this.f36456h = 1;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34697a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36449a == 0) {
            codedOutputByteBufferNano.m33523a(1, this.f36451c);
        }
        if (this.f36454f != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36454f);
        }
        if (this.f36449a == 1) {
            codedOutputByteBufferNano.m33531b(3, this.f36452d);
        }
        if ((this.f36450b & 8) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f36455g);
        }
        if (this.f36449a == 2) {
            codedOutputByteBufferNano.m33522a(5, this.f36453e);
        }
        if ((this.f36450b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36456h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34698b() {
        int b = super.b();
        if (this.f36449a == 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f36451c);
        }
        if (this.f36454f != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36454f);
        }
        if (this.f36449a == 1) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36452d);
        }
        if ((this.f36450b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f36455g);
        }
        if (this.f36449a == 2) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f36450b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f36456h);
        }
        return b;
    }

    private final bc m34695b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36451c = c7213a.m33565g();
                    this.f36449a = 0;
                    continue;
                case 18:
                    if (this.f36454f == null) {
                        this.f36454f = new ax();
                    }
                    c7213a.m33552a(this.f36454f);
                    continue;
                case 24:
                    this.f36452d = c7213a.m33568j();
                    this.f36449a = 1;
                    continue;
                case 34:
                    this.f36455g = c7213a.m33565g();
                    this.f36450b |= 8;
                    continue;
                case 40:
                    this.f36453e = c7213a.m33563e();
                    this.f36449a = 2;
                    continue;
                case 48:
                    this.f36450b |= 16;
                    int o = c7213a.m33573o();
                    try {
                        this.f36456h = bc.m34694a(c7213a.m33567i());
                        this.f36450b |= 16;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m34696a(C7213a c7213a) {
        return m34695b(c7213a);
    }
}
