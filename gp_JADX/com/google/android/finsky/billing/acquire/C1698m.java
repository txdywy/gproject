package com.google.android.finsky.billing.acquire;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.billing.common.C1802r;
import com.google.android.finsky.billing.p130b.C1697p;
import com.google.android.finsky.cv.p177a.is;

final class C1698m implements C1697p {
    public final /* synthetic */ C1664i f8748a;

    C1698m(C1664i c1664i) {
        this.f8748a = c1664i;
    }

    public final void mo2398a(boolean z, is isVar) {
        Intent intent;
        if (isVar == null) {
            C1690f c1690f = new C1690f();
            isVar = C1690f.m9475a(C1691g.RESULT_USER_CANCELED);
        }
        C1802r c1802r = new C1802r();
        Bundle a = C1802r.m9801a(isVar);
        if (a == null) {
            intent = null;
        } else {
            intent = new Intent().putExtras(a);
        }
        this.f8748a.setResult(z ? -1 : 0, intent);
        this.f8748a.ac = z;
        this.f8748a.ad = intent.getIntExtra("RESPONSE_CODE", C1691g.RESULT_USER_CANCELED.f8744d);
        this.f8748a.finish();
    }
}
