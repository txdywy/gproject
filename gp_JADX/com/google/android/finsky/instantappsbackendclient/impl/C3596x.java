package com.google.android.finsky.instantappsbackendclient.impl;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings.Secure;
import android.support.v4.os.C0330d;
import android.support.v4.p037h.C0305a;
import com.google.android.finsky.instantappsbackendclient.C3565a;
import com.google.android.finsky.instantappsbackendclient.C3566b;
import com.google.android.finsky.instantappsbackendclient.C3568d;
import com.google.android.finsky.instantappsbackendclient.C3569e;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient.InstantAppsClientException;
import com.google.android.finsky.utils.FinskyLog;
import com.google.e.a.a.a.a.a.a;
import com.google.e.a.a.a.a.a.e;
import com.google.e.a.a.a.a.a.f;
import com.google.e.a.a.a.a.a.h;
import com.google.e.a.a.a.a.a.i;
import com.google.e.a.a.a.a.a.j;
import com.google.e.a.a.a.a.a.k;
import com.google.e.a.a.a.a.a.l;
import com.google.e.a.a.a.a.a.m;
import com.google.e.a.a.a.a.a.n;
import com.google.e.a.a.a.a.a.o;
import com.google.protobuf.nano.C0757i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p000c.p001a.C0000a;

public final class C3596x implements InstantAppsClient {
    public final ad f17903a;
    public final C0000a f17904b;

    C3596x(ad adVar, C0000a c0000a) {
        this.f17903a = adVar;
        this.f17904b = c0000a;
    }

    public final C3565a mo3548a(String str, String str2, String str3, int i) {
        try {
            ad adVar = this.f17903a;
            C0757i eVar = new e();
            i iVar = new i();
            iVar.a = str2;
            iVar.b = str3;
            iVar.c = i;
            eVar.a = iVar;
            eVar.b = adVar.m17159a();
            String a = ad.m17157a(0, eVar, "/v1/appSplits");
            Map a2 = adVar.m17160a(str);
            ad.m17158a(0, eVar);
            ac acVar = new ac(0, eVar, a2, a);
            try {
                C0330d.m1728a("makeCall");
                af a3 = ((C3570t) this.f17904b.mo1a()).mo3544a(acVar);
                C0330d.m1727a();
                if (a3.mo3545a()) {
                    try {
                        f fVar = (f) C0757i.m4905a(new f(), a3.mo3547c());
                        Map c0305a = new C0305a(fVar.c.length);
                        for (j jVar : fVar.c) {
                            c0305a.put(jVar.b, new C3568d(Uri.parse(jVar.c), jVar.d, jVar.e, Arrays.asList(jVar.g), jVar.f));
                        }
                        if (fVar.f != null) {
                            Uri.parse(fVar.f.b);
                            C3566b c3566b = new C3566b();
                        }
                        List arrayList = new ArrayList(fVar.g.length);
                        for (h hVar : fVar.g) {
                            arrayList.add(new C3569e(Uri.parse(hVar.c), hVar.d, hVar.e));
                        }
                        String str4 = fVar.a;
                        Uri parse = Uri.parse(fVar.b);
                        if (fVar.e != null) {
                            Uri.parse(fVar.e);
                        }
                        return new C3565a(str2, i, str4, parse, c0305a, arrayList);
                    } catch (Throwable e) {
                        throw new InstantAppsClientException("Response was successful, but failure to read body", e);
                    }
                }
                throw new InstantAppsClientException("Response was unsuccessful", a3.mo3546b());
            } catch (Throwable e2) {
                throw new InstantAppsClientException("Network error while making call", e2);
            } catch (Throwable th) {
                C0330d.m1727a();
            }
        } catch (Throwable e22) {
            throw new InstantAppsClientException("Failed to prepare request", e22);
        }
    }

    public final l mo3549a(String str, List list) {
        try {
            ad adVar = this.f17903a;
            C0757i kVar = new k();
            kVar.b = (a[]) list.toArray(new a[list.size()]);
            kVar.a = adVar.m17159a();
            String a = ad.m17157a(1, kVar, "/v1/syncAppStates");
            Map a2 = adVar.m17160a(str);
            ad.m17158a(1, kVar);
            try {
                af a3 = ((C3570t) this.f17904b.mo1a()).mo3544a(new ac(1, kVar, a2, a));
                if (a3.mo3545a()) {
                    try {
                        return (l) C0757i.m4905a(new l(), a3.mo3547c());
                    } catch (Throwable e) {
                        throw new InstantAppsClientException("Response was successful, but failure to read body", e);
                    }
                }
                throw new InstantAppsClientException("Response was unsuccessful", a3.mo3546b());
            } catch (Throwable e2) {
                throw new InstantAppsClientException("Network error while making call", e2);
            }
        } catch (Throwable e22) {
            throw new InstantAppsClientException("Failed to prepare request", e22);
        }
    }

    public final void mo3550a(String str, boolean z) {
        try {
            ad adVar = this.f17903a;
            C0757i mVar = new m();
            mVar.c = adVar.m17159a().h;
            C0757i fVar = new com.google.wireless.android.d.a.a.f();
            fVar.c = Secure.getString(adVar.f17866e, "android_id");
            fVar.a = Build.MODEL;
            mVar.d = C0757i.m4909a(fVar);
            o oVar = new o();
            oVar.b = true;
            mVar.a = oVar;
            n nVar = new n();
            nVar.b = z;
            mVar.b = nVar;
            FinskyLog.m21662b("Update User Prefs Request=%s", mVar.toString());
            String a = ad.m17157a(1, mVar, "/v1/userPrefs");
            Map a2 = adVar.m17160a(str);
            ad.m17158a(1, mVar);
            try {
                af a3 = ((C3570t) this.f17904b.mo1a()).mo3544a(new ac(1, mVar, a2, a));
                if (!a3.mo3545a()) {
                    throw new InstantAppsClientException("Response was unsuccessful", a3.mo3546b());
                }
            } catch (Throwable e) {
                throw new InstantAppsClientException("Network error while making call", e);
            }
        } catch (Throwable e2) {
            throw new InstantAppsClientException("Failed to prepare request", e2);
        }
    }
}
