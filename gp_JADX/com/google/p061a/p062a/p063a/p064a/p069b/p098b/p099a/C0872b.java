package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.h.c.c.b.d.c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0868f;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0870h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0872b extends C0758b {
    public C0870h f5543a;
    public C0867e f5544b;
    public C0868f f5545c;
    public C0874d f5546d;
    public boolean f5547e;
    public int f5548f;
    public String f5549g;
    public long f5550h;
    public byte[] f5551i;

    public C0872b() {
        this.f5543a = null;
        this.f5544b = null;
        this.f5545c = null;
        this.f5546d = null;
        this.f5547e = false;
        this.f5548f = 0;
        this.f5549g = "";
        this.f5550h = 0;
        this.f5551i = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5546d != null) {
            codedOutputByteBufferNano.b(4, this.f5546d);
        }
        if (this.f5543a != null) {
            codedOutputByteBufferNano.b(5, this.f5543a);
        }
        if (this.f5544b != null) {
            codedOutputByteBufferNano.b(6, this.f5544b);
        }
        if (this.f5547e) {
            codedOutputByteBufferNano.a(8, this.f5547e);
        }
        if (this.f5545c != null) {
            codedOutputByteBufferNano.b(9, this.f5545c);
        }
        if (this.f5548f != 0) {
            codedOutputByteBufferNano.a(10, this.f5548f);
        }
        if (!(this.f5549g == null || this.f5549g.equals(""))) {
            codedOutputByteBufferNano.a(11, this.f5549g);
        }
        if (!Arrays.equals(this.f5551i, l.l)) {
            codedOutputByteBufferNano.a(12, this.f5551i);
        }
        if (this.f5550h != 0) {
            codedOutputByteBufferNano.b(13, this.f5550h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5546d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5546d);
        }
        if (this.f5543a != null) {
            b += CodedOutputByteBufferNano.d(5, this.f5543a);
        }
        if (this.f5544b != null) {
            b += CodedOutputByteBufferNano.d(6, this.f5544b);
        }
        if (this.f5547e) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f5545c != null) {
            b += CodedOutputByteBufferNano.d(9, this.f5545c);
        }
        if (this.f5548f != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f5548f);
        }
        if (!(this.f5549g == null || this.f5549g.equals(""))) {
            b += CodedOutputByteBufferNano.b(11, this.f5549g);
        }
        if (!Arrays.equals(this.f5551i, l.l)) {
            b += CodedOutputByteBufferNano.b(12, this.f5551i);
        }
        if (this.f5550h != 0) {
            return b + CodedOutputByteBufferNano.f(13, this.f5550h);
        }
        return b;
    }

    private final C0872b m5474b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f5546d == null) {
                        this.f5546d = new C0874d();
                    }
                    aVar.a(this.f5546d);
                    continue;
                case 42:
                    if (this.f5543a == null) {
                        this.f5543a = new C0870h();
                    }
                    aVar.a(this.f5543a);
                    continue;
                case 50:
                    if (this.f5544b == null) {
                        this.f5544b = new C0867e();
                    }
                    aVar.a(this.f5544b);
                    continue;
                case 64:
                    this.f5547e = aVar.e();
                    continue;
                case 74:
                    if (this.f5545c == null) {
                        this.f5545c = new C0868f();
                    }
                    aVar.a(this.f5545c);
                    continue;
                case 80:
                    int o = aVar.o();
                    try {
                        this.f5548f = c.a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 90:
                    this.f5549g = aVar.f();
                    continue;
                case 98:
                    this.f5551i = aVar.g();
                    continue;
                case 104:
                    this.f5550h = aVar.j();
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
        return m5474b(aVar);
    }
}
