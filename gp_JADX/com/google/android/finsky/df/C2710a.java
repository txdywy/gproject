package com.google.android.finsky.df;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageStats;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bd;
import com.google.wireless.android.a.a.a.a.cc;
import com.google.wireless.android.a.a.a.a.co;
import com.google.wireless.android.a.a.a.a.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C2710a extends C0971t {
    public C0986a f14873a;
    public C3646a f14874c;
    public C3960a f14875d;
    public Context f14876g;
    public C2824a f14877i;
    public C1461c f14878j;
    public C2206c f14879k;
    public C2830g f14880l;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1378b) C3947d.m18649a(C1378b.class)).mo1816a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        int i = 1;
        if (c1254c == null) {
            FinskyLog.m21669e("Running SessionAndStorageStatsLoggerHygieneJob without a DfeApi.", new Object[0]);
            return;
        }
        int i2;
        co a;
        String c = c1254c.mo1636c();
        cc ccVar = new cc();
        C2474c a2 = new C2474c(1).m13225a(ccVar);
        ccVar.a(this.f14875d.m18668a());
        ccVar.b(this.f14875d.m18669b());
        Account[] d = this.f14873a.mo1188d();
        if (d != null) {
            ccVar.c(d.length);
        }
        NetworkInfo a3 = C2278e.m11746a(this.f14876g);
        if (a3 != null) {
            ccVar.a(a3.getType());
            ccVar.b(a3.getSubtype());
        }
        if (!TextUtils.isEmpty(c)) {
            ccVar.e(C1821j.m9832b(c));
        }
        ccVar.d(((Integer) C0954a.f5833c.m5760a()).intValue());
        if (C4671b.m21784a()) {
            i2 = Global.getInt(this.f14876g.getContentResolver(), "install_non_market_apps", -1);
        } else {
            i2 = Secure.getInt(this.f14876g.getContentResolver(), "install_non_market_apps", -1);
        }
        if (i2 == -1) {
            FinskyLog.m21667d("Couldn't obtain INSTALL_NON_MARKET_APPS value", new Object[0]);
        } else {
            ccVar.c(i2 != 0);
        }
        ccVar.n = C2063t.m10825d(c);
        i2 = this.f14876g.getResources().getIdentifier("config_downloadDataDirSize", "integer", "android");
        if (i2 != 0) {
            ccVar.f(Resources.getSystem().getInteger(i2));
        }
        try {
            ccVar.a(Secure.getLong(this.f14876g.getContentResolver(), "download_manager_max_bytes_over_mobile"));
        } catch (SettingNotFoundException e) {
        }
        try {
            a = C2830g.m14965a(true);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "Failed to compute storage data", new Object[0]);
            a = new co();
            i = 0;
        }
        a2.m13228a(a);
        bd.m21796a();
        if (!bd.m21797a(this.f14876g, c)) {
            FinskyLog.m21659a("Device Information privacy flag is unchecked", new Object[0]);
            a.d();
            i = 0;
        }
        if (i != 0 && this.f14878j.dj().mo2294a(12631593)) {
            try {
                w wVar = new w();
                a.a(C2710a.m14603a(this.f14880l.m14973a(1)));
                a.c(C2710a.m14603a(this.f14880l.m14973a(2)));
                a.b(C2710a.m14603a(this.f14880l.m14973a(3)));
                a.j = wVar;
                Map a4 = this.f14874c.m17246a(this.f14879k, false);
                Collection hashSet = new HashSet();
                for (Set addAll : a4.values()) {
                    hashSet.addAll(addAll);
                }
                if (hashSet.isEmpty()) {
                    FinskyLog.m21665c("No package stats to fetch", new Object[0]);
                } else {
                    List arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    PackageStats a5 = this.f14877i.m14948a(c2495w, arrayList);
                    if (a5 == null) {
                        FinskyLog.m21665c("Failed to fetch package stats", new Object[0]);
                    } else {
                        wVar.b(C2710a.m14603a(a5.codeSize));
                        wVar.d(C2710a.m14603a(a5.cacheSize));
                        wVar.c(C2710a.m14603a(a5.dataSize));
                        wVar.a(C2710a.m14603a(((((((a5.codeSize + a5.dataSize) + a5.codeSize) + a5.externalObbSize) + a5.externalMediaSize) + a5.externalDataSize) + a5.externalCodeSize) + a5.externalCacheSize));
                    }
                }
            } catch (Throwable e22) {
                FinskyLog.m21660a(e22, "Failed to populate AppSizeData", new Object[0]);
            }
        }
        c2495w.m13367a(a2);
    }

    private static long m14603a(long j) {
        return j == -1 ? -1 : C2830g.m14968b(j);
    }
}
