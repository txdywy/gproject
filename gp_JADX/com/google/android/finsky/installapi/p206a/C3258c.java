package com.google.android.finsky.installapi.p206a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.installapi.C3255f;
import com.google.android.finsky.installapi.C3272g;
import com.google.android.finsky.installapi.C3277l;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5107g;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.Arrays;
import java.util.HashSet;

public final class C3258c implements C3255f {
    public final Context f16786a;
    public final C1254c f16787b;
    public final C3300k f16788c;
    public final C5107g f16789d;
    public final Handler f16790e = new Handler(Looper.getMainLooper());
    public final C2471a f16791f;
    public final C2320a f16792g;
    public final C1461c f16793h;

    public C3258c(Context context, C1254c c1254c, C3300k c3300k, C5107g c5107g, C2471a c2471a, C2320a c2320a, C1461c c1461c) {
        this.f16786a = context;
        this.f16787b = c1254c;
        this.f16788c = c3300k;
        this.f16789d = c5107g;
        this.f16791f = c2471a;
        this.f16792g = c2320a;
        this.f16793h = c1461c;
    }

    public final Bundle mo3398a(C3272g c3272g) {
        if (!((Boolean) C0955b.hU.m28964b()).booleanValue()) {
            FinskyLog.m21665c("Device owner install policy is disabled.", new Object[0]);
            return null;
        } else if (new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.hV.m28964b()))).contains(c3272g.f16842a)) {
            if (((Boolean) C0955b.hW.m28964b()).booleanValue()) {
                C5107g c5107g = this.f16789d;
                this.f16786a.getPackageManager();
                if (!c5107g.m23710a(c3272g.f16842a)) {
                    FinskyLog.m21665c("Device owner install policy failed Google signature verification.", new Object[0]);
                    return null;
                }
            }
            return m16373b(c3272g);
        } else {
            FinskyLog.m21665c("Calling package should be whitelisted.", new Object[0]);
            return null;
        }
    }

    private final Bundle m16373b(C3272g c3272g) {
        C0660x agVar = new ag();
        this.f16787b.mo1605a(C1283d.m7689a(Arrays.asList(new String[]{c3272g.f16843b})), true, agVar, (C0657w) agVar);
        try {
            bx bxVar = (bx) C3277l.m16395a(agVar, "Expected non empty response.");
            if (bxVar.a == null || bxVar.a.length == 0) {
                return C3258c.m16372a("permanent");
            }
            cv cvVar = bxVar.a[0].b;
            if (cvVar == null || cvVar.f12112s == null || cvVar.f12112s.f12048a == null || cvVar.f12108o == null) {
                FinskyLog.m21665c("Couldn't fetch enough details for app", new Object[0]);
                return C3258c.m16372a("permanent");
            } else if (cvVar.f12108o.f12161b != 1) {
                FinskyLog.m21665c("App is not available", new Object[0]);
                return C3258c.m16372a("permanent");
            } else {
                C3654j c3654j = new C3654j(this.f16793h);
                c3654j.m17262a(this.f16792g.mo2854a(c3272g.f16843b)).m17264a(cvVar.f12112s.f12048a);
                Bundle bundle;
                if (c3654j.m17269e()) {
                    FinskyLog.m21659a("App is already up-to-date.", new Object[0]);
                    bundle = new Bundle();
                    bundle.putInt("status_code", -5);
                    return bundle;
                }
                this.f16790e.post(new C3259d(this, c3272g, cvVar));
                bundle = new Bundle();
                bundle.putInt("status_code", 0);
                return bundle;
            }
        } catch (InterruptedException e) {
            return C3258c.m16372a("transient");
        } catch (VolleyError e2) {
            return C3258c.m16372a("transient");
        }
    }

    private static Bundle m16372a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("reason", str);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("status_code", -4);
        bundle2.putBundle("error", bundle);
        return bundle2;
    }
}
