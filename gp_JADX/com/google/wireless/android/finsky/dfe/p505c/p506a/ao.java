package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.eb;
import com.google.wireless.android.finsky.dfe.nano.ez;
import com.google.wireless.android.finsky.dfe.nano.gd;

public final class ao extends b {
    public int f37096a;
    public C7433w[] f37097b;
    public gd[] f37098c;
    public ez f37099d;
    public byte[] f37100e;
    public C7422l f37101f;
    public int f37102g;
    public String f37103h;

    public ao() {
        this.f37096a = 0;
        this.f37097b = C7433w.m35517d();
        this.f37098c = gd.m36485d();
        this.f37099d = null;
        this.f37100e = C7222l.f35479l;
        this.f37101f = null;
        this.f37102g = 0;
        this.f37103h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35117a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37097b != null && this.f37097b.length > 0) {
            for (i iVar : this.f37097b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37098c != null && this.f37098c.length > 0) {
            while (i < this.f37098c.length) {
                i iVar2 = this.f37098c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        if (this.f37099d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37099d);
        }
        if ((this.f37096a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f37100e);
        }
        if (this.f37101f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37101f);
        }
        if ((this.f37096a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37102g);
        }
        if ((this.f37096a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37103h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35118b() {
        int i = 0;
        int b = super.b();
        if (this.f37097b != null && this.f37097b.length > 0) {
            int i2 = b;
            for (i iVar : this.f37097b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f37098c != null && this.f37098c.length > 0) {
            while (i < this.f37098c.length) {
                i iVar2 = this.f37098c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        if (this.f37099d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37099d);
        }
        if ((this.f37096a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f37100e);
        }
        if (this.f37101f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37101f);
        }
        if ((this.f37096a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37102g);
        }
        if ((this.f37096a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f37103h);
        }
        return b;
    }

    private final ao m35115b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37097b == null ? 0 : this.f37097b.length;
                    obj = new C7433w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37097b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7433w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7433w();
                    c7213a.m33552a(obj[a]);
                    this.f37097b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37098c == null ? 0 : this.f37098c.length;
                    obj = new gd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37098c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gd();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new gd();
                    c7213a.m33552a(obj[a]);
                    this.f37098c = obj;
                    continue;
                case 26:
                    if (this.f37099d == null) {
                        this.f37099d = new ez();
                    }
                    c7213a.m33552a(this.f37099d);
                    continue;
                case 34:
                    this.f37100e = c7213a.m33565g();
                    this.f37096a |= 1;
                    continue;
                case 42:
                    if (this.f37101f == null) {
                        this.f37101f = new C7422l();
                    }
                    c7213a.m33552a(this.f37101f);
                    continue;
                case 48:
                    this.f37096a |= 2;
                    a2 = c7213a.m33573o();
                    try {
                        this.f37102g = eb.m36311a(c7213a.m33567i());
                        this.f37096a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a2);
                        a(c7213a, a);
                        break;
                    }
                case 58:
                    this.f37103h = c7213a.m33564f();
                    this.f37096a |= 4;
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

    public final /* synthetic */ i m35116a(C7213a c7213a) {
        return m35115b(c7213a);
    }
}
