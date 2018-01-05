package com.google.android.finsky.installapi.p206a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.installapi.C3255f;
import com.google.android.finsky.installapi.C3272g;
import com.google.android.finsky.installapi.C3277l;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ax;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fr;

public final class C3256a implements C3255f {
    public final C1287h f16776a;
    public final C3300k f16777b;
    public final C2693e f16778c;
    public final C2471a f16779d;
    public final Handler f16780e = new Handler(Looper.getMainLooper());
    public final C4562a f16781f;

    public C3256a(C1287h c1287h, C3300k c3300k, C2693e c2693e, C2471a c2471a, C4562a c4562a) {
        this.f16776a = c1287h;
        this.f16777b = c3300k;
        this.f16778c = c2693e;
        this.f16779d = c2471a;
        this.f16781f = c4562a;
    }

    public final Bundle mo3398a(C3272g c3272g) {
        Object e;
        fp fpVar = null;
        if (!"org.chromium.arc.applauncher".equals(c3272g.f16842a)) {
            return null;
        }
        if (!((Boolean) C0955b.gB.m28964b()).booleanValue()) {
            return C3256a.m16370a("install_policy_disabled", null);
        }
        if (ax.m21774a("ro.boot.container") != 1) {
            return C3256a.m16370a("not_running_in_container", null);
        }
        if (!c3272g.f16844c.containsKey("android_id")) {
            return C3256a.m16370a("missing_android_id", null);
        }
        if (!c3272g.f16844c.containsKey("account_name")) {
            return C3256a.m16370a("missing_account", null);
        }
        String string = c3272g.f16844c.getString("account_name");
        long j = c3272g.f16844c.getLong("android_id");
        C1254c a = this.f16776a.mo2016a(string);
        if (a == null) {
            return C3256a.m16370a("unknown_account", null);
        }
        C0657w agVar = new ag();
        this.f16781f.m21190a(a, this.f16778c, j, agVar, agVar);
        try {
            fr frVar = (fr) C3277l.m16395a(agVar, "Unable to fetch backup document choices for ARC++");
            FinskyLog.m21659a("getBackupDocumentChoices for ARC++ returned with %d documents", Integer.valueOf(frVar.b.length));
            for (int i = 0; i < frVar.b.length; i++) {
                if (c3272g.f16843b.equals(frVar.b[i].e.f11833b)) {
                    fpVar = frVar.b[i];
                    break;
                }
            }
            if (fpVar == null) {
                return C3256a.m16370a("document_not_found", null);
            }
            this.f16780e.post(new C3257b(this, string, c3272g, fpVar));
            Bundle bundle = new Bundle();
            bundle.putInt("status_code", 0);
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
            FinskyLog.m21667d("Error during ARC++ install: %s", e);
            return C3256a.m16370a("network_error", e.getClass().getSimpleName());
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21667d("Error during ARC++ install: %s", e);
            return C3256a.m16370a("network_error", e.getClass().getSimpleName());
        }
    }

    private static Bundle m16370a(String str, String str2) {
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
