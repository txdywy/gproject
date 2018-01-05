package com.google.android.finsky.activities;

import android.net.Uri;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.google.android.finsky.activities.myapps.r;
import com.google.android.finsky.activities.myapps.t;
import com.google.android.finsky.at.b;
import com.google.android.finsky.at.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.lx;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import java.util.ArrayList;

public final class com.google.android.finsky.activities.eq implements com.google.android.finsky.notification.b
{

    public final MainActivity a;

    eq(MainActivity p0) {
        this.a = p0;
    }

    private final boolean b(String p0) {
        v0 = 0;
        v1 = this.a.G.u();
        if (v1 == 0)
            return v0;
        switch (v1.a.f) {
            case 3:
                v0 = v1.N().k.equals(p0);
                break;
            case 4:
                if (!v1.Z())
                    return v0;
                v2 = v1.aa();
                v1 = 0;
                while (true) {
                    if (v1 >= v2.length)
                        return v0;
                    if (v2[v1].c.equals(p0))
                        break;
                    v1 = v1 + 1;
                }
                v0 = 1;
                break;
            default:
                return v0;
        }
    }

    public final boolean a() {
        v0 = this.a.G.k();
        if (v0 instanceof com.google.android.finsky.activities.myapps.t) {
            if (((com.google.android.finsky.activities.myapps.t)v0).ai != 0 && ((com.google.android.finsky.activities.myapps.t)v0).ai.e() == ((com.google.android.finsky.activities.myapps.t)v0).ai.i)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v0 = 1;
                return v0;
            }
        }
        v0 = 0;
        return v0;
    }

    public final boolean a(String p0) {
        v0 = 1;
        v2 = this.a.G.u();
        if (v2 == 0)
            return v0;
        switch (v2.a.f) {
            case 3:
                if (v2.N().k.equals(p0))
                    v0 = 0;
                break;
            case 4:
                if (!v2.Z())
                    return v0;
                v3 = v2.aa();
                v2 = 0;
                while (true) {
                    if (v2 >= v3.length)
                        return v0;
                    if (v3[v2].c.equals(p0))
                        break;
                    v2 = v2 + 1;
                }
                v0 = 0;
                break;
            default:
                return v0;
        }
    }

    public final boolean a(String p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        if (this.b(p0)) {
            this.a.a(p1, p2, p3, p0, p4);
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(String p0, String p1, String p2, String p3, com.google.android.finsky.d.w p4) {
        v0 = 0;
        v1 = this.a.G.u();
        if (v1 == 0)
            return v0;
        if (v1.a.c.equals(p0)) {
            this.a.a(p1, p2, p4);
            v0 = 1;
            return v0;
        }
        if (p3 == 0 || v1.a.w == 0)
            v1 = 0;
        else
            v1 = TextUtils.equals(Uri.parse(p3).getQueryParameter("doc"), Uri.parse(v1.a.w).getQueryParameter("doc"));
        if (v1 != 0) {
            this.a.a(p1, p2, p4);
            v0 = 1;
        }
        return v0;
    }

    public final boolean a(ArrayList p0, com.google.android.finsky.d.w p1) {
        this.a.startActivity(UninstallManagerActivityV2.a(p0, p1, 0));
        return 1;
    }

    public final boolean b(String p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4) {
        if (!this.b(p0))
            v0 = 0;
        else {
            ((com.google.android.finsky.at.b)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)((com.google.android.finsky.at.c)new com.google.android.finsky.at.c().c(p1)).b(p2)).d(2131953385)).e(2131951799)).a(0, p3, 0)).a(324, 0, 2904, 2903, p4)).a()).a(this.a.H_());
            v0 = 1;
        }
        return v0;
    }

}
