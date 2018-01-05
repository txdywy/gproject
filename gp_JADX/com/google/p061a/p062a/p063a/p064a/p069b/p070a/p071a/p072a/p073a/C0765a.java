package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p072a.p073a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0771d;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0801c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0807d;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p091j.p092a.C0834a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0765a extends C0758b {
    public C0811h f4782a;
    public C0807d f4783b;
    public C0804a f4784c;
    public C0771d f4785d;
    public C0801c f4786e;
    public C0834a[] f4787f;

    public C0765a() {
        this.f4782a = null;
        this.f4783b = null;
        this.f4784c = null;
        this.f4785d = null;
        this.f4786e = null;
        this.f4787f = C0834a.m5247a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4784c != null) {
            codedOutputByteBufferNano.b(1, this.f4784c);
        }
        if (this.f4785d != null) {
            codedOutputByteBufferNano.b(2, this.f4785d);
        }
        if (this.f4786e != null) {
            codedOutputByteBufferNano.b(4, this.f4786e);
        }
        if (this.f4783b != null) {
            codedOutputByteBufferNano.b(6, this.f4783b);
        }
        if (this.f4787f != null && this.f4787f.length > 0) {
            for (C0757i c0757i : this.f4787f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(7, c0757i);
                }
            }
        }
        if (this.f4782a != null) {
            codedOutputByteBufferNano.b(14, this.f4782a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4784c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4784c);
        }
        if (this.f4785d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4785d);
        }
        if (this.f4786e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4786e);
        }
        if (this.f4783b != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4783b);
        }
        if (this.f4787f != null && this.f4787f.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f4787f) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(7, c0757i);
                }
            }
            b = i;
        }
        if (this.f4782a != null) {
            return b + CodedOutputByteBufferNano.d(14, this.f4782a);
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
                    if (this.f4784c == null) {
                        this.f4784c = new C0804a();
                    }
                    aVar.a(this.f4784c);
                    continue;
                case 18:
                    if (this.f4785d == null) {
                        this.f4785d = new C0771d();
                    }
                    aVar.a(this.f4785d);
                    continue;
                case 34:
                    if (this.f4786e == null) {
                        this.f4786e = new C0801c();
                    }
                    aVar.a(this.f4786e);
                    continue;
                case 50:
                    if (this.f4783b == null) {
                        this.f4783b = new C0807d();
                    }
                    aVar.a(this.f4783b);
                    continue;
                case 58:
                    int a2 = l.a(aVar, 58);
                    a = this.f4787f == null ? 0 : this.f4787f.length;
                    Object obj = new C0834a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4787f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0834a();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0834a();
                    aVar.a(obj[a]);
                    this.f4787f = obj;
                    continue;
                case 114:
                    if (this.f4782a == null) {
                        this.f4782a = new C0811h();
                    }
                    aVar.a(this.f4782a);
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
