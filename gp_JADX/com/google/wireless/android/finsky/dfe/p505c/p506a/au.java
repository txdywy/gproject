package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class au extends b {
    public int f37126a;
    public aw f37127b;
    public ax f37128c;
    public ay f37129d;
    public bd f37130e;
    public bg f37131f;
    public bk f37132g;
    public bi f37133h;
    public az f37134i;

    public final ax m35137d() {
        if (this.f37126a == 1) {
            return this.f37128c;
        }
        return null;
    }

    public final ay m35138e() {
        if (this.f37126a == 2) {
            return this.f37129d;
        }
        return null;
    }

    public final bi m35139f() {
        if (this.f37126a == 6) {
            return this.f37133h;
        }
        return null;
    }

    public au() {
        this.f37126a = -1;
        this.f37126a = -1;
        this.f37127b = null;
        this.f37126a = -1;
        this.f37128c = null;
        this.f37126a = -1;
        this.f37129d = null;
        this.f37126a = -1;
        this.f37130e = null;
        this.f37126a = -1;
        this.f37131f = null;
        this.f37126a = -1;
        this.f37132g = null;
        this.f37126a = -1;
        this.f37133h = null;
        this.f37126a = -1;
        this.f37134i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35135a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37126a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f37127b);
        }
        if (this.f37126a == 1) {
            codedOutputByteBufferNano.m33532b(2, this.f37128c);
        }
        if (this.f37126a == 2) {
            codedOutputByteBufferNano.m33532b(3, this.f37129d);
        }
        if (this.f37126a == 3) {
            codedOutputByteBufferNano.m33532b(4, this.f37130e);
        }
        if (this.f37126a == 4) {
            codedOutputByteBufferNano.m33532b(5, this.f37131f);
        }
        if (this.f37126a == 5) {
            codedOutputByteBufferNano.m33532b(6, this.f37132g);
        }
        if (this.f37126a == 6) {
            codedOutputByteBufferNano.m33532b(7, this.f37133h);
        }
        if (this.f37126a == 7) {
            codedOutputByteBufferNano.m33532b(8, this.f37134i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35136b() {
        int b = super.b();
        if (this.f37126a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37127b);
        }
        if (this.f37126a == 1) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37128c);
        }
        if (this.f37126a == 2) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37129d);
        }
        if (this.f37126a == 3) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37130e);
        }
        if (this.f37126a == 4) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37131f);
        }
        if (this.f37126a == 5) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37132g);
        }
        if (this.f37126a == 6) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37133h);
        }
        if (this.f37126a == 7) {
            return b + CodedOutputByteBufferNano.m33503d(8, this.f37134i);
        }
        return b;
    }

    public final /* synthetic */ i m35134a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37127b == null) {
                        this.f37127b = new aw();
                    }
                    c7213a.m33552a(this.f37127b);
                    this.f37126a = 0;
                    continue;
                case 18:
                    if (this.f37128c == null) {
                        this.f37128c = new ax();
                    }
                    c7213a.m33552a(this.f37128c);
                    this.f37126a = 1;
                    continue;
                case 26:
                    if (this.f37129d == null) {
                        this.f37129d = new ay();
                    }
                    c7213a.m33552a(this.f37129d);
                    this.f37126a = 2;
                    continue;
                case 34:
                    if (this.f37130e == null) {
                        this.f37130e = new bd();
                    }
                    c7213a.m33552a(this.f37130e);
                    this.f37126a = 3;
                    continue;
                case 42:
                    if (this.f37131f == null) {
                        this.f37131f = new bg();
                    }
                    c7213a.m33552a(this.f37131f);
                    this.f37126a = 4;
                    continue;
                case 50:
                    if (this.f37132g == null) {
                        this.f37132g = new bk();
                    }
                    c7213a.m33552a(this.f37132g);
                    this.f37126a = 5;
                    continue;
                case 58:
                    if (this.f37133h == null) {
                        this.f37133h = new bi();
                    }
                    c7213a.m33552a(this.f37133h);
                    this.f37126a = 6;
                    continue;
                case 66:
                    if (this.f37134i == null) {
                        this.f37134i = new az();
                    }
                    c7213a.m33552a(this.f37134i);
                    this.f37126a = 7;
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
