package com.google.android.gms.ads.p272d;

import android.content.Context;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.C5302b;
import com.google.android.gms.internal.ap;

@C5302b
public final class C4911a {
    public static void m22928a(Context context, C4912b c4912b) {
        am.m23734a((Object) c4912b, (Object) "PlayStoreInAppPurchase must not be null.");
        try {
            C4913c.m22929a(context).mo4699a(c4912b.f25271a);
        } catch (Throwable e) {
            ap.m24192b("Failed to report In-App Purchases", e);
        }
    }
}
