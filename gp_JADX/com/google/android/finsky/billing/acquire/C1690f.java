package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.cv.p177a.is;
import com.google.android.finsky.cv.p177a.it;
import com.google.android.finsky.utils.ax;

public final class C1690f {
    public static is m9475a(C1691g c1691g) {
        is isVar = new is();
        it a = new it().m12815a("RESPONSE_CODE").m12814a(c1691g.f8744d);
        isVar.f12704a = new it[]{a};
        return isVar;
    }

    public static boolean m9476a() {
        return ax.m21774a("ro.boot.vr") == 1;
    }
}
