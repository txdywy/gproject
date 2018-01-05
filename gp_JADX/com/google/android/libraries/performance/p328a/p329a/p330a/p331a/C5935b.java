package com.google.android.libraries.performance.p328a.p329a.p330a.p331a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C5935b extends C0758b {
    public static volatile C5935b[] f29583a;
    public Integer f29584b;

    public static C5935b[] cy_() {
        if (f29583a == null) {
            synchronized (h.b) {
                if (f29583a == null) {
                    f29583a = new C5935b[0];
                }
            }
        }
        return f29583a;
    }

    public C5935b() {
        this.f29584b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f29584b != null) {
            codedOutputByteBufferNano.a(1, this.f29584b.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f29584b != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f29584b.intValue());
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29584b = Integer.valueOf(aVar.i());
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
