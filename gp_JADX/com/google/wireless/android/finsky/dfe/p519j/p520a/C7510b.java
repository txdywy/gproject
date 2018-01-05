package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7510b extends b {
    public int f38206a;
    public C7514f f38207b;
    public C7517i f38208c;
    public C7515g f38209d;
    public C7511c f38210e;

    public final C7514f m35903d() {
        if (this.f38206a == 0) {
            return this.f38207b;
        }
        return null;
    }

    public final C7517i m35904e() {
        if (this.f38206a == 1) {
            return this.f38208c;
        }
        return null;
    }

    public final C7515g m35905f() {
        if (this.f38206a == 2) {
            return this.f38209d;
        }
        return null;
    }

    public final C7511c m35906g() {
        if (this.f38206a == 3) {
            return this.f38210e;
        }
        return null;
    }

    public C7510b() {
        this.f38206a = -1;
        this.f38206a = -1;
        this.f38207b = null;
        this.f38206a = -1;
        this.f38208c = null;
        this.f38206a = -1;
        this.f38209d = null;
        this.f38206a = -1;
        this.f38210e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35901a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38206a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f38207b);
        }
        if (this.f38206a == 3) {
            codedOutputByteBufferNano.m33532b(2, this.f38210e);
        }
        if (this.f38206a == 1) {
            codedOutputByteBufferNano.m33532b(3, this.f38208c);
        }
        if (this.f38206a == 2) {
            codedOutputByteBufferNano.m33532b(4, this.f38209d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35902b() {
        int b = super.b();
        if (this.f38206a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38207b);
        }
        if (this.f38206a == 3) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38210e);
        }
        if (this.f38206a == 1) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38208c);
        }
        if (this.f38206a == 2) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f38209d);
        }
        return b;
    }

    public final /* synthetic */ i m35900a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38207b == null) {
                        this.f38207b = new C7514f();
                    }
                    c7213a.m33552a(this.f38207b);
                    this.f38206a = 0;
                    continue;
                case 18:
                    if (this.f38210e == null) {
                        this.f38210e = new C7511c();
                    }
                    c7213a.m33552a(this.f38210e);
                    this.f38206a = 3;
                    continue;
                case 26:
                    if (this.f38208c == null) {
                        this.f38208c = new C7517i();
                    }
                    c7213a.m33552a(this.f38208c);
                    this.f38206a = 1;
                    continue;
                case 34:
                    if (this.f38209d == null) {
                        this.f38209d = new C7515g();
                    }
                    c7213a.m33552a(this.f38209d);
                    this.f38206a = 2;
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
