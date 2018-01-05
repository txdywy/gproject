package com.google.android.finsky.instantapps.p212d;

import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.p037h.C0308c;
import com.google.android.finsky.instantapps.install.C3437s;
import com.google.android.finsky.instantapps.install.C3500d;
import com.google.android.finsky.instantapps.install.C3501e;
import com.google.android.finsky.instantapps.install.C3503c;
import com.google.android.finsky.instantappsbackendclient.C3565a;
import com.google.android.finsky.instantappsbackendclient.C3568d;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.instantapps.p309a.C5699f;
import com.google.android.p306h.p307a.p308a.C5678o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ah implements Callable {
    public final Context f17513a;
    public final InstantAppsClient f17514b;
    public final ExecutorService f17515c;
    public final C3500d f17516d;
    public final String f17517e;
    public final String f17518f;
    public final boolean f17519g;
    public final int f17520h;
    public final List f17521i;
    public final C3437s f17522j;
    public final af f17523k;
    public AtomicBoolean f17524l = new AtomicBoolean(false);
    public Future f17525m;

    ah(Context context, InstantAppsClient instantAppsClient, ExecutorService executorService, C3500d c3500d, String str, String str2, boolean z, int i, List list, C3437s c3437s, af afVar) {
        this.f17513a = context;
        this.f17514b = instantAppsClient;
        this.f17515c = executorService;
        this.f17516d = c3500d;
        this.f17517e = str;
        this.f17518f = str2;
        this.f17519g = z;
        this.f17520h = i;
        this.f17521i = list;
        this.f17522j = c3437s;
        this.f17523k = afVar;
    }

    final synchronized void m16963a() {
        if (this.f17525m != null) {
            throw new IllegalStateException("Launch task has already been started");
        }
        this.f17525m = this.f17515c.submit(this);
    }

    final synchronized aj m16964b() {
        aj ajVar;
        if (this.f17525m == null) {
            throw new IllegalStateException("Launch task has not been started");
        }
        try {
            ajVar = (aj) this.f17525m.get();
        } catch (InterruptedException e) {
            ajVar = new aj(3, null, null);
            return ajVar;
        } catch (ExecutionException e2) {
            ajVar = new aj(3, null, null);
            return ajVar;
        }
        return ajVar;
    }

    private final aj m16962c() {
        if (this.f17524l.get()) {
            return new aj(4, null, null);
        }
        try {
            this.f17523k.mo5136a(1612);
            Object a = this.f17514b.mo3548a(this.f17517e, this.f17518f, (String) this.f17521i.get(0), this.f17520h);
            this.f17523k.mo5136a(1613);
            if (this.f17524l.get()) {
                return new aj(4, null, null);
            }
            List a2 = m16960a(a, ah.m16959a(this.f17513a, a.f17840d), (String[]) this.f17521i.toArray(new String[0]));
            if (a2 == null) {
                return new aj(3, null, null);
            }
            if (a2.isEmpty()) {
                this.f17523k.mo5136a(1622);
                FinskyLog.m21659a("No install necessary.", new Object[0]);
                return new aj(1, (C3565a) C5699f.m26959a(a), null);
            }
            return new aj(0, (C3565a) C5699f.m26959a(a), (C3501e) C5699f.m26959a(this.f17516d.mo3537a(a.f17840d, a2, this.f17523k, this.f17522j)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Failed to hit backend for GetAppSplits. Reason=";
            String valueOf = String.valueOf(th.getMessage());
            if (valueOf.length() != 0) {
                valueOf = str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            FinskyLog.m21667d(valueOf, th);
            af afVar = this.f17523k;
            ad adVar = new ad(1636);
            adVar.f28909b = new CrashInfo(th);
            afVar.mo5139a(adVar.m26987a());
            throw th;
        }
    }

    private static ai m16959a(Context context, String str) {
        ai aiVar = new ai();
        aiVar.f17529d = -1;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            aiVar.f17526a = true;
            aiVar.f17530e = context.getPackageManager().getInstallerPackageName(str);
            aiVar.f17527b = C3600b.m17189a(applicationInfo);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8388608);
                aiVar.f17528c = packageInfo.splitNames == null ? new String[0] : packageInfo.splitNames;
                aiVar.f17529d = packageInfo.versionCode;
            } catch (NameNotFoundException e) {
                FinskyLog.m21667d("Couldn't get package info, no split info available", e);
                aiVar.f17528c = new String[0];
            }
        } catch (NameNotFoundException e2) {
            aiVar.f17526a = false;
            aiVar.f17527b = false;
            aiVar.f17528c = new String[0];
        }
        return aiVar;
    }

    private final List m16960a(C3565a c3565a, ai aiVar, String[] strArr) {
        if (aiVar.f17526a) {
            if (!aiVar.f17527b) {
                FinskyLog.m21665c("Non-ephemeral version of installing ephemeral app already available! Skipping ephemeral install.", new Object[0]);
                return null;
            } else if (!this.f17513a.getPackageName().equals(aiVar.f17530e)) {
                FinskyLog.m21665c("Ephemeral app installed by other installer. Skipping ephemeral install.", new Object[0]);
                return null;
            }
        }
        List arrayList = new ArrayList(ah.m16961a(c3565a.f17839c, strArr));
        int i = c3565a.f17841e;
        C5678o c5678o = new C5678o();
        if (!aiVar.f17526a) {
            c5678o.f28791h = Integer.valueOf(1);
        } else if (aiVar.f17529d == i) {
            arrayList.removeAll(Arrays.asList(aiVar.f17528c));
            arrayList.remove("");
            if (!arrayList.isEmpty()) {
                if (this.f17519g) {
                    c5678o.f28791h = Integer.valueOf(3);
                } else {
                    c5678o.f28791h = Integer.valueOf(2);
                }
            }
        } else if (aiVar.f17529d <= i) {
            FinskyLog.m21667d("Newer version code to install than on device. Downloading all needed splits.", new Object[0]);
            c5678o.f28791h = Integer.valueOf(4);
        } else if (this.f17513a.getPackageName().equals(aiVar.f17530e)) {
            FinskyLog.m21667d("Play installed ephemeral app is newer than installing version. Abort!", new Object[0]);
            return null;
        }
        if (!arrayList.isEmpty() || aiVar.f17526a) {
            i = !arrayList.isEmpty() ? 1 : 0;
            List arrayList2 = new ArrayList(arrayList.size());
            ArrayList arrayList3 = (ArrayList) arrayList;
            int size = arrayList3.size();
            int i2 = i;
            i = 0;
            while (i < size) {
                int i3 = i + 1;
                String str = (String) arrayList3.get(i);
                C3568d c3568d = (C3568d) c3565a.f17839c.get(str);
                int i4 = i2 & c3568d.f17846e;
                arrayList2.add(new C3503c(str, c3568d.a, c3568d.b, c3568d.c, c3568d.f17846e));
                i = i3;
                i2 = i4;
            }
            if (i2 != 0) {
                c5678o.f28791h = Integer.valueOf(5);
            }
            af afVar = this.f17523k;
            ad adVar = new ad(1642);
            adVar.f28913f = c5678o;
            afVar.mo5139a(adVar.m26987a());
            return arrayList2;
        }
        FinskyLog.m21667d("No splits needed, but app not installed, aborting launch.", new Object[0]);
        return null;
    }

    private static Set m16961a(Map map, String... strArr) {
        Set c0308c = new C0308c();
        for (Object obj : strArr) {
            if (c0308c.add(obj)) {
                C3568d c3568d = (C3568d) map.get(obj);
                if (c3568d == null) {
                    return Collections.emptySet();
                }
                String[] strArr2 = (String[]) c3568d.f17845d.toArray(new String[0]);
                if (strArr2.length > 0) {
                    c0308c.addAll(ah.m16961a(map, strArr2));
                }
            }
        }
        return c0308c;
    }

    public final /* synthetic */ Object call() {
        return m16962c();
    }
}
