package com.google.android.finsky.instantapps.appmanagement;

import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.e.a.a.a.a.a.a;
import com.google.e.a.a.a.a.a.b;
import com.google.e.a.a.a.a.a.c;
import com.google.e.a.a.a.a.a.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class C3380a implements C3379a {
    public final InstantAppsClient f17348a;
    public final C5785k f17349b;
    public final PackageManager f17350c;
    public final C3600b f17351d;
    public final C3389h f17352e;
    public final C3392k f17353f;
    public final C3400t f17354g;
    public final C5710a f17355h;

    public C3380a(InstantAppsClient instantAppsClient, C5785k c5785k, PackageManager packageManager, C3600b c3600b, C3389h c3389h, C3392k c3392k, C3400t c3400t, C5710a c5710a) {
        this.f17348a = instantAppsClient;
        this.f17349b = c5785k;
        this.f17350c = packageManager;
        this.f17351d = c3600b;
        this.f17352e = c3389h;
        this.f17353f = c3392k;
        this.f17354g = c3400t;
        this.f17355h = c5710a;
    }

    private final Boolean m16877a() {
        Throwable th;
        C5710a c5710a;
        ad adVar;
        this.f17355h.mo5136a(2113);
        List b = m16879b();
        if (b.isEmpty()) {
            this.f17355h.mo5136a(2120);
            return Boolean.valueOf(false);
        }
        l lVar = null;
        this.f17355h.mo5136a(2114);
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicReference atomicReference = new AtomicReference();
        this.f17349b.m27186a(new C3382b(this, atomicReference, conditionVariable));
        if (!conditionVariable.block(TimeUnit.SECONDS.toMillis(10))) {
            Log.e("InstantAppManager", "Timeout on GMSCore call to get optin account information.");
        }
        OptInInfo optInInfo = (OptInInfo) atomicReference.get();
        if (optInInfo == null || TextUtils.isEmpty(optInInfo.f26426b)) {
            this.f17355h.mo5136a(2116);
        } else {
            this.f17355h.mo5136a(2115);
        }
        if (optInInfo == null || TextUtils.isEmpty(optInInfo.f26426b)) {
            Log.i("InstantAppManager", "Could not obtain account information.");
        } else {
            try {
                lVar = this.f17348a.mo3549a(optInInfo.f26426b, b);
            } catch (Throwable e) {
                Log.e("InstantAppManager", "Failed to hit backend for SyncAppStates.", e);
            }
        }
        boolean z = true;
        for (C3379a c3379a : m16878a(r1, optInInfo)) {
            boolean z2;
            try {
                if (((Boolean) c3379a.call()).booleanValue()) {
                    z2 = z;
                } else {
                    try {
                        String valueOf = String.valueOf(c3379a.getClass());
                        Log.w("InstantAppManager", new StringBuilder(String.valueOf(valueOf).length() + 45).append("HygieneAction failed to finish successfully: ").append(valueOf).toString());
                        z2 = false;
                    } catch (Throwable e2) {
                        th = e2;
                        z2 = false;
                        Log.e("InstantAppManager", "Couldn't complete action.", th);
                        c5710a = this.f17355h;
                        adVar = new ad(2122);
                        adVar.f28909b = new CrashInfo(th);
                        c5710a.mo5139a(adVar.m26987a());
                        z = z2;
                    }
                }
                z = z2;
            } catch (Throwable e22) {
                th = e22;
                z2 = z;
                Log.e("InstantAppManager", "Couldn't complete action.", th);
                c5710a = this.f17355h;
                adVar = new ad(2122);
                adVar.f28909b = new CrashInfo(th);
                c5710a.mo5139a(adVar.m26987a());
                z = z2;
            }
        }
        if (z) {
            this.f17355h.mo5136a(2121);
        } else {
            this.f17355h.mo5136a(2123);
        }
        return Boolean.valueOf(z);
    }

    private final List m16879b() {
        this.f17355h.mo5136a(2118);
        List<InstantAppInfo> a = this.f17351d.m17194a();
        if (a == null || a.isEmpty()) {
            Log.v("InstantAppManager", "No instant apps found on device.");
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(a.size());
        for (InstantAppInfo instantAppInfo : a) {
            a aVar = new a();
            aVar.b = instantAppInfo.m17188a();
            try {
                aVar.c = this.f17350c.getPackageInfo(aVar.b, 0).versionCode;
                if ("com.android.vending".equalsIgnoreCase(this.f17350c.getInstallerPackageName(aVar.b))) {
                    arrayList.add(aVar);
                }
            } catch (NameNotFoundException e) {
                String str = "InstantAppManager";
                String str2 = "Package was not found for ";
                String valueOf = String.valueOf(aVar.b);
                Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        this.f17355h.mo5136a(2119);
        return arrayList;
    }

    private final List m16878a(l lVar, OptInInfo optInInfo) {
        ArrayList arrayList;
        List arrayList2 = new ArrayList();
        if (lVar != null && lVar.a.length > 0) {
            arrayList = new ArrayList(lVar.a.length);
            for (b bVar : lVar.a) {
                arrayList.add(bVar.b);
            }
            C3389h c3389h = this.f17352e;
            arrayList2.add(new C3388g((C3396o) C3389h.m16889a((C3396o) c3389h.f17372a.mo1a(), 1), (C5710a) C3389h.m16889a((C5710a) c3389h.f17373b.mo1a(), 2), (List) C3389h.m16889a(arrayList, 3)));
        }
        if (lVar != null && lVar.b.length > 0) {
            arrayList = new ArrayList(lVar.b.length);
            for (c cVar : lVar.b) {
                arrayList.add(cVar.b);
            }
            C3400t c3400t = this.f17354g;
            arrayList2.add(new C3399s((C3600b) C3400t.m16899a((C3600b) c3400t.f17411a.mo1a(), 1), (C5710a) C3400t.m16899a((C5710a) c3400t.f17412b.mo1a(), 2), (List) C3400t.m16899a(arrayList, 3)));
        }
        boolean z = (optInInfo == null || optInInfo.f26425a == 1) ? false : true;
        C3392k c3392k = this.f17353f;
        arrayList2.add(new C3391j(z, (Context) C3392k.m16892a((Context) c3392k.f17383a.mo1a(), 2), (PackageManager) C3392k.m16892a((PackageManager) c3392k.f17384b.mo1a(), 3), (C3600b) C3392k.m16892a((C3600b) c3392k.f17385c.mo1a(), 4), (C3385r) C3392k.m16892a((C3385r) c3392k.f17386d.mo1a(), 5), (C3396o) C3392k.m16892a((C3396o) c3392k.f17387e.mo1a(), 6), (C5710a) C3392k.m16892a((C5710a) c3392k.f17388f.mo1a(), 7)));
        return arrayList2;
    }

    public final /* synthetic */ Object call() {
        return m16877a();
    }
}
