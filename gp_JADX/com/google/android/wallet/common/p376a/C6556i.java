package com.google.android.wallet.common.p376a;

import com.android.volley.a.z;
import com.android.volley.q;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.wallet.common.p367c.C6573a;
import java.util.Collections;
import java.util.Map;

public final class C6556i extends z {
    public C6556i(int i, String str, x xVar, w wVar) {
        super(0, C6555h.f32661a.buildUpon().appendEncodedPath(C6555h.m29752a(i, null)).build().buildUpon().appendPath(str).toString(), null, xVar, wVar);
    }

    public final q m29755n() {
        return q.c;
    }

    public final Map m29754h() {
        return Collections.singletonMap("User-Agent", C6573a.f32700a);
    }
}
