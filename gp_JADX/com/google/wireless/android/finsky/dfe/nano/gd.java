package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gd extends b {
    public static volatile gd[] f39070a;
    public int f39071b;
    public String f39072c;
    public String f39073d;
    public String f39074e;

    public static gd[] m36485d() {
        if (f39070a == null) {
            synchronized (C7219h.f35465b) {
                if (f39070a == null) {
                    f39070a = new gd[0];
                }
            }
        }
        return f39070a;
    }

    public gd() {
        this.f39071b = 0;
        this.f39072c = "";
        this.f39073d = "";
        this.f39074e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36487a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39071b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39072c);
        }
        if ((this.f39071b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39073d);
        }
        if ((this.f39071b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39074e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36488b() {
        int b = super.b();
        if ((this.f39071b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39072c);
        }
        if ((this.f39071b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39073d);
        }
        if ((this.f39071b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f39074e);
        }
        return b;
    }

    public final /* synthetic */ i m36486a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39072c = c7213a.m33564f();
                    this.f39071b |= 1;
                    continue;
                case 18:
                    this.f39073d = c7213a.m33564f();
                    this.f39071b |= 2;
                    continue;
                case 26:
                    this.f39074e = c7213a.m33564f();
                    this.f39071b |= 4;
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
