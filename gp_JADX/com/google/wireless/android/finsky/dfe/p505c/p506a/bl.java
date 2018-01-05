package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bl extends b {
    public int f37195a;
    public cr f37196b;
    public byte[] f37197c;
    public cw f37198d;
    public bt f37199e;
    public db f37200f;
    public cl f37201g;
    public di f37202h;
    public dj f37203i;
    public cq f37204j;
    public bx f37205k;
    public by f37206l;

    public bl() {
        this.f37195a = 0;
        this.f37196b = null;
        this.f37197c = C7222l.f35479l;
        this.f37198d = null;
        this.f37199e = null;
        this.f37200f = null;
        this.f37201g = null;
        this.f37202h = null;
        this.f37203i = null;
        this.f37204j = null;
        this.f37205k = null;
        this.f37206l = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35192a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37196b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37196b);
        }
        if (this.f37198d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37198d);
        }
        if (this.f37199e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37199e);
        }
        if (this.f37200f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37200f);
        }
        if (this.f37201g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37201g);
        }
        if (this.f37202h != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37202h);
        }
        if ((this.f37195a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f37197c);
        }
        if (this.f37203i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37203i);
        }
        if (this.f37204j != null) {
            codedOutputByteBufferNano.m33532b(10, this.f37204j);
        }
        if (this.f37205k != null) {
            codedOutputByteBufferNano.m33532b(11, this.f37205k);
        }
        if (this.f37206l != null) {
            codedOutputByteBufferNano.m33532b(12, this.f37206l);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35193b() {
        int b = super.b();
        if (this.f37196b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37196b);
        }
        if (this.f37198d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37198d);
        }
        if (this.f37199e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37199e);
        }
        if (this.f37200f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37200f);
        }
        if (this.f37201g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37201g);
        }
        if (this.f37202h != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37202h);
        }
        if ((this.f37195a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f37197c);
        }
        if (this.f37203i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37203i);
        }
        if (this.f37204j != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f37204j);
        }
        if (this.f37205k != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f37205k);
        }
        if (this.f37206l != null) {
            return b + CodedOutputByteBufferNano.m33503d(12, this.f37206l);
        }
        return b;
    }

    public final /* synthetic */ i m35191a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37196b == null) {
                        this.f37196b = new cr();
                    }
                    c7213a.m33552a(this.f37196b);
                    continue;
                case 18:
                    if (this.f37198d == null) {
                        this.f37198d = new cw();
                    }
                    c7213a.m33552a(this.f37198d);
                    continue;
                case 26:
                    if (this.f37199e == null) {
                        this.f37199e = new bt();
                    }
                    c7213a.m33552a(this.f37199e);
                    continue;
                case 34:
                    if (this.f37200f == null) {
                        this.f37200f = new db();
                    }
                    c7213a.m33552a(this.f37200f);
                    continue;
                case 42:
                    if (this.f37201g == null) {
                        this.f37201g = new cl();
                    }
                    c7213a.m33552a(this.f37201g);
                    continue;
                case 50:
                    if (this.f37202h == null) {
                        this.f37202h = new di();
                    }
                    c7213a.m33552a(this.f37202h);
                    continue;
                case 58:
                    this.f37197c = c7213a.m33565g();
                    this.f37195a |= 1;
                    continue;
                case 66:
                    if (this.f37203i == null) {
                        this.f37203i = new dj();
                    }
                    c7213a.m33552a(this.f37203i);
                    continue;
                case 82:
                    if (this.f37204j == null) {
                        this.f37204j = new cq();
                    }
                    c7213a.m33552a(this.f37204j);
                    continue;
                case 90:
                    if (this.f37205k == null) {
                        this.f37205k = new bx();
                    }
                    c7213a.m33552a(this.f37205k);
                    continue;
                case 98:
                    if (this.f37206l == null) {
                        this.f37206l = new by();
                    }
                    c7213a.m33552a(this.f37206l);
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
