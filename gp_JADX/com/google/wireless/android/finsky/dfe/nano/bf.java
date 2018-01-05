package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bf extends b {
    public static volatile bf[] f38420a;
    public int f38421b;
    public String f38422c;
    public String f38423d;

    public static bf[] m36065d() {
        if (f38420a == null) {
            synchronized (C7219h.f35465b) {
                if (f38420a == null) {
                    f38420a = new bf[0];
                }
            }
        }
        return f38420a;
    }

    public bf() {
        this.f38421b = 0;
        this.f38422c = "";
        this.f38423d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36067a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38421b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38422c);
        }
        if ((this.f38421b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38423d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36068b() {
        int b = super.b();
        if ((this.f38421b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38422c);
        }
        if ((this.f38421b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38423d);
        }
        return b;
    }

    public final /* synthetic */ i m36066a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38422c = c7213a.m33564f();
                    this.f38421b |= 1;
                    continue;
                case 18:
                    this.f38423d = c7213a.m33564f();
                    this.f38421b |= 2;
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
