package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7451b extends b {
    public int f37839a;
    public String f37840b;
    public String f37841c;
    public ab f37842d;
    public ae f37843e;
    public ai f37844f;
    public int f37845g;
    public ah f37846h;
    public long f37847i;

    public C7451b() {
        this.f37839a = 0;
        this.f37840b = "";
        this.f37841c = "";
        this.f37842d = null;
        this.f37843e = null;
        this.f37844f = null;
        this.f37845g = 0;
        this.f37846h = null;
        this.f37847i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35627a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37839a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37840b);
        }
        if ((this.f37839a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37841c);
        }
        if (this.f37842d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37842d);
        }
        if (this.f37843e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37843e);
        }
        if (this.f37844f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37844f);
        }
        if ((this.f37839a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37845g);
        }
        if (this.f37846h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37846h);
        }
        if ((this.f37839a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f37847i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35628b() {
        int b = super.b();
        if ((this.f37839a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37840b);
        }
        if ((this.f37839a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37841c);
        }
        if (this.f37842d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37842d);
        }
        if (this.f37843e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37843e);
        }
        if (this.f37844f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37844f);
        }
        if ((this.f37839a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37845g);
        }
        if (this.f37846h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37846h);
        }
        if ((this.f37839a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(8, this.f37847i);
        }
        return b;
    }

    private final C7451b m35625b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37840b = c7213a.m33564f();
                    this.f37839a |= 1;
                    continue;
                case 18:
                    this.f37841c = c7213a.m33564f();
                    this.f37839a |= 2;
                    continue;
                case 26:
                    if (this.f37842d == null) {
                        this.f37842d = new ab();
                    }
                    c7213a.m33552a(this.f37842d);
                    continue;
                case 34:
                    if (this.f37843e == null) {
                        this.f37843e = new ae();
                    }
                    c7213a.m33552a(this.f37843e);
                    continue;
                case 42:
                    if (this.f37844f == null) {
                        this.f37844f = new ai();
                    }
                    c7213a.m33552a(this.f37844f);
                    continue;
                case 48:
                    this.f37839a |= 4;
                    int o = c7213a.m33573o();
                    try {
                        this.f37845g = C7450a.m35573a(c7213a.m33567i());
                        this.f37839a |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 58:
                    if (this.f37846h == null) {
                        this.f37846h = new ah();
                    }
                    c7213a.m33552a(this.f37846h);
                    continue;
                case 64:
                    this.f37847i = c7213a.m33568j();
                    this.f37839a |= 8;
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

    public final /* synthetic */ i m35626a(C7213a c7213a) {
        return m35625b(c7213a);
    }
}
