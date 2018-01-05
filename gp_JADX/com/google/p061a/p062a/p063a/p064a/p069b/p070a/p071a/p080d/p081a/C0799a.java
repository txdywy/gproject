package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0799a extends C0758b {
    public static volatile C0799a[] f5063a;
    public long f5064b;
    public ae f5065c;
    public String f5066d;
    public boolean f5067e;
    public ae f5068f;
    public String f5069g;

    public static C0799a[] m5101a() {
        if (f5063a == null) {
            synchronized (h.b) {
                if (f5063a == null) {
                    f5063a = new C0799a[0];
                }
            }
        }
        return f5063a;
    }

    public C0799a() {
        this.f5064b = 0;
        this.f5065c = null;
        this.f5066d = "";
        this.f5067e = false;
        this.f5068f = null;
        this.f5069g = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5066d == null || this.f5066d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5066d);
        }
        if (!(this.f5069g == null || this.f5069g.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5069g);
        }
        if (this.f5065c != null) {
            codedOutputByteBufferNano.b(5, this.f5065c);
        }
        if (this.f5067e) {
            codedOutputByteBufferNano.a(6, this.f5067e);
        }
        if (this.f5064b != 0) {
            codedOutputByteBufferNano.b(7, this.f5064b);
        }
        if (this.f5068f != null) {
            codedOutputByteBufferNano.b(8, this.f5068f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5066d == null || this.f5066d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5066d);
        }
        if (!(this.f5069g == null || this.f5069g.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5069g);
        }
        if (this.f5065c != null) {
            b += CodedOutputByteBufferNano.d(5, this.f5065c);
        }
        if (this.f5067e) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f5064b != 0) {
            b += CodedOutputByteBufferNano.f(7, this.f5064b);
        }
        if (this.f5068f != null) {
            return b + CodedOutputByteBufferNano.d(8, this.f5068f);
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
                    this.f5066d = aVar.f();
                    continue;
                case 26:
                    this.f5069g = aVar.f();
                    continue;
                case 42:
                    if (this.f5065c == null) {
                        this.f5065c = new ae();
                    }
                    aVar.a(this.f5065c);
                    continue;
                case 48:
                    this.f5067e = aVar.e();
                    continue;
                case 56:
                    this.f5064b = aVar.j();
                    continue;
                case 66:
                    if (this.f5068f == null) {
                        this.f5068f = new ae();
                    }
                    aVar.a(this.f5068f);
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
