package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cj extends b {
    public int f37305a;
    public String f37306b;
    public String f37307c;
    public dm f37308d;
    public df f37309e;
    public ck f37310f;

    public cj() {
        this.f37305a = 0;
        this.f37306b = "";
        this.f37307c = "";
        this.f37308d = null;
        this.f37309e = null;
        this.f37310f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35272a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37305a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37306b);
        }
        if ((this.f37305a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37307c);
        }
        if (this.f37308d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37308d);
        }
        if (this.f37309e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37309e);
        }
        if (this.f37310f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37310f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35273b() {
        int b = super.b();
        if ((this.f37305a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37306b);
        }
        if ((this.f37305a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37307c);
        }
        if (this.f37308d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37308d);
        }
        if (this.f37309e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37309e);
        }
        if (this.f37310f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37310f);
        }
        return b;
    }

    public final /* synthetic */ i m35271a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37306b = c7213a.m33564f();
                    this.f37305a |= 1;
                    continue;
                case 18:
                    this.f37307c = c7213a.m33564f();
                    this.f37305a |= 2;
                    continue;
                case 26:
                    if (this.f37308d == null) {
                        this.f37308d = new dm();
                    }
                    c7213a.m33552a(this.f37308d);
                    continue;
                case 34:
                    if (this.f37309e == null) {
                        this.f37309e = new df();
                    }
                    c7213a.m33552a(this.f37309e);
                    continue;
                case 42:
                    if (this.f37310f == null) {
                        this.f37310f = new ck();
                    }
                    c7213a.m33552a(this.f37310f);
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
