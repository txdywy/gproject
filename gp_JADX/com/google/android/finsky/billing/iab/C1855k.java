package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.utils.C4672c;
import com.google.wireless.android.finsky.dfe.nano.ey;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

final class C1855k implements C0660x {
    public final /* synthetic */ Bundle f9537a;
    public final /* synthetic */ Semaphore f9538b;

    C1855k(Bundle bundle, Semaphore semaphore) {
        this.f9537a = bundle;
        this.f9538b = semaphore;
    }

    public final /* synthetic */ void b_(Object obj) {
        ey eyVar = (ey) obj;
        this.f9537a.putInt("RESPONSE_CODE", C1868x.RESULT_OK.f9566l);
        this.f9537a.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", new ArrayList(C4672c.m21803a(eyVar.b)));
        this.f9537a.putStringArrayList("INAPP_PURCHASE_DATA_LIST", new ArrayList(C4672c.m21803a(eyVar.c)));
        this.f9537a.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", new ArrayList(C4672c.m21803a(eyVar.d)));
        if (!TextUtils.isEmpty(eyVar.e)) {
            this.f9537a.putString("INAPP_CONTINUATION_TOKEN", eyVar.e);
        }
        this.f9538b.release();
    }
}
