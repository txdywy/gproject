package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ct extends b {
    public int f36012a;
    public long f36013b;
    public String f36014c;
    public String f36015d;
    public int f36016e;
    public C7287s[] f36017f;

    public final ct m34367a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36012a |= 2;
        this.f36014c = str;
        return this;
    }

    public final ct m34370b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36012a |= 4;
        this.f36015d = str;
        return this;
    }

    public ct() {
        this.f36012a = 0;
        this.f36013b = 0;
        this.f36014c = "";
        this.f36015d = "";
        this.f36016e = 0;
        this.f36017f = C7287s.m34444d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34368a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36012a & 1) != 0) {
            codedOutputByteBufferNano.m33519a(1, this.f36013b);
        }
        if ((this.f36012a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36014c);
        }
        if ((this.f36012a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36015d);
        }
        if ((this.f36012a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36016e);
        }
        if (this.f36017f != null && this.f36017f.length > 0) {
            for (i iVar : this.f36017f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34369b() {
        int b = super.b();
        if ((this.f36012a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33505e(1, this.f36013b);
        }
        if ((this.f36012a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36014c);
        }
        if ((this.f36012a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36015d);
        }
        if ((this.f36012a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f36016e);
        }
        if (this.f36017f == null || this.f36017f.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36017f) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(5, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m34366a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36013b = c7213a.m33568j();
                    this.f36012a |= 1;
                    continue;
                case 18:
                    this.f36014c = c7213a.m33564f();
                    this.f36012a |= 2;
                    continue;
                case 26:
                    this.f36015d = c7213a.m33564f();
                    this.f36012a |= 4;
                    continue;
                case 32:
                    this.f36016e = c7213a.m33567i();
                    this.f36012a |= 8;
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36017f == null ? 0 : this.f36017f.length;
                    Object obj = new C7287s[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36017f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7287s();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7287s();
                    c7213a.m33552a(obj[a]);
                    this.f36017f = obj;
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
