package com.google.android.finsky.setup.p242d.p244a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.billing.p120d.C1811c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.ao;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4120g;
import com.google.android.finsky.setup.p242d.C4155d;
import com.google.android.finsky.setup.p242d.C4161e;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.bu;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class C4156l implements C4155d {
    public final Context f21009a;
    public final C4161e f21010b;
    public final ao f21011c;
    public final C2320a f21012d;
    public final C1287h f21013e;
    public final C0986a f21014f;
    public final al f21015g;
    public final bw f21016h;
    public final C1805b f21017i;
    public int f21018j = 0;

    public C4156l(Context context, C4161e c4161e, ao aoVar, C2320a c2320a, C1287h c1287h, C0986a c0986a, al alVar, bw bwVar, C1805b c1805b) {
        this.f21009a = context;
        this.f21010b = c4161e;
        this.f21011c = aoVar;
        this.f21012d = c2320a;
        this.f21013e = c1287h;
        this.f21014f = c0986a;
        this.f21015g = alVar;
        this.f21016h = bwVar;
        this.f21017i = c1805b;
    }

    public final boolean mo3974a() {
        return this.f21018j != 0;
    }

    public final void mo3973a(List list) {
        this.f21018j++;
        bb.m21792a(new C4158n(this, list), new Void[0]);
    }

    static List m19438a(bx bxVar, String str, Map map) {
        List arrayList = new ArrayList(bxVar.a.length);
        for (bu buVar : bxVar.a) {
            if (buVar != null) {
                Document document = new Document(buVar.b);
                C2918a c4120g = new C4120g(str, C4156l.m19437a(document, (List) map.get(document.f14885a.f12097d)), C4156l.m19440c((List) map.get(document.f14885a.f12097d)));
                FinskyLog.m21659a("Requesting restore of dependency %s:%d", document.cf(), Integer.valueOf(document.m14653h()));
                arrayList.add((Bundle) c4120g.mo3197a(buVar));
            }
        }
        return arrayList;
    }

    private static int m19437a(Document document, List list) {
        int i = 3;
        for (PackageSetupStatus packageSetupStatus : list) {
            int i2;
            if (packageSetupStatus == null || packageSetupStatus.f20546a.f20893g >= i) {
                i2 = i;
            } else {
                i2 = packageSetupStatus.f20546a.f20893g;
            }
            i = i2;
        }
        if (i != 1) {
            return i;
        }
        if (!"com.google.android.gms".equals(document.f14885a.f12097d)) {
            return i;
        }
        FinskyLog.m21665c("High priority package that depends on GMS Core requested, GMS Core update notification will be shown.", new Object[0]);
        return 2;
    }

    private static int m19440c(List list) {
        for (PackageSetupStatus packageSetupStatus : list) {
            if (packageSetupStatus.f20546a.f20898l == 1) {
                return 1;
            }
        }
        return 0;
    }

    static Map m19439b(List list) {
        Map hashMap = new HashMap();
        for (PackageSetupStatus packageSetupStatus : list) {
            if (!(packageSetupStatus == null || packageSetupStatus.f20546a.f20899m == null)) {
                for (ch chVar : packageSetupStatus.f20546a.f20899m.f12312d) {
                    String str = chVar.f12035c;
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, new ArrayList());
                    }
                    ((List) hashMap.get(str)).add(packageSetupStatus);
                }
            }
        }
        return hashMap;
    }

    final bx m19441a(String str, List list) {
        Throwable e;
        C1254c a = this.f21013e.mo2016a(str);
        if (a == null) {
            FinskyLog.m21659a("Not restoring dependencies because could not get DFE API for account %s", FinskyLog.m21655a(str));
            return null;
        }
        C0660x agVar = new ag();
        a.mo1605a(C1283d.m7689a(list), false, agVar, (C0657w) agVar);
        try {
            FinskyLog.m21659a("getBulkDetails returned with %d dependency documents", Integer.valueOf(((bx) this.f21016h.m19365b(a, agVar, "Unable to fetch documents to restore dependencies")).a.length));
            return (bx) this.f21016h.m19365b(a, agVar, "Unable to fetch documents to restore dependencies");
        } catch (VolleyError e2) {
            e = e2;
            FinskyLog.m21660a(e, "Could not get bulk details for dependencies.", new Object[0]);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Could not get bulk details for dependencies.", new Object[0]);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            FinskyLog.m21660a(e, "Could not get bulk details for dependencies.", new Object[0]);
            return null;
        }
    }

    final void m19442a(bx bxVar, String str) {
        Account b = this.f21014f.mo1183b(str);
        if (b == null) {
            FinskyLog.m21669e("Could not find account %s to acquire dependencies", FinskyLog.m21655a(str));
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C1807a a = this.f21017i.mo2455a();
        for (bu buVar : bxVar.a) {
            if (!(buVar == null || buVar.b == null)) {
                if (C4672c.m21804a(C4680k.m21818a((String) C0955b.bp.m28964b()), buVar.b.f12097d)) {
                    FinskyLog.m21659a("Auto-acquiring dependency %s", buVar.b.f12097d);
                    a.mo2456a(new C1811c(b, new Document(buVar.b)));
                } else {
                    FinskyLog.m21659a("Not auto-acquiring dependency %s because not whitelisted", buVar.b.f12097d);
                }
            }
        }
        a.mo2457a(new C4157m(countDownLatch));
        try {
            countDownLatch.await(((Long) C0955b.bo.m28964b()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            FinskyLog.m21667d("Timed out waiting to acquire dependencies", new Object[0]);
        }
    }
}
