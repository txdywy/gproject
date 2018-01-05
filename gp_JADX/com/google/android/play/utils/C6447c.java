package com.google.android.play.utils;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;

public final class C6447c {
    public static bd m29499a(cv cvVar, int i) {
        if (cvVar == null || cvVar.p == null) {
            return null;
        }
        bd[] bdVarArr = cvVar.p;
        for (int i2 = 0; i2 < bdVarArr.length; i2++) {
            if (bdVarArr[i2].c == i) {
                return bdVarArr[i2];
            }
        }
        return null;
    }
}
