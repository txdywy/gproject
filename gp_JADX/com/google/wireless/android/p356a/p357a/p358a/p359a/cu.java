package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cu extends b {
    public int f36018a;
    public String f36019b;
    public String f36020c;
    public boolean f36021d;
    public boolean f36022e;
    public boolean f36023f;
    public boolean f36024g;
    public boolean f36025h;

    public final cu m34372a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36018a |= 2;
        this.f36020c = str;
        return this;
    }

    public cu() {
        this.f36018a = 0;
        this.f36019b = "";
        this.f36020c = "";
        this.f36021d = false;
        this.f36022e = false;
        this.f36023f = false;
        this.f36024g = false;
        this.f36025h = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34373a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36018a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36019b);
        }
        if ((this.f36018a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36020c);
        }
        if ((this.f36018a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36021d);
        }
        if ((this.f36018a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f36022e);
        }
        if ((this.f36018a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f36023f);
        }
        if ((this.f36018a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f36024g);
        }
        if ((this.f36018a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f36025h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34374b() {
        int b = super.b();
        if ((this.f36018a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36019b);
        }
        if ((this.f36018a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36020c);
        }
        if ((this.f36018a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36018a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f36018a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f36018a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f36018a & 64) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(7) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34371a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36019b = c7213a.m33564f();
                    this.f36018a |= 1;
                    continue;
                case 18:
                    this.f36020c = c7213a.m33564f();
                    this.f36018a |= 2;
                    continue;
                case 24:
                    this.f36021d = c7213a.m33563e();
                    this.f36018a |= 4;
                    continue;
                case 32:
                    this.f36022e = c7213a.m33563e();
                    this.f36018a |= 8;
                    continue;
                case 40:
                    this.f36023f = c7213a.m33563e();
                    this.f36018a |= 16;
                    continue;
                case 48:
                    this.f36024g = c7213a.m33563e();
                    this.f36018a |= 32;
                    continue;
                case 56:
                    this.f36025h = c7213a.m33563e();
                    this.f36018a |= 64;
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
