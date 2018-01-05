package com.google.android.finsky.appdiscoveryservice.p128b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.android.vending.p055a.C0625a;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.appdiscoveryservice.C1327i;
import com.google.android.finsky.appdiscoveryservice.C1335q;
import com.google.android.finsky.appdiscoveryservice.C1337s;
import com.google.android.finsky.appdiscoveryservice.C1338t;
import com.google.android.finsky.appdiscoveryservice.p127a.C1303a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.u;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.utils.p354b.C6321a;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.finsky.dfe.a.a.b;
import com.google.wireless.android.finsky.dfe.a.a.c;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C1310a extends C1309k implements C0657w, C0660x, C1228w {
    public static final C6321a f7778a = C6321a.m28959a("finsky.launcher_search_suggest_timeout_ms", Long.valueOf(5000));
    public final C1287h f7779b;
    public final C1294w f7780c;
    public final C1314e f7781d;
    public final C1327i f7782e;
    public final ConditionVariable f7783f;
    public C0656n f7784g;
    public final C3600b f7785h;
    public ConditionVariable f7786i;
    public boolean f7787j;
    public long f7788k;
    public long f7789l;
    public long f7790m;
    public int f7791n;
    public byte[] f7792o;
    public boolean f7793p = m7775g();
    public Set f7794q;

    public C1310a(Context context, C1316h c1316h, int i, int i2, int i3, String str, String str2, int i4, C0625a c0625a, C3600b c3600b, C1337s c1337s, C1335q c1335q, C1338t c1338t, C1287h c1287h, C1294w c1294w, C1314e c1314e, C1303a c1303a, boolean z, ConditionVariable conditionVariable) {
        super(context, c1316h, i, i2, i3, str, str2, i4, c0625a, c3600b, c1337s, c1335q, c1314e, c1303a);
        this.f7779b = c1287h;
        this.f7780c = c1294w;
        this.f7781d = c1314e;
        this.f7782e = c1338t;
        this.f7787j = z;
        this.f7783f = conditionVariable;
        this.f7785h = c3600b;
    }

    protected final void mo1682a(Context context, String str) {
        this.f7788k = C4678i.m21813b();
        this.f7791n = 0;
        int i = this.f7768x;
        if (!TextUtils.isEmpty(str) && i != 0) {
            this.f7781d.m7791a(this.f7766v, this.f7767w, this.f7772E, this.f7773F, str, false, this.f7768x, this.f7793p);
            String str2 = "findApps: ";
            String valueOf = String.valueOf(str);
            FinskyLog.m21662b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            if (this.f7787j) {
                m7780a(context, str, i);
            }
            if (this.f7791n == i) {
                m7774f();
                return;
            }
            this.f7789l = C4678i.m21813b();
            FinskyLog.m21662b("Issuing search suggestions request.", new Object[0]);
            this.f7792o = null;
            this.f7783f.block(((Long) C0955b.iG.m28964b()).longValue());
            if (m7772d()) {
                FinskyLog.m21662b("Not performing server request - task was cancelled during wait period.", new Object[0]);
                return;
            }
            this.f7786i = new ConditionVariable();
            this.f7784g = this.f7779b.mo2015a().mo1580a(str, i, this.f7772E, this.f7773F, (C0660x) this, (C0657w) this, (C1228w) this);
            FinskyLog.m21662b("Search suggestions request issued.", new Object[0]);
            if (!this.f7786i.block(((Long) f7778a.m28964b()).longValue())) {
                FinskyLog.m21665c("Server app discovery request timed-out.", new Object[0]);
                m7773e();
            }
            FinskyLog.m21662b("Search suggestions request complete.", new Object[0]);
        } else if (this.f7787j) {
            super.mo1682a(context, str);
        } else {
            m7774f();
        }
    }

    private final void m7780a(Context context, String str, int i) {
        long b = C4678i.m21813b();
        FinskyLog.m21662b("Profile logging ms: " + (b - this.f7788k), new Object[0]);
        this.f7794q = new HashSet();
        List<Bundle> b2 = m7778b(context, str);
        for (Bundle bundle : b2) {
            String string = bundle.getString("AppDiscoveryService.packageName");
            if (string != null) {
                this.f7794q.add(string);
            }
            m7769a(bundle);
            this.f7791n++;
            if (this.f7791n == i) {
                break;
            }
        }
        FinskyLog.m21662b("No. of on-device instant apps found: " + b2.size(), new Object[0]);
        this.f7781d.m7792a(str, C4678i.m21813b() - this.f7788k, this.f7791n);
        FinskyLog.m21662b("Profile on-device fetch ms: " + (C4678i.m21813b() - b), new Object[0]);
    }

    protected final void mo1683b() {
        if (this.f7784g != null) {
            this.f7784g.mo1057f();
            this.f7784g = null;
        }
    }

    final void m7786a(List list, x[] xVarArr) {
        if (!this.f7760B) {
            int i = 0;
            for (c cVar : list) {
                if (!this.f7793p) {
                    cVar.g = null;
                }
                Bundle a = this.f7782e.mo1689a(this.f7762r, null, cVar, this.f7772E, this.f7773F, this.f7766v, this.f7767w, cVar.j, this.f7781d.f7801a);
                if (m7782a(a.getString("AppDiscoveryService.packageName", null))) {
                    i++;
                } else {
                    if (C1310a.m7781a(cVar)) {
                        a.putParcelable("AppDiscoveryService.launcherIcon", xVarArr[i].b());
                    }
                    m7769a(a);
                    i++;
                }
            }
            long b = C4678i.m21813b();
            long j = b - this.f7790m;
            b -= this.f7788k;
            FinskyLog.m21662b("Profile image fetch ms: " + j, new Object[0]);
            FinskyLog.m21662b("Profile total ms: " + b, new Object[0]);
            C1314e c1314e = this.f7781d;
            String str = this.f7765u;
            int size = list.size();
            c1314e.f7801a.m13371a(new C2474c(2302).m13227a(new cn().a(2).a(str).a(b).b(size).a(this.f7792o)).f13342a, null);
            m7774f();
            m7783h();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21662b("onErrorResponse", new Object[0]);
        m7773e();
        m7783h();
    }

    public final void ah_() {
        FinskyLog.m21662b("onRequestCanceled", new Object[0]);
        m7783h();
    }

    private static boolean m7781a(c cVar) {
        return (cVar == null || cVar.e == null || cVar.e.f11860f == null) ? false : true;
    }

    private final boolean m7782a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f7785h.f17918e.getPackageUid(str, 0) != -1) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    private final void m7783h() {
        this.f7784g = null;
        if (this.f7786i != null) {
            this.f7786i.open();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        b bVar = (b) obj;
        String valueOf = String.valueOf(bVar);
        FinskyLog.m21662b(new StringBuilder(String.valueOf(valueOf).length() + 12).append("onResponse: ").append(valueOf).toString(), new Object[0]);
        long b = C4678i.m21813b();
        FinskyLog.m21662b("Profile server fetch ms: " + (b - this.f7789l), new Object[0]);
        if (bVar.b == null) {
            FinskyLog.m21667d("Response object unexpectedly null.", new Object[0]);
            m7773e();
            m7783h();
        }
        this.f7792o = bVar.c;
        if (bVar.b.length == 0) {
            m7774f();
            m7783h();
        }
        int i = this.f7768x;
        List arrayList = new ArrayList();
        for (c cVar : bVar.b) {
            if (cVar != null) {
                if (((cVar.b & 1) != 0 ? 1 : 0) != 0 && (this.f7794q == null || !this.f7794q.contains(cVar.c))) {
                    arrayList.add(cVar);
                    this.f7791n++;
                    if (this.f7791n == i) {
                        break;
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            m7774f();
            m7783h();
        }
        this.f7790m = b;
        int dimensionPixelSize = this.f7762r.getResources().getDimensionPixelSize(C7582R.dimen.play_search_suggestion_icon_size);
        u a = this.f7780c.mo1670a();
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4;
            Object obj2 = arrayList2.get(i2);
            i2++;
            c cVar2 = (c) obj2;
            if (C1310a.m7781a(cVar2) && a.a(cVar2.e.f11860f, dimensionPixelSize, dimensionPixelSize) == null) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        x[] xVarArr = new x[arrayList.size()];
        y c1313c = new C1313c(i3, new C1312b(this, arrayList, xVarArr));
        arrayList2 = (ArrayList) arrayList;
        int size2 = arrayList2.size();
        i2 = 0;
        size = 0;
        while (i2 < size2) {
            i = i2 + 1;
            cVar2 = (c) arrayList2.get(i2);
            if (C1310a.m7781a(cVar2)) {
                String str = "Loading image: ";
                String valueOf2 = String.valueOf(cVar2.e.f11860f);
                FinskyLog.m21662b(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str), new Object[0]);
                xVarArr[size] = this.f7780c.mo1671a(cVar2.e.f11860f, dimensionPixelSize, dimensionPixelSize, c1313c);
            }
            i2 = i;
            size++;
        }
        if (i3 == 0) {
            m7786a(arrayList, xVarArr);
        }
    }
}
