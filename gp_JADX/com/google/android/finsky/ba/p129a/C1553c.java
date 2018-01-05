package com.google.android.finsky.ba.p129a;

import android.support.v4.p037h.C0313h;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cv.p177a.kn;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.cm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C1553c implements C1552e {
    public C0313h f8321a = new C0313h();
    public final String f8322b;
    public final C0986a f8323c;
    public final List f8324d = new ArrayList();
    public C0313h f8325e;
    public long[] f8326f;
    public long[] f8327g;
    public String f8328h;
    public String f8329i;
    public String f8330j;

    public C1553c(String str, C0986a c0986a, C1549f... c1549fArr) {
        this.f8322b = str;
        this.f8323c = c0986a;
        Collections.addAll(this.f8324d, c1549fArr);
        m9001b(C4680k.m21819b((String) C0954a.f5828X.m5777b(this.f8322b).m5760a()));
        C0957n b = C0954a.f5829Y.m5777b(this.f8322b);
        long[] b2 = C4680k.m21819b((String) b.m5760a());
        if (b2.length == 0 || !mo2304k()) {
            b.m5765c();
            this.f8325e = null;
            return;
        }
        mo2293a(b2);
    }

    public final C0313h mo2290a() {
        return C1554d.f8331a;
    }

    public final synchronized long[] mo2295b() {
        return this.f8326f;
    }

    public final synchronized long[] mo2296c() {
        return this.f8327g;
    }

    public synchronized boolean mo2294a(long j) {
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            if (this.f8325e != null) {
                if (this.f8325e.m1690c(j) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f8321a.m1690c(j) < 0) {
                    z2 = false;
                }
                if (z != z2) {
                    FinskyLog.m21659a("Target id: \"%s\" overridden. Enabled: <%b>", Long.valueOf(j), Boolean.valueOf(z));
                }
            } else {
                z = this.f8321a.m1690c(j) >= 0;
            }
        }
        return z;
    }

    public final synchronized boolean mo2297d() {
        boolean z = true;
        synchronized (this) {
            if (this.f8325e != null) {
                if (this.f8325e.m1681a() <= 0) {
                    z = false;
                }
            } else if (this.f8321a.m1681a() <= 0) {
                z = false;
            }
        }
        return z;
    }

    public final synchronized boolean mo2298e() {
        return !TextUtils.isEmpty(this.f8329i);
    }

    public final synchronized String mo2299f() {
        return this.f8328h;
    }

    public final synchronized String mo2300g() {
        return this.f8329i;
    }

    public final synchronized String mo2301h() {
        if (this.f8330j == null) {
            C0757i cmVar = new cm();
            cmVar.b = 1;
            cmVar.a |= 1;
            if (this.f8326f != null && this.f8326f.length > 0) {
                cmVar.c = new long[this.f8326f.length];
                C1553c.m8999a(this.f8326f, cmVar.c);
            }
            if (this.f8327g != null && this.f8327g.length > 0) {
                cmVar.d = new long[this.f8327g.length];
                C1553c.m8999a(this.f8327g, cmVar.d);
            }
            this.f8330j = ab.m21685a(cmVar);
        }
        return this.f8330j;
    }

    public final synchronized void mo2292a(kn knVar) {
        C0957n b = C0954a.f5828X.m5777b(this.f8322b);
        String str = (String) b.m5760a();
        long[] jArr = knVar.f12894b;
        Arrays.sort(jArr);
        Object a = C4680k.m21816a(jArr);
        if (!TextUtils.equals(str, a)) {
            int i;
            int i2;
            long j;
            b.m5763a(a);
            long[] c = C1553c.m9003c(jArr);
            C0313h c0313h = this.f8321a;
            long[] jArr2 = new long[C1554d.f8333c.m1681a()];
            int i3 = 0;
            int i4 = 0;
            while (i4 < C1554d.f8333c.m1681a()) {
                long a2 = C1554d.f8333c.m1683a(i4);
                if (mo2294a(a2)) {
                    i = i3 + 1;
                    jArr2[i3] = a2;
                } else {
                    i = i3;
                }
                i4++;
                i3 = i;
            }
            long[] copyOf = Arrays.copyOf(jArr2, i3);
            this.f8321a = new C0313h(c.length);
            long[] jArr3 = new long[(c.length + copyOf.length)];
            long[] jArr4 = new long[c.length];
            i4 = 0;
            i3 = 0;
            i = 0;
            while (i < copyOf.length) {
                i2 = i4 + 1;
                jArr3[i4] = copyOf[i];
                this.f8321a.m1689b(copyOf[i], null);
                i++;
                i4 = i2;
            }
            Object obj = null;
            for (long j2 : copyOf) {
                a = null;
                for (long j3 : c) {
                    if (j3 == j2) {
                        a = 1;
                        break;
                    }
                }
                if (a == null) {
                    FinskyLog.m21659a("Process stable target turned off mid-process: %d", Long.valueOf(j2));
                    obj = 1;
                    if (C1553c.m9002b(j2)) {
                        i = 1;
                        break;
                    }
                }
            }
            for (long j22 : c) {
                if (C1554d.f8333c.m1690c(j22) >= 0 && this.f8321a.m1690c(j22) < 0) {
                    FinskyLog.m21659a("Process stable target turned on mid-process: %d", Long.valueOf(j22));
                    obj = 1;
                    if (C1553c.m9002b(j22)) {
                        i = 1;
                        break;
                    }
                }
            }
            if (obj != null) {
                i = 2;
            } else {
                i = 0;
            }
            if (this.f8324d.size() > 0 && i != 0) {
                boolean z = i == 1;
                for (C1549f a3 : this.f8324d) {
                    a3.mo2287a(z);
                }
            }
            int length = c.length;
            i2 = 0;
            while (i2 < length) {
                j22 = c[i2];
                if (this.f8321a.m1690c(j22) >= 0) {
                    i = i3;
                    i3 = i4;
                } else if (C1554d.f8331a.m1690c(j22) < 0 || C1554d.f8333c.m1690c(j22) >= 0) {
                    i = i3 + 1;
                    jArr4[i3] = j22;
                    i3 = i4;
                } else {
                    i = i4 + 1;
                    jArr3[i4] = j22;
                    this.f8321a.m1689b(j22, null);
                    int i5 = i3;
                    i3 = i;
                    i = i5;
                }
                i2++;
                i4 = i3;
                i3 = i;
            }
            C0313h c0313h2 = new C0313h(c.length);
            C0313h c0313h3 = new C0313h(c.length);
            for (long j222 : c) {
                if (c0313h.m1690c(j222) < 0) {
                    c0313h2.m1689b(j222, null);
                }
            }
            C0313h c0313h4 = new C0313h(c.length);
            for (long j2222 : c) {
                c0313h4.m1689b(j2222, null);
            }
            for (i = 0; i < c0313h.m1681a(); i++) {
                j2222 = c0313h.m1683a(i);
                if (c0313h4.m1690c(j2222) < 0) {
                    c0313h3.m1689b(j2222, null);
                }
            }
            if (c0313h2.m1681a() > 0 || c0313h3.m1681a() > 0) {
                for (C1549f a32 : this.f8324d) {
                    a32.mo2286a(c0313h2, c0313h3);
                }
            }
            m9000a(jArr3, jArr4, i4, i3);
        }
    }

    public final synchronized C0313h mo2302i() {
        return this.f8321a;
    }

    public final C0313h mo2303j() {
        return this.f8325e;
    }

    public final boolean mo2304k() {
        return ((Boolean) C0955b.f5891h.m28964b()).booleanValue() && this.f8323c.mo1190f();
    }

    public final void mo2293a(long[] jArr) {
        int i = 0;
        if (mo2304k()) {
            C0957n b = C0954a.f5829Y.m5777b(this.f8322b);
            if (jArr == null || jArr.length == 0) {
                b.m5765c();
                this.f8325e = null;
                return;
            }
            b.m5763a(C4680k.m21816a(jArr));
            this.f8325e = new C0313h(jArr.length);
            int length = jArr.length;
            while (i < length) {
                this.f8325e.m1689b(jArr[i], null);
                i++;
            }
            return;
        }
        FinskyLog.m21669e("Experiment overriding not allowed.", new Object[0]);
    }

    private final void m9001b(long[] jArr) {
        int i = 0;
        long[] c = C1553c.m9003c(jArr);
        this.f8321a.m1687b();
        long[] jArr2 = new long[c.length];
        long[] jArr3 = new long[c.length];
        int length = c.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4;
            long j = c[i2];
            if (C1554d.f8331a.m1690c(j) >= 0) {
                i4 = i3 + 1;
                jArr2[i3] = j;
                this.f8321a.m1689b(j, null);
            } else {
                i4 = i + 1;
                jArr3[i] = j;
                i = i4;
                i4 = i3;
            }
            i2++;
            i3 = i4;
        }
        m9000a(jArr2, jArr3, i3, i);
    }

    private static long[] m9003c(long[] jArr) {
        int i = 0;
        long[] b = C4680k.m21819b((String) C0955b.dl.m28964b());
        if (b.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[(jArr.length + b.length)];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr2[i2] = jArr[i2];
        }
        while (i < b.length) {
            jArr2[jArr.length + i] = b[i];
            i++;
        }
        return jArr2;
    }

    private static boolean m9002b(long j) {
        int c = C1554d.f8333c.m1690c(j);
        if (c < 0) {
            return false;
        }
        Boolean bool = (Boolean) C1554d.f8333c.m1686b(c);
        return bool != null && bool.booleanValue();
    }

    private final void m9000a(long[] jArr, long[] jArr2, int i, int i2) {
        this.f8326f = Arrays.copyOf(jArr, i);
        this.f8327g = Arrays.copyOf(jArr2, i2);
        this.f8328h = C4680k.m21816a(this.f8326f);
        this.f8329i = C4680k.m21816a(this.f8327g);
        this.f8330j = null;
    }

    private static void m8999a(long[] jArr, long[] jArr2) {
        Arrays.sort(jArr);
        jArr2[0] = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            jArr2[i] = jArr[i] - jArr[i - 1];
        }
    }

    public final void mo2291a(C1549f c1549f) {
        this.f8324d.add(c1549f);
    }
}
