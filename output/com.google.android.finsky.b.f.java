package com.google.android.finsky.b;

import android.app.ActivityManager;
import android.app.ActivityManager$RecentTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.r;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.cw;
import com.google.android.finsky.cv.a.e;
import com.google.android.finsky.cv.a.jv;
import com.google.android.finsky.cv.a.ko;
import com.google.android.finsky.cv.a.lm;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.adshield.UrlParseException;
import com.google.android.gms.ads.adshield.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.tm;
import com.google.wireless.android.a.a.a.a.bm;
import com.google.wireless.android.a.a.a.a.bn;
import com.google.wireless.android.a.a.a.a.bo;
import java.util.List;

public final class com.google.android.finsky.b.f
{

    public final com.google.android.finsky.b.i a;
    public final com.google.android.finsky.bg.k b;
    public final com.google.android.finsky.d.g c;
    public final com.google.android.finsky.ba.c d;
    public final com.google.android.finsky.ct.a e;
    public final com.android.volley.r f;

    f(com.google.android.finsky.b.i p0, com.google.android.finsky.bg.k p1, com.google.android.finsky.d.g p2, com.google.android.finsky.ba.c p3, com.google.android.finsky.ct.a p4, com.android.volley.r p5) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
    }

    public static CharSequence a(Document p0) {
        v0 = 0;
        if (p0.cy()) {
            if (p0.cy())
                v0 = p0.bg().al;
            v0 = v0.b;
        }
        else if (p0.cz()) {
            if (p0.cz())
                v0 = p0.bg().am;
            v0 = v0.b;
        }
        else if (p0.cA()) {
            if (p0.cA())
                v0 = p0.bg().an;
            v0 = v0.b;
        }
        else
            v0 = "";
        return v0;
    }

    public static String a(Context p0) {
        try {
            v1 = ((ActivityManager)p0.getSystemService("activity")).getRecentTasks(2, 0);
            if (v1.size() <= 0) {
                v0 = 0;
                return v0;
            }
            v0 = ((ActivityManager$RecentTaskInfo)v1.get(0)).baseIntent.getComponent().getPackageName();
            if (p0.getPackageName().equals(v0) && v1.size() > 1)
                v0 = ((ActivityManager$RecentTaskInfo)v1.get(1)).baseIntent.getComponent().getPackageName();
        }
        catch (Exception ex) {
            FinskyLog.a(ex, "Exception while getting package.", new Object[0]);
            v0 = 0;
            return v0;
        }
        return v0;
    }

    final String a(Context p0, String p1, String p2, String p3) {
        if (!this.e.a())
            return p1;
        try {
            v0 = this.e.a.a.b(com.google.android.gms.dynamic.d.a(Uri.parse(p1).buildUpon().appendQueryParameter("nb", p2).appendQueryParameter("dim", p3).build()), com.google.android.gms.dynamic.d.a(p0));
            if (v0 == 0)
                throw new UrlParseException();
        }
        catch (RemoteException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Error accessing AdShield: %s", v2);
            return p1;
        }
        catch (UrlParseException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Error parsing the ad click URL: %s", v2);
            return p1;
        }
        try {
            p1 = ((Uri)com.google.android.gms.dynamic.d.a(v0)).toString();
        }
        catch (RemoteException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Error accessing AdShield: %s", v2);
            return p1;
        }
        catch (UrlParseException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.d("Error parsing the ad click URL: %s", v2);
        }
        return p1;
    }

    public final void a(Context p0, Document p1, String p2, int p3, int p4, int p5) {
        v7 = 0;
        if (p1 != 0 && p1.aZ()) {
            v2 = p1.bg();
            if (v2 != 0 && v2.l != 0)
                v4 = v2.l.b;
            else
                v4 = 0;
            if (TextUtils.isEmpty(v4)) {
                v1 = new Object[1];
                v1[0] = p1.a.c;
                FinskyLog.d("Empty ad click URL for docid: %s", v1);
            }
            else {
                if (p5 == 7)
                    v7 = 3;
                else if (p5 == 5 || p5 == 6)
                    v7 = 4;
                else if (p5 == 1 || p5 == 4)
                    v7 = 5;
                else
                    FinskyLog.e("Unknown ad click source.", new Object[0]);
                this.e.a(p0, new com.google.android.finsky.b.g(this, p0, p1, v4, p2, this.b.a(p0, p3) + "x" + this.b.a(p0, p4), v7));
            }
        }
    }

    public final void a(View p0) {
        p0.setOnTouchListener(new com.google.android.finsky.b.j(this.a.e));
    }

    public final void a(com.google.android.finsky.d.w p0, Context p1, String p2, int p3, int p4) {
        v0 = this.e.a(p1, p2);
        if (v0 != 0) {
            v1 = new com.google.wireless.android.a.a.a.a.bm();
            if (v0 == 0)
                throw new NullPointerException();
            v1.a = v1.a | 1;
            v1.b = v0;
            v1.c = new com.google.wireless.android.a.a.a.a.bn();
            v1.c.a = v1.c.a | 1;
            v1.c.b = p4;
            v1.c.a = v1.c.a | 2;
            v1.c.c = p3;
            v0 = new com.google.android.finsky.d.c(538).a(p2);
            v0.a.U = v1;
            p0.a(v0);
            this.c.dc().a(0);
        }
    }

}
