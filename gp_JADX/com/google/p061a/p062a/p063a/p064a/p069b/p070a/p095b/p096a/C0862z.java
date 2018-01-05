package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0862z extends C0758b {
    public int f5499a;
    public int f5500b;
    public String f5501c;
    public boolean f5502d;
    public String f5503e;
    public String f5504f;
    public int[] f5505g;

    public C0862z() {
        this.f5499a = 0;
        this.f5500b = 0;
        this.f5501c = "";
        this.f5502d = false;
        this.f5503e = "";
        this.f5504f = "";
        this.f5505g = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5499a != 0) {
            codedOutputByteBufferNano.a(1, this.f5499a);
        }
        if (this.f5500b != 0) {
            codedOutputByteBufferNano.a(2, this.f5500b);
        }
        if (!(this.f5501c == null || this.f5501c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5501c);
        }
        if (this.f5502d) {
            codedOutputByteBufferNano.a(4, this.f5502d);
        }
        if (!(this.f5503e == null || this.f5503e.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5503e);
        }
        if (!(this.f5504f == null || this.f5504f.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5504f);
        }
        if (this.f5505g != null && this.f5505g.length > 0) {
            for (int a : this.f5505g) {
                codedOutputByteBufferNano.a(7, a);
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5499a != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5499a);
        }
        if (this.f5500b != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5500b);
        }
        if (!(this.f5501c == null || this.f5501c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5501c);
        }
        if (this.f5502d) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if (!(this.f5503e == null || this.f5503e.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5503e);
        }
        if (!(this.f5504f == null || this.f5504f.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5504f);
        }
        if (this.f5505g == null || this.f5505g.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f5505g.length) {
            i2 += CodedOutputByteBufferNano.c(this.f5505g[i]);
            i++;
        }
        return (b + i2) + (this.f5505g.length * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f5499a = aVar.i();
                    continue;
                case 16:
                    this.f5500b = aVar.i();
                    continue;
                case 26:
                    this.f5501c = aVar.f();
                    continue;
                case 32:
                    this.f5502d = aVar.e();
                    continue;
                case 42:
                    this.f5503e = aVar.f();
                    continue;
                case 50:
                    this.f5504f = aVar.f();
                    continue;
                case 56:
                    a2 = l.a(aVar, 56);
                    if (this.f5505g == null) {
                        a = 0;
                    } else {
                        a = this.f5505g.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5505g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f5505g = obj;
                    continue;
                case 58:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5505g == null ? 0 : this.f5505g.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5505g, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f5505g = obj2;
                    aVar.d(c);
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
