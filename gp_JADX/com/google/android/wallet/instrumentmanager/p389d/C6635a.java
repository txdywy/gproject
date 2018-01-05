package com.google.android.wallet.instrumentmanager.p389d;

import android.os.Bundle;
import com.android.volley.n;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.b.a.g;
import com.google.a.a.a.a.b.b.a.h;
import com.google.a.a.a.a.b.b.a.i;
import com.google.android.wallet.common.p374d.C6532b;
import com.google.android.wallet.common.p374d.C6574c;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.p384a.p385a.C6628b;
import com.google.android.wallet.p355a.C6487c;
import java.util.Map;

public final class C6635a extends C6532b {
    public static final Object f32805i = new Object();
    public i af;
    public g ag;
    public boolean ah;

    public final void m30026a(h hVar, e eVar, Map map, C6638d c6638d, C6574c c6574c, Object obj) {
        if (hVar.a != null) {
            throw new IllegalArgumentException("SavePageRequest's RequestContext should not be set by the caller");
        }
        n c6628b = new C6628b(this.d, hVar, map, eVar.b, this.e, c6638d, c6574c);
        c6628b.o = obj;
        c6574c.f32703a = c6628b;
        super.m29658a(c6628b, true);
        C6567a.m29801a(720, 1, eVar.c);
        this.ah = false;
    }

    protected final boolean mo5541a(int i) {
        return this.ah && i - 1 < ((Integer) C6487c.f32490a.a()).intValue();
    }

    public final void mo5508e(Bundle bundle) {
        super.mo5508e(bundle);
        if (this.af != null) {
            bundle.putParcelable("savePageResponse", ParcelableProto.m29885a(this.af));
        }
        if (this.ag != null) {
            bundle.putParcelable("refreshPageResponse", ParcelableProto.m29885a(this.ag));
        }
        bundle.putBoolean("sendingRequestAfterSms", this.ah);
    }

    protected final void mo5506a(Bundle bundle) {
        this.af = (i) ParcelableProto.m29887a(bundle, "savePageResponse");
        this.ag = (g) ParcelableProto.m29887a(bundle, "refreshPageResponse");
        this.ah = bundle.getBoolean("sendingRequestAfterSms");
        super.mo5506a(bundle);
    }

    protected final void mo5505W() {
        this.af = null;
        this.ag = null;
    }
}
