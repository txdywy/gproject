package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4717u extends C0758b {
    public int f24261a;
    public C4718v[] f24262b;
    public long f24263c;
    public boolean f24264d;
    public int f24265e;

    public final C4717u m21949a(long j) {
        this.f24261a |= 1;
        this.f24263c = j;
        return this;
    }

    public C4717u() {
        this.f24261a = 0;
        this.f24262b = C4718v.cs_();
        this.f24263c = 0;
        this.f24264d = false;
        this.f24265e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24262b != null && this.f24262b.length > 0) {
            for (C0757i c0757i : this.f24262b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f24261a & 1) != 0) {
            codedOutputByteBufferNano.b(2, this.f24263c);
        }
        if ((this.f24261a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f24264d);
        }
        if ((this.f24261a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f24265e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24262b != null && this.f24262b.length > 0) {
            for (C0757i c0757i : this.f24262b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f24261a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f24263c);
        }
        if ((this.f24261a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f24261a & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(4, this.f24265e);
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
                    a = this.f24262b == null ? 0 : this.f24262b.length;
                    Object obj = new C4718v[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24262b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4718v();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4718v();
                    aVar.a(obj[a]);
                    this.f24262b = obj;
                    continue;
                case 16:
                    this.f24263c = aVar.j();
                    this.f24261a |= 1;
                    continue;
                case 24:
                    this.f24264d = aVar.e();
                    this.f24261a |= 2;
                    continue;
                case 32:
                    this.f24265e = aVar.i();
                    this.f24261a |= 4;
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
