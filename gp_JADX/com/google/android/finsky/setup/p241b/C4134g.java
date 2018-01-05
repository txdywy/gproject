package com.google.android.finsky.setup.p241b;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4114a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.fq;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class C4134g {
    public final String f20843a;
    public final C2918a f20844b = new C4114a(this.f20843a);
    public final bw f20845c;
    public final C1287h f20846d;

    public C4134g(String str, bw bwVar, C1287h c1287h) {
        this.f20843a = str;
        this.f20845c = bwVar;
        this.f20846d = c1287h;
    }

    public final Bundle m19250a() {
        Exception e;
        C1254c a = this.f20846d.mo2016a(this.f20843a);
        if (a == null) {
            return this.f20845c.m19363a("no_account", null, this.f20843a, 2);
        }
        ag agVar = new ag();
        a.mo1631c(agVar, agVar);
        try {
            Bundle bundle;
            fq fqVar = (fq) this.f20845c.m19365b(a, agVar, "Unable to fetch backup devices");
            FinskyLog.m21659a("getBackupDeviceChoices returned with %d devices", Integer.valueOf(fqVar.a.length));
            ArrayList arrayList = new ArrayList(fqVar.a.length);
            for (Object obj : fqVar.a) {
                if (obj == null) {
                    FinskyLog.m21665c("response.getBackupDeviceChoices[%d] was null", Integer.valueOf(r2));
                } else {
                    bundle = (Bundle) this.f20844b.mo3197a(obj);
                    if (bundle == null) {
                        FinskyLog.m21665c("getBackupDeviceChoices didn't return correct device for %s", obj);
                    } else {
                        arrayList.add(bundle);
                    }
                }
            }
            bundle = new Bundle();
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("devices", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            }
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        FinskyLog.m21667d("Error in getPackagesForDevice: %s", e);
        return this.f20845c.m19363a(null, e, this.f20843a, 2);
    }
}
