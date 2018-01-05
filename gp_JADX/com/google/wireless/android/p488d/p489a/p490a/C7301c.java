package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;

public final class C7301c extends b {
    public C7316r[] f36226a;
    public C7315q[] f36227b;
    public C7317s f36228c;
    public C7300b f36229d;
    public C7299a[] f36230e;
    public C7310l[] f36231f;
    public C7302d[] f36232g;
    public int f36233h;
    public String f36234i;
    public C7318t[] f36235j;
    public C7312n[] f36236k;

    public C7301c() {
        this.f36226a = C7316r.m34585d();
        this.f36227b = C7315q.m34581d();
        this.f36228c = null;
        this.f36229d = null;
        this.f36230e = C7299a.m34523d();
        this.f36231f = C7310l.m34563d();
        this.f36232g = C7302d.m34533d();
        this.f36233h = 0;
        this.f36234i = "";
        this.f36235j = C7318t.m34592d();
        this.f36236k = C7312n.m34570d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34531a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36226a != null && this.f36226a.length > 0) {
            for (i iVar : this.f36226a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f36227b != null && this.f36227b.length > 0) {
            for (i iVar2 : this.f36227b) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar2);
                }
            }
        }
        if (this.f36229d != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36229d);
        }
        if (this.f36230e != null && this.f36230e.length > 0) {
            for (i iVar22 : this.f36230e) {
                if (iVar22 != null) {
                    codedOutputByteBufferNano.m33532b(10, iVar22);
                }
            }
        }
        if (this.f36231f != null && this.f36231f.length > 0) {
            for (i iVar222 : this.f36231f) {
                if (iVar222 != null) {
                    codedOutputByteBufferNano.m33532b(11, iVar222);
                }
            }
        }
        if (this.f36228c != null) {
            codedOutputByteBufferNano.m33532b(12, this.f36228c);
        }
        if (this.f36233h != 0) {
            codedOutputByteBufferNano.m33518a(13, this.f36233h);
        }
        if (!(this.f36234i == null || this.f36234i.equals(""))) {
            codedOutputByteBufferNano.m33521a(14, this.f36234i);
        }
        if (this.f36232g != null && this.f36232g.length > 0) {
            for (i iVar2222 : this.f36232g) {
                if (iVar2222 != null) {
                    codedOutputByteBufferNano.m33532b(15, iVar2222);
                }
            }
        }
        if (this.f36235j != null && this.f36235j.length > 0) {
            for (i iVar22222 : this.f36235j) {
                if (iVar22222 != null) {
                    codedOutputByteBufferNano.m33532b(16, iVar22222);
                }
            }
        }
        if (this.f36236k != null && this.f36236k.length > 0) {
            while (i < this.f36236k.length) {
                i iVar3 = this.f36236k[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(17, iVar3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34532b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f36226a != null && this.f36226a.length > 0) {
            i = b;
            for (i iVar : this.f36226a) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (this.f36227b != null && this.f36227b.length > 0) {
            i = b;
            for (i iVar2 : this.f36227b) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar2);
                }
            }
            b = i;
        }
        if (this.f36229d != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36229d);
        }
        if (this.f36230e != null && this.f36230e.length > 0) {
            i = b;
            for (i iVar22 : this.f36230e) {
                if (iVar22 != null) {
                    i += CodedOutputByteBufferNano.m33503d(10, iVar22);
                }
            }
            b = i;
        }
        if (this.f36231f != null && this.f36231f.length > 0) {
            i = b;
            for (i iVar222 : this.f36231f) {
                if (iVar222 != null) {
                    i += CodedOutputByteBufferNano.m33503d(11, iVar222);
                }
            }
            b = i;
        }
        if (this.f36228c != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f36228c);
        }
        if (this.f36233h != 0) {
            b += CodedOutputByteBufferNano.m33502d(13, this.f36233h);
        }
        if (!(this.f36234i == null || this.f36234i.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f36234i);
        }
        if (this.f36232g != null && this.f36232g.length > 0) {
            i = b;
            for (i iVar2222 : this.f36232g) {
                if (iVar2222 != null) {
                    i += CodedOutputByteBufferNano.m33503d(15, iVar2222);
                }
            }
            b = i;
        }
        if (this.f36235j != null && this.f36235j.length > 0) {
            i = b;
            for (i iVar22222 : this.f36235j) {
                if (iVar22222 != null) {
                    i += CodedOutputByteBufferNano.m33503d(16, iVar22222);
                }
            }
            b = i;
        }
        if (this.f36236k != null && this.f36236k.length > 0) {
            while (i2 < this.f36236k.length) {
                i iVar3 = this.f36236k[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(17, iVar3);
                }
                i2++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34530a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f36226a == null ? 0 : this.f36226a.length;
                    obj = new C7316r[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36226a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7316r();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7316r();
                    c7213a.m33552a(obj[a]);
                    this.f36226a = obj;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36227b == null ? 0 : this.f36227b.length;
                    obj = new C7315q[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36227b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7315q();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7315q();
                    c7213a.m33552a(obj[a]);
                    this.f36227b = obj;
                    continue;
                case 74:
                    if (this.f36229d == null) {
                        this.f36229d = new C7300b();
                    }
                    c7213a.m33552a(this.f36229d);
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f36230e == null ? 0 : this.f36230e.length;
                    obj = new C7299a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36230e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7299a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7299a();
                    c7213a.m33552a(obj[a]);
                    this.f36230e = obj;
                    continue;
                case 90:
                    a2 = C7222l.m33624a(c7213a, 90);
                    a = this.f36231f == null ? 0 : this.f36231f.length;
                    obj = new C7310l[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36231f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7310l();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7310l();
                    c7213a.m33552a(obj[a]);
                    this.f36231f = obj;
                    continue;
                case 98:
                    if (this.f36228c == null) {
                        this.f36228c = new C7317s();
                    }
                    c7213a.m33552a(this.f36228c);
                    continue;
                case 104:
                    this.f36233h = c7213a.m33567i();
                    continue;
                case 114:
                    this.f36234i = c7213a.m33564f();
                    continue;
                case 122:
                    a2 = C7222l.m33624a(c7213a, 122);
                    a = this.f36232g == null ? 0 : this.f36232g.length;
                    obj = new C7302d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36232g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7302d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7302d();
                    c7213a.m33552a(obj[a]);
                    this.f36232g = obj;
                    continue;
                case 130:
                    a2 = C7222l.m33624a(c7213a, 130);
                    a = this.f36235j == null ? 0 : this.f36235j.length;
                    obj = new C7318t[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36235j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7318t();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7318t();
                    c7213a.m33552a(obj[a]);
                    this.f36235j = obj;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    a2 = C7222l.m33624a(c7213a, HprofParser.ROOT_FINALIZING);
                    a = this.f36236k == null ? 0 : this.f36236k.length;
                    obj = new C7312n[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36236k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7312n();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7312n();
                    c7213a.m33552a(obj[a]);
                    this.f36236k = obj;
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
