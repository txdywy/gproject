package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0820q;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0829e extends C0758b {
    public int f5263a;
    public String f5264b;
    public byte[] f5265c;
    public String f5266d;
    public String f5267e;
    public String f5268f;
    public boolean f5269g;
    public boolean f5270h;
    public String f5271i;
    public C0820q f5272j;
    public C0825a[] f5273k;

    public final void m5229a(String str) {
        if (str == null) {
            this.f5267e = null;
            if (this.f5263a == 1) {
                this.f5263a = -1;
                return;
            }
            return;
        }
        this.f5263a = -1;
        this.f5267e = str;
        this.f5263a = 1;
    }

    public C0829e() {
        this.f5263a = -1;
        this.f5264b = "";
        this.f5265c = l.l;
        this.f5263a = -1;
        this.f5263a = -1;
        this.f5268f = "";
        this.f5269g = false;
        this.f5270h = false;
        this.f5271i = "";
        this.f5272j = null;
        this.f5273k = C0825a.m5209a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5264b == null || this.f5264b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5264b);
        }
        if (!Arrays.equals(this.f5265c, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5265c);
        }
        if (this.f5263a == 0) {
            codedOutputByteBufferNano.a(3, this.f5266d);
        }
        if (this.f5263a == 1) {
            codedOutputByteBufferNano.a(4, this.f5267e);
        }
        if (!(this.f5268f == null || this.f5268f.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5268f);
        }
        if (this.f5269g) {
            codedOutputByteBufferNano.a(6, this.f5269g);
        }
        if (!(this.f5271i == null || this.f5271i.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f5271i);
        }
        if (this.f5272j != null) {
            codedOutputByteBufferNano.b(8, this.f5272j);
        }
        if (this.f5273k != null && this.f5273k.length > 0) {
            for (C0757i c0757i : this.f5273k) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(9, c0757i);
                }
            }
        }
        if (this.f5270h) {
            codedOutputByteBufferNano.a(10, this.f5270h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5264b == null || this.f5264b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5264b);
        }
        if (!Arrays.equals(this.f5265c, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5265c);
        }
        if (this.f5263a == 0) {
            b += CodedOutputByteBufferNano.b(3, this.f5266d);
        }
        if (this.f5263a == 1) {
            b += CodedOutputByteBufferNano.b(4, this.f5267e);
        }
        if (!(this.f5268f == null || this.f5268f.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5268f);
        }
        if (this.f5269g) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (!(this.f5271i == null || this.f5271i.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f5271i);
        }
        if (this.f5272j != null) {
            b += CodedOutputByteBufferNano.d(8, this.f5272j);
        }
        if (this.f5273k != null && this.f5273k.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5273k) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(9, c0757i);
                }
            }
            b = i;
        }
        if (this.f5270h) {
            return b + (CodedOutputByteBufferNano.d(10) + 1);
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
                    this.f5264b = aVar.f();
                    continue;
                case 18:
                    this.f5265c = aVar.g();
                    continue;
                case 26:
                    this.f5266d = aVar.f();
                    this.f5263a = 0;
                    continue;
                case 34:
                    this.f5267e = aVar.f();
                    this.f5263a = 1;
                    continue;
                case 42:
                    this.f5268f = aVar.f();
                    continue;
                case 48:
                    this.f5269g = aVar.e();
                    continue;
                case 58:
                    this.f5271i = aVar.f();
                    continue;
                case 66:
                    if (this.f5272j == null) {
                        this.f5272j = new C0820q();
                    }
                    aVar.a(this.f5272j);
                    continue;
                case 74:
                    int a2 = l.a(aVar, 74);
                    a = this.f5273k == null ? 0 : this.f5273k.length;
                    Object obj = new C0825a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5273k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0825a();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0825a();
                    aVar.a(obj[a]);
                    this.f5273k = obj;
                    continue;
                case 80:
                    this.f5270h = aVar.e();
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
