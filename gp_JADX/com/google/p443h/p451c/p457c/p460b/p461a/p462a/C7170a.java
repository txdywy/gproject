package com.google.p443h.p451c.p457c.p460b.p461a.p462a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7170a extends b {
    public String f35002a;
    public int f35003b;
    public int f35004c;
    public int[] f35005d;
    public C7171b f35006e;

    private static int m32505a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum IconStyle");
        }
    }

    public C7170a() {
        this.f35002a = "";
        this.f35003b = 0;
        this.f35004c = 0;
        this.f35005d = C7222l.f35472e;
        this.f35006e = null;
        this.aP = -1;
    }

    public final void m32508a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35002a == null || this.f35002a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35002a);
        }
        if (this.f35003b != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35003b);
        }
        if (this.f35005d != null && this.f35005d.length > 0) {
            for (int a : this.f35005d) {
                codedOutputByteBufferNano.m33518a(4, a);
            }
        }
        if (this.f35004c != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35004c);
        }
        if (this.f35006e != null) {
            codedOutputByteBufferNano.m33532b(6, this.f35006e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32509b() {
        int i = 0;
        int b = super.b();
        if (!(this.f35002a == null || this.f35002a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35002a);
        }
        if (this.f35003b != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35003b);
        }
        if (this.f35005d != null && this.f35005d.length > 0) {
            int i2 = 0;
            while (i < this.f35005d.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f35005d[i]);
                i++;
            }
            b = (b + i2) + (this.f35005d.length * 1);
        }
        if (this.f35004c != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35004c);
        }
        if (this.f35006e != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f35006e);
        }
        return b;
    }

    private final C7170a m32506b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int o;
            int a2;
            int i;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35002a = c7213a.m33564f();
                    continue;
                case 24:
                    o = c7213a.m33573o();
                    try {
                        this.f35003b = C7170a.m32505a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 32:
                    a2 = C7222l.m33624a(c7213a, 32);
                    Object obj = new int[a2];
                    o = 0;
                    for (i = 0; i < a2; i++) {
                        if (i != 0) {
                            c7213a.m33550a();
                        }
                        int o2 = c7213a.m33573o();
                        try {
                            obj[o] = com.google.a.a.a.a.b.a.a.h.a.b.a(c7213a.m33567i());
                            o++;
                        } catch (IllegalArgumentException e2) {
                            c7213a.m33562e(o2);
                            a(c7213a, a);
                        }
                    }
                    if (o != 0) {
                        i = this.f35005d == null ? 0 : this.f35005d.length;
                        if (i != 0 || o != obj.length) {
                            Object obj2 = new int[(i + o)];
                            if (i != 0) {
                                System.arraycopy(this.f35005d, 0, obj2, 0, i);
                            }
                            System.arraycopy(obj, 0, obj2, i, o);
                            this.f35005d = obj2;
                            break;
                        }
                        this.f35005d = obj;
                        break;
                    }
                    continue;
                case 34:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i = c7213a.m33573o();
                    o = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            com.google.a.a.a.a.b.a.a.h.a.b.a(c7213a.m33567i());
                            o++;
                        } catch (IllegalArgumentException e3) {
                        }
                    }
                    if (o != 0) {
                        c7213a.m33562e(i);
                        if (this.f35005d == null) {
                            i = 0;
                        } else {
                            i = this.f35005d.length;
                        }
                        Object obj3 = new int[(o + i)];
                        if (i != 0) {
                            System.arraycopy(this.f35005d, 0, obj3, 0, i);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i] = com.google.a.a.a.a.b.a.a.h.a.b.a(c7213a.m33567i());
                                i++;
                            } catch (IllegalArgumentException e4) {
                                c7213a.m33562e(a2);
                                a(c7213a, 32);
                            }
                        }
                        this.f35005d = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 40:
                    o = c7213a.m33573o();
                    try {
                        this.f35004c = C7170a.m32505a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e5) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 50:
                    if (this.f35006e == null) {
                        this.f35006e = new C7171b();
                    }
                    c7213a.m33552a(this.f35006e);
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

    public final /* synthetic */ i m32507a(C7213a c7213a) {
        return m32506b(c7213a);
    }
}
