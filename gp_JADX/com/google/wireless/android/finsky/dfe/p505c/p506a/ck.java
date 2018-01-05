package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ck extends b {
    public int[] f37311a;
    public int[] f37312b;

    private static int m35274a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum InputType");
        }
    }

    private static int m35275b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ImeOption");
        }
    }

    public ck() {
        this.f37311a = C7222l.f35472e;
        this.f37312b = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35278a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37311a != null && this.f37311a.length > 0) {
            for (int a : this.f37311a) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if (this.f37312b != null && this.f37312b.length > 0) {
            while (i < this.f37312b.length) {
                codedOutputByteBufferNano.m33518a(2, this.f37312b[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35279b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f37311a == null || this.f37311a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int c : this.f37311a) {
                i2 += CodedOutputByteBufferNano.m33498c(c);
            }
            i = (b + i2) + (this.f37311a.length * 1);
        }
        if (this.f37312b == null || this.f37312b.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.f37312b.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f37312b[i3]);
            i3++;
        }
        return (i + i2) + (this.f37312b.length * 1);
    }

    private final ck m35276b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            int i;
            int i2;
            Object obj2;
            Object obj3;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[i] = ck.m35274a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f37311a == null ? 0 : this.f37311a.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f37311a, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f37311a = obj2;
                            break;
                        }
                        this.f37311a = obj;
                        break;
                    }
                    continue;
                    break;
                case 10:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            ck.m35274a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f37311a == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f37311a.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f37311a, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = ck.m35274a(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a2);
                                a(c7213a, 8);
                            }
                        }
                        this.f37311a = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 16:
                    a2 = C7222l.m33624a(c7213a, 16);
                    obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[i] = ck.m35275b(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e4) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f37312b == null ? 0 : this.f37312b.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f37312b, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f37312b = obj2;
                            break;
                        }
                        this.f37312b = obj;
                        break;
                    }
                    continue;
                case 18:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            ck.m35275b(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f37312b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f37312b.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f37312b, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = ck.m35275b(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e6) {
                                c7213a.m33562e(a2);
                                a(c7213a, 16);
                            }
                        }
                        this.f37312b = obj3;
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

    public final /* synthetic */ i m35277a(C7213a c7213a) {
        return m35276b(c7213a);
    }
}
