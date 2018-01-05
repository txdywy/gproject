package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0812i;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0786n extends C0758b {
    public static volatile C0786n[] f4957b;
    public int f4958a;
    public al f4959c;
    public C0804a f4960d;
    public C0812i f4961e;
    public boolean f4962f;

    public static C0786n[] m5046a() {
        if (f4957b == null) {
            synchronized (h.b) {
                if (f4957b == null) {
                    f4957b = new C0786n[0];
                }
            }
        }
        return f4957b;
    }

    public final al m5050c() {
        if (this.f4958a == 0) {
            return this.f4959c;
        }
        return null;
    }

    public final C0804a m5051d() {
        if (this.f4958a == 1) {
            return this.f4960d;
        }
        return null;
    }

    public final C0812i m5052e() {
        if (this.f4958a == 2) {
            return this.f4961e;
        }
        return null;
    }

    public C0786n() {
        this.f4958a = -1;
        this.f4958a = -1;
        this.f4959c = null;
        this.f4958a = -1;
        this.f4960d = null;
        this.f4958a = -1;
        this.f4961e = null;
        this.f4962f = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4958a == 0) {
            codedOutputByteBufferNano.b(1, this.f4959c);
        }
        if (this.f4958a == 1) {
            codedOutputByteBufferNano.b(2, this.f4960d);
        }
        if (this.f4958a == 2) {
            codedOutputByteBufferNano.b(4, this.f4961e);
        }
        if (this.f4962f) {
            codedOutputByteBufferNano.a(6, this.f4962f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4958a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4959c);
        }
        if (this.f4958a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4960d);
        }
        if (this.f4958a == 2) {
            b += CodedOutputByteBufferNano.d(4, this.f4961e);
        }
        if (this.f4962f) {
            return b + (CodedOutputByteBufferNano.d(6) + 1);
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
                    if (this.f4959c == null) {
                        this.f4959c = new al();
                    }
                    aVar.a(this.f4959c);
                    this.f4958a = 0;
                    continue;
                case 18:
                    if (this.f4960d == null) {
                        this.f4960d = new C0804a();
                    }
                    aVar.a(this.f4960d);
                    this.f4958a = 1;
                    continue;
                case 34:
                    if (this.f4961e == null) {
                        this.f4961e = new C0812i();
                    }
                    aVar.a(this.f4961e);
                    this.f4958a = 2;
                    continue;
                case 48:
                    this.f4962f = aVar.e();
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
