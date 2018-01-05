package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class em extends b {
    public int f38783a;
    public String f38784b;
    public String f38785c;
    public String f38786d;
    public String f38787e;
    public String f38788f;
    public bd f38789g;
    public String f38790h;
    public String f38791i;

    public em() {
        this.f38783a = 0;
        this.f38784b = "";
        this.f38785c = "";
        this.f38786d = "";
        this.f38787e = "";
        this.f38788f = "";
        this.f38789g = null;
        this.f38790h = "";
        this.f38791i = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36344a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38783a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38784b);
        }
        if ((this.f38783a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38785c);
        }
        if ((this.f38783a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38786d);
        }
        if ((this.f38783a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38787e);
        }
        if ((this.f38783a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38788f);
        }
        if (this.f38789g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38789g);
        }
        if ((this.f38783a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38790h);
        }
        if ((this.f38783a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38791i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36345b() {
        int b = super.b();
        if ((this.f38783a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38784b);
        }
        if ((this.f38783a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38785c);
        }
        if ((this.f38783a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38786d);
        }
        if ((this.f38783a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38787e);
        }
        if ((this.f38783a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38788f);
        }
        if (this.f38789g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38789g);
        }
        if ((this.f38783a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38790h);
        }
        if ((this.f38783a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f38791i);
        }
        return b;
    }

    public final /* synthetic */ i m36343a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38784b = c7213a.m33564f();
                    this.f38783a |= 1;
                    continue;
                case 18:
                    this.f38785c = c7213a.m33564f();
                    this.f38783a |= 2;
                    continue;
                case 26:
                    this.f38786d = c7213a.m33564f();
                    this.f38783a |= 4;
                    continue;
                case 34:
                    this.f38787e = c7213a.m33564f();
                    this.f38783a |= 8;
                    continue;
                case 42:
                    this.f38788f = c7213a.m33564f();
                    this.f38783a |= 16;
                    continue;
                case 50:
                    if (this.f38789g == null) {
                        this.f38789g = new bd();
                    }
                    c7213a.m33552a(this.f38789g);
                    continue;
                case 58:
                    this.f38790h = c7213a.m33564f();
                    this.f38783a |= 32;
                    continue;
                case 66:
                    this.f38791i = c7213a.m33564f();
                    this.f38783a |= 64;
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
