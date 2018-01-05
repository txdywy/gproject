package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0806c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ab extends C0758b {
    public String f4845a;
    public byte[] f4846b;
    public int f4847c;
    public int f4848d;
    public String f4849e;
    public C0806c f4850f;
    public String f4851g;
    public String f4852h;

    public ab() {
        this.f4845a = "";
        this.f4846b = l.l;
        this.f4847c = 0;
        this.f4848d = 0;
        this.f4849e = "";
        this.f4850f = null;
        this.f4851g = "";
        this.f4852h = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4847c != 0) {
            codedOutputByteBufferNano.a(1, this.f4847c);
        }
        if (this.f4848d != 0) {
            codedOutputByteBufferNano.a(2, this.f4848d);
        }
        if (!(this.f4849e == null || this.f4849e.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4849e);
        }
        if (this.f4850f != null) {
            codedOutputByteBufferNano.b(5, this.f4850f);
        }
        if (!(this.f4852h == null || this.f4852h.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f4852h);
        }
        if (!(this.f4851g == null || this.f4851g.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f4851g);
        }
        if (!(this.f4845a == null || this.f4845a.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f4845a);
        }
        if (!Arrays.equals(this.f4846b, l.l)) {
            codedOutputByteBufferNano.a(9, this.f4846b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4847c != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4847c);
        }
        if (this.f4848d != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f4848d);
        }
        if (!(this.f4849e == null || this.f4849e.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4849e);
        }
        if (this.f4850f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4850f);
        }
        if (!(this.f4852h == null || this.f4852h.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f4852h);
        }
        if (!(this.f4851g == null || this.f4851g.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f4851g);
        }
        if (!(this.f4845a == null || this.f4845a.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f4845a);
        }
        if (Arrays.equals(this.f4846b, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(9, this.f4846b);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f4847c = aVar.i();
                    continue;
                case 16:
                    this.f4848d = aVar.i();
                    continue;
                case 26:
                    this.f4849e = aVar.f();
                    continue;
                case 42:
                    if (this.f4850f == null) {
                        this.f4850f = new C0806c();
                    }
                    aVar.a(this.f4850f);
                    continue;
                case 50:
                    this.f4852h = aVar.f();
                    continue;
                case 58:
                    this.f4851g = aVar.f();
                    continue;
                case 66:
                    this.f4845a = aVar.f();
                    continue;
                case 74:
                    this.f4846b = aVar.g();
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
