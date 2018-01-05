package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0781i extends C0758b {
    public C0811h f4931a;
    public C0782j[] f4932b;
    public int f4933c;

    public C0781i() {
        this.f4931a = null;
        this.f4932b = C0782j.m5032a();
        this.f4933c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4931a != null) {
            codedOutputByteBufferNano.b(1, this.f4931a);
        }
        if (this.f4932b != null && this.f4932b.length > 0) {
            for (C0757i c0757i : this.f4932b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f4933c != 0) {
            codedOutputByteBufferNano.a(3, this.f4933c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4931a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4931a);
        }
        if (this.f4932b != null && this.f4932b.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f4932b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (this.f4933c != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f4933c);
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
                    if (this.f4931a == null) {
                        this.f4931a = new C0811h();
                    }
                    aVar.a(this.f4931a);
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f4932b == null ? 0 : this.f4932b.length;
                    Object obj = new C0782j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4932b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0782j();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0782j();
                    aVar.a(obj[a]);
                    this.f4932b = obj;
                    continue;
                case 24:
                    this.f4933c = aVar.i();
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
