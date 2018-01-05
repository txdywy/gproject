package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ck extends b {
    public int f35959a;
    public int f35960b;
    public String[] f35961c;
    public String f35962d;

    public static int m34316a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Type");
        }
    }

    public final ck m34319a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f35959a |= 2;
        this.f35962d = str;
        return this;
    }

    public ck() {
        this.f35959a = 0;
        this.f35960b = 0;
        this.f35961c = C7222l.f35477j;
        this.f35962d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34320a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35959a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35960b);
        }
        if (this.f35961c != null && this.f35961c.length > 0) {
            for (String str : this.f35961c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
            }
        }
        if ((this.f35959a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35962d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34321b() {
        int i = 0;
        int b = super.b();
        if ((this.f35959a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35960b);
        }
        if (this.f35961c != null && this.f35961c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f35961c.length) {
                String str = this.f35961c[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f35959a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f35962d);
        }
        return b;
    }

    private final ck m34317b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35959a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f35960b = ck.m34316a(c7213a.m33567i());
                        this.f35959a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    o = C7222l.m33624a(c7213a, 18);
                    a = this.f35961c == null ? 0 : this.f35961c.length;
                    Object obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35961c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f35961c = obj;
                    continue;
                case 26:
                    this.f35962d = c7213a.m33564f();
                    this.f35959a |= 2;
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

    public final /* synthetic */ i m34318a(C7213a c7213a) {
        return m34317b(c7213a);
    }
}
