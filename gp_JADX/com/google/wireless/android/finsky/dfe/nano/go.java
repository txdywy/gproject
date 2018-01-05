package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class go extends b {
    public static volatile go[] f39110a;
    public int f39111b;
    public int f39112c;
    public String f39113d;

    public static go[] m36520d() {
        if (f39110a == null) {
            synchronized (C7219h.f35465b) {
                if (f39110a == null) {
                    f39110a = new go[0];
                }
            }
        }
        return f39110a;
    }

    public go() {
        this.f39111b = 0;
        this.f39112c = 0;
        this.f39113d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36522a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39111b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f39112c);
        }
        if ((this.f39111b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39113d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36523b() {
        int b = super.b();
        if ((this.f39111b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39112c);
        }
        if ((this.f39111b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f39113d);
        }
        return b;
    }

    public final /* synthetic */ i m36521a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39112c = c7213a.m33567i();
                    this.f39111b |= 1;
                    continue;
                case 18:
                    this.f39113d = c7213a.m33564f();
                    this.f39111b |= 2;
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
