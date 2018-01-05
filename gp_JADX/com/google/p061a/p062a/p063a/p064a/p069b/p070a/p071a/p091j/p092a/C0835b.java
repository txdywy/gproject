package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p091j.p092a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0835b extends C0758b {
    public String f5298a;
    public long f5299b;
    public byte[] f5300c;
    public at[] f5301d;

    public C0835b() {
        this.f5298a = "";
        this.f5299b = 0;
        this.f5300c = l.l;
        this.f5301d = at.m5344a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5298a == null || this.f5298a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5298a);
        }
        if (this.f5301d != null && this.f5301d.length > 0) {
            for (C0757i c0757i : this.f5301d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (!Arrays.equals(this.f5300c, l.l)) {
            codedOutputByteBufferNano.a(4, this.f5300c);
        }
        if (this.f5299b != 0) {
            codedOutputByteBufferNano.b(6, this.f5299b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5298a == null || this.f5298a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5298a);
        }
        if (this.f5301d != null && this.f5301d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5301d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (!Arrays.equals(this.f5300c, l.l)) {
            b += CodedOutputByteBufferNano.b(4, this.f5300c);
        }
        if (this.f5299b != 0) {
            return b + CodedOutputByteBufferNano.f(6, this.f5299b);
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
                    this.f5298a = aVar.f();
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f5301d == null ? 0 : this.f5301d.length;
                    Object obj = new at[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5301d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new at();
                    aVar.a(obj[a]);
                    this.f5301d = obj;
                    continue;
                case 34:
                    this.f5300c = aVar.g();
                    continue;
                case 48:
                    this.f5299b = aVar.j();
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
