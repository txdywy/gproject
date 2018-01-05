package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.jt;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dq extends b {
    public int f38673a;
    public String f38674b;
    public int f38675c;
    public fh[] f38676d;
    public int[] f38677e;
    public int[] f38678f;

    public dq() {
        this.f38673a = 0;
        this.f38674b = "";
        this.f38675c = 0;
        this.f38676d = fh.m36414d();
        this.f38677e = C7222l.f35472e;
        this.f38678f = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36271a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38673a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38674b);
        }
        if ((this.f38673a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38675c);
        }
        if (this.f38676d != null && this.f38676d.length > 0) {
            for (i iVar : this.f38676d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f38678f != null && this.f38678f.length > 0) {
            for (int a : this.f38678f) {
                codedOutputByteBufferNano.m33518a(4, a);
            }
        }
        if (this.f38677e != null && this.f38677e.length > 0) {
            while (i < this.f38677e.length) {
                codedOutputByteBufferNano.m33518a(5, this.f38677e[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36272b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f38673a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38674b);
        }
        if ((this.f38673a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38675c);
        }
        if (this.f38676d != null && this.f38676d.length > 0) {
            i = b;
            for (i iVar : this.f38676d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (this.f38678f != null && this.f38678f.length > 0) {
            int i3 = 0;
            for (int c : this.f38678f) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i3) + (this.f38678f.length * 1);
        }
        if (this.f38677e == null || this.f38677e.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f38677e.length) {
            i += CodedOutputByteBufferNano.m33498c(this.f38677e[i2]);
            i2++;
        }
        return (b + i) + (this.f38677e.length * 1);
    }

    private final dq m36269b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            int length;
            int a3;
            Object obj;
            Object obj2;
            Object obj3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38674b = c7213a.m33564f();
                    this.f38673a |= 1;
                    continue;
                case 16:
                    this.f38675c = c7213a.m33567i();
                    this.f38673a |= 2;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    length = this.f38676d == null ? 0 : this.f38676d.length;
                    Object obj4 = new fh[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f38676d, 0, obj4, 0, length);
                    }
                    while (length < obj4.length - 1) {
                        obj4[length] = new fh();
                        c7213a.m33552a(obj4[length]);
                        c7213a.m33550a();
                        length++;
                    }
                    obj4[length] = new fh();
                    c7213a.m33552a(obj4[length]);
                    this.f38676d = obj4;
                    continue;
                case 32:
                    a3 = C7222l.m33624a(c7213a, 32);
                    obj = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[length] = jt.b(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f38678f == null ? 0 : this.f38678f.length;
                        if (a2 != 0 || length != obj.length) {
                            obj2 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f38678f, 0, obj2, 0, a2);
                            }
                            System.arraycopy(obj, 0, obj2, a2, length);
                            this.f38678f = obj2;
                            break;
                        }
                        this.f38678f = obj;
                        break;
                    }
                    continue;
                case 34:
                    a = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            jt.b(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a2);
                        if (this.f38678f == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f38678f.length;
                        }
                        obj3 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f38678f, 0, obj3, 0, a2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a3 = c7213a.m33573o();
                            try {
                                obj3[a2] = jt.b(c7213a.m33567i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a3);
                                a(c7213a, 32);
                            }
                        }
                        this.f38678f = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 40:
                    a3 = C7222l.m33624a(c7213a, 40);
                    obj = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[length] = jt.a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e4) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f38677e == null ? 0 : this.f38677e.length;
                        if (a2 != 0 || length != obj.length) {
                            obj2 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f38677e, 0, obj2, 0, a2);
                            }
                            System.arraycopy(obj, 0, obj2, a2, length);
                            this.f38677e = obj2;
                            break;
                        }
                        this.f38677e = obj;
                        break;
                    }
                    continue;
                case 42:
                    a = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            jt.a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a2);
                        if (this.f38677e == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f38677e.length;
                        }
                        obj3 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f38677e, 0, obj3, 0, a2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a3 = c7213a.m33573o();
                            try {
                                obj3[a2] = jt.a(c7213a.m33567i());
                                a2++;
                            } catch (IllegalArgumentException e6) {
                                c7213a.m33562e(a3);
                                a(c7213a, 40);
                            }
                        }
                        this.f38677e = obj3;
                    }
                    c7213a.m33561d(a);
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

    public final /* synthetic */ i m36270a(C7213a c7213a) {
        return m36269b(c7213a);
    }
}
