package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4710n extends C0758b {
    public int f24225a;
    public C4702f[] f24226b;
    public boolean f24227c;

    public C4710n() {
        this.f24225a = 0;
        this.f24226b = C4702f.cl_();
        this.f24227c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24226b != null && this.f24226b.length > 0) {
            for (C0757i c0757i : this.f24226b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f24225a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f24227c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24226b != null && this.f24226b.length > 0) {
            for (C0757i c0757i : this.f24226b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f24225a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f24226b == null ? 0 : this.f24226b.length;
                    Object obj = new C4702f[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24226b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4702f();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4702f();
                    aVar.a(obj[a]);
                    this.f24226b = obj;
                    continue;
                case 16:
                    this.f24227c = aVar.e();
                    this.f24225a |= 1;
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
