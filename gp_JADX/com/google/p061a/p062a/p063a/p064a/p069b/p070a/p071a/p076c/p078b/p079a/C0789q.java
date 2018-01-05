package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0789q extends C0758b {
    public String f4982a;
    public byte[] f4983b;
    public String f4984c;
    public C0791s[] f4985d;
    public ac[] f4986e;
    public byte[] f4987f;

    public C0789q() {
        this.f4982a = "";
        this.f4983b = l.l;
        this.f4984c = "";
        this.f4985d = C0791s.m5068a();
        this.f4986e = ac.m4984a();
        this.f4987f = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f4982a == null || this.f4982a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4982a);
        }
        if (!Arrays.equals(this.f4983b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4983b);
        }
        if (!(this.f4984c == null || this.f4984c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4984c);
        }
        if (this.f4985d != null && this.f4985d.length > 0) {
            for (C0757i c0757i : this.f4985d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if (this.f4986e != null && this.f4986e.length > 0) {
            while (i < this.f4986e.length) {
                C0757i c0757i2 = this.f4986e[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(6, c0757i2);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.f4987f, l.l)) {
            codedOutputByteBufferNano.a(7, this.f4987f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f4982a == null || this.f4982a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4982a);
        }
        if (!Arrays.equals(this.f4983b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4983b);
        }
        if (!(this.f4984c == null || this.f4984c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4984c);
        }
        if (this.f4985d != null && this.f4985d.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f4985d) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i2;
        }
        if (this.f4986e != null && this.f4986e.length > 0) {
            while (i < this.f4986e.length) {
                C0757i c0757i2 = this.f4986e[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(6, c0757i2);
                }
                i++;
            }
        }
        if (Arrays.equals(this.f4987f, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(7, this.f4987f);
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
                    this.f4982a = aVar.f();
                    continue;
                case 18:
                    this.f4983b = aVar.g();
                    continue;
                case 26:
                    this.f4984c = aVar.f();
                    continue;
                case 42:
                    a2 = l.a(aVar, 42);
                    a = this.f4985d == null ? 0 : this.f4985d.length;
                    obj = new C0791s[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4985d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0791s();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0791s();
                    aVar.a(obj[a]);
                    this.f4985d = obj;
                    continue;
                case 50:
                    a2 = l.a(aVar, 50);
                    a = this.f4986e == null ? 0 : this.f4986e.length;
                    obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4986e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ac();
                    aVar.a(obj[a]);
                    this.f4986e = obj;
                    continue;
                case 58:
                    this.f4987f = aVar.g();
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
