package com.google.android.finsky.billing.common;

import android.os.Bundle;
import com.google.android.finsky.cv.p177a.is;
import com.google.android.finsky.cv.p177a.it;
import com.google.android.finsky.utils.FinskyLog;

public final class C1802r {
    public static Bundle m9801a(is isVar) {
        if (isVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (it itVar : isVar.f12704a) {
            String str = itVar.f12708d;
            if (itVar.m12820d()) {
                bundle.putString(str, itVar.bq_());
            } else if (itVar.m12822f()) {
                bundle.putBoolean(str, itVar.m12821e());
            } else if (itVar.m12824h()) {
                bundle.putLong(str, itVar.m12823g());
            } else if (itVar.f12706a == 3) {
                int i;
                if (itVar.f12706a == 3) {
                    i = itVar.f12712h;
                } else {
                    i = 0;
                }
                bundle.putInt(str, i);
            } else {
                FinskyLog.m21665c("No known value type for key: %s", str);
            }
        }
        return bundle;
    }
}
