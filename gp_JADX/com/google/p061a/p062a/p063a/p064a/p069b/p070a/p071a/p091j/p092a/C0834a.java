package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p091j.p092a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0834a extends C0758b {
    public static volatile C0834a[] f5293a;
    public String f5294b;
    public C0811h f5295c;
    public String f5296d;
    public al[] f5297e;

    public static C0834a[] m5247a() {
        if (f5293a == null) {
            synchronized (h.b) {
                if (f5293a == null) {
                    f5293a = new C0834a[0];
                }
            }
        }
        return f5293a;
    }

    public C0834a() {
        this.f5294b = "";
        this.f5295c = null;
        this.f5296d = "";
        this.f5297e = al.m5297a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5294b == null || this.f5294b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5294b);
        }
        if (!(this.f5296d == null || this.f5296d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5296d);
        }
        if (this.f5297e != null && this.f5297e.length > 0) {
            for (C0757i c0757i : this.f5297e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (this.f5295c != null) {
            codedOutputByteBufferNano.b(7, this.f5295c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5294b == null || this.f5294b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5294b);
        }
        if (!(this.f5296d == null || this.f5296d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5296d);
        }
        if (this.f5297e != null && this.f5297e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5297e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if (this.f5295c != null) {
            return b + CodedOutputByteBufferNano.d(7, this.f5295c);
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
                    this.f5294b = aVar.f();
                    continue;
                case 18:
                    this.f5296d = aVar.f();
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f5297e == null ? 0 : this.f5297e.length;
                    Object obj = new al[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5297e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new al();
                    aVar.a(obj[a]);
                    this.f5297e = obj;
                    continue;
                case 58:
                    if (this.f5295c == null) {
                        this.f5295c = new C0811h();
                    }
                    aVar.a(this.f5295c);
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
