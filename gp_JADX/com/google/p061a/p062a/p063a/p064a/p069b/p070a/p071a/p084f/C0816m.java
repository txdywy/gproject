package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.h.c.c.b.b.a.a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p082e.p083a.C0802a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.h;

public final class C0816m extends C0758b {
    public static volatile C0816m[] f5172b;
    public int f5173a;
    public al f5174c;
    public C0804a f5175d;
    public ae f5176e;
    public C0812i f5177f;
    public C0802a f5178g;
    public C0814k f5179h;
    public C0807d f5180i;
    public C0810g f5181j;
    public a f5182k;
    public ad f5183l;
    public boolean f5184m;

    public static C0816m[] m5164a() {
        if (f5172b == null) {
            synchronized (h.b) {
                if (f5172b == null) {
                    f5172b = new C0816m[0];
                }
            }
        }
        return f5172b;
    }

    public final al m5168c() {
        if (this.f5173a == 0) {
            return this.f5174c;
        }
        return null;
    }

    public final C0804a m5169d() {
        if (this.f5173a == 1) {
            return this.f5175d;
        }
        return null;
    }

    public final ae m5170e() {
        if (this.f5173a == 2) {
            return this.f5176e;
        }
        return null;
    }

    public final C0812i m5171f() {
        if (this.f5173a == 3) {
            return this.f5177f;
        }
        return null;
    }

    public final C0802a m5172g() {
        if (this.f5173a == 4) {
            return this.f5178g;
        }
        return null;
    }

    public final C0814k m5173h() {
        if (this.f5173a == 5) {
            return this.f5179h;
        }
        return null;
    }

    public final C0807d m5174i() {
        if (this.f5173a == 6) {
            return this.f5180i;
        }
        return null;
    }

    public final C0810g m5175j() {
        if (this.f5173a == 7) {
            return this.f5181j;
        }
        return null;
    }

    public final a m5176k() {
        if (this.f5173a == 8) {
            return this.f5182k;
        }
        return null;
    }

    public final ad m5177l() {
        if (this.f5173a == 9) {
            return this.f5183l;
        }
        return null;
    }

    public C0816m() {
        this.f5173a = -1;
        this.f5173a = -1;
        this.f5174c = null;
        this.f5173a = -1;
        this.f5175d = null;
        this.f5173a = -1;
        this.f5176e = null;
        this.f5173a = -1;
        this.f5177f = null;
        this.f5173a = -1;
        this.f5178g = null;
        this.f5173a = -1;
        this.f5179h = null;
        this.f5173a = -1;
        this.f5180i = null;
        this.f5173a = -1;
        this.f5181j = null;
        this.f5173a = -1;
        this.f5182k = null;
        this.f5173a = -1;
        this.f5183l = null;
        this.f5184m = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5173a == 0) {
            codedOutputByteBufferNano.b(1, this.f5174c);
        }
        if (this.f5173a == 1) {
            codedOutputByteBufferNano.b(2, this.f5175d);
        }
        if (this.f5173a == 2) {
            codedOutputByteBufferNano.b(3, this.f5176e);
        }
        if (this.f5173a == 3) {
            codedOutputByteBufferNano.b(4, this.f5177f);
        }
        if (this.f5173a == 4) {
            codedOutputByteBufferNano.b(5, this.f5178g);
        }
        if (this.f5184m) {
            codedOutputByteBufferNano.a(6, this.f5184m);
        }
        if (this.f5173a == 5) {
            codedOutputByteBufferNano.b(7, this.f5179h);
        }
        if (this.f5173a == 6) {
            codedOutputByteBufferNano.b(8, this.f5180i);
        }
        if (this.f5173a == 7) {
            codedOutputByteBufferNano.b(10, this.f5181j);
        }
        if (this.f5173a == 8) {
            codedOutputByteBufferNano.b(11, this.f5182k);
        }
        if (this.f5173a == 9) {
            codedOutputByteBufferNano.b(12, this.f5183l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5173a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5174c);
        }
        if (this.f5173a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f5175d);
        }
        if (this.f5173a == 2) {
            b += CodedOutputByteBufferNano.d(3, this.f5176e);
        }
        if (this.f5173a == 3) {
            b += CodedOutputByteBufferNano.d(4, this.f5177f);
        }
        if (this.f5173a == 4) {
            b += CodedOutputByteBufferNano.d(5, this.f5178g);
        }
        if (this.f5184m) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f5173a == 5) {
            b += CodedOutputByteBufferNano.d(7, this.f5179h);
        }
        if (this.f5173a == 6) {
            b += CodedOutputByteBufferNano.d(8, this.f5180i);
        }
        if (this.f5173a == 7) {
            b += CodedOutputByteBufferNano.d(10, this.f5181j);
        }
        if (this.f5173a == 8) {
            b += CodedOutputByteBufferNano.d(11, this.f5182k);
        }
        if (this.f5173a == 9) {
            return b + CodedOutputByteBufferNano.d(12, this.f5183l);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5174c == null) {
                        this.f5174c = new al();
                    }
                    aVar.a(this.f5174c);
                    this.f5173a = 0;
                    continue;
                case 18:
                    if (this.f5175d == null) {
                        this.f5175d = new C0804a();
                    }
                    aVar.a(this.f5175d);
                    this.f5173a = 1;
                    continue;
                case 26:
                    if (this.f5176e == null) {
                        this.f5176e = new ae();
                    }
                    aVar.a(this.f5176e);
                    this.f5173a = 2;
                    continue;
                case 34:
                    if (this.f5177f == null) {
                        this.f5177f = new C0812i();
                    }
                    aVar.a(this.f5177f);
                    this.f5173a = 3;
                    continue;
                case 42:
                    if (this.f5178g == null) {
                        this.f5178g = new C0802a();
                    }
                    aVar.a(this.f5178g);
                    this.f5173a = 4;
                    continue;
                case 48:
                    this.f5184m = aVar.e();
                    continue;
                case 58:
                    if (this.f5179h == null) {
                        this.f5179h = new C0814k();
                    }
                    aVar.a(this.f5179h);
                    this.f5173a = 5;
                    continue;
                case 66:
                    if (this.f5180i == null) {
                        this.f5180i = new C0807d();
                    }
                    aVar.a(this.f5180i);
                    this.f5173a = 6;
                    continue;
                case 82:
                    if (this.f5181j == null) {
                        this.f5181j = new C0810g();
                    }
                    aVar.a(this.f5181j);
                    this.f5173a = 7;
                    continue;
                case 90:
                    if (this.f5182k == null) {
                        this.f5182k = new a();
                    }
                    aVar.a(this.f5182k);
                    this.f5173a = 8;
                    continue;
                case 98:
                    if (this.f5183l == null) {
                        this.f5183l = new ad();
                    }
                    aVar.a(this.f5183l);
                    this.f5173a = 9;
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
