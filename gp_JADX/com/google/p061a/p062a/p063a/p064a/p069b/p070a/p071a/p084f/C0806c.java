package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.g.a.a.b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0806c extends C0758b {
    public String f5118a;
    public long f5119b;
    public byte[] f5120c;
    public b f5121d;
    public String f5122e;
    public boolean f5123f;
    public byte[] f5124g;

    public C0806c() {
        this.f5118a = "";
        this.f5119b = 0;
        this.f5120c = l.l;
        this.f5121d = null;
        this.f5122e = "";
        this.f5123f = false;
        this.f5124g = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5121d != null) {
            codedOutputByteBufferNano.b(1, this.f5121d);
        }
        if (!(this.f5122e == null || this.f5122e.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5122e);
        }
        if (this.f5123f) {
            codedOutputByteBufferNano.a(3, this.f5123f);
        }
        if (!(this.f5118a == null || this.f5118a.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5118a);
        }
        if (!Arrays.equals(this.f5124g, l.l)) {
            codedOutputByteBufferNano.a(6, this.f5124g);
        }
        if (!Arrays.equals(this.f5120c, l.l)) {
            codedOutputByteBufferNano.a(7, this.f5120c);
        }
        if (this.f5119b != 0) {
            codedOutputByteBufferNano.b(8, this.f5119b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5121d != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5121d);
        }
        if (!(this.f5122e == null || this.f5122e.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5122e);
        }
        if (this.f5123f) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (!(this.f5118a == null || this.f5118a.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5118a);
        }
        if (!Arrays.equals(this.f5124g, l.l)) {
            b += CodedOutputByteBufferNano.b(6, this.f5124g);
        }
        if (!Arrays.equals(this.f5120c, l.l)) {
            b += CodedOutputByteBufferNano.b(7, this.f5120c);
        }
        if (this.f5119b != 0) {
            return b + CodedOutputByteBufferNano.f(8, this.f5119b);
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
                    if (this.f5121d == null) {
                        this.f5121d = new b();
                    }
                    aVar.a(this.f5121d);
                    continue;
                case 18:
                    this.f5122e = aVar.f();
                    continue;
                case 24:
                    this.f5123f = aVar.e();
                    continue;
                case 42:
                    this.f5118a = aVar.f();
                    continue;
                case 50:
                    this.f5124g = aVar.g();
                    continue;
                case 58:
                    this.f5120c = aVar.g();
                    continue;
                case 64:
                    this.f5119b = aVar.j();
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
