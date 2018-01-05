package com.google.android.finsky.instantapps.p212d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.AuthorityEntry;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.instantapps.install.C3437s;
import com.google.android.finsky.instantapps.install.C3500d;
import com.google.android.finsky.instantapps.install.C3501e;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.gms.common.api.C1643x;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.gms.C5788n;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.af;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class C3438n implements C3437s {
    public final C3449y f17587a;
    public final C5785k f17588b;
    public final C3434k f17589c;
    public final Handler f17590d;
    public final bf f17591e;
    public final ak f17592f;
    public final C3373z f17593g;
    public final String f17594h;
    public final String f17595i;
    public final int f17596j;
    public final List f17597k;
    public final af f17598l;
    public final boolean f17599m;
    public final AtomicBoolean f17600n = new AtomicBoolean(false);
    public final AtomicBoolean f17601o = new AtomicBoolean(false);
    public final AtomicReference f17602p = new AtomicReference();

    public C3438n(C3449y c3449y, C5785k c5785k, C3434k c3434k, Handler handler, bf bfVar, ak akVar, C3373z c3373z, String str, String str2, int i, List list, af afVar, boolean z) {
        this.f17587a = c3449y;
        this.f17588b = c5785k;
        this.f17589c = c3434k;
        this.f17590d = handler;
        this.f17591e = bfVar;
        this.f17592f = akVar;
        this.f17593g = c3373z;
        this.f17594h = str;
        this.f17595i = str2;
        this.f17596j = i;
        this.f17597k = list;
        this.f17598l = afVar;
        this.f17599m = z;
    }

    public final void m17000a(boolean z) {
        this.f17598l.mo5136a(1652);
        if (this.f17601o.getAndSet(true)) {
            throw new IllegalStateException("Launcher was already started");
        }
        if (((Boolean) this.f17591e.mo5158a()).booleanValue()) {
            if (!TextUtils.isEmpty(this.f17587a.m17005a())) {
                String a = this.f17587a.m17005a();
                new Object[1][0] = a;
                m16994a(m16992a(a), z);
                return;
            }
        }
        m16994a(null, z);
    }

    private final void m16994a(ah ahVar, boolean z) {
        String str;
        String str2;
        Intent intent;
        this.f17598l.mo5136a(604);
        C3434k c3434k = this.f17589c;
        String str3 = this.f17594h;
        String str4 = this.f17595i;
        if (str3 == null) {
            C3600b c3600b = c3434k.f17579a;
            List allIntentFilters;
            if (C0327a.m1722b()) {
                allIntentFilters = c3600b.f17918e.getAllIntentFilters(str4);
            } else {
                allIntentFilters = Collections.emptyList();
            }
            str = str3;
            for (IntentFilter intentFilter : r0) {
                boolean z2;
                if (intentFilter.hasAction("android.intent.action.VIEW") && intentFilter.hasCategory("android.intent.category.BROWSABLE")) {
                    if (intentFilter.countDataAuthorities() != 0) {
                        Iterator schemesIterator = intentFilter.schemesIterator();
                        if (schemesIterator != null) {
                            while (schemesIterator.hasNext()) {
                                str2 = (String) schemesIterator.next();
                                if (!"http".equalsIgnoreCase(str2)) {
                                    if ("https".equalsIgnoreCase(str2)) {
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Iterator authoritiesIterator = intentFilter.authoritiesIterator();
                    if (authoritiesIterator != null) {
                        while (authoritiesIterator.hasNext()) {
                            AuthorityEntry authorityEntry = (AuthorityEntry) authoritiesIterator.next();
                            if (authorityEntry != null && !TextUtils.isEmpty(authorityEntry.getHost())) {
                                str2 = authorityEntry.getHost();
                                break;
                            }
                        }
                        str2 = str;
                        if (str2 != null) {
                            break;
                        }
                        str = str2;
                    } else {
                        continue;
                    }
                }
            }
            str2 = str;
        } else {
            str2 = str3;
        }
        if (r0 == null) {
            intent = null;
        } else {
            str = "android.intent.action.VIEW";
            String str5 = "https://";
            str2 = String.valueOf(r0);
            intent = new Intent(str, Uri.parse(str2.length() != 0 ? str5.concat(str2) : new String(str5))).putExtra("com.google.android.gms.instantapps.packageNameOverride", str4);
        }
        if (intent == null) {
            m16997a(2504, false);
            C3438n.m16993a(ahVar);
            return;
        }
        C1643x c3439o = new C3439o(this, ahVar, z);
        C5785k c5785k = this.f17588b;
        c5785k.f29224b.m27167a(new C5788n(c5785k, intent, c3439o));
    }

    final void m16999a(ah ahVar, boolean z, String str) {
        this.f17590d.post(new C3443s(this, str));
        this.f17598l.mo5136a(607);
        this.f17590d.post(new C3444t(this, z));
        if (ahVar == null) {
            ahVar = m16992a(str);
        } else if (!TextUtils.equals(str, ahVar.f17517e)) {
            Object[] objArr = new Object[]{ahVar.f17517e, str};
            C3438n.m16993a(ahVar);
            ahVar = m16992a(str);
        }
        aj b = ahVar.m16964b();
        switch (b.f17531a) {
            case 0:
                this.f17598l.mo5136a(1653);
                this.f17590d.post(new C3446v(this, b));
                this.f17602p.set(b.f17533c);
                if (this.f17600n.get()) {
                    ((C3501e) this.f17602p.get()).mo3538a();
                    return;
                }
                return;
            case 1:
                this.f17590d.post(new C3445u(this, b));
                m16995d();
                return;
            case 2:
                m16997a(2506, true);
                return;
            case 3:
                m16997a(2506, false);
                return;
            default:
                return;
        }
    }

    static void m16993a(ah ahVar) {
        if (ahVar != null) {
            ahVar.f17524l.set(true);
        }
    }

    private final void m16995d() {
        this.f17601o.set(false);
        this.f17590d.post(new C3447w(this.f17593g));
    }

    final void m16997a(int i, boolean z) {
        this.f17601o.set(false);
        C3501e c3501e = (C3501e) this.f17602p.get();
        if (c3501e != null) {
            c3501e.mo3539b();
        }
        this.f17590d.post(new C3448x(this, i, z));
    }

    public final void m17002c() {
        if (!this.f17600n.getAndSet(true)) {
            C3501e c3501e = (C3501e) this.f17602p.get();
            if (c3501e != null) {
                c3501e.mo3538a();
            }
        }
    }

    public final void mo3527a() {
        m16995d();
    }

    public final void mo3529b() {
        m16997a(2506, true);
    }

    public final void mo3528a(long j, long j2) {
        this.f17593g.mo3488a(j, j2);
    }

    private final ah m16992a(String str) {
        ak akVar = this.f17592f;
        String str2 = this.f17595i;
        boolean z = this.f17599m;
        int i = this.f17596j;
        List list = this.f17597k;
        af afVar = this.f17598l;
        Context context = (Context) ak.m16965a((Context) akVar.f17534a.mo1a(), 1);
        InstantAppsClient instantAppsClient = (InstantAppsClient) ak.m16965a((InstantAppsClient) akVar.f17535b.mo1a(), 2);
        ExecutorService executorService = (ExecutorService) ak.m16965a((ExecutorService) akVar.f17536c.mo1a(), 3);
        C3500d c3500d = (C3500d) ak.m16965a((C3500d) akVar.f17537d.mo1a(), 4);
        ak.m16965a((C3600b) akVar.f17538e.mo1a(), 5);
        ah ahVar = new ah(context, instantAppsClient, executorService, c3500d, (String) ak.m16965a(str, 6), (String) ak.m16965a(str2, 7), z, i, (List) ak.m16965a(list, 10), (C3437s) ak.m16965a(this, 11), (af) ak.m16965a(afVar, 12));
        ahVar.m16963a();
        return ahVar;
    }
}
