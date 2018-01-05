package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cf extends b {
    public int f35932a;
    public cg f35933b;
    public String f35934c;
    public String f35935d;
    public String f35936e;
    public int f35937f;
    public boolean f35938g;
    public C7294z f35939h;
    public al f35940i;
    public int f35941j;

    public final cf m34296a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f35932a |= 4;
        this.f35936e = str;
        return this;
    }

    public final cf m34295a(int i) {
        this.f35932a |= 8;
        this.f35937f = i;
        return this;
    }

    public final cf m34300d() {
        this.f35932a |= 16;
        this.f35938g = true;
        return this;
    }

    public final cf m34299b(int i) {
        this.f35932a |= 32;
        this.f35941j = i;
        return this;
    }

    public cf() {
        this.f35932a = 0;
        this.f35933b = null;
        this.f35934c = "";
        this.f35935d = "";
        this.f35936e = "";
        this.f35937f = 0;
        this.f35938g = false;
        this.f35939h = null;
        this.f35940i = null;
        this.f35941j = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34297a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35933b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35933b);
        }
        if ((this.f35932a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35934c);
        }
        if ((this.f35932a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35935d);
        }
        if ((this.f35932a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f35936e);
        }
        if ((this.f35932a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35937f);
        }
        if ((this.f35932a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35938g);
        }
        if (this.f35939h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f35939h);
        }
        if (this.f35940i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f35940i);
        }
        if ((this.f35932a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35941j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34298b() {
        int b = super.b();
        if (this.f35933b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35933b);
        }
        if ((this.f35932a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35934c);
        }
        if ((this.f35932a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35935d);
        }
        if ((this.f35932a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f35936e);
        }
        if ((this.f35932a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35937f);
        }
        if ((this.f35932a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f35939h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f35939h);
        }
        if (this.f35940i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f35940i);
        }
        if ((this.f35932a & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(9, this.f35941j);
        }
        return b;
    }

    public final /* synthetic */ i m34294a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35933b == null) {
                        this.f35933b = new cg();
                    }
                    c7213a.m33552a(this.f35933b);
                    continue;
                case 18:
                    this.f35934c = c7213a.m33564f();
                    this.f35932a |= 1;
                    continue;
                case 26:
                    this.f35935d = c7213a.m33564f();
                    this.f35932a |= 2;
                    continue;
                case 34:
                    this.f35936e = c7213a.m33564f();
                    this.f35932a |= 4;
                    continue;
                case 40:
                    this.f35937f = c7213a.m33567i();
                    this.f35932a |= 8;
                    continue;
                case 48:
                    this.f35938g = c7213a.m33563e();
                    this.f35932a |= 16;
                    continue;
                case 58:
                    if (this.f35939h == null) {
                        this.f35939h = new C7294z();
                    }
                    c7213a.m33552a(this.f35939h);
                    continue;
                case 66:
                    if (this.f35940i == null) {
                        this.f35940i = new al();
                    }
                    c7213a.m33552a(this.f35940i);
                    continue;
                case 72:
                    this.f35941j = c7213a.m33567i();
                    this.f35932a |= 32;
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
