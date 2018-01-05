package com.google.android.finsky.cd;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2260c extends C0758b {
    public static volatile C2260c[] f11220b;
    public int f11221a;
    public int f11222c;
    public String f11223d;
    public String f11224e;
    public byte[] f11225f;
    public long f11226g;
    public boolean f11227h;
    public C2264g f11228i;

    public static C2260c[] an_() {
        if (f11220b == null) {
            synchronized (h.b) {
                if (f11220b == null) {
                    f11220b = new C2260c[0];
                }
            }
        }
        return f11220b;
    }

    public C2260c() {
        this.f11221a = -1;
        this.f11222c = 0;
        this.f11223d = "";
        this.f11221a = -1;
        this.f11224e = "";
        this.f11221a = -1;
        this.f11225f = l.l;
        this.f11221a = -1;
        this.f11226g = 0;
        this.f11221a = -1;
        this.f11227h = false;
        this.f11221a = -1;
        this.f11228i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11222c & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11223d);
        }
        if (this.f11221a == 0) {
            codedOutputByteBufferNano.a(2, this.f11224e);
        }
        if (this.f11221a == 1) {
            codedOutputByteBufferNano.a(3, this.f11225f);
        }
        if (this.f11221a == 2) {
            codedOutputByteBufferNano.b(4, this.f11226g);
        }
        if (this.f11221a == 3) {
            codedOutputByteBufferNano.a(5, this.f11227h);
        }
        if (this.f11221a == 4) {
            codedOutputByteBufferNano.b(6, this.f11228i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11222c & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11223d);
        }
        if (this.f11221a == 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11224e);
        }
        if (this.f11221a == 1) {
            b += CodedOutputByteBufferNano.b(3, this.f11225f);
        }
        if (this.f11221a == 2) {
            b += CodedOutputByteBufferNano.f(4, this.f11226g);
        }
        if (this.f11221a == 3) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (this.f11221a == 4) {
            return b + CodedOutputByteBufferNano.d(6, this.f11228i);
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
                    this.f11223d = aVar.f();
                    this.f11222c |= 1;
                    continue;
                case 18:
                    this.f11224e = aVar.f();
                    this.f11221a = 0;
                    continue;
                case 26:
                    this.f11225f = aVar.g();
                    this.f11221a = 1;
                    continue;
                case 32:
                    this.f11226g = aVar.j();
                    this.f11221a = 2;
                    continue;
                case 40:
                    this.f11227h = aVar.e();
                    this.f11221a = 3;
                    continue;
                case 50:
                    if (this.f11228i == null) {
                        this.f11228i = new C2264g();
                    }
                    aVar.a(this.f11228i);
                    this.f11221a = 4;
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
