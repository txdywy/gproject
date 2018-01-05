package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0806c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0774b extends C0758b {
    public String f4897a;
    public byte[] f4898b;
    public at[] f4899c;
    public C0806c f4900d;
    public C0806c f4901e;
    public String[] f4902f;

    public C0774b() {
        this.f4897a = "";
        this.f4898b = l.l;
        this.f4899c = at.m5344a();
        this.f4900d = null;
        this.f4901e = null;
        this.f4902f = l.j;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f4897a == null || this.f4897a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4897a);
        }
        if (!Arrays.equals(this.f4898b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4898b);
        }
        if (this.f4899c != null && this.f4899c.length > 0) {
            for (C0757i c0757i : this.f4899c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f4900d != null) {
            codedOutputByteBufferNano.b(4, this.f4900d);
        }
        if (this.f4901e != null) {
            codedOutputByteBufferNano.b(5, this.f4901e);
        }
        if (this.f4902f != null && this.f4902f.length > 0) {
            while (i < this.f4902f.length) {
                String str = this.f4902f[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (!(this.f4897a == null || this.f4897a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4897a);
        }
        if (!Arrays.equals(this.f4898b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4898b);
        }
        if (this.f4899c != null && this.f4899c.length > 0) {
            i = b;
            for (C0757i c0757i : this.f4899c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f4900d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4900d);
        }
        if (this.f4901e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4901e);
        }
        if (this.f4902f == null || this.f4902f.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.f4902f.length) {
            String str = this.f4902f[i2];
            if (str != null) {
                i3++;
                i += CodedOutputByteBufferNano.b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
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
                    this.f4897a = aVar.f();
                    continue;
                case 18:
                    this.f4898b = aVar.g();
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f4899c == null ? 0 : this.f4899c.length;
                    obj = new at[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4899c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new at();
                    aVar.a(obj[a]);
                    this.f4899c = obj;
                    continue;
                case 34:
                    if (this.f4900d == null) {
                        this.f4900d = new C0806c();
                    }
                    aVar.a(this.f4900d);
                    continue;
                case 42:
                    if (this.f4901e == null) {
                        this.f4901e = new C0806c();
                    }
                    aVar.a(this.f4901e);
                    continue;
                case 50:
                    a2 = l.a(aVar, 50);
                    a = this.f4902f == null ? 0 : this.f4902f.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4902f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f4902f = obj;
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
