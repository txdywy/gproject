package com.google.android.finsky.setup;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cr.C2366c;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.x;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bb implements C1003o {
    public C2366c f20852a;
    public C2366c f20853b;
    public final Map f20854c = new HashMap();
    public final Map f20855d = new HashMap();
    public final Map f20856e = new HashMap();
    public final az f20857f = new az(this.f20860i);
    public int f20858g = 0;
    public String f20859h = null;
    public final /* synthetic */ RestoreService f20860i;

    bb(RestoreService restoreService) {
        this.f20860i = restoreService;
    }

    static aw m19251a(String str, Map map) {
        if (C1473m.f7980a.mo2041U().mo1183b(str) == null) {
            FinskyLog.m21665c("Unknown account %s", FinskyLog.m21655a(str));
            return null;
        }
        String str2 = (String) map.get("attempts");
        String str3 = (String) map.get("aid");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            FinskyLog.m21665c("Missing data for account %s", FinskyLog.m21655a(str));
            return null;
        }
        try {
            int intValue = Integer.valueOf(str2).intValue();
            if (intValue < 0 || intValue >= ((Integer) C0955b.bj.m28964b()).intValue()) {
                FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(intValue), FinskyLog.m21655a(str));
                return null;
            }
            aw awVar = new aw();
            awVar.f20804a = intValue;
            awVar.f20805b = str3;
            return awVar;
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Bad data for account %s (%s, %s)", FinskyLog.m21655a(str), str2, str3);
            return null;
        }
    }

    public final void m19259a(String str, boolean z) {
        aw awVar = (aw) this.f20854c.get(str);
        if (z) {
            this.f20854c.remove(str);
            m19261b(str);
        } else if (awVar != null) {
            awVar.f20806c = false;
        }
        m19256a();
    }

    public final int m19255a(String str) {
        aw awVar = (aw) this.f20854c.get(str);
        return awVar != null ? awVar.f20804a : 0;
    }

    final void m19261b(String str) {
        String encode = Uri.encode(str);
        aw awVar = (aw) this.f20854c.get(str);
        if (awVar == null) {
            this.f20852a.mo2869a(encode);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(awVar.f20804a));
        hashMap.put("aid", awVar.f20805b);
        this.f20852a.mo2870a(encode, hashMap);
    }

    static ay m19254b(String str, Map map) {
        Throwable e;
        String str2 = (String) map.get("attempts");
        String str3 = (String) map.get("versionCode");
        String str4 = (String) map.get("accountName");
        String str5 = (String) map.get("title");
        String str6 = (String) map.get("priority");
        String str7 = (String) map.get("deliveryToken");
        String str8 = (String) map.get("visible");
        String str9 = (String) map.get("appIconUrl");
        String str10 = (String) map.get("retryTime");
        String str11 = (String) map.get("isVpa");
        String str12 = (String) map.get("networkType");
        String str13 = (String) map.get("installDetails");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str8) || TextUtils.isEmpty(str9) || TextUtils.isEmpty(str10)) {
            FinskyLog.m21665c("Missing data for package %s", str);
            return null;
        }
        ay ayVar = new ay();
        try {
            ayVar.f20808a = Integer.valueOf(str2).intValue();
            ayVar.f20809b = Integer.valueOf(str3).intValue();
            ayVar.f20812e = Integer.valueOf(str6).intValue();
            ayVar.f20814g = Boolean.valueOf(str8).booleanValue();
            ayVar.f20816i = Long.valueOf(str10).longValue();
            ayVar.f20817j = Boolean.valueOf(str11).booleanValue();
            ayVar.f20818k = str12 != null ? Integer.valueOf(str12).intValue() : 1;
            if (str13 != null) {
                ayVar.f20819l = es.m12537a(Base64.decode(str13, 0));
            }
            if (ayVar.f20808a < 0 || ayVar.f20808a >= ((Integer) C0955b.bl.m28964b()).intValue()) {
                FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(ayVar.f20808a), str);
                return null;
            }
            Object obj = !TextUtils.isEmpty(str4) ? 1 : null;
            if (!ayVar.f20817j && obj == null) {
                FinskyLog.m21665c("Missing account name for package %s", str);
                return null;
            } else if (obj == null || C1473m.f7980a.mo2041U().mo1183b(str4) != null) {
                ayVar.f20810c = str4;
                ayVar.f20811d = str5;
                ayVar.f20813f = str7;
                ayVar.f20815h = str9;
                return ayVar;
            } else {
                FinskyLog.m21665c("Unknown account %s", FinskyLog.m21655a(str4));
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Bad data for package %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", str, str2, str3, FinskyLog.m21655a(str4), str5, str6, str8, str10, str11, str12, str13);
            return null;
        } catch (InvalidProtocolBufferNanoException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Bad data for package %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", str, str2, str3, FinskyLog.m21655a(str4), str5, str6, str8, str10, str11, str12, str13);
            return null;
        }
    }

    public final void m19258a(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, boolean z2, int i3, es esVar) {
        ay ayVar;
        ay ayVar2 = (ay) this.f20855d.get(str);
        if (ayVar2 == null) {
            ayVar = new ay();
        } else {
            ayVar = ayVar2;
        }
        ayVar.f20808a++;
        ayVar.f20809b = i;
        ayVar.f20810c = str2;
        ayVar.f20811d = str3;
        ayVar.f20812e = i2;
        ayVar.f20813f = str4;
        ayVar.f20814g = z;
        ayVar.f20815h = str5;
        ayVar.f20816i = 0;
        ayVar.f20817j = z2;
        ayVar.f20818k = i3;
        ayVar.f20819l = esVar;
        this.f20855d.put(str, ayVar);
        m19264e(str);
        m19260b();
        C1473m.f7980a.aS().mo3951a(ayVar.f20810c, str, ayVar.f20808a, ayVar.f20809b, ayVar.f20817j);
    }

    final void m19262c(String str) {
        this.f20855d.remove(str);
        m19264e(str);
        m19260b();
    }

    private final void m19252a(String str, int i, boolean z) {
        int i2;
        boolean z2;
        int i3 = 0;
        ay ayVar = (ay) this.f20855d.get(str);
        int i4 = (ayVar == null || !ayVar.f20814g) ? 0 : 1;
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (ayVar != null) {
            z2 = ayVar.f20817j;
        } else {
            z2 = false;
        }
        String str2 = ayVar != null ? ayVar.f20810c : null;
        bs aS = C1473m.f7980a.aS();
        ay ayVar2 = (ay) this.f20855d.get(str);
        if (ayVar2 != null) {
            i3 = ayVar2.f20808a;
        }
        aS.mo3961b(str2, str, i3, i, z2);
        if (i2 != 0) {
            C1473m.f7980a.mo2266y().mo3823a(str);
            if (i4 != 0) {
                C0954a.bh.m5763a(Integer.valueOf(((Integer) C0954a.bh.m5760a()).intValue() + 1));
            }
        } else if (!(z || i4 == 0)) {
            C0954a.bi.m5763a(Integer.valueOf(((Integer) C0954a.bi.m5760a()).intValue() + 1));
        }
        if (!(i2 == 0 && z)) {
            m19262c(str);
        }
        m19256a();
    }

    public final boolean m19263d(String str) {
        ay ayVar = (ay) this.f20855d.get(str);
        if (ayVar == null) {
            return false;
        }
        if (ayVar.f20808a < ((Integer) C0955b.bl.m28964b()).intValue()) {
            return true;
        }
        FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(ayVar.f20808a), str);
        return false;
    }

    final void m19264e(String str) {
        String encode = Uri.encode(str);
        ay ayVar = (ay) this.f20855d.get(str);
        if (ayVar == null) {
            this.f20853b.mo2869a(encode);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(ayVar.f20808a));
        hashMap.put("versionCode", Integer.toString(ayVar.f20809b));
        hashMap.put("accountName", ayVar.f20810c);
        hashMap.put("title", ayVar.f20811d);
        hashMap.put("priority", Integer.toString(ayVar.f20812e));
        if (!TextUtils.isEmpty(ayVar.f20813f)) {
            hashMap.put("deliveryToken", ayVar.f20813f);
        }
        hashMap.put("visible", Boolean.toString(ayVar.f20814g));
        hashMap.put("appIconUrl", ayVar.f20815h);
        hashMap.put("retryTime", Long.toString(ayVar.f20816i));
        hashMap.put("isVpa", Boolean.toString(ayVar.f20817j));
        hashMap.put("networkType", Integer.toString(ayVar.f20818k));
        if (ayVar.f20819l != null) {
            hashMap.put("installDetails", Base64.encodeToString(C0757i.m4909a(ayVar.f20819l), 0));
        }
        this.f20853b.mo2870a(encode, hashMap);
    }

    public final void m19265f(String str) {
        this.f20856e.remove(str);
        m19256a();
    }

    public final void m19256a() {
        if (this.f20855d.isEmpty() && this.f20854c.isEmpty() && this.f20856e.isEmpty() && this.f20858g <= 0) {
            if (this.f20860i.f20579m == null || this.f20860i.f20579m.booleanValue()) {
                C1473m.f7980a.aS().mo3958b();
            }
            this.f20860i.f20579m = null;
            FinskyLog.m21659a("Restore complete with %d success and %d failed.", C0954a.bh.m5760a(), C0954a.bi.m5760a());
            C0954a.bh.m5763a(Integer.valueOf(0));
            C0954a.bi.m5763a(Integer.valueOf(0));
            this.f20860i.m19095a(1, null);
            this.f20860i.m19094a();
            this.f20860i.stopSelf(this.f20860i.f20571d);
        }
    }

    public final boolean m19266g(String str) {
        if (!this.f20854c.isEmpty()) {
            for (aw awVar : this.f20854c.values()) {
                if (awVar.f20806c) {
                    return true;
                }
            }
        }
        if (!this.f20855d.isEmpty()) {
            for (Entry entry : this.f20855d.entrySet()) {
                if ((str == null || !str.equals(entry.getKey())) && ((ay) entry.getValue()).f20812e == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void mo1205a(C3369m c3369m) {
        ay ayVar = (ay) this.f20855d.get(c3369m.m16819a());
        if (ayVar != null) {
            boolean z;
            switch (c3369m.f17273c.f17153d) {
                case 0:
                case 11:
                    z = false;
                    break;
                case 1:
                case 4:
                case 7:
                    m19253a(c3369m.m16819a(), true, false);
                    z = false;
                    break;
                case 2:
                    FinskyLog.m21667d("Restore package %s download cancelled", c3369m.m16819a());
                    m19253a(c3369m.m16819a(), false, false);
                    m19252a(c3369m.m16819a(), 4, false);
                    z = true;
                    break;
                case 3:
                    FinskyLog.m21667d("Restore package %s download error %d", c3369m.m16819a(), Integer.valueOf(c3369m.m16820b()));
                    boolean z2 = bq.m19292a(c3369m.m16820b()) && this.f20860i.f20572e.m19263d(c3369m.m16819a());
                    m19253a(c3369m.m16819a(), false, z2);
                    m19252a(c3369m.m16819a(), 5, z2);
                    if (!z2) {
                        z = true;
                        break;
                    }
                    Long l;
                    if (ayVar == null || ayVar.f20812e != 1) {
                        l = (Long) C0955b.bm.m28964b();
                    } else {
                        l = (Long) C0955b.bn.m28964b();
                    }
                    long a = C1473m.f7980a.cK().mo3920a(this.f20860i, c3369m.m16819a(), (long) (((double) l.longValue()) * (0.75d + (Math.random() / 2.0d))));
                    bb bbVar = this.f20860i.f20572e;
                    String a2 = c3369m.m16819a();
                    ay ayVar2 = (ay) bbVar.f20855d.get(a2);
                    if (ayVar2 == null) {
                        FinskyLog.m21659a("Unexpected missing package %s, can't write retry time", a2);
                    } else {
                        ayVar2.f20816i = a;
                        bbVar.m19264e(a2);
                    }
                    C1473m.f7980a.mo2256o().mo3438a(c3369m.m16819a(), ayVar.f20811d, ayVar.f20819l);
                    this.f20860i.m19098a(c3369m.m16819a(), ayVar.f20815h);
                    z = false;
                    break;
                case 5:
                    FinskyLog.m21667d("Restore package %s install error %d", c3369m.m16819a(), Integer.valueOf(c3369m.m16820b()));
                    m19253a(c3369m.m16819a(), false, false);
                    m19252a(c3369m.m16819a(), 6, false);
                    z = true;
                    break;
                case 6:
                    FinskyLog.m21659a("Restore package %s install complete", c3369m.m16819a());
                    m19253a(c3369m.m16819a(), false, false);
                    m19252a(c3369m.m16819a(), 0, false);
                    z = true;
                    break;
                case 8:
                    z = false;
                    break;
                default:
                    FinskyLog.m21669e("enum %s", Integer.valueOf(c3369m.f17273c.f17153d));
                    z = false;
                    break;
            }
            if (z) {
                RestoreService restoreService = this.f20860i;
                String a3 = c3369m.m16819a();
                FinskyLog.m21659a("Canceling bitmap for %s", a3);
                x xVar = (x) restoreService.f20583q.remove(a3);
                if (xVar != null) {
                    xVar.a();
                }
                restoreService.f20572e.m19265f(a3);
            }
        }
    }

    private final void m19253a(String str, boolean z, boolean z2) {
        ay ayVar = (ay) this.f20855d.get(str);
        if (ayVar != null && ayVar.f20812e == 1) {
            if (z) {
                this.f20859h = str;
                if (ayVar.f20814g) {
                    this.f20860i.m19095a(3, str);
                    return;
                } else {
                    this.f20860i.m19095a(2, str);
                    return;
                }
            }
            this.f20859h = null;
            if (z2) {
                this.f20860i.m19095a(2, str);
            } else if (!m19266g(str)) {
                this.f20860i.m19095a(1, str);
            }
        }
    }

    final void m19260b() {
        if (!C1503a.m8831b(this.f20860i.getApplicationContext())) {
            ay ayVar;
            int i;
            Object obj;
            int intValue = ((Integer) C0954a.bh.m5760a()).intValue() + ((Integer) C0954a.bi.m5760a()).intValue();
            int i2 = intValue;
            for (ay ayVar2 : this.f20855d.values()) {
                if (ayVar2.f20814g) {
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                i2 = i;
            }
            Set<String> keySet = this.f20855d.keySet();
            if (keySet.isEmpty()) {
                obj = null;
            } else if (C1473m.f7980a.mo2258q().m11721c()) {
                obj = null;
            } else {
                for (String str : keySet) {
                    ayVar2 = (ay) this.f20855d.get(str);
                    if (ayVar2.f20814g && ayVar2.f20818k == 1) {
                        obj = null;
                        break;
                    }
                }
                i = 1;
            }
            if (obj != null) {
                az azVar = this.f20857f;
                long j = 0;
                for (ay ayVar22 : this.f20855d.values()) {
                    long j2;
                    if (ayVar22.f20819l == null) {
                        j2 = 0;
                    } else {
                        j2 = ayVar22.f20819l.f12311c;
                    }
                    j += j2;
                }
                azVar.m19240a(i2, j);
                return;
            }
            this.f20857f.m19239a(intValue, i2);
        }
    }
}
