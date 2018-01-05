package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7401o extends b {
    public static volatile C7401o[] f36963a;
    public int f36964b;
    public String f36965c;

    public static C7401o[] m35026d() {
        if (f36963a == null) {
            synchronized (C7219h.f35465b) {
                if (f36963a == null) {
                    f36963a = new C7401o[0];
                }
            }
        }
        return f36963a;
    }

    public C7401o() {
        this.f36964b = 0;
        this.f36965c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35028a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36964b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36965c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35029b() {
        int b = super.b();
        if ((this.f36964b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36965c);
        }
        return b;
    }

    public final /* synthetic */ i m35027a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36965c = c7213a.m33564f();
                    this.f36964b |= 1;
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
