package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4715s extends C0758b {
    public int f24251a;
    public C4699c[] f24252b;
    public boolean f24253c;
    public long f24254d;
    public long f24255e;
    public boolean f24256f;
    public boolean f24257g;
    public C4698b f24258h;
    public boolean f24259i;

    public C4715s() {
        this.f24251a = 0;
        this.f24252b = C4699c.ch_();
        this.f24253c = false;
        this.f24254d = 0;
        this.f24255e = 0;
        this.f24256f = false;
        this.f24257g = false;
        this.f24258h = null;
        this.f24259i = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24252b != null && this.f24252b.length > 0) {
            for (C0757i c0757i : this.f24252b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f24251a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f24253c);
        }
        if ((this.f24251a & 2) != 0) {
            codedOutputByteBufferNano.b(3, this.f24254d);
        }
        if ((this.f24251a & 4) != 0) {
            codedOutputByteBufferNano.b(4, this.f24255e);
        }
        if ((this.f24251a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f24256f);
        }
        if ((this.f24251a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f24257g);
        }
        if (this.f24258h != null) {
            codedOutputByteBufferNano.b(7, this.f24258h);
        }
        if ((this.f24251a & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f24259i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24252b != null && this.f24252b.length > 0) {
            for (C0757i c0757i : this.f24252b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f24251a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f24251a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(3, this.f24254d);
        }
        if ((this.f24251a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f24255e);
        }
        if ((this.f24251a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f24251a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f24258h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f24258h);
        }
        if ((this.f24251a & 32) != 0) {
            return b + (CodedOutputByteBufferNano.d(8) + 1);
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
                    a = this.f24252b == null ? 0 : this.f24252b.length;
                    Object obj = new C4699c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24252b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4699c();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4699c();
                    aVar.a(obj[a]);
                    this.f24252b = obj;
                    continue;
                case 16:
                    this.f24253c = aVar.e();
                    this.f24251a |= 1;
                    continue;
                case 24:
                    this.f24254d = aVar.j();
                    this.f24251a |= 2;
                    continue;
                case 32:
                    this.f24255e = aVar.j();
                    this.f24251a |= 4;
                    continue;
                case 40:
                    this.f24256f = aVar.e();
                    this.f24251a |= 8;
                    continue;
                case 48:
                    this.f24257g = aVar.e();
                    this.f24251a |= 16;
                    continue;
                case 58:
                    if (this.f24258h == null) {
                        this.f24258h = new C4698b();
                    }
                    aVar.a(this.f24258h);
                    continue;
                case 64:
                    this.f24259i = aVar.e();
                    this.f24251a |= 32;
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
