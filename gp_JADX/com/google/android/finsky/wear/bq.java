package com.google.android.finsky.wear;

import android.os.AsyncTask;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

final class bq extends AsyncTask {
    public final /* synthetic */ C2206c f24893a;
    public final /* synthetic */ C3646a f24894b;
    public final /* synthetic */ WearSupportService f24895c;

    bq(WearSupportService wearSupportService, C2206c c2206c, C3646a c3646a) {
        this.f24895c = wearSupportService;
        this.f24893a = c2206c;
        this.f24894b = c3646a;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        C5058o c5058o = this.f24895c.f24756c.f24792b;
        if (c5058o == null || !c5058o.mo4562j()) {
            FinskyLog.m21665c("HSIA: Dropping intent due to Gms not connected", new Object[0]);
        } else {
            for (String str : map.keySet()) {
                Set set = (Set) map.get(str);
                if (set != null) {
                    String a = cl.m22516a(str);
                    FinskyLog.m21659a("Writing installed apps for account %s", FinskyLog.m21655a(str));
                    C5651m a2 = C5651m.m26837a(a);
                    a2.f28707b.m26656c("appsList", new ArrayList(set));
                    C5652n.f28708a.mo5117a(c5058o, a2.m26838a());
                }
            }
        }
        this.f24895c.f24760g = this.f24895c.f24760g - 1;
        this.f24895c.m22419a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f24893a.mo2820c();
        this.f24894b.f18022b.m11209c();
        return this.f24894b.m17246a(this.f24893a, true);
    }
}
