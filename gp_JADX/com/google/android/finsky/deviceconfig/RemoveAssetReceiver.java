package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;

public class RemoveAssetReceiver extends C0989a {
    public C2471a f14821a;
    public C3646a f14822b;
    public ab f14823c;
    public C2296c f14824d;

    public final void mo1179a() {
        ((C1377d) C3947d.m18649a(C1377d.class)).mo1810a(this);
    }

    public final void mo1180a(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE")) {
            setResultCode(-1);
            if ("google.com".equals(intent.getStringExtra("from")) && intent.getCategories() != null && intent.getCategories().contains("REMOVE_ASSET")) {
                this.f14822b.m17248a(new C2706s(this, context, intent));
            }
        }
    }
}
