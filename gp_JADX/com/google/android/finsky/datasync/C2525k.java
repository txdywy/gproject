package com.google.android.finsky.datasync;

import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;

final class C2525k implements C1096g {
    public final /* synthetic */ C1254c f13552a;
    public final /* synthetic */ BrowseDataSyncService f13553b;

    C2525k(BrowseDataSyncService browseDataSyncService, C1254c c1254c) {
        this.f13553b = browseDataSyncService;
        this.f13552a = c1254c;
    }

    public final void mo1427a(gp gpVar) {
        this.f13553b.m13402a(gpVar.f31765h, this.f13552a);
    }

    public final void mo1426a(VolleyError volleyError) {
        BrowseDataSyncService browseDataSyncService = this.f13553b;
        browseDataSyncService.f13457b = true;
        browseDataSyncService.f13456a--;
        if (browseDataSyncService.f13456a == 0) {
            FinskyLog.m21659a("Fetch browse data complete", new Object[0]);
            C2474c c2474c = new C2474c(532);
            if (browseDataSyncService.f13457b) {
                c2474c.m13210a(1);
            }
            browseDataSyncService.f13460e.dc().m13319a(c2474c.f13342a, null);
            browseDataSyncService.stopSelf();
        }
    }
}
