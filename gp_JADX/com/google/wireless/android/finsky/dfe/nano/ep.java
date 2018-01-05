package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ep extends b {
    public static volatile ep[] f38796a;
    public int f38797b;
    public cv f38798c;
    public String f38799d;
    public boolean f38800e;
    public String f38801f;
    public boolean f38802g;

    public static ep[] m36350d() {
        if (f38796a == null) {
            synchronized (C7219h.f35465b) {
                if (f38796a == null) {
                    f38796a = new ep[0];
                }
            }
        }
        return f38796a;
    }

    public ep() {
        this.f38797b = 0;
        this.f38798c = null;
        this.f38799d = "";
        this.f38800e = false;
        this.f38801f = "";
        this.f38802g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36352a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38798c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38798c);
        }
        if ((this.f38797b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38799d);
        }
        if ((this.f38797b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f38800e);
        }
        if ((this.f38797b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38801f);
        }
        if ((this.f38797b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f38802g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36353b() {
        int b = super.b();
        if (this.f38798c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38798c);
        }
        if ((this.f38797b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38799d);
        }
        if ((this.f38797b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f38797b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38801f);
        }
        if ((this.f38797b & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36351a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38798c == null) {
                        this.f38798c = new cv();
                    }
                    c7213a.m33552a(this.f38798c);
                    continue;
                case 18:
                    this.f38799d = c7213a.m33564f();
                    this.f38797b |= 1;
                    continue;
                case 24:
                    this.f38800e = c7213a.m33563e();
                    this.f38797b |= 2;
                    continue;
                case 34:
                    this.f38801f = c7213a.m33564f();
                    this.f38797b |= 4;
                    continue;
                case 40:
                    this.f38802g = c7213a.m33563e();
                    this.f38797b |= 8;
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
