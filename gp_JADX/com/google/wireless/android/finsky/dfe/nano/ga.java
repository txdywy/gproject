package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ga extends b {
    public int f39056a;
    public String f39057b;
    public String f39058c;
    public boolean f39059d;
    public byte[] f39060e;
    public fy f39061f;
    public boolean f39062g;
    public ai[] f39063h;
    public cv[] f39064i;
    public fz[] f39065j;
    public String f39066k;

    public ga() {
        this.f39056a = 0;
        this.f39057b = "";
        this.f39058c = "";
        this.f39059d = false;
        this.f39060e = C7222l.f35479l;
        this.f39061f = null;
        this.f39062g = false;
        this.f39063h = ai.m35995d();
        this.f39064i = cv.aS_();
        this.f39065j = fz.m36471d();
        this.f39066k = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36479a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f39056a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39066k);
        }
        if ((this.f39056a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39058c);
        }
        if ((this.f39056a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f39062g);
        }
        if (this.f39063h != null && this.f39063h.length > 0) {
            for (i iVar : this.f39063h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f39064i != null && this.f39064i.length > 0) {
            for (i iVar2 : this.f39064i) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar2);
                }
            }
        }
        if (this.f39065j != null && this.f39065j.length > 0) {
            while (i < this.f39065j.length) {
                i iVar3 = this.f39065j[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar3);
                }
                i++;
            }
        }
        if ((this.f39056a & 8) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f39060e);
        }
        if ((this.f39056a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f39059d);
        }
        if ((this.f39056a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f39057b);
        }
        if (this.f39061f != null) {
            codedOutputByteBufferNano.m33532b(11, this.f39061f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36480b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f39056a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39066k);
        }
        if ((this.f39056a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39058c);
        }
        if ((this.f39056a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f39063h != null && this.f39063h.length > 0) {
            i = b;
            for (i iVar : this.f39063h) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i;
        }
        if (this.f39064i != null && this.f39064i.length > 0) {
            i = b;
            for (i iVar2 : this.f39064i) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar2);
                }
            }
            b = i;
        }
        if (this.f39065j != null && this.f39065j.length > 0) {
            while (i2 < this.f39065j.length) {
                i iVar3 = this.f39065j[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(6, iVar3);
                }
                i2++;
            }
        }
        if ((this.f39056a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f39060e);
        }
        if ((this.f39056a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f39056a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f39057b);
        }
        if (this.f39061f != null) {
            return b + CodedOutputByteBufferNano.m33503d(11, this.f39061f);
        }
        return b;
    }

    public final /* synthetic */ i m36478a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39066k = c7213a.m33564f();
                    this.f39056a |= 32;
                    continue;
                case 18:
                    this.f39058c = c7213a.m33564f();
                    this.f39056a |= 2;
                    continue;
                case 24:
                    this.f39062g = c7213a.m33563e();
                    this.f39056a |= 16;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f39063h == null ? 0 : this.f39063h.length;
                    obj = new ai[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39063h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ai();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ai();
                    c7213a.m33552a(obj[a]);
                    this.f39063h = obj;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f39064i == null ? 0 : this.f39064i.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39064i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cv();
                    c7213a.m33552a(obj[a]);
                    this.f39064i = obj;
                    continue;
                case 50:
                    a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f39065j == null ? 0 : this.f39065j.length;
                    obj = new fz[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39065j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new fz();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new fz();
                    c7213a.m33552a(obj[a]);
                    this.f39065j = obj;
                    continue;
                case 58:
                    this.f39060e = c7213a.m33565g();
                    this.f39056a |= 8;
                    continue;
                case 64:
                    this.f39059d = c7213a.m33563e();
                    this.f39056a |= 4;
                    continue;
                case 82:
                    this.f39057b = c7213a.m33564f();
                    this.f39056a |= 1;
                    continue;
                case 90:
                    if (this.f39061f == null) {
                        this.f39061f = new fy();
                    }
                    c7213a.m33552a(this.f39061f);
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
