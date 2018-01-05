package com.google.android.finsky.activities;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.inlinedetails.C1039i;
import com.google.android.finsky.inlinedetails.C3251f;
import com.google.android.finsky.inlinedetails.C3254j;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

public class MarketDeepLinkHandlerActivity extends InlineAppDetailsDialog implements C1039i {
    public Intent f6383X;
    public C3254j f6384Y;
    public C3251f f6385Z;
    public boolean aa;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.getBoolean("is_content_view_created")) {
            m6116H();
        }
    }

    public void onPostResume() {
        super.onPostResume();
        if (this.aa) {
            this.aa = false;
            FinskyLog.m21665c("Continue deferred inline flow", new Object[0]);
            mo1283D();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_content_view_created", m6115G());
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f6385Z.m16365a(this.f6384Y);
    }

    protected final C2495w mo1289y() {
        return C1473m.f7980a.dd().m13375a("deep_link");
    }

    protected final void mo1281B() {
        if (C1473m.f7980a.dj().mo2294a(12629616)) {
            C1473m.f7980a.aP().m13350a(this.f6316C, 1722);
        }
        super.mo1281B();
    }

    protected final boolean mo1282C() {
        C1461c c1461c = C1473m.f7980a;
        C0988c c0988c = C1473m.f7980a;
        C2162a bn = C1473m.f7980a.bn();
        C1473m.f7980a.aJ();
        C3646a I = C1473m.f7980a.mo2029I();
        C1473m.f7980a.mo2027G();
        this.f6385Z = new C3251f(this, new ej(this, c1461c, c0988c, bn, I, C1473m.f7980a.cx(), C1473m.f7980a.cW()), this, C1473m.f7980a, C1473m.f7980a.mo2029I(), C1473m.f7980a.mo2037Q(), C1473m.f7980a.mo2035O(), C1473m.f7980a.bK(), C1473m.f7980a.bo(), this.f6316C);
        this.f6385Z.m16364a(this.S);
        return true;
    }

    protected final void mo1283D() {
        if (this.f6327x) {
            this.aa = true;
            FinskyLog.m21665c("Activity state was saved; inline flow deferred.", new Object[0]);
            return;
        }
        super.mo1283D();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f6385Z.m16366a(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    protected final boolean mo1284E() {
        return (this.f6384Y == null || !this.f6384Y.f16769a || this.f6383X == null) ? false : true;
    }

    protected final String mo1285F() {
        if (mo1284E()) {
            return this.f6383X.getAction();
        }
        return null;
    }

    protected final String mo1286e(String str) {
        if (mo1284E()) {
            return this.f6383X.getStringExtra(str);
        }
        return null;
    }

    protected final boolean mo1287f(String str) {
        if (mo1284E()) {
            return this.f6383X.getBooleanExtra(str, false);
        }
        return false;
    }

    protected final Bundle mo1288g(String str) {
        if (mo1284E()) {
            return this.f6383X.getBundleExtra(str);
        }
        return null;
    }

    public final void mo1254a(C3254j c3254j) {
        this.f6384Y = c3254j;
        this.f6383X = c3254j.m16368a();
        this.f6316C.m13376a(this.f6383X);
        if (c3254j.f16769a) {
            m6118J();
            mo1283D();
            return;
        }
        startActivity(this.f6383X);
        finish();
    }
}
