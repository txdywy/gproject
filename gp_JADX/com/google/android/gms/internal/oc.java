package com.google.android.gms.internal;

import java.util.Arrays;

public final class oc extends wu {
    public byte[] f27223a;
    public String f27224b;
    public double f27225c;
    public float f27226d;
    public long f27227e;
    public int f27228f;
    public int f27229g;
    public boolean f27230h;
    public oa[] f27231i;
    public ob[] f27232j;
    public String[] f27233k;
    public long[] f27234l;
    public float[] f27235m;
    public long f27236n;

    public oc() {
        this.f27223a = xc.f27660f;
        this.f27224b = "";
        this.f27225c = 0.0d;
        this.f27226d = 0.0f;
        this.f27227e = 0;
        this.f27228f = 0;
        this.f27229g = 0;
        this.f27230h = false;
        this.f27231i = oa.m25251b();
        this.f27232j = ob.m25255b();
        this.f27233k = xc.f27658d;
        this.f27234l = xc.f27656b;
        this.f27235m = xc.f27657c;
        this.f27236n = 0;
        this.ah = null;
        this.ai = -1;
    }

    public final /* synthetic */ wz mo4705a(ws wsVar) {
        while (true) {
            int a = wsVar.m25865a();
            int a2;
            Object obj;
            int c;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27223a = wsVar.m25874d();
                    continue;
                case 18:
                    this.f27224b = wsVar.m25872c();
                    continue;
                case 25:
                    this.f27225c = Double.longBitsToDouble(wsVar.m25879h());
                    continue;
                case 37:
                    this.f27226d = Float.intBitsToFloat(wsVar.m25878g());
                    continue;
                case 40:
                    this.f27227e = wsVar.m25877f();
                    continue;
                case 48:
                    this.f27228f = wsVar.m25875e();
                    continue;
                case 56:
                    a = wsVar.m25875e();
                    this.f27229g = (-(a & 1)) ^ (a >>> 1);
                    continue;
                case 64:
                    this.f27230h = wsVar.m25869b();
                    continue;
                case 74:
                    a2 = xc.m25935a(wsVar, 74);
                    a = this.f27231i == null ? 0 : this.f27231i.length;
                    obj = new oa[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27231i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oa();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new oa();
                    wsVar.m25868a(obj[a]);
                    this.f27231i = obj;
                    continue;
                case 82:
                    a2 = xc.m25935a(wsVar, 82);
                    a = this.f27232j == null ? 0 : this.f27232j.length;
                    obj = new ob[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27232j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ob();
                        wsVar.m25868a(obj[a]);
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = new ob();
                    wsVar.m25868a(obj[a]);
                    this.f27232j = obj;
                    continue;
                case 90:
                    a2 = xc.m25935a(wsVar, 90);
                    a = this.f27233k == null ? 0 : this.f27233k.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27233k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25872c();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25872c();
                    this.f27233k = obj;
                    continue;
                case 96:
                    a2 = xc.m25935a(wsVar, 96);
                    a = this.f27234l == null ? 0 : this.f27234l.length;
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27234l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = wsVar.m25877f();
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = wsVar.m25877f();
                    this.f27234l = obj;
                    continue;
                case 98:
                    c = wsVar.m25871c(wsVar.m25875e());
                    a2 = wsVar.m25881j();
                    a = 0;
                    while (wsVar.m25880i() > 0) {
                        wsVar.m25877f();
                        a++;
                    }
                    wsVar.m25876e(a2);
                    a2 = this.f27234l == null ? 0 : this.f27234l.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f27234l, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = wsVar.m25877f();
                        a2++;
                    }
                    this.f27234l = obj2;
                    wsVar.m25873d(c);
                    continue;
                case 104:
                    this.f27236n = wsVar.m25877f();
                    continue;
                case 114:
                    a = wsVar.m25875e();
                    a2 = wsVar.m25871c(a);
                    c = a / 4;
                    a = this.f27235m == null ? 0 : this.f27235m.length;
                    Object obj3 = new float[(c + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27235m, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = Float.intBitsToFloat(wsVar.m25878g());
                        a++;
                    }
                    this.f27235m = obj3;
                    wsVar.m25873d(a2);
                    continue;
                case 117:
                    a2 = xc.m25935a(wsVar, 117);
                    a = this.f27235m == null ? 0 : this.f27235m.length;
                    obj = new float[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27235m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = Float.intBitsToFloat(wsVar.m25878g());
                        wsVar.m25865a();
                        a++;
                    }
                    obj[a] = Float.intBitsToFloat(wsVar.m25878g());
                    this.f27235m = obj;
                    continue;
                default:
                    if (!super.m24220a(wsVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final void mo4702a(wt wtVar) {
        int i = 0;
        if (!Arrays.equals(this.f27223a, xc.f27660f)) {
            wtVar.m25906a(1, this.f27223a);
        }
        if (!(this.f27224b == null || this.f27224b.equals(""))) {
            wtVar.m25904a(2, this.f27224b);
        }
        if (Double.doubleToLongBits(this.f27225c) != Double.doubleToLongBits(0.0d)) {
            double d = this.f27225c;
            wtVar.m25910c(3, 1);
            wtVar.m25911c(Double.doubleToLongBits(d));
        }
        if (Float.floatToIntBits(this.f27226d) != Float.floatToIntBits(0.0f)) {
            wtVar.m25900a(4, this.f27226d);
        }
        if (this.f27227e != 0) {
            wtVar.m25902a(5, this.f27227e);
        }
        if (this.f27228f != 0) {
            wtVar.m25901a(6, this.f27228f);
        }
        if (this.f27229g != 0) {
            int i2 = this.f27229g;
            wtVar.m25910c(7, 0);
            wtVar.m25908b(wt.m25897d(i2));
        }
        if (this.f27230h) {
            wtVar.m25905a(8, this.f27230h);
        }
        if (this.f27231i != null && this.f27231i.length > 0) {
            for (wz wzVar : this.f27231i) {
                if (wzVar != null) {
                    wtVar.m25903a(9, wzVar);
                }
            }
        }
        if (this.f27232j != null && this.f27232j.length > 0) {
            for (wz wzVar2 : this.f27232j) {
                if (wzVar2 != null) {
                    wtVar.m25903a(10, wzVar2);
                }
            }
        }
        if (this.f27233k != null && this.f27233k.length > 0) {
            for (String str : this.f27233k) {
                if (str != null) {
                    wtVar.m25904a(11, str);
                }
            }
        }
        if (this.f27234l != null && this.f27234l.length > 0) {
            for (long a : this.f27234l) {
                wtVar.m25902a(12, a);
            }
        }
        if (this.f27236n != 0) {
            wtVar.m25902a(13, this.f27236n);
        }
        if (this.f27235m != null && this.f27235m.length > 0) {
            while (i < this.f27235m.length) {
                wtVar.m25900a(14, this.f27235m[i]);
                i++;
            }
        }
        super.mo4702a(wtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        if (!Arrays.equals(this.f27223a, ocVar.f27223a)) {
            return false;
        }
        if (this.f27224b == null) {
            if (ocVar.f27224b != null) {
                return false;
            }
        } else if (!this.f27224b.equals(ocVar.f27224b)) {
            return false;
        }
        return Double.doubleToLongBits(this.f27225c) != Double.doubleToLongBits(ocVar.f27225c) ? false : Float.floatToIntBits(this.f27226d) != Float.floatToIntBits(ocVar.f27226d) ? false : this.f27227e != ocVar.f27227e ? false : this.f27228f != ocVar.f27228f ? false : this.f27229g != ocVar.f27229g ? false : this.f27230h != ocVar.f27230h ? false : !wy.m25928a(this.f27231i, ocVar.f27231i) ? false : !wy.m25928a(this.f27232j, ocVar.f27232j) ? false : !wy.m25928a(this.f27233k, ocVar.f27233k) ? false : !wy.m25927a(this.f27234l, ocVar.f27234l) ? false : !wy.m25925a(this.f27235m, ocVar.f27235m) ? false : this.f27236n != ocVar.f27236n ? false : (this.ah == null || this.ah.m25913a()) ? ocVar.ah == null || ocVar.ah.m25913a() : this.ah.equals(ocVar.ah);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f27224b == null ? 0 : this.f27224b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f27223a)) * 31);
        long doubleToLongBits = Double.doubleToLongBits(this.f27225c);
        hashCode = ((((((((((((((this.f27230h ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.f27226d)) * 31) + ((int) (this.f27227e ^ (this.f27227e >>> 32)))) * 31) + this.f27228f) * 31) + this.f27229g) * 31)) * 31) + wy.m25922a(this.f27231i)) * 31) + wy.m25922a(this.f27232j)) * 31) + wy.m25922a(this.f27233k)) * 31) + wy.m25921a(this.f27234l)) * 31) + wy.m25919a(this.f27235m)) * 31) + ((int) (this.f27236n ^ (this.f27236n >>> 32)))) * 31;
        if (!(this.ah == null || this.ah.m25913a())) {
            i = this.ah.hashCode();
        }
        return hashCode + i;
    }

    protected final int mo4701a() {
        int i;
        int i2 = 0;
        int a = super.mo4701a();
        if (!Arrays.equals(this.f27223a, xc.f27660f)) {
            a += wt.m25893b(1, this.f27223a);
        }
        if (!(this.f27224b == null || this.f27224b.equals(""))) {
            a += wt.m25892b(2, this.f27224b);
        }
        if (Double.doubleToLongBits(this.f27225c) != Double.doubleToLongBits(0.0d)) {
            a += wt.m25896c(24) + 8;
        }
        if (Float.floatToIntBits(this.f27226d) != Float.floatToIntBits(0.0f)) {
            a += wt.m25896c(32) + 4;
        }
        if (this.f27227e != 0) {
            a += wt.m25890b(5, this.f27227e);
        }
        if (this.f27228f != 0) {
            a += wt.m25889b(6, this.f27228f);
        }
        if (this.f27229g != 0) {
            a += wt.m25896c(wt.m25897d(this.f27229g)) + wt.m25896c(56);
        }
        if (this.f27230h) {
            a += wt.m25896c(64) + 1;
        }
        if (this.f27231i != null && this.f27231i.length > 0) {
            i = a;
            for (wz wzVar : this.f27231i) {
                if (wzVar != null) {
                    i += wt.m25891b(9, wzVar);
                }
            }
            a = i;
        }
        if (this.f27232j != null && this.f27232j.length > 0) {
            i = a;
            for (wz wzVar2 : this.f27232j) {
                if (wzVar2 != null) {
                    i += wt.m25891b(10, wzVar2);
                }
            }
            a = i;
        }
        if (this.f27233k != null && this.f27233k.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f27233k) {
                if (str != null) {
                    i4++;
                    i3 += wt.m25885a(str);
                }
            }
            a = (a + i3) + (i4 * 1);
        }
        if (this.f27234l != null && this.f27234l.length > 0) {
            i = 0;
            while (i2 < this.f27234l.length) {
                i += wt.m25894b(this.f27234l[i2]);
                i2++;
            }
            a = (a + i) + (this.f27234l.length * 1);
        }
        if (this.f27236n != 0) {
            a += wt.m25890b(13, this.f27236n);
        }
        return (this.f27235m == null || this.f27235m.length <= 0) ? a : (a + (this.f27235m.length * 4)) + (this.f27235m.length * 1);
    }
}
