package com.google.android.finsky.hygiene;

import android.content.Context;
import android.content.pm.PackageStats;
import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bd;
import com.google.wireless.android.a.a.a.a.co;
import com.google.wireless.android.a.a.a.a.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class C3210x extends AsyncTask {
    public final /* synthetic */ C2474c f16525a;
    public final /* synthetic */ Context f16526b;
    public final /* synthetic */ String f16527c;
    public final /* synthetic */ C2495w f16528d;

    C3210x(C2474c c2474c, Context context, String str, C2495w c2495w) {
        this.f16525a = c2474c;
        this.f16526b = context;
        this.f16527c = str;
        this.f16528d = c2495w;
    }

    private final Void m16258a() {
        co a;
        Throwable e;
        w wVar;
        long a2;
        Map a3;
        Collection hashSet;
        List arrayList;
        PackageStats a4;
        C2830g bD = C1473m.f7980a.bD();
        if (C1473m.f7980a.dj().mo2294a(12617418)) {
            try {
                a = C2830g.m14965a(true);
                try {
                    this.f16525a.m13228a(a);
                } catch (Exception e2) {
                    e = e2;
                    FinskyLog.m21660a(e, "Failed to get storage info for logging", new Object[0]);
                    if (C1473m.f7980a.dj().mo2294a(12631593)) {
                        if (a == null) {
                            a = new co();
                            this.f16525a.m13228a(a);
                        }
                        bd.m21796a();
                        if (bd.m21797a(this.f16526b, this.f16527c)) {
                            try {
                                wVar = new w();
                                a2 = bD.m14973a(1);
                                if (a2 == -1) {
                                    a2 = -1;
                                } else {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                }
                                a.a(a2);
                                a2 = bD.m14973a(2);
                                if (a2 == -1) {
                                    a2 = -1;
                                } else {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                }
                                a.c(a2);
                                a2 = bD.m14973a(3);
                                if (a2 == -1) {
                                    a2 = -1;
                                } else {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                }
                                a.b(a2);
                                a.j = wVar;
                                a3 = C1473m.f7980a.mo2029I().m17246a(C1473m.f7980a.ah(), false);
                                hashSet = new HashSet();
                                for (Set addAll : a3.values()) {
                                    hashSet.addAll(addAll);
                                }
                                if (hashSet.size() == 0) {
                                    FinskyLog.m21665c("No package stats to fetch", new Object[0]);
                                } else {
                                    arrayList = new ArrayList();
                                    arrayList.addAll(hashSet);
                                    a4 = C1473m.f7980a.bC().m14948a(this.f16528d, arrayList);
                                    if (a4 == null) {
                                        FinskyLog.m21665c("Failed to fetch package stats", new Object[0]);
                                    } else {
                                        a2 = a4.codeSize;
                                        if (a2 == -1) {
                                            a2 = -1;
                                        } else {
                                            C1473m.f7980a.bD();
                                            a2 = C2830g.m14968b(a2);
                                        }
                                        wVar.b(a2);
                                        a2 = a4.cacheSize;
                                        if (a2 == -1) {
                                            a2 = -1;
                                        } else {
                                            C1473m.f7980a.bD();
                                            a2 = C2830g.m14968b(a2);
                                        }
                                        wVar.d(a2);
                                        a2 = a4.dataSize;
                                        if (a2 == -1) {
                                            a2 = -1;
                                        } else {
                                            C1473m.f7980a.bD();
                                            a2 = C2830g.m14968b(a2);
                                        }
                                        wVar.c(a2);
                                        a2 = ((((((a4.codeSize + a4.dataSize) + a4.codeSize) + a4.externalObbSize) + a4.externalMediaSize) + a4.externalDataSize) + a4.externalCodeSize) + a4.externalCacheSize;
                                        if (a2 == -1) {
                                            a2 = -1;
                                        } else {
                                            C1473m.f7980a.bD();
                                            a2 = C2830g.m14968b(a2);
                                        }
                                        wVar.a(a2);
                                    }
                                }
                            } catch (Throwable e3) {
                                this.f16525a.m13238a(e3);
                                FinskyLog.m21660a(e3, "Failed to populate AppSizeData", new Object[0]);
                            }
                        } else {
                            FinskyLog.m21659a("device Information privacy flag is unchecked", new Object[0]);
                            a.d();
                        }
                    }
                    return null;
                }
            } catch (Throwable e32) {
                e = e32;
                a = null;
                FinskyLog.m21660a(e, "Failed to get storage info for logging", new Object[0]);
                if (C1473m.f7980a.dj().mo2294a(12631593)) {
                    if (a == null) {
                        a = new co();
                        this.f16525a.m13228a(a);
                    }
                    bd.m21796a();
                    if (bd.m21797a(this.f16526b, this.f16527c)) {
                        wVar = new w();
                        a2 = bD.m14973a(1);
                        if (a2 == -1) {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        } else {
                            a2 = -1;
                        }
                        a.a(a2);
                        a2 = bD.m14973a(2);
                        if (a2 == -1) {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        } else {
                            a2 = -1;
                        }
                        a.c(a2);
                        a2 = bD.m14973a(3);
                        if (a2 == -1) {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        } else {
                            a2 = -1;
                        }
                        a.b(a2);
                        a.j = wVar;
                        a3 = C1473m.f7980a.mo2029I().m17246a(C1473m.f7980a.ah(), false);
                        hashSet = new HashSet();
                        while (r3.hasNext()) {
                            hashSet.addAll(addAll);
                        }
                        if (hashSet.size() == 0) {
                            arrayList = new ArrayList();
                            arrayList.addAll(hashSet);
                            a4 = C1473m.f7980a.bC().m14948a(this.f16528d, arrayList);
                            if (a4 == null) {
                                a2 = a4.codeSize;
                                if (a2 == -1) {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                } else {
                                    a2 = -1;
                                }
                                wVar.b(a2);
                                a2 = a4.cacheSize;
                                if (a2 == -1) {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                } else {
                                    a2 = -1;
                                }
                                wVar.d(a2);
                                a2 = a4.dataSize;
                                if (a2 == -1) {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                } else {
                                    a2 = -1;
                                }
                                wVar.c(a2);
                                a2 = ((((((a4.codeSize + a4.dataSize) + a4.codeSize) + a4.externalObbSize) + a4.externalMediaSize) + a4.externalDataSize) + a4.externalCodeSize) + a4.externalCacheSize;
                                if (a2 == -1) {
                                    C1473m.f7980a.bD();
                                    a2 = C2830g.m14968b(a2);
                                } else {
                                    a2 = -1;
                                }
                                wVar.a(a2);
                            } else {
                                FinskyLog.m21665c("Failed to fetch package stats", new Object[0]);
                            }
                        } else {
                            FinskyLog.m21665c("No package stats to fetch", new Object[0]);
                        }
                    } else {
                        FinskyLog.m21659a("device Information privacy flag is unchecked", new Object[0]);
                        a.d();
                    }
                }
                return null;
            }
        }
        a = null;
        if (C1473m.f7980a.dj().mo2294a(12631593)) {
            if (a == null) {
                a = new co();
                this.f16525a.m13228a(a);
            }
            bd.m21796a();
            if (bd.m21797a(this.f16526b, this.f16527c)) {
                FinskyLog.m21659a("device Information privacy flag is unchecked", new Object[0]);
                a.d();
            } else {
                wVar = new w();
                a2 = bD.m14973a(1);
                if (a2 == -1) {
                    a2 = -1;
                } else {
                    C1473m.f7980a.bD();
                    a2 = C2830g.m14968b(a2);
                }
                a.a(a2);
                a2 = bD.m14973a(2);
                if (a2 == -1) {
                    a2 = -1;
                } else {
                    C1473m.f7980a.bD();
                    a2 = C2830g.m14968b(a2);
                }
                a.c(a2);
                a2 = bD.m14973a(3);
                if (a2 == -1) {
                    a2 = -1;
                } else {
                    C1473m.f7980a.bD();
                    a2 = C2830g.m14968b(a2);
                }
                a.b(a2);
                a.j = wVar;
                a3 = C1473m.f7980a.mo2029I().m17246a(C1473m.f7980a.ah(), false);
                hashSet = new HashSet();
                while (r3.hasNext()) {
                    hashSet.addAll(addAll);
                }
                if (hashSet.size() == 0) {
                    FinskyLog.m21665c("No package stats to fetch", new Object[0]);
                } else {
                    arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    a4 = C1473m.f7980a.bC().m14948a(this.f16528d, arrayList);
                    if (a4 == null) {
                        FinskyLog.m21665c("Failed to fetch package stats", new Object[0]);
                    } else {
                        a2 = a4.codeSize;
                        if (a2 == -1) {
                            a2 = -1;
                        } else {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        }
                        wVar.b(a2);
                        a2 = a4.cacheSize;
                        if (a2 == -1) {
                            a2 = -1;
                        } else {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        }
                        wVar.d(a2);
                        a2 = a4.dataSize;
                        if (a2 == -1) {
                            a2 = -1;
                        } else {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        }
                        wVar.c(a2);
                        a2 = ((((((a4.codeSize + a4.dataSize) + a4.codeSize) + a4.externalObbSize) + a4.externalMediaSize) + a4.externalDataSize) + a4.externalCodeSize) + a4.externalCacheSize;
                        if (a2 == -1) {
                            a2 = -1;
                        } else {
                            C1473m.f7980a.bD();
                            a2 = C2830g.m14968b(a2);
                        }
                        wVar.a(a2);
                    }
                }
            }
        }
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f16528d.m13367a(this.f16525a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m16258a();
    }
}
