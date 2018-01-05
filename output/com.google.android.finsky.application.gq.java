package com.google.android.finsky.application;

import a.a.c;
import android.content.Context;
import android.telephony.TelephonyManager;
import c.a.a;

public final class com.google.android.finsky.application.gq implements c.a.a
{

    public final c.a.a a;

    gq(c.a.a p0) {
        this.a = p0;
    }

    public final Object a() {
        return (TelephonyManager)a.a.c.a((TelephonyManager)((Context)this.a.a()).getSystemService("phone"), "Cannot return null from a non-@Nullable @Provides method");
    }

}
