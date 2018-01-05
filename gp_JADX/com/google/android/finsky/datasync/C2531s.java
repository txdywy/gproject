package com.google.android.finsky.datasync;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.volley.C1470a;
import com.google.android.finsky.volley.C4778c;
import com.google.wireless.android.a.a.a.a.ac;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C2531s {
    public static Integer f13563j;
    public final C0986a f13564a;
    public final Context f13565b;
    public final C2471a f13566c;
    public final C1470a f13567d;
    public final C1287h f13568e;
    public final C1289l f13569f;
    public final C1461c f13570g;
    public final C2534x f13571h;
    public C0659a f13572i;
    public final Map f13573k = new HashMap();

    public C2531s(C0986a c0986a, Context context, C2471a c2471a, C1470a c1470a, C1287h c1287h, C1289l c1289l, C1461c c1461c, C2534x c2534x) {
        this.f13564a = c0986a;
        this.f13565b = context;
        this.f13566c = c2471a;
        this.f13567d = c1470a;
        this.f13568e = c1287h;
        this.f13569f = c1289l;
        this.f13570g = c1461c;
        this.f13571h = c2534x;
    }

    public final boolean m13483a(String str) {
        return this.f13570g.mo2249j(str).mo2294a(12627544) && ((Boolean) C0955b.cw.m28964b()).booleanValue();
    }

    public final void m13481a(List list, int i) {
        m13474a(list, new C2474c(i));
    }

    private final void m13474a(List list, C2474c c2474c) {
        for (String str : list) {
            C2495w c2495w = (C2495w) this.f13573k.get(str);
            if (c2495w == null) {
                c2495w = this.f13566c.m13184a(null).m13380b(str);
                this.f13573k.put(str, c2495w);
            }
            c2495w.m13367a(c2474c);
        }
    }

    final void m13482a(List list, boolean z) {
        int i;
        int i2 = 0;
        C2474c c2474c = new C2474c(1620);
        ac acVar = new ac();
        int intValue = ((Integer) C1189b.f7268d.m5760a()).intValue();
        if (intValue == 3 || intValue == 4) {
            List<ah> a = this.f13571h.m13487a("dfe").mo2927a();
            List arrayList = new ArrayList();
            for (ah ahVar : a) {
                if (list.contains(ahVar.f13537b)) {
                    arrayList.add(ahVar);
                }
            }
            i2 = m13475b(arrayList);
            i = i2;
            i2 = arrayList.size() - i2;
        } else {
            i = 0;
        }
        long longValue = ((Long) C1189b.f7272h.m5760a()).longValue();
        acVar.a |= 1;
        acVar.b = longValue;
        longValue = ((Long) C1189b.f7273i.m5760a()).longValue();
        acVar.a |= 2;
        acVar.c = longValue;
        acVar.a(intValue);
        acVar.m = ((Integer) C1189b.f7269e.m5760a()).intValue();
        acVar.a |= eq.FLAG_MOVED;
        acVar.a(((Long) C1189b.f7274j.m5760a()).longValue());
        longValue = ((Long) C1189b.f7284t.m5760a()).longValue();
        acVar.a |= 16;
        acVar.f = longValue;
        String str = (String) C1189b.f7285u.m5760a();
        if (str == null) {
            throw new NullPointerException();
        }
        acVar.a |= 32;
        acVar.g = str;
        int intValue2 = ((Integer) C1189b.f7276l.m5760a()).intValue();
        acVar.a |= 64;
        acVar.h = intValue2;
        intValue2 = ((Integer) C1189b.f7277m.m5760a()).intValue();
        acVar.a |= 256;
        acVar.j = intValue2;
        intValue2 = ((Integer) C1189b.f7279o.m5760a()).intValue();
        acVar.a |= 128;
        acVar.i = intValue2;
        intValue2 = ((Integer) C1189b.f7280p.m5760a()).intValue();
        acVar.a |= 512;
        acVar.k = intValue2;
        acVar.a(z);
        acVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
        acVar.n = i;
        acVar.a |= 8192;
        acVar.o = i2;
        c2474c.m13215a(acVar);
        m13474a(list, c2474c);
    }

    final void m13480a(List list) {
        m13474a(list, new C2474c(1612).m13244b("gms_core_unavailable"));
    }

    public final void m13479a(Context context) {
        try {
            FinskyLog.m21662b("[Cache and Sync] cache and sync cleared", new Object[0]);
            long longValue = ((Long) C1189b.f7283s.m5760a()).longValue();
            long longValue2 = ((Long) C1189b.f7286v.m5760a()).longValue();
            long longValue3 = ((Long) C1189b.f7274j.m5760a()).longValue();
            long longValue4 = ((Long) C1189b.f7284t.m5760a()).longValue();
            Object obj = (String) C1189b.f7285u.m5760a();
            int intValue = ((Integer) C1189b.f7276l.m5760a()).intValue();
            int intValue2 = ((Integer) C1189b.f7279o.m5760a()).intValue();
            C1189b.f7265a.m5759b();
            C1189b.f7283s.m5763a(Long.valueOf(longValue));
            C1189b.f7286v.m5763a(Long.valueOf(longValue2));
            C1189b.f7274j.m5763a(Long.valueOf(longValue3));
            C1189b.f7284t.m5763a(Long.valueOf(longValue4));
            C1189b.f7285u.m5763a(obj);
            C1189b.f7276l.m5763a(Integer.valueOf(intValue));
            C1189b.f7279o.m5763a(Integer.valueOf(intValue2));
            C1189b.f7268d.m5763a(Integer.valueOf(1));
            C1189b.f7269e.m5763a(Integer.valueOf(1));
            C1189b.f7270f.m5763a(Integer.valueOf(1));
            C1189b.f7271g.m5763a(Integer.valueOf(1));
            if (!this.f13570g.dj().mo2294a(12628818)) {
                m13478a().mo1068b();
            }
            FinskyLog.m21662b("[Cache and Sync] Clearing all queues. Sync state now: IDLE.", new Object[0]);
            ag a = ag.m13461a(context);
            a.getWritableDatabase().delete("fetch_suggestions_queues_table", null, null);
            a.getWritableDatabase().delete("synced_entries_table", null, null);
            C1189b.f7270f.m5763a(Integer.valueOf(1));
            C1189b.f7271g.m5763a(Integer.valueOf(1));
        } catch (Exception e) {
            FinskyLog.m21667d("[Cache and Sync] clearing cache and sync failed", new Object[0]);
        }
    }

    public final synchronized C0659a m13478a() {
        if (this.f13572i == null) {
            File file = new File(this.f13565b.getCacheDir(), "cache_and_sync_images");
            file.mkdirs();
            this.f13572i = new C4778c(file, (int) an.f24044g.mo4319a((long) ((Integer) C0955b.f5890g.m28964b()).intValue()), null, false);
            this.f13572i.mo1065a();
        }
        return this.f13572i;
    }

    public static boolean m13477b() {
        return ((Integer) C1189b.f7278n.m5760a()).intValue() > ((Integer) C0955b.hg.m28964b()).intValue();
    }

    public final List m13485c() {
        List arrayList = new ArrayList();
        for (Account account : this.f13564a.mo1188d()) {
            if (m13483a(account.name)) {
                arrayList.add(account.name);
            }
        }
        return arrayList;
    }

    public final boolean m13484a(String str, String str2) {
        C1254c a = this.f13568e.mo2016a(str2);
        if (a == null) {
            return false;
        }
        String a2 = this.f13569f.m7699a(Uri.withAppendedPath(this.f13569f.f7683b, str).toString(), str2, a.mo1646e(), a.mo1650f(), null);
        C0659a dl = this.f13567d.dl();
        if (dl instanceof C4778c) {
            return ((C4778c) dl).m22408c(a2);
        }
        return dl.mo1064a(a2) != null;
    }

    public static void m13476b(String str) {
        C1189b.f7284t.m5763a(Long.valueOf(C4678i.m21812a()));
        if (!TextUtils.isEmpty(str)) {
            C1189b.f7285u.m5763a((Object) str);
        }
    }

    private final int m13475b(List list) {
        int i = 0;
        for (ah ahVar : list) {
            int i2;
            if (m13484a(ahVar.f13536a.f12151c, ahVar.f13537b)) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
        }
        return i;
    }
}
