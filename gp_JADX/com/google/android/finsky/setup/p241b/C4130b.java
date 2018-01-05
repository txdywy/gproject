package com.google.android.finsky.setup.p241b;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public final class C4130b implements C4128c {
    public final String f20829a;
    public final String[] f20830b;
    public final C2918a f20831c;
    public final bw f20832d;
    public final C1287h f20833e;

    public C4130b(C4126m c4126m, C1287h c1287h, bw bwVar, String str, String[] strArr) {
        this.f20831c = c4126m.m19178c(str);
        this.f20832d = bwVar;
        this.f20833e = c1287h;
        this.f20829a = str;
        this.f20830b = strArr;
    }

    public final Bundle mo3934a() {
        Exception e;
        C1254c a = this.f20833e.mo2016a(this.f20829a);
        if (a == null) {
            return this.f20832d.m19363a("no_account", null, this.f20829a, 1);
        }
        C0660x agVar = new ag();
        a.mo1606a(C1283d.m7689a(Arrays.asList(this.f20830b)), false, true, agVar, (C0657w) agVar);
        try {
            Bundle bundle;
            bx bxVar = (bx) this.f20832d.m19365b(a, agVar, "Unable to fetch compatible documents.");
            FinskyLog.m21659a("getBulkDetails returned with %d documents", Integer.valueOf(bxVar.a.length));
            ArrayList arrayList = new ArrayList(bxVar.a.length);
            for (int i = 0; i < bxVar.a.length; i++) {
                if (bxVar.a[i] == null) {
                    FinskyLog.m21665c("getBulkDetails returned null entry for '%s'", this.f20830b[i]);
                } else {
                    bundle = (Bundle) this.f20831c.mo3197a(bxVar.a[i].b);
                    if (bundle == null) {
                        FinskyLog.m21665c("getBulkDetails didn't return correct doc for '%s'", this.f20830b[i]);
                    } else {
                        arrayList.add(bundle);
                    }
                }
            }
            bundle = new Bundle();
            if (!arrayList.isEmpty()) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("title", null);
                bundle2.putParcelableArray("documents", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
                bundle.putParcelableArray("document_groups", new Bundle[]{bundle2});
            }
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        FinskyLog.m21667d("Error in getCompatiblePackages: %s", e);
        return this.f20832d.m19363a(e.getMessage(), e, this.f20829a, 1);
    }
}
