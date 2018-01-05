package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7306h extends b {
    public static volatile C7306h[] f36259a;
    public String[] f36260b;
    public String[] f36261c;
    public C7307i[] f36262d;
    public int f36263e;

    public static C7306h[] m34547d() {
        if (f36259a == null) {
            synchronized (C7219h.f35465b) {
                if (f36259a == null) {
                    f36259a = new C7306h[0];
                }
            }
        }
        return f36259a;
    }

    public C7306h() {
        this.f36260b = C7222l.f35477j;
        this.f36261c = C7222l.f35477j;
        this.f36262d = C7307i.m34551d();
        this.f36263e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34549a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36260b != null && this.f36260b.length > 0) {
            for (String str : this.f36260b) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f36261c != null && this.f36261c.length > 0) {
            for (String str2 : this.f36261c) {
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(2, str2);
                }
            }
        }
        if (this.f36262d != null && this.f36262d.length > 0) {
            while (i < this.f36262d.length) {
                i iVar = this.f36262d[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
                i++;
            }
        }
        if (this.f36263e != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36263e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34550b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.f36260b == null || this.f36260b.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f36260b) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f36261c != null && this.f36261c.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f36261c) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.m33495b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f36262d != null && this.f36262d.length > 0) {
            while (i4 < this.f36262d.length) {
                i iVar = this.f36262d[i4];
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
                i4++;
            }
        }
        if (this.f36263e != 0) {
            return i + CodedOutputByteBufferNano.m33502d(4, this.f36263e);
        }
        return i;
    }

    public final /* synthetic */ i m34548a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36260b == null ? 0 : this.f36260b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36260b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36260b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36261c == null ? 0 : this.f36261c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36261c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36261c = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f36262d == null ? 0 : this.f36262d.length;
                    obj = new C7307i[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36262d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7307i();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7307i();
                    c7213a.m33552a(obj[a]);
                    this.f36262d = obj;
                    continue;
                case 32:
                    this.f36263e = c7213a.m33567i();
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
