package com.google.android.instantapps.common;

import android.os.SystemProperties;
import com.google.android.instantapps.p309a.p311b.p312a.C5694a;

final class C5803j implements C5694a {
    C5803j() {
    }

    public final /* synthetic */ Object mo5134a() {
        return Boolean.valueOf(SystemProperties.getBoolean("debug.instantapps.enable_gpu", true));
    }
}
