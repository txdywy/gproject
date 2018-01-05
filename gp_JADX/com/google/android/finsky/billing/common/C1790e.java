package com.google.android.finsky.billing.common;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.a.a.ax;
import com.google.wireless.android.finsky.b.u;
import com.google.wireless.android.finsky.b.x;
import com.google.wireless.android.finsky.b.y;

public final class C1790e {
    public final Application f9317a;

    public C1790e(Application application) {
        this.f9317a = application;
    }

    public final void m9752a(ax axVar) {
        if (axVar != null && axVar.m4919a(u.a)) {
            u uVar = (u) axVar.m4921b(u.a);
            Intent intent = new Intent(uVar.d);
            intent.setPackage(uVar.e);
            Bundle a = C1790e.m9751a(uVar.f);
            if (a != null) {
                intent.putExtras(a);
            }
            this.f9317a.sendBroadcast(intent);
        }
    }

    private static Bundle m9751a(x xVar) {
        if (xVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (y yVar : xVar.a) {
            String str = yVar.d;
            if ((yVar.a == 0 ? 1 : 0) != 0) {
                String str2;
                if (yVar.a == 0) {
                    str2 = yVar.e;
                } else {
                    str2 = "";
                }
                bundle.putString(str, str2);
            } else if (yVar.a == 1) {
                boolean z;
                if (yVar.a == 1) {
                    z = yVar.f;
                } else {
                    z = false;
                }
                bundle.putBoolean(str, z);
            } else if (yVar.a == 2) {
                long j;
                if (yVar.a == 2) {
                    j = yVar.g;
                } else {
                    j = 0;
                }
                bundle.putLong(str, j);
            } else {
                FinskyLog.m21665c("No known value type for key: %s", str);
            }
        }
        return bundle;
    }
}
