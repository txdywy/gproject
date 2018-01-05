package com.google.android.finsky.wear;

import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;
import java.util.List;

final class aa implements Runnable {
    public final /* synthetic */ String f24763a;
    public final /* synthetic */ int f24764b;
    public final /* synthetic */ ArrayList f24765c;
    public final /* synthetic */ C4805z f24766d;

    aa(C4805z c4805z, String str, int i, ArrayList arrayList) {
        this.f24766d = c4805z;
        this.f24763a = str;
        this.f24764b = i;
        this.f24765c = arrayList;
    }

    public final void run() {
        String a = C1473m.f7980a.bt().m15626a(this.f24763a).m15620a(C1473m.f7980a.cZ());
        C4805z c4805z;
        if (TextUtils.isEmpty(a)) {
            FinskyLog.m21665c("Account missing.", new Object[0]);
            c4805z = this.f24766d;
            String str = this.f24763a;
            FinskyLog.m21659a("Writing module response for node %s to path %s", c4805z.f25076d, c4805z.f25078f);
            if (c4805z.f25080h != null) {
                ForegroundCoordinator.m16015a(c4805z.f25080h);
                c4805z.f25080h = null;
            }
            C5651m a2 = C5651m.m26837a(c4805z.f25078f);
            C5620h c5620h = a2.f28707b;
            c5620h.m26642a("status", 1);
            c5620h.m26646a("packageName", str);
            c5620h.m26643a("timestamp", System.currentTimeMillis());
            C5613a c5613a = C5652n.f28708a;
            C5058o c5058o = c4805z.f25075c;
            PutDataRequest a3 = a2.m26838a();
            a3.f28571e = 0;
            c5613a.mo5117a(c5058o, a3).mo4490a(new ae(c4805z));
            return;
        }
        C1254c a4 = C1473m.f7980a.mo2047a(a, this.f24766d.f25076d);
        if (a4 == null) {
            FinskyLog.m21665c("Can't get dfeApi for account %s", FinskyLog.m21655a(a));
            c4805z = this.f24766d;
            str = this.f24763a;
            FinskyLog.m21659a("Writing module response for node %s to path %s", c4805z.f25076d, c4805z.f25078f);
            if (c4805z.f25080h != null) {
                ForegroundCoordinator.m16015a(c4805z.f25080h);
                c4805z.f25080h = null;
            }
            a2 = C5651m.m26837a(c4805z.f25078f);
            c5620h = a2.f28707b;
            c5620h.m26642a("status", 1);
            c5620h.m26646a("packageName", str);
            c5620h.m26643a("timestamp", System.currentTimeMillis());
            c5613a = C5652n.f28708a;
            c5058o = c4805z.f25075c;
            a3 = a2.m26838a();
            a3.f28571e = 0;
            c5613a.mo5117a(c5058o, a3).mo4490a(new ae(c4805z));
            return;
        }
        C4805z c4805z2 = this.f24766d;
        String str2 = this.f24763a;
        int i = this.f24764b;
        ArrayList arrayList = this.f24765c;
        C0660x abVar = new ab(c4805z2, str2);
        C0657w acVar = new ac(c4805z2, str2);
        C1473m c1473m = C1473m.f7980a;
        C1552e dj = c1473m.dj();
        c4805z2.f25079g = c1473m.bz();
        if (dj.mo2294a(12608873) || !c4805z2.f25079g.m16017a()) {
            a4.mo1582a(str2, i, (List) arrayList, new int[0], new int[0], abVar, acVar);
        } else if (c4805z2.f25080h != null) {
            FinskyLog.m21669e("Already exists foreground connection", new Object[0]);
        } else {
            c4805z2.f25080h = c4805z2.f25079g.m16016a(5, dj, new ad(a4, str2, i, arrayList, abVar, acVar));
        }
    }
}
