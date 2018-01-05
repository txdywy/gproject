package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0791s extends C0758b {
    public static volatile C0791s[] f4995a;
    public String f4996b;
    public byte[] f4997c;
    public C0787o[] f4998d;
    public String f4999e;

    public static C0791s[] m5068a() {
        if (f4995a == null) {
            synchronized (h.b) {
                if (f4995a == null) {
                    f4995a = new C0791s[0];
                }
            }
        }
        return f4995a;
    }

    public C0791s() {
        this.f4996b = "";
        this.f4997c = l.l;
        this.f4998d = C0787o.m5053a();
        this.f4999e = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4996b == null || this.f4996b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4996b);
        }
        if (!Arrays.equals(this.f4997c, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4997c);
        }
        if (this.f4998d != null && this.f4998d.length > 0) {
            for (C0757i c0757i : this.f4998d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (!(this.f4999e == null || this.f4999e.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f4999e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4996b == null || this.f4996b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4996b);
        }
        if (!Arrays.equals(this.f4997c, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4997c);
        }
        if (this.f4998d != null && this.f4998d.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f4998d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f4999e == null || this.f4999e.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(4, this.f4999e);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4996b = aVar.f();
                    continue;
                case 18:
                    this.f4997c = aVar.g();
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f4998d == null ? 0 : this.f4998d.length;
                    Object obj = new C0787o[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4998d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0787o();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0787o();
                    aVar.a(obj[a]);
                    this.f4998d = obj;
                    continue;
                case 34:
                    this.f4999e = aVar.f();
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
