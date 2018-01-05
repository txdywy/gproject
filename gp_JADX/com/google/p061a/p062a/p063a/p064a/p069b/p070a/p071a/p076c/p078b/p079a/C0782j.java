package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.aj;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0782j extends C0758b {
    public static volatile C0782j[] f4934a;
    public long f4935b;
    public String f4936c;
    public ae f4937d;
    public ae f4938e;
    public byte[] f4939f;
    public aj f4940g;
    public boolean f4941h;

    public static C0782j[] m5032a() {
        if (f4934a == null) {
            synchronized (h.b) {
                if (f4934a == null) {
                    f4934a = new C0782j[0];
                }
            }
        }
        return f4934a;
    }

    public C0782j() {
        this.f4935b = 0;
        this.f4936c = "";
        this.f4937d = null;
        this.f4938e = null;
        this.f4939f = l.l;
        this.f4940g = null;
        this.f4941h = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4936c == null || this.f4936c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4936c);
        }
        if (!Arrays.equals(this.f4939f, l.l)) {
            codedOutputByteBufferNano.a(3, this.f4939f);
        }
        if (this.f4940g != null) {
            codedOutputByteBufferNano.b(4, this.f4940g);
        }
        if (this.f4941h) {
            codedOutputByteBufferNano.a(5, this.f4941h);
        }
        if (this.f4937d != null) {
            codedOutputByteBufferNano.b(6, this.f4937d);
        }
        if (this.f4938e != null) {
            codedOutputByteBufferNano.b(7, this.f4938e);
        }
        if (this.f4935b != 0) {
            codedOutputByteBufferNano.b(8, this.f4935b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4936c == null || this.f4936c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4936c);
        }
        if (!Arrays.equals(this.f4939f, l.l)) {
            b += CodedOutputByteBufferNano.b(3, this.f4939f);
        }
        if (this.f4940g != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4940g);
        }
        if (this.f4941h) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (this.f4937d != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4937d);
        }
        if (this.f4938e != null) {
            b += CodedOutputByteBufferNano.d(7, this.f4938e);
        }
        if (this.f4935b != 0) {
            return b + CodedOutputByteBufferNano.f(8, this.f4935b);
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
                    this.f4936c = aVar.f();
                    continue;
                case 26:
                    this.f4939f = aVar.g();
                    continue;
                case 34:
                    if (this.f4940g == null) {
                        this.f4940g = new aj();
                    }
                    aVar.a(this.f4940g);
                    continue;
                case 40:
                    this.f4941h = aVar.e();
                    continue;
                case 50:
                    if (this.f4937d == null) {
                        this.f4937d = new ae();
                    }
                    aVar.a(this.f4937d);
                    continue;
                case 58:
                    if (this.f4938e == null) {
                        this.f4938e = new ae();
                    }
                    aVar.a(this.f4938e);
                    continue;
                case 64:
                    this.f4935b = aVar.j();
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
