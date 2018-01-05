package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0777e extends C0758b {
    public C0811h f4911a;
    public ae f4912b;
    public ad f4913c;
    public al f4914d;
    public ae[] f4915e;
    public ae f4916f;

    public C0777e() {
        this.f4911a = null;
        this.f4912b = null;
        this.f4913c = null;
        this.f4914d = null;
        this.f4915e = ae.m5273a();
        this.f4916f = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4911a != null) {
            codedOutputByteBufferNano.b(1, this.f4911a);
        }
        if (this.f4912b != null) {
            codedOutputByteBufferNano.b(2, this.f4912b);
        }
        if (this.f4913c != null) {
            codedOutputByteBufferNano.b(3, this.f4913c);
        }
        if (this.f4914d != null) {
            codedOutputByteBufferNano.b(5, this.f4914d);
        }
        if (this.f4915e != null && this.f4915e.length > 0) {
            for (C0757i c0757i : this.f4915e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
            }
        }
        if (this.f4916f != null) {
            codedOutputByteBufferNano.b(7, this.f4916f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4911a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4911a);
        }
        if (this.f4912b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4912b);
        }
        if (this.f4913c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f4913c);
        }
        if (this.f4914d != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4914d);
        }
        if (this.f4915e != null && this.f4915e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f4915e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(6, c0757i);
                }
            }
            b = i;
        }
        if (this.f4916f != null) {
            return b + CodedOutputByteBufferNano.d(7, this.f4916f);
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
                    if (this.f4911a == null) {
                        this.f4911a = new C0811h();
                    }
                    aVar.a(this.f4911a);
                    continue;
                case 18:
                    if (this.f4912b == null) {
                        this.f4912b = new ae();
                    }
                    aVar.a(this.f4912b);
                    continue;
                case 26:
                    if (this.f4913c == null) {
                        this.f4913c = new ad();
                    }
                    aVar.a(this.f4913c);
                    continue;
                case 42:
                    if (this.f4914d == null) {
                        this.f4914d = new al();
                    }
                    aVar.a(this.f4914d);
                    continue;
                case 50:
                    int a2 = l.a(aVar, 50);
                    a = this.f4915e == null ? 0 : this.f4915e.length;
                    Object obj = new ae[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4915e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ae();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ae();
                    aVar.a(obj[a]);
                    this.f4915e = obj;
                    continue;
                case 58:
                    if (this.f4916f == null) {
                        this.f4916f = new ae();
                    }
                    aVar.a(this.f4916f);
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
