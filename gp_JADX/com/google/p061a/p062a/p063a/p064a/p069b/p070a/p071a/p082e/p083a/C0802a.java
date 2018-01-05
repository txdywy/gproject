package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p082e.p083a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0802a extends C0758b {
    public String f5076a;
    public long f5077b;
    public byte[] f5078c;
    public al[] f5079d;

    public C0802a() {
        this.f5076a = "";
        this.f5077b = 0;
        this.f5078c = l.l;
        this.f5079d = al.m5297a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5076a == null || this.f5076a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5076a);
        }
        if (this.f5079d != null && this.f5079d.length > 0) {
            for (C0757i c0757i : this.f5079d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f5077b != 0) {
            codedOutputByteBufferNano.b(4, this.f5077b);
        }
        if (!Arrays.equals(this.f5078c, l.l)) {
            codedOutputByteBufferNano.a(5, this.f5078c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5076a == null || this.f5076a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5076a);
        }
        if (this.f5079d != null && this.f5079d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5079d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f5077b != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f5077b);
        }
        if (Arrays.equals(this.f5078c, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(5, this.f5078c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5076a = aVar.f();
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f5079d == null ? 0 : this.f5079d.length;
                    Object obj = new al[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5079d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new al();
                    aVar.a(obj[a]);
                    this.f5079d = obj;
                    continue;
                case 32:
                    this.f5077b = aVar.j();
                    continue;
                case 42:
                    this.f5078c = aVar.g();
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
