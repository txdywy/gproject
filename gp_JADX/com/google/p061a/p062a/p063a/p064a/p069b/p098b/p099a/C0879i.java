package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.h.c.c.b.d.c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0865c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0868f;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0870h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0879i extends C0758b {
    public int f5598a;
    public C0870h f5599b;
    public C0867e f5600c;
    public C0868f f5601d;
    public boolean f5602e;
    public int f5603f;
    public String f5604g;
    public C0874d f5605h;
    public boolean f5606i;
    public long f5607j;
    public byte[] f5608k;
    public C0865c f5609l;

    public C0879i() {
        this.f5598a = -1;
        this.f5599b = null;
        this.f5600c = null;
        this.f5601d = null;
        this.f5602e = false;
        this.f5603f = 0;
        this.f5604g = "";
        this.f5598a = -1;
        this.f5605h = null;
        this.f5598a = -1;
        this.f5607j = 0;
        this.f5608k = l.l;
        this.f5609l = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5604g == null || this.f5604g.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5604g);
        }
        if (this.f5598a == 0) {
            codedOutputByteBufferNano.b(2, this.f5605h);
        }
        if (this.f5599b != null) {
            codedOutputByteBufferNano.b(3, this.f5599b);
        }
        if (this.f5600c != null) {
            codedOutputByteBufferNano.b(4, this.f5600c);
        }
        if (this.f5602e) {
            codedOutputByteBufferNano.a(5, this.f5602e);
        }
        if (this.f5598a == 1) {
            codedOutputByteBufferNano.a(6, this.f5606i);
        }
        if (this.f5607j != 0) {
            codedOutputByteBufferNano.b(7, this.f5607j);
        }
        if (this.f5601d != null) {
            codedOutputByteBufferNano.b(8, this.f5601d);
        }
        if (this.f5603f != 0) {
            codedOutputByteBufferNano.a(9, this.f5603f);
        }
        if (!Arrays.equals(this.f5608k, l.l)) {
            codedOutputByteBufferNano.a(10, this.f5608k);
        }
        if (this.f5609l != null) {
            codedOutputByteBufferNano.b(12, this.f5609l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5604g == null || this.f5604g.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5604g);
        }
        if (this.f5598a == 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5605h);
        }
        if (this.f5599b != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5599b);
        }
        if (this.f5600c != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5600c);
        }
        if (this.f5602e) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (this.f5598a == 1) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f5607j != 0) {
            b += CodedOutputByteBufferNano.f(7, this.f5607j);
        }
        if (this.f5601d != null) {
            b += CodedOutputByteBufferNano.d(8, this.f5601d);
        }
        if (this.f5603f != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f5603f);
        }
        if (!Arrays.equals(this.f5608k, l.l)) {
            b += CodedOutputByteBufferNano.b(10, this.f5608k);
        }
        if (this.f5609l != null) {
            return b + CodedOutputByteBufferNano.d(12, this.f5609l);
        }
        return b;
    }

    private final C0879i m5501b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5604g = aVar.f();
                    continue;
                case 18:
                    if (this.f5605h == null) {
                        this.f5605h = new C0874d();
                    }
                    aVar.a(this.f5605h);
                    this.f5598a = 0;
                    continue;
                case 26:
                    if (this.f5599b == null) {
                        this.f5599b = new C0870h();
                    }
                    aVar.a(this.f5599b);
                    continue;
                case 34:
                    if (this.f5600c == null) {
                        this.f5600c = new C0867e();
                    }
                    aVar.a(this.f5600c);
                    continue;
                case 40:
                    this.f5602e = aVar.e();
                    continue;
                case 48:
                    this.f5606i = aVar.e();
                    this.f5598a = 1;
                    continue;
                case 56:
                    this.f5607j = aVar.j();
                    continue;
                case 66:
                    if (this.f5601d == null) {
                        this.f5601d = new C0868f();
                    }
                    aVar.a(this.f5601d);
                    continue;
                case 72:
                    int o = aVar.o();
                    try {
                        this.f5603f = c.a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 82:
                    this.f5608k = aVar.g();
                    continue;
                case 98:
                    if (this.f5609l == null) {
                        this.f5609l = new C0865c();
                    }
                    aVar.a(this.f5609l);
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5501b(aVar);
    }
}
