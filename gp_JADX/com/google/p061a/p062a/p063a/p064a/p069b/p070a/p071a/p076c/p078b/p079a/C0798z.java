package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0806c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0798z extends C0758b {
    public String f5052a;
    public String f5053b;
    public String f5054c;
    public String f5055d;
    public int f5056e;
    public int f5057f;
    public C0806c f5058g;
    public String f5059h;
    public ac[] f5060i;
    public byte[] f5061j;
    public String f5062k;

    public C0798z() {
        this.f5052a = "";
        this.f5053b = "";
        this.f5054c = "";
        this.f5055d = "";
        this.f5056e = 0;
        this.f5057f = 0;
        this.f5058g = null;
        this.f5059h = "";
        this.f5060i = ac.m4984a();
        this.f5061j = l.l;
        this.f5062k = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5054c == null || this.f5054c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5054c);
        }
        if (!(this.f5055d == null || this.f5055d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5055d);
        }
        if (this.f5056e != 0) {
            codedOutputByteBufferNano.a(3, this.f5056e);
        }
        if (this.f5057f != 0) {
            codedOutputByteBufferNano.a(4, this.f5057f);
        }
        if (!(this.f5059h == null || this.f5059h.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5059h);
        }
        if (!(this.f5053b == null || this.f5053b.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f5053b);
        }
        if (this.f5058g != null) {
            codedOutputByteBufferNano.b(10, this.f5058g);
        }
        if (!Arrays.equals(this.f5061j, l.l)) {
            codedOutputByteBufferNano.a(11, this.f5061j);
        }
        if (!(this.f5062k == null || this.f5062k.equals(""))) {
            codedOutputByteBufferNano.a(12, this.f5062k);
        }
        if (!(this.f5052a == null || this.f5052a.equals(""))) {
            codedOutputByteBufferNano.a(13, this.f5052a);
        }
        if (this.f5060i != null && this.f5060i.length > 0) {
            for (C0757i c0757i : this.f5060i) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(14, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5054c == null || this.f5054c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5054c);
        }
        if (!(this.f5055d == null || this.f5055d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5055d);
        }
        if (this.f5056e != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f5056e);
        }
        if (this.f5057f != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5057f);
        }
        if (!(this.f5059h == null || this.f5059h.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5059h);
        }
        if (!(this.f5053b == null || this.f5053b.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f5053b);
        }
        if (this.f5058g != null) {
            b += CodedOutputByteBufferNano.d(10, this.f5058g);
        }
        if (!Arrays.equals(this.f5061j, l.l)) {
            b += CodedOutputByteBufferNano.b(11, this.f5061j);
        }
        if (!(this.f5062k == null || this.f5062k.equals(""))) {
            b += CodedOutputByteBufferNano.b(12, this.f5062k);
        }
        if (!(this.f5052a == null || this.f5052a.equals(""))) {
            b += CodedOutputByteBufferNano.b(13, this.f5052a);
        }
        if (this.f5060i == null || this.f5060i.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f5060i) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(14, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5054c = aVar.f();
                    continue;
                case 18:
                    this.f5055d = aVar.f();
                    continue;
                case 24:
                    this.f5056e = aVar.i();
                    continue;
                case 32:
                    this.f5057f = aVar.i();
                    continue;
                case 50:
                    this.f5059h = aVar.f();
                    continue;
                case 74:
                    this.f5053b = aVar.f();
                    continue;
                case 82:
                    if (this.f5058g == null) {
                        this.f5058g = new C0806c();
                    }
                    aVar.a(this.f5058g);
                    continue;
                case 90:
                    this.f5061j = aVar.g();
                    continue;
                case 98:
                    this.f5062k = aVar.f();
                    continue;
                case 106:
                    this.f5052a = aVar.f();
                    continue;
                case 114:
                    int a2 = l.a(aVar, 114);
                    a = this.f5060i == null ? 0 : this.f5060i.length;
                    Object obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5060i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ac();
                    aVar.a(obj[a]);
                    this.f5060i = obj;
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
