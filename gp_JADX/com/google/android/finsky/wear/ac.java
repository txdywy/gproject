package com.google.android.finsky.wear;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;

final class ac implements C0657w {
    public final /* synthetic */ String f24769a;
    public final /* synthetic */ C4805z f24770b;

    ac(C4805z c4805z, String str) {
        this.f24770b = c4805z;
        this.f24769a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Module delivery for node %s volley error %s", this.f24770b.f25076d, volleyError);
        C4805z c4805z = this.f24770b;
        String str = this.f24769a;
        FinskyLog.m21659a("Writing module response for node %s to path %s", c4805z.f25076d, c4805z.f25078f);
        if (c4805z.f25080h != null) {
            ForegroundCoordinator.m16015a(c4805z.f25080h);
            c4805z.f25080h = null;
        }
        C5651m a = C5651m.m26837a(c4805z.f25078f);
        C5620h c5620h = a.f28707b;
        c5620h.m26642a("status", 1);
        c5620h.m26646a("packageName", str);
        c5620h.m26643a("timestamp", System.currentTimeMillis());
        C5613a c5613a = C5652n.f28708a;
        C5058o c5058o = c4805z.f25075c;
        PutDataRequest a2 = a.m26838a();
        a2.f28571e = 0;
        c5613a.mo5117a(c5058o, a2).mo4490a(new ae(c4805z));
    }
}
