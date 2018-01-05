package com.google.android.finsky.family.p201c;

import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.al;

public final class C3049j {
    public static C3047k f15917a;

    static String m15706a(al[] alVarArr, int i, Object... objArr) {
        int length = alVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            al alVar = alVarArr[i2];
            if (alVar.c != i) {
                i2++;
            } else if (objArr.length > 0) {
                return String.format(alVar.d, objArr);
            } else {
                return alVar.d;
            }
        }
        FinskyLog.m21669e("Unable to find text for " + i, new Object[0]);
        return "";
    }
}
