package com.google.android.finsky.setup.p241b;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fr;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class C4129a implements C4128c {
    public final String f20823a;
    public final long f20824b;
    public final C2918a f20825c;
    public final C4562a f20826d;
    public final bw f20827e;
    public final C1287h f20828f;

    public C4129a(String str, long j, C4126m c4126m, C4562a c4562a, bw bwVar, C1287h c1287h) {
        this.f20825c = c4126m.m19176a(str);
        this.f20823a = str;
        this.f20824b = j;
        this.f20826d = c4562a;
        this.f20827e = bwVar;
        this.f20828f = c1287h;
    }

    public final Bundle mo3934a() {
        Exception e;
        C1254c a = this.f20828f.mo2016a(this.f20823a);
        if (a == null) {
            return this.f20827e.m19363a("no_account", null, this.f20823a, 1);
        }
        C0657w agVar = new ag();
        this.f20826d.m21191a(a, C2693e.m14552a(), this.f20824b, agVar, agVar, true);
        try {
            fr frVar = (fr) this.f20827e.m19365b(a, agVar, "Unable to fetch backup document choices");
            FinskyLog.m21659a("getBackupDocumentChoices returned %d documents and %d unrestorable documents", Integer.valueOf(frVar.b.length), Integer.valueOf(frVar.d.length));
            Bundle bundle = new Bundle();
            Parcelable[] a2 = m19242a(frVar.b);
            if (a2.length != 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("title", null);
                bundle2.putParcelableArray("documents", a2);
                bundle.putParcelableArray("document_groups", new Bundle[]{bundle2});
            }
            Parcelable[] a3 = m19242a(frVar.d);
            if (a3.length != 0) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("title", null);
                bundle3.putParcelableArray("documents", a3);
                bundle.putParcelableArray("unrestorable_document_groups", new Bundle[]{bundle3});
            }
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
            FinskyLog.m21667d("Error in getPackagesForDevice: %s", e);
            return this.f20827e.m19363a(null, e, this.f20823a, 1);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21667d("Error in getPackagesForDevice: %s", e);
            return this.f20827e.m19363a(null, e, this.f20823a, 1);
        } catch (ExecutionException e4) {
            e = e4;
            FinskyLog.m21667d("Error in getPackagesForDevice: %s", e);
            return this.f20827e.m19363a(null, e, this.f20823a, 1);
        }
    }

    private final Bundle[] m19242a(fp[] fpVarArr) {
        if (fpVarArr == null) {
            return new Bundle[0];
        }
        ArrayList arrayList = new ArrayList(fpVarArr.length);
        for (int i = 0; i < fpVarArr.length; i++) {
            if (fpVarArr[i] == null) {
                FinskyLog.m21665c("getBackupDocumentChoices returned null document at index %d", Integer.valueOf(i));
            } else {
                Bundle bundle = (Bundle) this.f20825c.mo3197a(fpVarArr[i]);
                if (bundle == null) {
                    String str;
                    if (fpVarArr[i].c != null) {
                        str = fpVarArr[i].c.f12097d;
                    } else {
                        str = null;
                    }
                    FinskyLog.m21665c("getBackupDocumentChoices didn't return correct doc for %s", str);
                } else {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }
}
