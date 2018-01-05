package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.utils.c;
import com.google.wireless.android.finsky.dfe.nano.ey;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.k implements com.android.volley.x
{

    public final Bundle a;
    public final Semaphore b;

    k(Bundle p0, Semaphore p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void b_(Object p0) {
        this.a.putInt("RESPONSE_CODE", com.google.android.finsky.billing.iab.x.a.l);
        this.a.putStringArrayList("INAPP_PURCHASE_ITEM_LIST", new ArrayList(com.google.android.finsky.utils.c.a(((com.google.wireless.android.finsky.dfe.nano.ey)p0).b)));
        this.a.putStringArrayList("INAPP_PURCHASE_DATA_LIST", new ArrayList(com.google.android.finsky.utils.c.a(((com.google.wireless.android.finsky.dfe.nano.ey)p0).c)));
        this.a.putStringArrayList("INAPP_DATA_SIGNATURE_LIST", new ArrayList(com.google.android.finsky.utils.c.a(((com.google.wireless.android.finsky.dfe.nano.ey)p0).d)));
        if (!TextUtils.isEmpty(((com.google.wireless.android.finsky.dfe.nano.ey)p0).e))
            this.a.putString("INAPP_CONTINUATION_TOKEN", ((com.google.wireless.android.finsky.dfe.nano.ey)p0).e);
        this.b.release();
    }

}
