package com.google.android.finsky.instantapps.statussync;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.p217e.C5748j;
import com.google.android.instantapps.common.p217e.bd;
import com.google.android.instantapps.common.p217e.bs;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.p306h.p307a.p308a.C5675l;
import com.google.android.p306h.p307a.p308a.C5678o;

public final class C3547a {
    public final Context f17809a;
    public final bd f17810b;

    public C3547a(Context context, bd bdVar) {
        this.f17809a = context;
        this.f17810b = bdVar;
    }

    final boolean m17125a() {
        try {
            int i;
            this.f17809a.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 0);
            bd bdVar = this.f17810b;
            if (!((Boolean) bdVar.f29088f.mo5134a()).booleanValue() || VERSION.SDK_INT < 23) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                bd.f29083a.m27210c("LMP Supervisor running on M+ builds", new Object[0]);
            } else {
                if (bd.m27108a()) {
                    bd.f29083a.m27210c("Ignoring Kill Switch", new Object[0]);
                    i = 0;
                } else {
                    C5748j c5748j = bdVar.f29090h;
                    if (c5748j.f29152c.isEmpty()) {
                        i = 1;
                    } else {
                        ConnectivityManager connectivityManager = (ConnectivityManager) c5748j.f29151b.getSystemService("connectivity");
                        if (connectivityManager == null) {
                            C5748j.f29150a.m27210c("ConnectivityManager N/A", new Object[0]);
                            i = 1;
                        } else {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null) {
                                C5748j.f29150a.m27207a("NetworkInfo : %s %s", Integer.valueOf(activeNetworkInfo.getType()), Integer.valueOf(activeNetworkInfo.getSubtype()));
                                if (!(activeNetworkInfo.getType() == 0 && c5748j.f29152c.contains(Integer.valueOf(activeNetworkInfo.getSubtype())))) {
                                    i = 1;
                                }
                            }
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        bdVar.f29087e.mo5136a(1334);
                        bd.f29083a.m27210c("AIA disabled on current network", new Object[0]);
                    } else {
                        bs bsVar = bdVar.f29089g;
                        int intValue = ((Integer) bsVar.f29128e.mo5134a()).intValue();
                        if (intValue < 0) {
                            i = 1;
                        } else if (((Integer) bsVar.f29127d.mo5158a()).intValue() <= intValue) {
                            i = 1;
                        } else {
                            C5678o c5678o = new C5678o();
                            C5675l c5675l = new C5675l();
                            c5675l.f28768b = "com.google.android.webview";
                            c5675l.f28769c = Integer.valueOf(intValue);
                            c5678o.f28794k = new C5675l[]{c5675l};
                            C5710a c5710a = bsVar.f29126c;
                            ad adVar = new ad(1338);
                            adVar.f28913f = c5678o;
                            c5710a.mo5139a(adVar.m26987a());
                            i = 0;
                        }
                        if (i == 0) {
                            bd.f29083a.m27210c("AIA disabled on webview version.", new Object[0]);
                        } else {
                            if (((Boolean) bdVar.f29085c.mo5158a()).booleanValue() && bdVar.m27109b()) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            if (i == 0) {
                                i = 0;
                            }
                        }
                    }
                }
                if (i != 0) {
                    return true;
                }
                return false;
            }
            i = 1;
            if (i != 0) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            FinskyLog.m21659a("Supervisor not found.", new Object[0]);
            return false;
        }
    }
}
