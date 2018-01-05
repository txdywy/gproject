package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aj extends b {
    public int f37818a;
    public ai f37819b;
    public ae f37820c;
    public String f37821d;
    public String f37822e;
    public String f37823f;
    public int f37824g;
    public long f37825h;
    public long f37826i;

    public aj() {
        this.f37818a = 0;
        this.f37819b = null;
        this.f37820c = null;
        this.f37821d = "";
        this.f37822e = "";
        this.f37823f = "";
        this.f37824g = 0;
        this.f37825h = 0;
        this.f37826i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35613a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37819b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37819b);
        }
        if (this.f37820c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37820c);
        }
        if ((this.f37818a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37821d);
        }
        if ((this.f37818a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37822e);
        }
        if ((this.f37818a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37823f);
        }
        if ((this.f37818a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37824g);
        }
        if ((this.f37818a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f37825h);
        }
        if ((this.f37818a & 32) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f37826i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35614b() {
        int b = super.b();
        if (this.f37819b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37819b);
        }
        if (this.f37820c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37820c);
        }
        if ((this.f37818a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37821d);
        }
        if ((this.f37818a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37822e);
        }
        if ((this.f37818a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37823f);
        }
        if ((this.f37818a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37824g);
        }
        if ((this.f37818a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f37825h);
        }
        if ((this.f37818a & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(8, this.f37826i);
        }
        return b;
    }

    public final /* synthetic */ i m35612a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37819b == null) {
                        this.f37819b = new ai();
                    }
                    c7213a.m33552a(this.f37819b);
                    continue;
                case 18:
                    if (this.f37820c == null) {
                        this.f37820c = new ae();
                    }
                    c7213a.m33552a(this.f37820c);
                    continue;
                case 26:
                    this.f37821d = c7213a.m33564f();
                    this.f37818a |= 1;
                    continue;
                case 34:
                    this.f37822e = c7213a.m33564f();
                    this.f37818a |= 2;
                    continue;
                case 42:
                    this.f37823f = c7213a.m33564f();
                    this.f37818a |= 4;
                    continue;
                case 48:
                    this.f37824g = c7213a.m33567i();
                    this.f37818a |= 8;
                    continue;
                case 56:
                    this.f37825h = c7213a.m33568j();
                    this.f37818a |= 16;
                    continue;
                case 64:
                    this.f37826i = c7213a.m33568j();
                    this.f37818a |= 32;
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
