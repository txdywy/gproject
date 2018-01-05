package com.google.android.finsky.installapi.p206a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installapi.C3255f;
import com.google.android.finsky.installapi.C3272g;
import com.google.android.finsky.installapi.C3277l;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5107g;
import com.google.wireless.android.finsky.dfe.nano.fi;

public final class C3265j implements C3255f {
    public static final String[] f16811a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.canary", "com.chrome.dev"};
    public final Context f16812b;
    public final C1287h f16813c;
    public final String f16814d;
    public final C3300k f16815e;
    public final C1461c f16816f;
    public final C2471a f16817g;
    public final Handler f16818h = new Handler(Looper.getMainLooper());

    public C3265j(Context context, C1287h c1287h, String str, C3300k c3300k, C1461c c1461c, C2471a c2471a) {
        this.f16812b = context;
        this.f16813c = c1287h;
        this.f16814d = str;
        this.f16815e = c3300k;
        this.f16816f = c1461c;
        this.f16817g = c2471a;
    }

    public final Bundle mo3398a(C3272g c3272g) {
        Object e;
        if (((Boolean) C0955b.hQ.m28964b()).booleanValue()) {
            int i;
            String str = c3272g.f16842a;
            for (String equals : f16811a) {
                if (equals.equals(str)) {
                    i = 1;
                    break;
                }
            }
            i = 0;
            if (i == 0) {
                return null;
            }
        }
        if (!((Boolean) C0955b.hM.m28964b()).booleanValue() || this.f16816f.dj().mo2294a(12622452)) {
            return C3265j.m16378a("install_policy_disabled", null);
        }
        if (((Boolean) C0955b.hR.m28964b()).booleanValue()) {
            C5107g a = C5107g.m23705a(this.f16812b);
            this.f16812b.getPackageManager();
            if (!a.m23710a(c3272g.f16842a)) {
                FinskyLog.m21665c("WebAPK service failed Google signature verification.", new Object[0]);
                return C3265j.m16378a("not_google_signed", null);
            }
        }
        if (!c3272g.f16844c.containsKey("version_number")) {
            FinskyLog.m21665c("WebAPK service missing version_number.", new Object[0]);
            return C3265j.m16378a("missing_version_number", null);
        } else if (!c3272g.f16844c.containsKey("title")) {
            FinskyLog.m21665c("WebAPK service missing title.", new Object[0]);
            return C3265j.m16378a("missing_title", null);
        } else if (!c3272g.f16844c.containsKey("notification_intent")) {
            FinskyLog.m21665c("WebAPK service missing notification_intent.", new Object[0]);
            return C3265j.m16378a("missing_notification_intent", null);
        } else if (!c3272g.f16844c.containsKey("wam_token")) {
            FinskyLog.m21665c("WebAPK service missing wam_token.", new Object[0]);
            return C3265j.m16378a("missing_wam_token", null);
        } else if (TextUtils.isEmpty(c3272g.f16843b)) {
            FinskyLog.m21665c("WebAPK service missing package name", new Object[0]);
            return C3265j.m16378a("missing_package_name", null);
        } else {
            C1254c a2 = this.f16813c.mo2016a(this.f16814d);
            if (a2 == null) {
                FinskyLog.m21665c("WebAPK service unknown_account.", new Object[0]);
                return C3265j.m16378a("unknown_account", null);
            }
            C0660x agVar = new ag();
            a2.mo1640d(c3272g.f16843b, c3272g.f16844c.getString("wam_token"), agVar, (C0657w) agVar);
            try {
                fi fiVar = (fi) C3277l.m16395a(agVar, "Unable to resolve WebAPK");
                if (fiVar.d == 1) {
                    this.f16818h.post(new C3266k(this, c3272g, fiVar));
                    FinskyLog.m21659a("WebAPK service install success", new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putInt("status_code", 0);
                    return bundle;
                }
                FinskyLog.m21659a("Server returned error resolving WebAPK, status=%d", Integer.valueOf(fiVar.d));
                return C3265j.m16378a("error_resolving_webapk", null);
            } catch (VolleyError e2) {
                e = e2;
                FinskyLog.m21667d("Error during WebAPK install: %s", e);
                return C3265j.m16378a("network_error", e.getClass().getSimpleName());
            } catch (InterruptedException e3) {
                e = e3;
                FinskyLog.m21667d("Error during WebAPK install: %s", e);
                return C3265j.m16378a("network_error", e.getClass().getSimpleName());
            }
        }
    }

    private static Bundle m16378a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("reason", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("exception_type", str2);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("status_code", -4);
        bundle2.putBundle("error", bundle);
        return bundle2;
    }
}
