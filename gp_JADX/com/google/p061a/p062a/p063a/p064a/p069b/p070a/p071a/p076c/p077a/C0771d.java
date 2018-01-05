package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0773a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0788p;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0797y;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ah;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0818o;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a.C0826b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0771d extends C0758b {
    public C0797y f4805a;
    public ad f4806b;
    public ah f4807c;
    public C0818o f4808d;
    public C0773a f4809e;
    public C0788p f4810f;
    public C0826b f4811g;

    public C0771d() {
        this.f4805a = null;
        this.f4806b = null;
        this.f4807c = null;
        this.f4808d = null;
        this.f4809e = null;
        this.f4810f = null;
        this.f4811g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4805a != null) {
            codedOutputByteBufferNano.b(2, this.f4805a);
        }
        if (this.f4806b != null) {
            codedOutputByteBufferNano.b(5, this.f4806b);
        }
        if (this.f4807c != null) {
            codedOutputByteBufferNano.b(7, this.f4807c);
        }
        if (this.f4808d != null) {
            codedOutputByteBufferNano.b(11, this.f4808d);
        }
        if (this.f4809e != null) {
            codedOutputByteBufferNano.b(12, this.f4809e);
        }
        if (this.f4810f != null) {
            codedOutputByteBufferNano.b(14, this.f4810f);
        }
        if (this.f4811g != null) {
            codedOutputByteBufferNano.b(15, this.f4811g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4805a != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4805a);
        }
        if (this.f4806b != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4806b);
        }
        if (this.f4807c != null) {
            b += CodedOutputByteBufferNano.d(7, this.f4807c);
        }
        if (this.f4808d != null) {
            b += CodedOutputByteBufferNano.d(11, this.f4808d);
        }
        if (this.f4809e != null) {
            b += CodedOutputByteBufferNano.d(12, this.f4809e);
        }
        if (this.f4810f != null) {
            b += CodedOutputByteBufferNano.d(14, this.f4810f);
        }
        if (this.f4811g != null) {
            return b + CodedOutputByteBufferNano.d(15, this.f4811g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f4805a == null) {
                        this.f4805a = new C0797y();
                    }
                    aVar.a(this.f4805a);
                    continue;
                case 42:
                    if (this.f4806b == null) {
                        this.f4806b = new ad();
                    }
                    aVar.a(this.f4806b);
                    continue;
                case 58:
                    if (this.f4807c == null) {
                        this.f4807c = new ah();
                    }
                    aVar.a(this.f4807c);
                    continue;
                case 90:
                    if (this.f4808d == null) {
                        this.f4808d = new C0818o();
                    }
                    aVar.a(this.f4808d);
                    continue;
                case 98:
                    if (this.f4809e == null) {
                        this.f4809e = new C0773a();
                    }
                    aVar.a(this.f4809e);
                    continue;
                case 114:
                    if (this.f4810f == null) {
                        this.f4810f = new C0788p();
                    }
                    aVar.a(this.f4810f);
                    continue;
                case 122:
                    if (this.f4811g == null) {
                        this.f4811g = new C0826b();
                    }
                    aVar.a(this.f4811g);
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
