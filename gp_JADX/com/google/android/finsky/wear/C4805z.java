package com.google.android.finsky.wear;

import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;

public final class C4805z {
    public final cc f25073a;
    public final C4781b f25074b;
    public final C5058o f25075c;
    public final String f25076d;
    public final String f25077e;
    public final String f25078f;
    public ForegroundCoordinator f25079g;
    public C3138b f25080h;

    public C4805z(C4781b c4781b, C5058o c5058o, String str, String str2, cc ccVar) {
        this.f25074b = c4781b;
        this.f25075c = c5058o;
        this.f25076d = str;
        this.f25077e = str2;
        this.f25073a = ccVar;
        String str3 = this.f25077e;
        String str4 = this.f25076d;
        this.f25078f = new StringBuilder((String.valueOf(str3).length() + 24) + String.valueOf(str4).length()).append("/zapp_modules_response/").append(str3).append("/").append(str4).toString();
    }

    final void m22581a(int i, String str, ArrayList arrayList) {
        FinskyLog.m21659a("Writing module response for node %s to path %s", this.f25076d, this.f25078f);
        if (this.f25080h != null) {
            ForegroundCoordinator.m16015a(this.f25080h);
            this.f25080h = null;
        }
        C5651m a = C5651m.m26837a(this.f25078f);
        C5620h c5620h = a.f28707b;
        c5620h.m26642a("status", i);
        c5620h.m26646a("packageName", str);
        c5620h.m26643a("timestamp", System.currentTimeMillis());
        if (arrayList != null) {
            c5620h.m26647a("moduleInfos", C5620h.m26635a(arrayList));
        }
        C5613a c5613a = C5652n.f28708a;
        C5058o c5058o = this.f25075c;
        PutDataRequest a2 = a.m26838a();
        a2.f28571e = 0;
        c5613a.mo5117a(c5058o, a2).mo4490a(new ae(this));
    }
}
