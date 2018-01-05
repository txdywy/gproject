package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0814k extends C0758b {
    public C0811h f5160a;
    public String f5161b;
    public C0815l f5162c;
    public String[] f5163d;
    public String[] f5164e;
    public String f5165f;
    public boolean f5166g;

    public C0814k() {
        this.f5160a = null;
        this.f5161b = "";
        this.f5162c = null;
        this.f5163d = l.j;
        this.f5164e = l.j;
        this.f5165f = "";
        this.f5166g = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5160a != null) {
            codedOutputByteBufferNano.b(1, this.f5160a);
        }
        if (this.f5162c != null) {
            codedOutputByteBufferNano.b(2, this.f5162c);
        }
        if (this.f5163d != null && this.f5163d.length > 0) {
            for (String str : this.f5163d) {
                if (str != null) {
                    codedOutputByteBufferNano.a(3, str);
                }
            }
        }
        if (!(this.f5161b == null || this.f5161b.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5161b);
        }
        if (!(this.f5165f == null || this.f5165f.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5165f);
        }
        if (this.f5166g) {
            codedOutputByteBufferNano.a(6, this.f5166g);
        }
        if (this.f5164e != null && this.f5164e.length > 0) {
            while (i < this.f5164e.length) {
                String str2 = this.f5164e[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(9, str2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if (this.f5160a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5160a);
        }
        if (this.f5162c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5162c);
        }
        if (this.f5163d != null && this.f5163d.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f5163d) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if (!(this.f5161b == null || this.f5161b.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5161b);
        }
        if (!(this.f5165f == null || this.f5165f.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5165f);
        }
        if (this.f5166g) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f5164e == null || this.f5164e.length <= 0) {
            return b;
        }
        i2 = 0;
        i = 0;
        while (i3 < this.f5164e.length) {
            String str2 = this.f5164e[i3];
            if (str2 != null) {
                i++;
                i2 += CodedOutputByteBufferNano.b(str2);
            }
            i3++;
        }
        return (b + i2) + (i * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5160a == null) {
                        this.f5160a = new C0811h();
                    }
                    aVar.a(this.f5160a);
                    continue;
                case 18:
                    if (this.f5162c == null) {
                        this.f5162c = new C0815l();
                    }
                    aVar.a(this.f5162c);
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f5163d == null ? 0 : this.f5163d.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5163d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5163d = obj;
                    continue;
                case 34:
                    this.f5161b = aVar.f();
                    continue;
                case 42:
                    this.f5165f = aVar.f();
                    continue;
                case 48:
                    this.f5166g = aVar.e();
                    continue;
                case 74:
                    a2 = l.a(aVar, 74);
                    a = this.f5164e == null ? 0 : this.f5164e.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5164e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5164e = obj;
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
