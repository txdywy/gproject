package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7353i extends b {
    public int f36761a;
    public String[] f36762b;
    public C7354j[] f36763c;
    public int f36764d;

    public C7353i() {
        this.f36761a = 0;
        this.f36762b = C7222l.f35477j;
        this.f36763c = C7354j.m34860d();
        this.f36764d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34858a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36762b != null && this.f36762b.length > 0) {
            for (String str : this.f36762b) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f36763c != null && this.f36763c.length > 0) {
            while (i < this.f36763c.length) {
                i iVar = this.f36763c[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33520a(2, iVar);
                }
                i++;
            }
        }
        if ((this.f36761a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36764d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34859b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f36762b == null || this.f36762b.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f36762b) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f36763c != null && this.f36763c.length > 0) {
            while (i2 < this.f36763c.length) {
                i iVar = this.f36763c[i2];
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33499c(2, iVar);
                }
                i2++;
            }
        }
        if ((this.f36761a & 1) != 0) {
            return i + CodedOutputByteBufferNano.m33502d(5, this.f36764d);
        }
        return i;
    }

    public final /* synthetic */ i m34857a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36762b == null ? 0 : this.f36762b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36762b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36762b = obj;
                    continue;
                case 19:
                    a2 = C7222l.m33624a(c7213a, 19);
                    a = this.f36763c == null ? 0 : this.f36763c.length;
                    obj = new C7354j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36763c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7354j();
                        c7213a.m33553a(obj[a], 2);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7354j();
                    c7213a.m33553a(obj[a], 2);
                    this.f36763c = obj;
                    continue;
                case 40:
                    this.f36764d = c7213a.m33567i();
                    this.f36761a |= 1;
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
