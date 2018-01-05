package com.google.android.wallet.instrumentmanager.p389d;

import com.android.volley.VolleyError;
import com.google.android.wallet.common.p374d.C6574c;
import com.google.android.wallet.common.util.C6611w;

public final class C6639e extends C6574c {
    public final C6611w f32810d;
    public final /* synthetic */ C6635a f32811e;

    public C6639e(C6635a c6635a, byte[] bArr, C6611w c6611w) {
        this.f32811e = c6635a;
        super(c6635a, bArr);
        this.f32810d = c6611w;
    }

    public final void mo5543a(VolleyError volleyError) {
        super.mo5543a(volleyError);
        if (this.f32811e.f32598l == 3) {
            this.f32810d.f32780b = null;
        }
    }
}
