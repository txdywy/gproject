package com.google.android.instantapps.common;

import com.google.android.instantapps.p309a.p310a.C5686a;

public final class C5802i {
    public static final C5686a f29258a = C5686a.m26933a("com.google.android.instantapps.common.backendHost", "playatoms-pa.googleapis.com");

    static {
        C5686a.m26934a("com.google.android.instantapps.common.enableInterpretedMode", true);
        C5686a.m26934a("com.google.android.instantapps.common.disableSpeedBumpUi", false);
        C5803j c5803j = new C5803j();
        C5686a.m26934a("com.google.android.instantapps.common.enableNativeActivity", false);
        C5686a.m26931a("com.google.android.instantapps.common.backendPort", Integer.valueOf(443));
        C5686a.m26933a("com.google.android.instantapps.common.oauthScopes", "https://www.googleapis.com/auth/playatoms");
    }
}
