package com.google.p061a.p062a.p063a.p064a.p065a.p068b;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0761a extends C0758b {
    public static volatile C0761a[] f4741a;
    public String f4742b;
    public String f4743c;
    public C0762b[] f4744d;

    public static C0761a[] m4928a() {
        if (f4741a == null) {
            synchronized (h.b) {
                if (f4741a == null) {
                    f4741a = new C0761a[0];
                }
            }
        }
        return f4741a;
    }

    public C0761a() {
        this.f4742b = "";
        this.f4743c = "";
        this.f4744d = C0762b.m4932a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4742b == null || this.f4742b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4742b);
        }
        if (!(this.f4743c == null || this.f4743c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4743c);
        }
        if (this.f4744d != null && this.f4744d.length > 0) {
            for (C0757i c0757i : this.f4744d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4742b == null || this.f4742b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4742b);
        }
        if (!(this.f4743c == null || this.f4743c.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4743c);
        }
        if (this.f4744d == null || this.f4744d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f4744d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
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
                    this.f4742b = aVar.f();
                    continue;
                case 18:
                    this.f4743c = aVar.f();
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f4744d == null ? 0 : this.f4744d.length;
                    Object obj = new C0762b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4744d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0762b();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0762b();
                    aVar.a(obj[a]);
                    this.f4744d = obj;
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
