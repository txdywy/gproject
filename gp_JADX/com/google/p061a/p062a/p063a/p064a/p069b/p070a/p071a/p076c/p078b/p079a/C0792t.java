package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0792t extends C0758b {
    public static volatile C0792t[] f5000a;
    public C0794v[] f5001b;
    public String f5002c;

    public static C0792t[] m5072a() {
        if (f5000a == null) {
            synchronized (h.b) {
                if (f5000a == null) {
                    f5000a = new C0792t[0];
                }
            }
        }
        return f5000a;
    }

    public C0792t() {
        this.f5001b = C0794v.m5081a();
        this.f5002c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5001b != null && this.f5001b.length > 0) {
            for (C0757i c0757i : this.f5001b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (!(this.f5002c == null || this.f5002c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5002c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5001b != null && this.f5001b.length > 0) {
            for (C0757i c0757i : this.f5001b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (this.f5002c == null || this.f5002c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(2, this.f5002c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f5001b == null ? 0 : this.f5001b.length;
                    Object obj = new C0794v[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5001b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0794v();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0794v();
                    aVar.a(obj[a]);
                    this.f5001b = obj;
                    continue;
                case 18:
                    this.f5002c = aVar.f();
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
