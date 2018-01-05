package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7387a extends b {
    public static volatile C7387a[] f36912a;
    public int f36913b;
    public String f36914c;
    public int f36915d;
    public int f36916e;
    public String[] f36917f;
    public C7401o[] f36918g;

    public static C7387a[] m34977d() {
        if (f36912a == null) {
            synchronized (C7219h.f35465b) {
                if (f36912a == null) {
                    f36912a = new C7387a[0];
                }
            }
        }
        return f36912a;
    }

    public final C7387a m34980a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36913b |= 1;
        this.f36914c = str;
        return this;
    }

    public final C7387a m34979a(int i) {
        this.f36913b |= 2;
        this.f36915d = i;
        return this;
    }

    public final C7387a m34983b(int i) {
        this.f36913b |= 4;
        this.f36916e = i;
        return this;
    }

    public C7387a() {
        this.f36913b = 0;
        this.f36914c = "";
        this.f36915d = 0;
        this.f36916e = 0;
        this.f36917f = C7222l.f35477j;
        this.f36918g = C7401o.m35026d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34981a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36913b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36914c);
        }
        if ((this.f36913b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36915d);
        }
        if (this.f36917f != null && this.f36917f.length > 0) {
            for (String str : this.f36917f) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
            }
        }
        if ((this.f36913b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36916e);
        }
        if (this.f36918g != null && this.f36918g.length > 0) {
            while (i < this.f36918g.length) {
                i iVar = this.f36918g[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34982b() {
        int i = 0;
        int b = super.b();
        if ((this.f36913b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36914c);
        }
        if ((this.f36913b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36915d);
        }
        if (this.f36917f != null && this.f36917f.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f36917f) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f36913b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f36916e);
        }
        if (this.f36918g != null && this.f36918g.length > 0) {
            while (i < this.f36918g.length) {
                i iVar = this.f36918g[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34978a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36914c = c7213a.m33564f();
                    this.f36913b |= 1;
                    continue;
                case 16:
                    this.f36915d = c7213a.m33567i();
                    this.f36913b |= 2;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f36917f == null ? 0 : this.f36917f.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36917f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36917f = obj;
                    continue;
                case 32:
                    this.f36916e = c7213a.m33567i();
                    this.f36913b |= 4;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36918g == null ? 0 : this.f36918g.length;
                    obj = new C7401o[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36918g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7401o();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7401o();
                    c7213a.m33552a(obj[a]);
                    this.f36918g = obj;
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
