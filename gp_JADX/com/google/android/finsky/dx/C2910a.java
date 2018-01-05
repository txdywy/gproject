package com.google.android.finsky.dx;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cv.p177a.lf;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.cv.p177a.lh;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.volley.C4774e;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.ak;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.finsky.dfe.nano.bn;
import com.google.wireless.android.finsky.dfe.nano.bo;
import com.google.wireless.android.finsky.dfe.nano.bp;
import com.google.wireless.android.finsky.dfe.nano.cn;
import com.google.wireless.android.finsky.dfe.nano.dl;
import com.google.wireless.android.finsky.dfe.nano.gq;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class C2910a {
    public static final long[] f15464b = new long[]{12603772};
    public final List f15465a = new ArrayList();
    public final Context f15466c;
    public final C0988c f15467d;
    public final C1287h f15468e;
    public final C4774e f15469f;
    public final C1461c f15470g;
    public final Map f15471h = new ConcurrentHashMap();
    public C1549f f15472i;

    public C2910a(Context context, C0988c c0988c, C1287h c1287h, C4774e c4774e, C1461c c1461c) {
        this.f15466c = context;
        this.f15467d = c0988c;
        this.f15468e = c1287h;
        this.f15469f = c4774e;
        this.f15470g = c1461c;
    }

    public final void m15189a(String str, lf... lfVarArr) {
        int i = 7;
        int i2 = 1;
        if (lfVarArr.length > 0) {
            for (lf lfVar : lfVarArr) {
                C2910a.m15174a(str, lfVar.f13008d);
            }
        }
        if (lfVarArr.length == 1) {
            lf lfVar2 = lfVarArr[0];
            if ((lfVar2.f13006b & 1) == 0) {
                i2 = 0;
            }
            if (i2 != 0) {
                i = lfVar2.f13007c;
            }
            m15184a(str, i);
            return;
        }
        m15184a(str, 7);
    }

    public final void m15181a() {
        for (Account account : this.f15467d.cX()) {
            m15184a(account.name, 7);
        }
    }

    public final void m15184a(String str, int i) {
        FinskyLog.m21659a("Refreshing user settings: account=%s", FinskyLog.m21655a(str));
        C0957n b = C0954a.ar.m5777b(str);
        C2910a.m15176b(str, i);
        int intValue = m15180l(str).intValue();
        if (intValue == 7) {
            this.f15469f.mo4380a(null, "user_settings_changed");
        } else if (intValue == 10) {
            this.f15469f.mo4380a(null, "content_filter_settings_changed");
        }
        this.f15468e.mo2016a(str).mo1558a(C2910a.m15178d(str), intValue, new C2911b(this, str, intValue, b), new C2912c(this));
    }

    public static void m15176b(String str, int i) {
        C0957n b = C0954a.as.m5777b(str);
        Integer num = (Integer) b.m5760a();
        if (num == null) {
            b.m5763a(Integer.valueOf(i));
        } else if (num.intValue() != i) {
            b.m5763a(Integer.valueOf(7));
        }
    }

    static void m15177c(String str, int i) {
        C0957n b = C0954a.as.m5777b(str);
        Integer num = (Integer) b.m5760a();
        if (num != null && num.intValue() == i) {
            b.m5765c();
        }
    }

    public final void m15183a(String str) {
        Integer l = m15180l(str);
        if (l != null) {
            m15184a(str, l.intValue());
        }
    }

    public final gy m15190b(String str) {
        C1552e j = this.f15470g.mo2249j(str);
        if (!j.mo2294a(12639710) && !j.mo2294a(12639721)) {
            return C2910a.m15179k(str);
        }
        gy gyVar = (gy) this.f15471h.get(str);
        if (gyVar != null) {
            return gyVar;
        }
        gyVar = C2910a.m15179k(str);
        if (gyVar == null) {
            return null;
        }
        this.f15471h.put(str, gyVar);
        return gyVar;
    }

    private static gy m15179k(String str) {
        String str2 = (String) C0954a.ar.m5777b(str).m5760a();
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        C0757i gyVar = new gy();
        if (ab.m21686a(str2, gyVar)) {
            return gyVar;
        }
        return null;
    }

    public final boolean m15192c(String str) {
        return m15180l(str) != null;
    }

    private final Integer m15180l(String str) {
        C0957n b = C0954a.as.m5777b(str);
        if (m15190b(str) == null) {
            return Integer.valueOf(7);
        }
        return (Integer) b.m5760a();
    }

    public static lg m15178d(String str) {
        bb.m21791a();
        String str2 = (String) C0954a.at.m5777b(str).m5760a();
        C0757i lgVar = new lg();
        if (TextUtils.isEmpty(str2)) {
            return lgVar;
        }
        ab.m21686a(str2, lgVar);
        return lgVar;
    }

    public static void m15174a(String str, lg lgVar) {
        if (lgVar != null && lgVar.f13009a != null) {
            for (lh a : lgVar.f13009a) {
                C2910a.m15175a(str, a);
            }
        }
    }

    public static void m15175a(String str, lh lhVar) {
        if (lhVar == null || lhVar.f13012c == null || lhVar.f13013d == null) {
            FinskyLog.m21669e("Invalid argument: updatedTokenInfo missing required field", new Object[0]);
            return;
        }
        int i;
        bb.m21791a();
        C0757i d = C2910a.m15178d(str);
        if (d.f13009a != null) {
            i = 0;
            for (lh lhVar2 : d.f13009a) {
                if (lhVar.f13012c.equals(lhVar2.f13012c)) {
                    lhVar2.m13029a(lhVar.f13013d);
                    i = 1;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            if (d.f13009a == null) {
                i = 0;
            } else {
                i = d.f13009a.length;
            }
            Object obj = new lh[(i + 1)];
            if (i > 0) {
                System.arraycopy(d.f13009a, 0, obj, 0, i);
            }
            obj[i] = lhVar;
            d.f13009a = obj;
        }
        C0954a.at.m5777b(str).m5763a(ab.m21685a(d));
        FinskyLog.m21659a("Updated user setting consistency token.", new Object[0]);
    }

    public final void m15182a(C1054h c1054h) {
        this.f15465a.add(c1054h);
    }

    public final void m15191b(C1054h c1054h) {
        this.f15465a.remove(c1054h);
    }

    public final dl m15195e(String str) {
        gy b = m15190b(str);
        if (b == null) {
            return null;
        }
        return b.a;
    }

    public final void m15188a(String str, boolean z, C0657w c0657w) {
        gq gqVar = new gq();
        gqVar.b = new dl();
        dl dlVar = gqVar.b;
        dlVar.a |= 1;
        dlVar.b = z;
        m15187a(str, gqVar, 1, null, c0657w);
    }

    public final bo m15196f(String str) {
        gy b = m15190b(str);
        if (b == null) {
            return null;
        }
        return b.i;
    }

    public final Integer m15193d(String str, int i) {
        bn e = m15194e(str, i);
        return e != null ? Integer.valueOf(e.f) : null;
    }

    public final bn m15194e(String str, int i) {
        bo f = m15196f(str);
        if (f == null) {
            return null;
        }
        for (bp bpVar : f.a) {
            for (bn bnVar : bpVar.d) {
                if (bnVar.c == i) {
                    return bnVar;
                }
            }
        }
        return null;
    }

    public final void m15185a(String str, int i, int i2, C0660x c0660x, C0657w c0657w) {
        bn bnVar = new bn();
        bnVar.c = i;
        bnVar.b |= 1;
        bnVar.f = i2;
        bnVar.b |= 8;
        gq gqVar = new gq();
        gqVar.g = bnVar;
        m15187a(str, gqVar, 12, c0660x, c0657w);
    }

    public final void m15186a(String str, C0660x c0660x, C0657w c0657w, String str2) {
        gq gqVar = new gq();
        gqVar.e = new cn();
        cn cnVar = gqVar.e;
        cnVar.a |= 1;
        cnVar.b = str2;
        m15187a(str, gqVar, 8, c0660x, c0657w);
    }

    public final an m15197g(String str) {
        gy b = m15190b(str);
        if (b != null) {
            return b.g;
        }
        return null;
    }

    public final ak m15198h(String str) {
        an g = m15197g(str);
        if (g != null) {
            return g.c;
        }
        return null;
    }

    public final int m15199i(String str) {
        an g = m15197g(str);
        if (g != null && g.d != null && g.d.length != 0) {
            return g.d.length;
        }
        FinskyLog.m21665c("No settings for recovery options flow yet.", new Object[0]);
        return 1;
    }

    public final void m15200j(String str) {
        gq gqVar = new gq();
        gqVar.f = new an();
        ak akVar = new ak();
        akVar.a(true);
        akVar.a(System.currentTimeMillis());
        akVar.a(m15199i(str));
        gqVar.f.c = akVar;
        m15187a(str, gqVar, 11, null, null);
    }

    public final void m15187a(String str, gq gqVar, int i, C0660x c0660x, C0657w c0657w) {
        this.f15468e.mo2016a(str).mo1577a(gqVar, C2910a.m15178d(str), new C2915f(this, str, i, c0660x), new C2916g(c0657w));
    }
}
