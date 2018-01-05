package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0820q extends C0758b {
    public String f5201a;
    public byte[] f5202b;
    public C0821r[] f5203c;
    public String f5204d;

    public C0820q() {
        this.f5201a = "";
        this.f5202b = l.l;
        this.f5203c = C0821r.m5195a();
        this.f5204d = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5201a == null || this.f5201a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5201a);
        }
        if (!Arrays.equals(this.f5202b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5202b);
        }
        if (this.f5203c != null && this.f5203c.length > 0) {
            for (C0757i c0757i : this.f5203c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (!(this.f5204d == null || this.f5204d.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5204d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5201a == null || this.f5201a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5201a);
        }
        if (!Arrays.equals(this.f5202b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5202b);
        }
        if (this.f5203c != null && this.f5203c.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5203c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f5204d == null || this.f5204d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(4, this.f5204d);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5201a = aVar.f();
                    continue;
                case 18:
                    this.f5202b = aVar.g();
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f5203c == null ? 0 : this.f5203c.length;
                    Object obj = new C0821r[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5203c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0821r();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0821r();
                    aVar.a(obj[a]);
                    this.f5203c = obj;
                    continue;
                case 34:
                    this.f5204d = aVar.f();
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
