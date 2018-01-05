package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p074b.p075a.C0767a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0779g extends C0758b {
    public C0811h f4920a;
    public C0767a f4921b;
    public C0799a f4922c;
    public ae[] f4923d;
    public String f4924e;
    public ae f4925f;
    public boolean f4926g;
    public String f4927h;

    public C0779g() {
        this.f4920a = null;
        this.f4921b = null;
        this.f4922c = null;
        this.f4923d = ae.m5273a();
        this.f4924e = "";
        this.f4925f = null;
        this.f4926g = false;
        this.f4927h = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4920a != null) {
            codedOutputByteBufferNano.b(1, this.f4920a);
        }
        if (this.f4921b != null) {
            codedOutputByteBufferNano.b(2, this.f4921b);
        }
        if (this.f4922c != null) {
            codedOutputByteBufferNano.b(3, this.f4922c);
        }
        if (this.f4923d != null && this.f4923d.length > 0) {
            for (C0757i c0757i : this.f4923d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (!(this.f4924e == null || this.f4924e.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f4924e);
        }
        if (this.f4925f != null) {
            codedOutputByteBufferNano.b(6, this.f4925f);
        }
        if (this.f4926g) {
            codedOutputByteBufferNano.a(7, this.f4926g);
        }
        if (!(this.f4927h == null || this.f4927h.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f4927h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4920a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4920a);
        }
        if (this.f4921b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4921b);
        }
        if (this.f4922c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f4922c);
        }
        if (this.f4923d != null && this.f4923d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f4923d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if (!(this.f4924e == null || this.f4924e.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f4924e);
        }
        if (this.f4925f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4925f);
        }
        if (this.f4926g) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if (this.f4927h == null || this.f4927h.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(8, this.f4927h);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f4920a == null) {
                        this.f4920a = new C0811h();
                    }
                    aVar.a(this.f4920a);
                    continue;
                case 18:
                    if (this.f4921b == null) {
                        this.f4921b = new C0767a();
                    }
                    aVar.a(this.f4921b);
                    continue;
                case 26:
                    if (this.f4922c == null) {
                        this.f4922c = new C0799a();
                    }
                    aVar.a(this.f4922c);
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f4923d == null ? 0 : this.f4923d.length;
                    Object obj = new ae[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4923d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ae();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ae();
                    aVar.a(obj[a]);
                    this.f4923d = obj;
                    continue;
                case 42:
                    this.f4924e = aVar.f();
                    continue;
                case 50:
                    if (this.f4925f == null) {
                        this.f4925f = new ae();
                    }
                    aVar.a(this.f4925f);
                    continue;
                case 56:
                    this.f4926g = aVar.e();
                    continue;
                case 66:
                    this.f4927h = aVar.f();
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
