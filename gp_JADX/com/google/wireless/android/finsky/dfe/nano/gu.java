package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p509e.p510a.C7445e;
import com.google.wireless.android.p360b.p361a.C7295a;

public final class gu extends b {
    public int f39129a;
    public com.google.wireless.android.b.a.b f39130b;
    public C7295a f39131c;
    public String f39132d;
    public gt f39133e;
    public C7445e f39134f;

    public gu() {
        this.f39129a = 0;
        this.f39130b = null;
        this.f39131c = null;
        this.f39132d = "";
        this.f39133e = null;
        this.f39134f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36535a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39130b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39130b);
        }
        if ((this.f39129a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39132d);
        }
        if (this.f39131c != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39131c);
        }
        if (this.f39133e != null) {
            codedOutputByteBufferNano.m33532b(6, this.f39133e);
        }
        if (this.f39134f != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39134f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36536b() {
        int b = super.b();
        if (this.f39130b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39130b);
        }
        if ((this.f39129a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39132d);
        }
        if (this.f39131c != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39131c);
        }
        if (this.f39133e != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f39133e);
        }
        if (this.f39134f != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f39134f);
        }
        return b;
    }

    public final /* synthetic */ i m36534a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39130b == null) {
                        this.f39130b = new com.google.wireless.android.b.a.b();
                    }
                    c7213a.m33552a(this.f39130b);
                    continue;
                case 26:
                    this.f39132d = c7213a.m33564f();
                    this.f39129a |= 1;
                    continue;
                case 34:
                    if (this.f39131c == null) {
                        this.f39131c = new C7295a();
                    }
                    c7213a.m33552a(this.f39131c);
                    continue;
                case 50:
                    if (this.f39133e == null) {
                        this.f39133e = new gt();
                    }
                    c7213a.m33552a(this.f39133e);
                    continue;
                case 58:
                    if (this.f39134f == null) {
                        this.f39134f = new C7445e();
                    }
                    c7213a.m33552a(this.f39134f);
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
