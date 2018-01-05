package com.google.android.finsky.p111d;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.ax;
import com.google.wireless.android.a.a.a.a.aa;
import com.google.wireless.android.a.a.a.a.ab;
import com.google.wireless.android.a.a.a.a.ac;
import com.google.wireless.android.a.a.a.a.ag;
import com.google.wireless.android.a.a.a.a.aj;
import com.google.wireless.android.a.a.a.a.ak;
import com.google.wireless.android.a.a.a.a.an;
import com.google.wireless.android.a.a.a.a.ao;
import com.google.wireless.android.a.a.a.a.ay;
import com.google.wireless.android.a.a.a.a.bg;
import com.google.wireless.android.a.a.a.a.bk;
import com.google.wireless.android.a.a.a.a.bz;
import com.google.wireless.android.a.a.a.a.ca;
import com.google.wireless.android.a.a.a.a.cc;
import com.google.wireless.android.a.a.a.a.ck;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.a.a.a.a.co;
import com.google.wireless.android.a.a.a.a.ct;
import com.google.wireless.android.a.a.a.a.r;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.a.a.a.a.u;
import com.google.wireless.android.a.a.a.a.x;
import com.google.wireless.android.a.a.a.a.z;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C2474c {
    public final bo f13342a = C2482j.m13310e();

    public C2474c(int i) {
        this.f13342a.m28992a(i);
    }

    public final C2474c m13236a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f13342a.m28994a(str);
        }
        return this;
    }

    @Deprecated
    public final C2474c m13244b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f13342a.m28999b(str);
        }
        return this;
    }

    @Deprecated
    public final C2474c m13210a(int i) {
        if (i != 0) {
            this.f13342a.m28998b(i);
        }
        return this;
    }

    public final C2474c m13238a(Throwable th) {
        if (th != null) {
            this.f13342a.m29000c(th.getClass().getSimpleName());
        }
        return this;
    }

    public final C2474c m13240a(byte[] bArr) {
        if (bArr != null) {
            bo boVar = this.f13342a;
            if (bArr == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 32;
            boVar.f31707g = bArr;
        }
        return this;
    }

    public final C2474c m13241b(int i) {
        if (i != 0) {
            bo boVar = this.f13342a;
            boVar.f31701a |= 64;
            boVar.f31708h = i;
        }
        return this;
    }

    public final C2474c m13235a(Integer num) {
        if (num != null) {
            bo boVar = this.f13342a;
            int intValue = num.intValue();
            boVar.f31701a |= 128;
            boVar.f31709i = intValue;
        }
        return this;
    }

    public final C2474c m13243b(Integer num) {
        if (num != null) {
            bo boVar = this.f13342a;
            int intValue = num.intValue();
            boVar.f31701a |= 256;
            boVar.f31710j = intValue;
        }
        return this;
    }

    public final C2474c m13225a(cc ccVar) {
        this.f13342a.f31711k = ccVar;
        return this;
    }

    public final C2474c m13231a(t tVar) {
        this.f13342a.f31712l = tVar;
        return this;
    }

    public final C2474c m13212a(long j) {
        if (j >= 0) {
            bo boVar = this.f13342a;
            boVar.f31701a |= 512;
            boVar.f31713m = j;
        }
        return this;
    }

    public final C2474c m13242b(long j) {
        if (j >= 0) {
            this.f13342a.m28993a(j);
        }
        return this;
    }

    @Deprecated
    public final C2474c m13239a(boolean z) {
        this.f13342a.m28995a(z);
        return this;
    }

    public final C2474c m13214a(aa aaVar) {
        this.f13342a.f31718r = aaVar;
        return this;
    }

    public final C2474c m13246c(int i) {
        if (i >= 0) {
            bo boVar = this.f13342a;
            boVar.f31701a |= 8192;
            boVar.f31719s = i;
        }
        return this;
    }

    public final C2474c m13245b(boolean z) {
        bo boVar = this.f13342a;
        boVar.f31701a |= 16384;
        boVar.f31720t = z;
        return this;
    }

    public final C2474c m13227a(cn cnVar) {
        this.f13342a.f31721u = cnVar;
        return this;
    }

    public final C2474c m13247c(String str) {
        if (!TextUtils.isEmpty(str)) {
            bo boVar = this.f13342a;
            if (str == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 32768;
            boVar.f31722v = str;
        }
        return this;
    }

    public final C2474c m13249d(String str) {
        if (!TextUtils.isEmpty(str)) {
            bo boVar = this.f13342a;
            if (str == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 65536;
            boVar.f31724x = str;
        }
        return this;
    }

    public final C2474c m13234a(z zVar) {
        this.f13342a.f31725y = zVar;
        return this;
    }

    public final C2474c m13224a(bz bzVar) {
        this.f13342a.f31675A = bzVar;
        return this;
    }

    public final C2474c m13251e(String str) {
        if (!TextUtils.isEmpty(str)) {
            bo boVar = this.f13342a;
            if (str == null) {
                throw new NullPointerException();
            }
            boVar.f31701a |= 131072;
            boVar.f31677C = str;
        }
        return this;
    }

    public final C2474c m13248d(int i) {
        if (this.f13342a.f31679E == null) {
            this.f13342a.f31679E = new ab();
        }
        ab abVar = this.f13342a.f31679E;
        abVar.a |= 1;
        abVar.b = i;
        return this;
    }

    public final C2474c m13230a(r rVar) {
        this.f13342a.al = rVar;
        return this;
    }

    public final C2474c m13228a(co coVar) {
        this.f13342a.f31689O = coVar;
        return this;
    }

    public final C2474c m13223a(bk bkVar) {
        this.f13342a.f31691Q = bkVar;
        return this;
    }

    public final C2474c m13250e(int i) {
        bo boVar = this.f13342a;
        boVar.f31692R = i;
        boVar.f31701a |= 524288;
        return this;
    }

    public final C2474c m13217a(aj ajVar) {
        this.f13342a.f31693S = ajVar;
        return this;
    }

    public final C2474c m13253f(String str) {
        bo boVar = this.f13342a;
        if (str == null) {
            throw new NullPointerException();
        }
        boVar.f31701a |= 1048576;
        boVar.f31694T = str;
        return this;
    }

    public final C2474c m13252f(int i) {
        bo boVar = this.f13342a;
        boVar.f31697W = i;
        boVar.f31701a |= 2097152;
        return this;
    }

    public final C2474c m13232a(u uVar) {
        this.f13342a.f31699Y = uVar;
        return this;
    }

    public final C2474c m13226a(ck ckVar) {
        this.f13342a.aa = ckVar;
        return this;
    }

    public final C2474c m13215a(ac acVar) {
        this.f13342a.ac = acVar;
        return this;
    }

    public final C2474c m13237a(String str, String str2, int i, int i2) {
        ca caVar = new ca();
        if (str == null) {
            throw new NullPointerException();
        }
        caVar.a |= 1;
        caVar.b = str;
        if (str2 != null) {
            if (str2 == null) {
                throw new NullPointerException();
            }
            caVar.a |= 2;
            caVar.c = str2;
        }
        caVar.e = i;
        caVar.a |= 8;
        caVar.a |= 16;
        caVar.f = i2;
        this.f13342a.ag = caVar;
        return this;
    }

    public final C2474c m13213a(ax axVar) {
        this.f13342a.aj = axVar;
        return this;
    }

    public final C2474c m13221a(ay ayVar) {
        this.f13342a.ak = ayVar;
        return this;
    }

    public final C2474c m13222a(bg bgVar) {
        this.f13342a.am = bgVar;
        return this;
    }

    public final C2474c m13229a(ct ctVar) {
        this.f13342a.an = ctVar;
        return this;
    }

    public final C2474c m13216a(ag agVar) {
        this.f13342a.ao = agVar;
        return this;
    }

    public final C2474c m13218a(ak akVar) {
        this.f13342a.ap = akVar;
        return this;
    }

    public final C2474c m13254g(int i) {
        if (!(((Boolean) C0955b.ju.m28964b()).booleanValue() || i == 0)) {
            bo boVar = this.f13342a;
            boVar.aq = i;
            boVar.f31701a |= 16777216;
        }
        return this;
    }

    public final C2474c m13211a(int i, int i2) {
        m13254g(i);
        if (!(((Boolean) C0955b.ju.m28964b()).booleanValue() || i2 == 0)) {
            bo boVar = this.f13342a;
            boVar.f31701a |= 33554432;
            boVar.ar = i2;
        }
        return this;
    }

    public final C2474c m13255h(int i) {
        bo boVar = this.f13342a;
        boVar.ax = i;
        boVar.f31701a |= 134217728;
        return this;
    }

    public final C2474c m13233a(x xVar) {
        this.f13342a.aC = xVar;
        return this;
    }

    public final C2474c m13220a(ao aoVar) {
        this.f13342a.aG = aoVar;
        return this;
    }

    public final C2474c m13219a(an anVar) {
        this.f13342a.aH = anVar;
        return this;
    }
}
