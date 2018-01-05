package com.google.android.finsky.instantappsquickinstall;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0257x;
import android.support.v4.app.Fragment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(21)
public class InstantAppsInstallProgressActivity extends C1036b implements C3603k {
    public C3611j f17926G;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0257x c0257x = (C0257x) getLastNonConfigurationInstance();
        C3611j c3611j = (C3611j) (c0257x != null ? c0257x.f1621a : null);
        if (c3611j == null) {
            c3611j = new C3611j((QuickInstallState) getIntent().getParcelableExtra("quickInstallState"), C1473m.f7980a.bw(), new C2471a(C1473m.f7980a.az()).m13179a(getIntent().getExtras()));
        }
        this.f17926G = c3611j;
        Fragment c3613m = new C3613m();
        H_().mo284a().mo331b(16908290, c3613m).mo334c();
        C1003o c1003o = this.f17926G;
        if (c1003o.f17951h) {
            int i = 0;
        } else {
            c1003o.f17947d = c3613m;
            c1003o.f17950g = this;
            c1003o.f17945b.mo3481a(c1003o);
            if (c1003o.f17947d == null) {
                FinskyLog.m21662b("asked to bind views while fragment is missing, this isn't correct but will no-op", new Object[0]);
            } else {
                C3614n c3614n = new C3614n(c1003o.f17944a.f17927a.f14885a.f12100g, c1003o.f17944a.f17927a.aj().f11860f, c1003o.f17944a.f17927a.aj().f11863i);
                C3613m c3613m2 = c1003o.f17947d;
                c3613m2.f17962f = c3614n;
                c3613m2.mo968W();
            }
            c1003o.m17216b();
            if (!c1003o.f17953j) {
                c1003o.f17946c.m13370a(new C2488p().m13342a(new C2473o(332)));
                c1003o.f17953j = true;
            }
            boolean z = true;
        }
        if (i == 0) {
            finishAndRemoveTask();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f17926G.m17214a();
    }

    public final Object T_() {
        this.f17926G.m17214a();
        return this.f17926G;
    }

    public final void mo3552b(Intent intent) {
        if (intent != null) {
            startActivity(intent);
        }
        finishAndRemoveTask();
    }
}
