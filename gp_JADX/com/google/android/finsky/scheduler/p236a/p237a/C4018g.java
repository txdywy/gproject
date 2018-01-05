package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C4018g extends C0758b {
    public static volatile C4018g[] f20184a;
    public int f20185b;
    public long f20186c;
    public boolean f20187d;
    public boolean f20188e;
    public boolean f20189f;
    public long f20190g;

    public static C4018g[] bW_() {
        if (f20184a == null) {
            synchronized (h.b) {
                if (f20184a == null) {
                    f20184a = new C4018g[0];
                }
            }
        }
        return f20184a;
    }

    public C4018g() {
        this.f20185b = 0;
        this.f20186c = 0;
        this.f20187d = false;
        this.f20188e = false;
        this.f20189f = false;
        this.f20190g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f20185b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f20186c);
        }
        if ((this.f20185b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f20187d);
        }
        if ((this.f20185b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f20188e);
        }
        if ((this.f20185b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f20189f);
        }
        if ((this.f20185b & 16) != 0) {
            codedOutputByteBufferNano.b(5, this.f20190g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f20185b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f20186c);
        }
        if ((this.f20185b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f20185b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f20185b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f20185b & 16) != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f20190g);
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
                    this.f20186c = aVar.j();
                    this.f20185b |= 1;
                    continue;
                case 16:
                    this.f20187d = aVar.e();
                    this.f20185b |= 2;
                    continue;
                case 24:
                    this.f20188e = aVar.e();
                    this.f20185b |= 4;
                    continue;
                case 32:
                    this.f20189f = aVar.e();
                    this.f20185b |= 8;
                    continue;
                case 40:
                    this.f20190g = aVar.j();
                    this.f20185b |= 16;
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
