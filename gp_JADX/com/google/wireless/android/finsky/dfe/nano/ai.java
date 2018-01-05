package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public static volatile ai[] f38341a;
    public int f38342b;
    public ch[] f38343c;
    public boolean f38344d;
    public String f38345e;
    public String f38346f;
    public String f38347g;
    public String f38348h;
    public String f38349i;
    public double f38350j;
    public long f38351k;
    public String f38352l;
    public boolean f38353m;

    public static ai[] m35995d() {
        if (f38341a == null) {
            synchronized (C7219h.f35465b) {
                if (f38341a == null) {
                    f38341a = new ai[0];
                }
            }
        }
        return f38341a;
    }

    public ai() {
        this.f38342b = 0;
        this.f38343c = ch.m36154d();
        this.f38344d = false;
        this.f38345e = "";
        this.f38346f = "";
        this.f38347g = "";
        this.f38348h = "";
        this.f38349i = "";
        this.f38350j = 0.0d;
        this.f38351k = 0;
        this.f38352l = "";
        this.f38353m = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35997a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38343c != null && this.f38343c.length > 0) {
            for (i iVar : this.f38343c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38342b & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38344d);
        }
        if ((this.f38342b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38345e);
        }
        if ((this.f38342b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38346f);
        }
        if ((this.f38342b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38347g);
        }
        if ((this.f38342b & 64) != 0) {
            codedOutputByteBufferNano.m33516a(6, this.f38350j);
        }
        if ((this.f38342b & 128) != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f38351k);
        }
        if ((this.f38342b & 256) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38352l);
        }
        if ((this.f38342b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38348h);
        }
        if ((this.f38342b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38349i);
        }
        if ((this.f38342b & 512) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f38353m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35998b() {
        int b = super.b();
        if (this.f38343c != null && this.f38343c.length > 0) {
            for (i iVar : this.f38343c) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38342b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f38342b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38345e);
        }
        if ((this.f38342b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38346f);
        }
        if ((this.f38342b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38347g);
        }
        if ((this.f38342b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 8;
        }
        if ((this.f38342b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f38351k);
        }
        if ((this.f38342b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38352l);
        }
        if ((this.f38342b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38348h);
        }
        if ((this.f38342b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f38349i);
        }
        if ((this.f38342b & 512) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(11) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35996a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38343c == null ? 0 : this.f38343c.length;
                    Object obj = new ch[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38343c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ch();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ch();
                    c7213a.m33552a(obj[a]);
                    this.f38343c = obj;
                    continue;
                case 16:
                    this.f38344d = c7213a.m33563e();
                    this.f38342b |= 1;
                    continue;
                case 26:
                    this.f38345e = c7213a.m33564f();
                    this.f38342b |= 2;
                    continue;
                case 34:
                    this.f38346f = c7213a.m33564f();
                    this.f38342b |= 4;
                    continue;
                case 42:
                    this.f38347g = c7213a.m33564f();
                    this.f38342b |= 8;
                    continue;
                case 49:
                    this.f38350j = Double.longBitsToDouble(c7213a.m33570l());
                    this.f38342b |= 64;
                    continue;
                case 56:
                    this.f38351k = c7213a.m33568j();
                    this.f38342b |= 128;
                    continue;
                case 66:
                    this.f38352l = c7213a.m33564f();
                    this.f38342b |= 256;
                    continue;
                case 74:
                    this.f38348h = c7213a.m33564f();
                    this.f38342b |= 16;
                    continue;
                case 82:
                    this.f38349i = c7213a.m33564f();
                    this.f38342b |= 32;
                    continue;
                case 88:
                    this.f38353m = c7213a.m33563e();
                    this.f38342b |= 512;
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
