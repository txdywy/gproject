package com.google.android.finsky.billing.common;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.b;
import com.google.wireless.android.finsky.a.a.ax;
import com.google.wireless.android.finsky.b.u;
import com.google.wireless.android.finsky.b.x;
import com.google.wireless.android.finsky.b.y;

public final class com.google.android.finsky.billing.common.e
{

    public final Application a;

    e(Application p0) {
        this.a = p0;
    }

    private static Bundle a(com.google.wireless.android.finsky.b.x p0) {
        if (p0 == 0)
            v0 = 0;
        else {
            v4 = new Bundle();
            v6 = 0;
            while (v6 < p0.a.length) {
                if (p0.a[v6].a == 0)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0) {
                    if (p0.a[v6].a == 0)
                        v0 = p0.a[v6].e;
                    else
                        v0 = "";
                    v4.putString(p0.a[v6].d, v0);
                }
                else if (p0.a[v6].a == 1) {
                    if (p0.a[v6].a == 1)
                        v0 = p0.a[v6].f;
                    else
                        v0 = 0;
                    v4.putBoolean(p0.a[v6].d, v0);
                }
                else if (p0.a[v6].a == 2) {
                    if (p0.a[v6].a == 2)
                        v2 = p0.a[v6].g;
                    else
                        v2 = 0;
                    v4.putLong(p0.a[v6].d, v2);
                }
                else {
                    v2 = new Object[1];
                    v2[0] = p0.a[v6].d;
                    FinskyLog.c("No known value type for key: %s", v2);
                }
                v6 = v6 + 1;
            }
            v0 = v4;
        }
        return v0;
    }

    public final void a(com.google.wireless.android.finsky.a.a.ax p0) {
        if (p0 != 0 && p0.a(com.google.wireless.android.finsky.b.u.a)) {
            v0 = (com.google.wireless.android.finsky.b.u)p0.b(com.google.wireless.android.finsky.b.u.a);
            v1 = new Intent(v0.d);
            v1.setPackage(v0.e);
            v0 = com.google.android.finsky.billing.common.e.a(v0.f);
            if (v0 != 0)
                v1.putExtras(v0);
            this.a.sendBroadcast(v1);
        }
    }

}
