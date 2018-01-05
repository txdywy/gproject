package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4706j extends C0758b {
    public int f24207a;
    public C4710n f24208b;
    public String f24209c;
    public C4707k[] f24210d;

    public final C4706j m21907a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f24207a |= 1;
        this.f24209c = str;
        return this;
    }

    public C4706j() {
        this.f24207a = 0;
        this.f24208b = null;
        this.f24209c = "";
        this.f24210d = C4707k.co_();
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24208b != null) {
            codedOutputByteBufferNano.b(1, this.f24208b);
        }
        if ((this.f24207a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f24209c);
        }
        if (this.f24210d != null && this.f24210d.length > 0) {
            for (C0757i c0757i : this.f24210d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24208b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f24208b);
        }
        if ((this.f24207a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f24209c);
        }
        if (this.f24210d == null || this.f24210d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f24210d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24208b == null) {
                        this.f24208b = new C4710n();
                    }
                    aVar.a(this.f24208b);
                    continue;
                case 18:
                    this.f24209c = aVar.f();
                    this.f24207a |= 1;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f24210d == null ? 0 : this.f24210d.length;
                    Object obj = new C4707k[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24210d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4707k();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4707k();
                    aVar.a(obj[a]);
                    this.f24210d = obj;
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
