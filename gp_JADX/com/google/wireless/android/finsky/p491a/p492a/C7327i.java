package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p485c.p486a.p487a.C7298a;

public final class C7327i extends b {
    public int f36503a;
    public String f36504b;
    public String f36505c;
    public String f36506d;
    public String f36507e;
    public am[] f36508f;
    public C7298a f36509g;
    public ad[] f36510h;
    public String f36511i;
    public int[] f36512j;
    public C7334p[] f36513k;

    public C7327i() {
        this.f36503a = 0;
        this.f36504b = "";
        this.f36505c = "";
        this.f36506d = "";
        this.f36507e = "";
        this.f36508f = am.m34643d();
        this.f36509g = null;
        this.f36510h = ad.m34609d();
        this.f36511i = "";
        this.f36512j = C7222l.f35472e;
        this.f36513k = C7334p.m34760d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34738a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36503a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36504b);
        }
        if ((this.f36503a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36505c);
        }
        if ((this.f36503a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36506d);
        }
        if ((this.f36503a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36507e);
        }
        if (this.f36508f != null && this.f36508f.length > 0) {
            for (i iVar : this.f36508f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (this.f36509g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36509g);
        }
        if (this.f36510h != null && this.f36510h.length > 0) {
            for (i iVar2 : this.f36510h) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar2);
                }
            }
        }
        if ((this.f36503a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36511i);
        }
        if (this.f36512j != null && this.f36512j.length > 0) {
            for (int a : this.f36512j) {
                codedOutputByteBufferNano.m33518a(9, a);
            }
        }
        if (this.f36513k != null && this.f36513k.length > 0) {
            while (i < this.f36513k.length) {
                i iVar3 = this.f36513k[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(10, iVar3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34739b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f36503a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36504b);
        }
        if ((this.f36503a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36505c);
        }
        if ((this.f36503a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36506d);
        }
        if ((this.f36503a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36507e);
        }
        if (this.f36508f != null && this.f36508f.length > 0) {
            i = b;
            for (i iVar : this.f36508f) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if (this.f36509g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36509g);
        }
        if (this.f36510h != null && this.f36510h.length > 0) {
            i = b;
            for (i iVar2 : this.f36510h) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(7, iVar2);
                }
            }
            b = i;
        }
        if ((this.f36503a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36511i);
        }
        if (this.f36512j != null && this.f36512j.length > 0) {
            int i3 = 0;
            for (int c : this.f36512j) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i3) + (this.f36512j.length * 1);
        }
        if (this.f36513k != null && this.f36513k.length > 0) {
            while (i2 < this.f36513k.length) {
                i iVar3 = this.f36513k[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(10, iVar3);
                }
                i2++;
            }
        }
        return b;
    }

    private final C7327i m34736b(C7213a c7213a) {
        int a;
        while (true) {
            int a2 = c7213a.m33550a();
            int a3;
            int length;
            Object obj;
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f36504b = c7213a.m33564f();
                    this.f36503a |= 1;
                    continue;
                case 18:
                    this.f36505c = c7213a.m33564f();
                    this.f36503a |= 2;
                    continue;
                case 26:
                    this.f36506d = c7213a.m33564f();
                    this.f36503a |= 4;
                    continue;
                case 34:
                    this.f36507e = c7213a.m33564f();
                    this.f36503a |= 8;
                    continue;
                case 42:
                    a3 = C7222l.m33624a(c7213a, 42);
                    length = this.f36508f == null ? 0 : this.f36508f.length;
                    obj = new am[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f36508f, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new am();
                        c7213a.m33552a(obj[length]);
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = new am();
                    c7213a.m33552a(obj[length]);
                    this.f36508f = obj;
                    continue;
                case 50:
                    if (this.f36509g == null) {
                        this.f36509g = new C7298a();
                    }
                    c7213a.m33552a(this.f36509g);
                    continue;
                case 58:
                    a3 = C7222l.m33624a(c7213a, 58);
                    length = this.f36510h == null ? 0 : this.f36510h.length;
                    obj = new ad[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f36510h, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new ad();
                        c7213a.m33552a(obj[length]);
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = new ad();
                    c7213a.m33552a(obj[length]);
                    this.f36510h = obj;
                    continue;
                case 66:
                    this.f36511i = c7213a.m33564f();
                    this.f36503a |= 16;
                    continue;
                case 72:
                    a = C7222l.m33624a(c7213a, 72);
                    Object obj2 = new int[a];
                    length = 0;
                    for (a3 = 0; a3 < a; a3++) {
                        if (a3 != 0) {
                            c7213a.m33550a();
                        }
                        int o = c7213a.m33573o();
                        try {
                            obj2[length] = C7319a.m34596a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a2);
                        }
                    }
                    if (length != 0) {
                        a3 = this.f36512j == null ? 0 : this.f36512j.length;
                        if (a3 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a3 + length)];
                            if (a3 != 0) {
                                System.arraycopy(this.f36512j, 0, obj3, 0, a3);
                            }
                            System.arraycopy(obj2, 0, obj3, a3, length);
                            this.f36512j = obj3;
                            break;
                        }
                        this.f36512j = obj2;
                        break;
                    }
                    continue;
                case 74:
                    a2 = c7213a.m33558c(c7213a.m33567i());
                    a3 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7319a.m34596a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a3);
                        if (this.f36512j == null) {
                            a3 = 0;
                        } else {
                            a3 = this.f36512j.length;
                        }
                        Object obj4 = new int[(length + a3)];
                        if (a3 != 0) {
                            System.arraycopy(this.f36512j, 0, obj4, 0, a3);
                        }
                        while (c7213a.m33571m() > 0) {
                            a = c7213a.m33573o();
                            try {
                                obj4[a3] = C7319a.m34596a(c7213a.m33567i());
                                a3++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a);
                                a(c7213a, 72);
                            }
                        }
                        this.f36512j = obj4;
                    }
                    c7213a.m33561d(a2);
                    continue;
                case 82:
                    a3 = C7222l.m33624a(c7213a, 82);
                    length = this.f36513k == null ? 0 : this.f36513k.length;
                    obj = new C7334p[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f36513k, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C7334p();
                        c7213a.m33552a(obj[length]);
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = new C7334p();
                    c7213a.m33552a(obj[length]);
                    this.f36513k = obj;
                    continue;
                default:
                    if (!super.a(c7213a, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m34737a(C7213a c7213a) {
        return m34736b(c7213a);
    }
}
