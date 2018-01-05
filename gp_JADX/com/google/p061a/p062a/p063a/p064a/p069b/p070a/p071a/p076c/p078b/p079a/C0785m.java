package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0785m extends C0758b {
    public String f4953a;
    public byte[] f4954b;
    public String f4955c;
    public at[] f4956d;

    public C0785m() {
        this.f4953a = "";
        this.f4954b = l.l;
        this.f4955c = "";
        this.f4956d = at.m5344a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4953a == null || this.f4953a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4953a);
        }
        if (!Arrays.equals(this.f4954b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4954b);
        }
        if (!(this.f4955c == null || this.f4955c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4955c);
        }
        if (this.f4956d != null && this.f4956d.length > 0) {
            for (C0757i c0757i : this.f4956d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4953a == null || this.f4953a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4953a);
        }
        if (!Arrays.equals(this.f4954b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4954b);
        }
        if (!(this.f4955c == null || this.f4955c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4955c);
        }
        if (this.f4956d == null || this.f4956d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f4956d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(4, c0757i);
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
                    this.f4953a = aVar.f();
                    continue;
                case 18:
                    this.f4954b = aVar.g();
                    continue;
                case 26:
                    this.f4955c = aVar.f();
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f4956d == null ? 0 : this.f4956d.length;
                    Object obj = new at[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4956d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new at();
                    aVar.a(obj[a]);
                    this.f4956d = obj;
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
