package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.dk;
import com.google.android.finsky.cv.a.hc;
import com.google.android.finsky.cv.a.jq;
import com.google.android.finsky.cv.a.jr;
import com.google.android.finsky.cv.a.kn;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.ab;

public final class fl extends b {
    public int f38975a;
    public fk f38976b;
    public jq f38977c;
    public hc[] f38978d;
    public ab[] f38979e;
    public jr f38980f;
    public kn f38981g;
    public dk[] f38982h;
    public byte[] f38983i;
    public fm f38984j;

    public fl() {
        this.f38975a = 0;
        this.f38976b = null;
        this.f38977c = null;
        this.f38978d = hc.bh_();
        this.f38979e = ab.m34804d();
        this.f38980f = null;
        this.f38981g = null;
        this.f38982h = dk.aT_();
        this.f38983i = C7222l.f35479l;
        this.f38984j = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36428a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38976b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38976b);
        }
        if (this.f38977c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38977c);
        }
        if (this.f38978d != null && this.f38978d.length > 0) {
            for (i iVar : this.f38978d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f38979e != null && this.f38979e.length > 0) {
            for (i iVar2 : this.f38979e) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar2);
                }
            }
        }
        if (this.f38980f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f38980f);
        }
        if (this.f38981g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38981g);
        }
        if (this.f38982h != null && this.f38982h.length > 0) {
            while (i < this.f38982h.length) {
                i iVar3 = this.f38982h[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(8, iVar3);
                }
                i++;
            }
        }
        if ((this.f38975a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(9, this.f38983i);
        }
        if (this.f38984j != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38984j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36429b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f38976b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38976b);
        }
        if (this.f38977c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38977c);
        }
        if (this.f38978d != null && this.f38978d.length > 0) {
            i = b;
            for (i iVar : this.f38978d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (this.f38979e != null && this.f38979e.length > 0) {
            i = b;
            for (i iVar2 : this.f38979e) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar2);
                }
            }
            b = i;
        }
        if (this.f38980f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f38980f);
        }
        if (this.f38981g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38981g);
        }
        if (this.f38982h != null && this.f38982h.length > 0) {
            while (i2 < this.f38982h.length) {
                i iVar3 = this.f38982h[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(8, iVar3);
                }
                i2++;
            }
        }
        if ((this.f38975a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(9, this.f38983i);
        }
        if (this.f38984j != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f38984j);
        }
        return b;
    }

    public static fl m36426a(byte[] bArr) {
        return (fl) i.a(new fl(), bArr);
    }

    public final /* synthetic */ i m36427a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38976b == null) {
                        this.f38976b = new fk();
                    }
                    c7213a.m33552a(this.f38976b);
                    continue;
                case 18:
                    if (this.f38977c == null) {
                        this.f38977c = new jq();
                    }
                    c7213a.m33552a(this.f38977c);
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38978d == null ? 0 : this.f38978d.length;
                    obj = new hc[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38978d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hc();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new hc();
                    c7213a.m33552a(obj[a]);
                    this.f38978d = obj;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f38979e == null ? 0 : this.f38979e.length;
                    obj = new ab[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38979e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ab();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ab();
                    c7213a.m33552a(obj[a]);
                    this.f38979e = obj;
                    continue;
                case 42:
                    if (this.f38980f == null) {
                        this.f38980f = new jr();
                    }
                    c7213a.m33552a(this.f38980f);
                    continue;
                case 50:
                    if (this.f38981g == null) {
                        this.f38981g = new kn();
                    }
                    c7213a.m33552a(this.f38981g);
                    continue;
                case 66:
                    a2 = C7222l.m33624a(c7213a, 66);
                    a = this.f38982h == null ? 0 : this.f38982h.length;
                    obj = new dk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38982h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dk();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dk();
                    c7213a.m33552a(obj[a]);
                    this.f38982h = obj;
                    continue;
                case 74:
                    this.f38983i = c7213a.m33565g();
                    this.f38975a |= 1;
                    continue;
                case 82:
                    if (this.f38984j == null) {
                        this.f38984j = new fm();
                    }
                    c7213a.m33552a(this.f38984j);
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
