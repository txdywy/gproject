package com.google.android.finsky.p187g;

import com.google.android.finsky.utils.FinskyLog;

public final class C3154d implements C3151c {
    public final void mo3332a(String[] strArr, C2890e c2890e) {
        int i = 0;
        FinskyLog.m21659a("backup not available due to pre-O API", new Object[0]);
        int length = strArr.length;
        while (i < length) {
            c2890e.mo3190b(strArr[i]);
            i++;
        }
    }
}
