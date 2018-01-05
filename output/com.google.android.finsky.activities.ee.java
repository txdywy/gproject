package com.google.android.finsky.activities;

import android.support.v4.app.u;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.uninstall.UninstallManagerActivity;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import java.util.ArrayList;

public final class com.google.android.finsky.activities.ee implements com.google.android.finsky.notification.b
{

    public final InlineAppPostPurchaseDialog a;

    ee(InlineAppPostPurchaseDialog p0) {
        this.a = p0;
    }

    public final boolean a() {
        return 0;
    }

    public final boolean a(String p0) {
        return 0;
    }

    public final boolean a(String p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        v0 = 0;
        if (this.a.J.a.c.equals(p0) && p3 == 3) {
            if (com.google.android.finsky.m.a.dj().a(12610437)) {
                v1 = new ArrayList();
                v1.add(p0);
                this.a.startActivityForResult(UninstallManagerActivityV2.a(v1, this.a.C, 0), 100);
            }
            else
                this.a.startActivityForResult(UninstallManagerActivity.a(this.a.J, this.a.C), 100);
            v0 = 1;
        }
        return v0;
    }

    public final boolean a(String p0, String p1, String p2, String p3, com.google.android.finsky.d.w p4) {
        return 0;
    }

    public final boolean a(ArrayList p0, com.google.android.finsky.d.w p1) {
        return 0;
    }

    public final boolean b(String p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        return 0;
    }

}
