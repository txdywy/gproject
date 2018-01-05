package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dj extends b {
    public static volatile dj[] f38649a;
    public int f38650b;
    public String f38651c;
    public int f38652d;
    public byte[] f38653e;

    public static dj[] m36246d() {
        if (f38649a == null) {
            synchronized (C7219h.f35465b) {
                if (f38649a == null) {
                    f38649a = new dj[0];
                }
            }
        }
        return f38649a;
    }

    public final dj m36249a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f38650b |= 1;
        this.f38651c = str;
        return this;
    }

    public final dj m36248a(int i) {
        this.f38650b |= 2;
        this.f38652d = i;
        return this;
    }

    public dj() {
        this.f38650b = 0;
        this.f38651c = "";
        this.f38652d = 0;
        this.f38653e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36250a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38650b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38651c);
        }
        if ((this.f38650b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38652d);
        }
        if ((this.f38650b & 4) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f38653e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36251b() {
        int b = super.b();
        if ((this.f38650b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38651c);
        }
        if ((this.f38650b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38652d);
        }
        if ((this.f38650b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(3, this.f38653e);
        }
        return b;
    }

    public final /* synthetic */ i m36247a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38651c = c7213a.m33564f();
                    this.f38650b |= 1;
                    continue;
                case 16:
                    this.f38652d = c7213a.m33567i();
                    this.f38650b |= 2;
                    continue;
                case 26:
                    this.f38653e = c7213a.m33565g();
                    this.f38650b |= 4;
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
