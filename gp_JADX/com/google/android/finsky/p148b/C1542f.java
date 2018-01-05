package com.google.android.finsky.p148b;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.C0700r;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.C2431e;
import com.google.android.finsky.cv.p177a.cw;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.cv.p177a.lm;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.adshield.C4891a;
import com.google.android.gms.ads.adshield.UrlParseException;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5164d;
import com.google.wireless.android.a.a.a.a.bm;
import com.google.wireless.android.a.a.a.a.bn;
import java.util.List;

public final class C1542f {
    public final C1545i f8288a;
    public final C1611k f8289b;
    public final C1463g f8290c;
    public final C1461c f8291d;
    public final C2412a f8292e;
    public final C0700r f8293f;

    public C1542f(C1545i c1545i, C1611k c1611k, C1463g c1463g, C1461c c1461c, C2412a c2412a, C0700r c0700r) {
        this.f8288a = c1545i;
        this.f8289b = c1611k;
        this.f8290c = c1463g;
        this.f8291d = c1461c;
        this.f8292e = c2412a;
        this.f8293f = c0700r;
    }

    public final void m8973a(Context context, Document document, String str, int i, int i2, int i3) {
        int i4 = 0;
        if (document != null && document.aZ()) {
            Object obj;
            ko bg = document.bg();
            if (bg == null || bg.f12933l == null) {
                obj = null;
            } else {
                obj = bg.f12933l.f12821b;
            }
            if (TextUtils.isEmpty(obj)) {
                FinskyLog.m21667d("Empty ad click URL for docid: %s", document.f14885a.f12096c);
                return;
            }
            String str2 = this.f8289b.m9274a(context, i) + "x" + this.f8289b.m9274a(context, i2);
            if (i3 == 7) {
                i4 = 3;
            } else if (i3 == 5 || i3 == 6) {
                i4 = 4;
            } else if (i3 == 1 || i3 == 4) {
                i4 = 5;
            } else {
                FinskyLog.m21669e("Unknown ad click source.", new Object[0]);
            }
            this.f8292e.m12119a(context, new C1543g(this, context, document, obj, str, str2, i4));
        }
    }

    public final void m8975a(C2495w c2495w, Context context, String str, int i, int i2) {
        String a = this.f8292e.m12118a(context, str);
        if (a != null) {
            bm bmVar = new bm();
            if (a == null) {
                throw new NullPointerException();
            }
            bmVar.a |= 1;
            bmVar.b = a;
            bmVar.c = new bn();
            bn bnVar = bmVar.c;
            bnVar.a |= 1;
            bnVar.b = i2;
            bnVar = bmVar.c;
            bnVar.a |= 2;
            bnVar.c = i;
            C2474c a2 = new C2474c(538).m13236a(str);
            a2.f13342a.f31695U = bmVar;
            c2495w.m13367a(a2);
            this.f8290c.dc().m13329a(null);
        }
    }

    public final void m8974a(View view) {
        view.setOnTouchListener(new C1546j(this.f8288a.f8311e));
    }

    final String m8972a(Context context, String str, String str2, String str3) {
        if (this.f8292e.m12120a()) {
            try {
                Object build = Uri.parse(str).buildUpon().appendQueryParameter("nb", str2).appendQueryParameter("dim", str3).build();
                C4891a c4891a = this.f8292e.f11713a;
                C5161a b = c4891a.f25238a.mo4875b(C5164d.m23906a(build), C5164d.m23906a((Object) context));
                if (b == null) {
                    throw new UrlParseException();
                }
                str = ((Uri) C5164d.m23907a(b)).toString();
            } catch (RemoteException e) {
                FinskyLog.m21667d("Error accessing AdShield: %s", e);
            } catch (UrlParseException e2) {
                FinskyLog.m21667d("Error parsing the ad click URL: %s", e2);
            }
        }
        return str;
    }

    public static String m8971a(Context context) {
        try {
            List recentTasks = ((ActivityManager) context.getSystemService("activity")).getRecentTasks(2, 0);
            if (recentTasks.size() > 0) {
                String packageName = ((RecentTaskInfo) recentTasks.get(0)).baseIntent.getComponent().getPackageName();
                if (!context.getPackageName().equals(packageName) || recentTasks.size() <= 1) {
                    return packageName;
                }
                return ((RecentTaskInfo) recentTasks.get(1)).baseIntent.getComponent().getPackageName();
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Exception while getting package.", new Object[0]);
        }
        return null;
    }

    public static CharSequence m8970a(Document document) {
        lm lmVar = null;
        if (document.cy()) {
            C2431e c2431e;
            if (document.cy()) {
                c2431e = document.bg().al;
            }
            return c2431e.f12239b;
        } else if (document.cz()) {
            cw cwVar;
            if (document.cz()) {
                cwVar = document.bg().am;
            }
            return cwVar.f12121b;
        } else if (!document.cA()) {
            return "";
        } else {
            if (document.cA()) {
                lmVar = document.bg().an;
            }
            return lmVar.f13025b;
        }
    }
}
