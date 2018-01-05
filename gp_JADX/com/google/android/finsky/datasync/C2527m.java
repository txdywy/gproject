package com.google.android.finsky.datasync;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

final class C2527m implements C0657w {
    public final /* synthetic */ BrowseDataSyncService f13555a;

    C2527m(BrowseDataSyncService browseDataSyncService) {
        this.f13555a = browseDataSyncService;
    }

    public final void mo1062a(VolleyError volleyError) {
        BrowseDataSyncService browseDataSyncService = this.f13555a;
        browseDataSyncService.f13457b = browseDataSyncService.f13457b;
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
