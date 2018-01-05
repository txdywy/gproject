package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0774b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0789q;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0798z;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ai;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0820q;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a.C0829e;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0772e extends C0758b {
    public int f4812a;
    public C0798z f4813b;
    public ae f4814c;
    public ai f4815d;
    public C0774b f4816e;
    public C0820q f4817f;
    public C0789q f4818g;
    public C0829e f4819h;

    public final C0820q m4969a() {
        if (this.f4812a == 4) {
            return this.f4817f;
        }
        return null;
    }

    public final C0772e m4968a(C0829e c0829e) {
        if (c0829e == null) {
            if (this.f4812a == 6) {
                this.f4812a = -1;
            }
            this.f4819h = null;
        } else {
            this.f4812a = -1;
            this.f4812a = 6;
            this.f4819h = c0829e;
        }
        return this;
    }

    public C0772e() {
        this.f4812a = -1;
        this.f4812a = -1;
        this.f4813b = null;
        this.f4812a = -1;
        this.f4814c = null;
        this.f4812a = -1;
        this.f4815d = null;
        this.f4812a = -1;
        this.f4816e = null;
        this.f4812a = -1;
        this.f4817f = null;
        this.f4812a = -1;
        this.f4818g = null;
        this.f4812a = -1;
        this.f4819h = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4812a == 0) {
            codedOutputByteBufferNano.b(1, this.f4813b);
        }
        if (this.f4812a == 1) {
            codedOutputByteBufferNano.b(4, this.f4814c);
        }
        if (this.f4812a == 2) {
            codedOutputByteBufferNano.b(6, this.f4815d);
        }
        if (this.f4812a == 3) {
            codedOutputByteBufferNano.b(7, this.f4816e);
        }
        if (this.f4812a == 4) {
            codedOutputByteBufferNano.b(11, this.f4817f);
        }
        if (this.f4812a == 5) {
            codedOutputByteBufferNano.b(12, this.f4818g);
        }
        if (this.f4812a == 6) {
            codedOutputByteBufferNano.b(13, this.f4819h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4812a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4813b);
        }
        if (this.f4812a == 1) {
            b += CodedOutputByteBufferNano.d(4, this.f4814c);
        }
        if (this.f4812a == 2) {
            b += CodedOutputByteBufferNano.d(6, this.f4815d);
        }
        if (this.f4812a == 3) {
            b += CodedOutputByteBufferNano.d(7, this.f4816e);
        }
        if (this.f4812a == 4) {
            b += CodedOutputByteBufferNano.d(11, this.f4817f);
        }
        if (this.f4812a == 5) {
            b += CodedOutputByteBufferNano.d(12, this.f4818g);
        }
        if (this.f4812a == 6) {
            return b + CodedOutputByteBufferNano.d(13, this.f4819h);
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
                    if (this.f4813b == null) {
                        this.f4813b = new C0798z();
                    }
                    aVar.a(this.f4813b);
                    this.f4812a = 0;
                    continue;
                case 34:
                    if (this.f4814c == null) {
                        this.f4814c = new ae();
                    }
                    aVar.a(this.f4814c);
                    this.f4812a = 1;
                    continue;
                case 50:
                    if (this.f4815d == null) {
                        this.f4815d = new ai();
                    }
                    aVar.a(this.f4815d);
                    this.f4812a = 2;
                    continue;
                case 58:
                    if (this.f4816e == null) {
                        this.f4816e = new C0774b();
                    }
                    aVar.a(this.f4816e);
                    this.f4812a = 3;
                    continue;
                case 90:
                    if (this.f4817f == null) {
                        this.f4817f = new C0820q();
                    }
                    aVar.a(this.f4817f);
                    this.f4812a = 4;
                    continue;
                case 98:
                    if (this.f4818g == null) {
                        this.f4818g = new C0789q();
                    }
                    aVar.a(this.f4818g);
                    this.f4812a = 5;
                    continue;
                case 106:
                    if (this.f4819h == null) {
                        this.f4819h = new C0829e();
                    }
                    aVar.a(this.f4819h);
                    this.f4812a = 6;
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
