package com.google.android.finsky.p257t;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C1050j;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;

final class C4564c implements C1050j {
    public final /* synthetic */ boolean f23319a = true;
    public final /* synthetic */ C1254c f23320b;
    public final /* synthetic */ C2693e f23321c;
    public final /* synthetic */ long f23322d;
    public final /* synthetic */ C0660x f23323e;
    public final /* synthetic */ C0657w f23324f;
    public final /* synthetic */ C4562a f23325g;

    C4564c(C4562a c4562a, C1254c c1254c, C2693e c2693e, long j, C0660x c0660x, C0657w c0657w) {
        this.f23325g = c4562a;
        this.f23320b = c1254c;
        this.f23321c = c2693e;
        this.f23322d = j;
        this.f23323e = c0660x;
        this.f23324f = c0657w;
    }

    public final void mo1306a() {
        this.f23320b.mo1554a(this.f23322d, new C4563b(this.f23323e), this.f23324f);
    }

    public final void mo1307a(VolleyError volleyError) {
        FinskyLog.m21665c("Upload device configuration failed - try getBackupDocumentChoices anyway", new Object[0]);
        this.f23320b.mo1554a(this.f23322d, new C4563b(this.f23323e), this.f23324f);
    }
}
