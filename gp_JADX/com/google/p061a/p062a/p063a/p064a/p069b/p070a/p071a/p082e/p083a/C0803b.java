package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p082e.p083a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0803b extends C0758b {
    public String f5080a;
    public long f5081b;
    public byte[] f5082c;
    public at[] f5083d;

    public C0803b() {
        this.f5080a = "";
        this.f5081b = 0;
        this.f5082c = l.l;
        this.f5083d = at.m5344a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5080a == null || this.f5080a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5080a);
        }
        if (this.f5083d != null && this.f5083d.length > 0) {
            for (C0757i c0757i : this.f5083d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (!Arrays.equals(this.f5082c, l.l)) {
            codedOutputByteBufferNano.a(3, this.f5082c);
        }
        if (this.f5081b != 0) {
            codedOutputByteBufferNano.b(4, this.f5081b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5080a == null || this.f5080a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5080a);
        }
        if (this.f5083d != null && this.f5083d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5083d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (!Arrays.equals(this.f5082c, l.l)) {
            b += CodedOutputByteBufferNano.b(3, this.f5082c);
        }
        if (this.f5081b != 0) {
            return b + CodedOutputByteBufferNano.f(4, this.f5081b);
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
                    this.f5080a = aVar.f();
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f5083d == null ? 0 : this.f5083d.length;
                    Object obj = new at[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5083d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new at();
                    aVar.a(obj[a]);
                    this.f5083d = obj;
                    continue;
                case 26:
                    this.f5082c = aVar.g();
                    continue;
                case 32:
                    this.f5081b = aVar.j();
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
