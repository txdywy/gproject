package com.google.android.finsky.deviceconfig;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.android.volley.ServerError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gv;
import com.google.wireless.android.p360b.p361a.C6333b;

final class C2696h implements C0660x {
    public final /* synthetic */ C2482j f14841a;
    public final /* synthetic */ String f14842b;
    public final /* synthetic */ C6333b f14843c;
    public final /* synthetic */ C1254c f14844d;
    public final /* synthetic */ C1050j f14845e;
    public final /* synthetic */ C2698k f14846f;
    public final /* synthetic */ C2693e f14847g;

    C2696h(C2693e c2693e, C2482j c2482j, String str, C6333b c6333b, C1254c c1254c, C1050j c1050j, C2698k c2698k) {
        this.f14847g = c2693e;
        this.f14841a = c2482j;
        this.f14842b = str;
        this.f14843c = c6333b;
        this.f14844d = c1254c;
        this.f14845e = c1050j;
        this.f14846f = c2698k;
    }

    public final /* synthetic */ void b_(Object obj) {
        gv gvVar = (gv) obj;
        this.f14841a.m13319a(new C2474c(120).f13342a, null);
        if (!TextUtils.isEmpty(this.f14842b)) {
            C0954a.f5843m.m5763a(this.f14842b);
        }
        if (this.f14843c != null) {
            if (TextUtils.isEmpty(gvVar.b)) {
                FinskyLog.m21669e("Unexpected - missing UploadDeviceConfigToken", new Object[0]);
                if (this.f14845e != null) {
                    this.f14845e.mo1307a(new ServerError());
                }
            } else {
                FinskyLog.m21659a("Received device config token %s", gvVar.b);
                this.f14847g.mo3113a(this.f14844d.mo1636c(), r0);
                this.f14844d.mo1642d();
                if (this.f14845e != null) {
                    this.f14845e.mo1306a();
                }
            }
        }
        this.f14847g.m14564a(this.f14846f);
    }
}
