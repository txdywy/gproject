package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7313o extends b {
    public int f36295a;
    public String f36296b;
    public String f36297c;
    public boolean f36298d;
    public String f36299e;
    public String f36300f;
    public String f36301g;
    public String f36302h;

    public C7313o() {
        this.f36295a = -1;
        this.f36296b = "";
        this.f36297c = "";
        this.f36295a = -1;
        this.f36295a = -1;
        this.f36295a = -1;
        this.f36295a = -1;
        this.f36295a = -1;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34575a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36296b == null || this.f36296b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36296b);
        }
        if (!(this.f36297c == null || this.f36297c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36297c);
        }
        if (this.f36295a == 1) {
            codedOutputByteBufferNano.m33521a(3, this.f36299e);
        }
        if (this.f36295a == 2) {
            codedOutputByteBufferNano.m33521a(4, this.f36300f);
        }
        if (this.f36295a == 3) {
            codedOutputByteBufferNano.m33521a(5, this.f36301g);
        }
        if (this.f36295a == 0) {
            codedOutputByteBufferNano.m33522a(6, this.f36298d);
        }
        if (this.f36295a == 4) {
            codedOutputByteBufferNano.m33521a(7, this.f36302h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34576b() {
        int b = super.b();
        if (!(this.f36296b == null || this.f36296b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36296b);
        }
        if (!(this.f36297c == null || this.f36297c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36297c);
        }
        if (this.f36295a == 1) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36299e);
        }
        if (this.f36295a == 2) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36300f);
        }
        if (this.f36295a == 3) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36301g);
        }
        if (this.f36295a == 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f36295a == 4) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f36302h);
        }
        return b;
    }

    public final /* synthetic */ i m34574a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36296b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36297c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36299e = c7213a.m33564f();
                    this.f36295a = 1;
                    continue;
                case 34:
                    this.f36300f = c7213a.m33564f();
                    this.f36295a = 2;
                    continue;
                case 42:
                    this.f36301g = c7213a.m33564f();
                    this.f36295a = 3;
                    continue;
                case 48:
                    this.f36298d = c7213a.m33563e();
                    this.f36295a = 0;
                    continue;
                case 58:
                    this.f36302h = c7213a.m33564f();
                    this.f36295a = 4;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
