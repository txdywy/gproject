package com.google.android.play.utils.p146c;

import com.google.android.play.utils.PlayCommonLog;

public final class C6323d {
    public static C1458e f31613a;

    public static int m28965a() {
        if (f31613a != null) {
            return f31613a.mo2011a();
        }
        PlayCommonLog.d("NetworkQualityCache instance is not set in NetworkQualityUtil", new Object[0]);
        return -1;
    }
}
