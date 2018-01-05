package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.es;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fp extends b {
    public static volatile fp[] f38998a;
    public int f38999b;
    public cv f39000c;
    public int f39001d;
    public ax f39002e;
    public String f39003f;
    public int f39004g;
    public bd f39005h;
    public es f39006i;

    public static fp[] m36438d() {
        if (f38998a == null) {
            synchronized (C7219h.f35465b) {
                if (f38998a == null) {
                    f38998a = new fp[0];
                }
            }
        }
        return f38998a;
    }

    public final boolean m36442e() {
        return (this.f38999b & 1) != 0;
    }

    public fp() {
        this.f38999b = 0;
        this.f39000c = null;
        this.f39001d = 0;
        this.f39002e = null;
        this.f39003f = "";
        this.f39004g = 0;
        this.f39005h = null;
        this.f39006i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36440a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39002e != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39002e);
        }
        if ((this.f38999b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39003f);
        }
        if ((this.f38999b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f39004g);
        }
        if (this.f39005h != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39005h);
        }
        if ((this.f38999b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f39001d);
        }
        if (this.f39006i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f39006i);
        }
        if (this.f39000c != null) {
            codedOutputByteBufferNano.m33532b(9, this.f39000c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36441b() {
        int b = super.b();
        if (this.f39002e != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39002e);
        }
        if ((this.f38999b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39003f);
        }
        if ((this.f38999b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39004g);
        }
        if (this.f39005h != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39005h);
        }
        if ((this.f38999b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f39001d);
        }
        if (this.f39006i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f39006i);
        }
        if (this.f39000c != null) {
            return b + CodedOutputByteBufferNano.m33503d(9, this.f39000c);
        }
        return b;
    }

    public final /* synthetic */ i m36439a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39002e == null) {
                        this.f39002e = new ax();
                    }
                    c7213a.m33552a(this.f39002e);
                    continue;
                case 18:
                    this.f39003f = c7213a.m33564f();
                    this.f38999b |= 2;
                    continue;
                case 24:
                    this.f39004g = c7213a.m33567i();
                    this.f38999b |= 4;
                    continue;
                case 34:
                    if (this.f39005h == null) {
                        this.f39005h = new bd();
                    }
                    c7213a.m33552a(this.f39005h);
                    continue;
                case 40:
                    this.f39001d = c7213a.m33567i();
                    this.f38999b |= 1;
                    continue;
                case 66:
                    if (this.f39006i == null) {
                        this.f39006i = new es();
                    }
                    c7213a.m33552a(this.f39006i);
                    continue;
                case 74:
                    if (this.f39000c == null) {
                        this.f39000c = new cv();
                    }
                    c7213a.m33552a(this.f39000c);
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
