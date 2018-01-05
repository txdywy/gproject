package com.google.android.finsky.p107l;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class C3654j {
    public final C1461c f18061a;
    public int f18062b = -1;
    public int f18063c = 0;
    public long f18064d = 0;
    public String[] f18065e = null;
    public int f18066f = -1;
    public int f18067g = 0;
    public long f18068h = 0;
    public String[] f18069i = null;

    public C3654j(C1461c c1461c) {
        this.f18061a = c1461c;
    }

    public final C3654j m17264a(C2441n c2441n) {
        if (c2441n != null) {
            m17260a(c2441n.f13163c, c2441n.f13153B, null);
        }
        return this;
    }

    public final C3654j m17261a(C2129c c2129c) {
        int i;
        String[] strArr;
        Object obj = null;
        if (c2129c != null) {
            i = c2129c.f10809c;
        } else {
            i = -1;
        }
        this.f18066f = i;
        if (c2129c != null) {
            i = c2129c.f10802I;
        } else {
            i = 0;
        }
        this.f18067g = i;
        this.f18068h = 0;
        if (c2129c.f10832z != null) {
            es esVar = c2129c.f10832z.f13153B;
            if (esVar != null) {
                if ((esVar.f12309a & 16) != 0) {
                    obj = 1;
                }
                if (obj != null) {
                    this.f18068h = esVar.f12315g;
                }
            }
        }
        if (c2129c != null) {
            strArr = c2129c.f10805L;
        } else {
            strArr = null;
        }
        this.f18069i = strArr;
        return this;
    }

    public final C3654j m17263a(ch chVar) {
        return m17260a(chVar.f12036d, null, null);
    }

    public final C3654j m17260a(int i, es esVar, String[] strArr) {
        int i2;
        long j;
        this.f18066f = i;
        if (esVar != null) {
            i2 = esVar.f12314f;
        } else {
            i2 = 0;
        }
        this.f18067g = i2;
        if (esVar != null) {
            j = esVar.f12315g;
        } else {
            j = 0;
        }
        this.f18068h = j;
        this.f18069i = (String[]) C4672c.m21806a(esVar != null ? esVar.f12320l : null, (Object[]) strArr);
        return this;
    }

    public final C3654j m17262a(C2322b c2322b) {
        this.f18062b = c2322b != null ? c2322b.f11419d : -1;
        this.f18063c = c2322b != null ? c2322b.f11420e : 0;
        this.f18064d = c2322b != null ? c2322b.f11421f : 0;
        this.f18065e = c2322b != null ? c2322b.f11430o : null;
        return this;
    }

    public final boolean m17265a() {
        return m17272h() > 0;
    }

    public final boolean m17266b() {
        return m17272h() < 0;
    }

    public final Set m17267c() {
        if (this.f18061a.dj().mo2294a(12642050) && m17258i() == 0) {
            return m17259j();
        }
        FinskyLog.m21669e("GetMissingSplitNames() called when not on isOnLatestVersion()", new Object[0]);
        return Collections.emptySet();
    }

    public final boolean m17268d() {
        return m17258i() == 0 && !m17259j().isEmpty();
    }

    public final boolean m17269e() {
        return !m17265a();
    }

    public final String m17270f() {
        int i = this.f18066f;
        int i2 = this.f18067g;
        return i + "." + i2 + "." + this.f18068h;
    }

    public final String m17271g() {
        int i = this.f18062b;
        int i2 = this.f18063c;
        return i + "." + i2 + "." + this.f18064d;
    }

    public final int m17272h() {
        int i = m17258i();
        if (i != 0 || m17259j().isEmpty()) {
            return i;
        }
        return 1;
    }

    private final int m17258i() {
        if (this.f18066f > this.f18062b) {
            return 1;
        }
        if (this.f18066f != this.f18062b) {
            return -1;
        }
        if (this.f18061a.dj().mo2294a(12637130) && this.f18067g == this.f18063c) {
            if (this.f18068h == -1 && this.f18064d != 0) {
                Object[] objArr = new Object[]{Integer.valueOf(this.f18062b), Integer.valueOf(this.f18063c), Long.valueOf(this.f18064d), Integer.valueOf(this.f18066f), Integer.valueOf(this.f18067g), Long.valueOf(this.f18068h)};
                return 1;
            } else if (this.f18061a.dj().mo2294a(12643849)) {
                int compareTo = Long.valueOf(this.f18068h).compareTo(Long.valueOf(this.f18064d));
                if (compareTo > 0) {
                    Object[] objArr2 = new Object[]{Integer.valueOf(this.f18062b), Integer.valueOf(this.f18063c), Long.valueOf(this.f18064d), Integer.valueOf(this.f18066f), Integer.valueOf(this.f18067g), Long.valueOf(this.f18068h)};
                }
                return compareTo;
            }
        }
        return Integer.valueOf(this.f18067g).compareTo(Integer.valueOf(this.f18063c));
    }

    private final Set m17259j() {
        if (!this.f18061a.dj().mo2294a(12642050)) {
            return Collections.emptySet();
        }
        if (this.f18069i == null || this.f18069i.length == 0) {
            return Collections.emptySet();
        }
        Set hashSet = new HashSet(Arrays.asList(this.f18069i));
        if (this.f18065e == null || this.f18065e.length <= 0) {
            return hashSet;
        }
        hashSet.removeAll(Arrays.asList(this.f18065e));
        return hashSet;
    }
}
