package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cr extends b {
    public static volatile cr[] f38593a;
    public int f38594b;
    public String f38595c;
    public byte[] f38596d;
    public String f38597e;

    public static cr[] m36187d() {
        if (f38593a == null) {
            synchronized (C7219h.f35465b) {
                if (f38593a == null) {
                    f38593a = new cr[0];
                }
            }
        }
        return f38593a;
    }

    public cr() {
        this.f38594b = 0;
        this.f38595c = "";
        this.f38596d = C7222l.f35479l;
        this.f38597e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36189a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38594b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38595c);
        }
        if ((this.f38594b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38596d);
        }
        if ((this.f38594b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38597e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36190b() {
        int b = super.b();
        if ((this.f38594b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38595c);
        }
        if ((this.f38594b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f38596d);
        }
        if ((this.f38594b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38597e);
        }
        return b;
    }

    public final /* synthetic */ i m36188a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38595c = c7213a.m33564f();
                    this.f38594b |= 1;
                    continue;
                case 18:
                    this.f38596d = c7213a.m33565g();
                    this.f38594b |= 2;
                    continue;
                case 26:
                    this.f38597e = c7213a.m33564f();
                    this.f38594b |= 4;
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
