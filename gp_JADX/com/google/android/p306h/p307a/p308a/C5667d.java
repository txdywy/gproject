package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C5667d extends C0758b {
    public static volatile C5667d[] f28741a;
    public Long f28742b;
    public Long f28743c;

    public static C5667d[] m26862a() {
        if (f28741a == null) {
            synchronized (h.b) {
                if (f28741a == null) {
                    f28741a = new C5667d[0];
                }
            }
        }
        return f28741a;
    }

    public C5667d() {
        this.f28742b = null;
        this.f28743c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28742b != null) {
            codedOutputByteBufferNano.b(1, this.f28742b.longValue());
        }
        if (this.f28743c != null) {
            codedOutputByteBufferNano.b(2, this.f28743c.longValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28742b != null) {
            b += CodedOutputByteBufferNano.f(1, this.f28742b.longValue());
        }
        if (this.f28743c != null) {
            return b + CodedOutputByteBufferNano.f(2, this.f28743c.longValue());
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
                    this.f28742b = Long.valueOf(aVar.j());
                    continue;
                case 16:
                    this.f28743c = Long.valueOf(aVar.j());
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
