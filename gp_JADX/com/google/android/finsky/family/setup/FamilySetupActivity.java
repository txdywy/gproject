package com.google.android.finsky.family.setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bc.C1573p;
import com.google.android.finsky.bc.C1587s;
import com.google.android.finsky.bc.C1588u;
import com.google.android.finsky.bc.C1589w;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p106a.C0950c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p113v.C4695b;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.d;
import com.squareup.leakcanary.C7582R;

public class FamilySetupActivity extends C1036b implements C1587s, C1037e {
    public static final C1557b f16038G = C1473m.f7980a.aY();
    public C1589w f16039H;
    public boolean f16040I;
    public Runnable f16041J;

    public FamilySetupActivity() {
        C1473m.f7980a.aJ();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3982a bK = C1473m.f7980a.bK();
        if (bK.mo3875b()) {
            bK.mo3879f();
            finish();
        }
    }

    protected final void mo1249b(boolean z) {
        super.mo1249b(z);
        setRequestedOrientation(1);
        Intent intent = getIntent();
        if (intent.getStringExtra("debug") != null) {
            FinskyLog.m21659a(f16038G.mo2313c().mo2335p(), new Object[0]);
            finish();
        } else if (C2744a.m14792b((Activity) this)) {
            if (mo3309B() && intent.getParcelableExtra("purchase_intent") == null) {
                FinskyLog.m21669e("Music purchase intent hasn't been set", new Object[0]);
                finish();
            }
            this.f16039H = (C1589w) H_().mo283a("family_setup_sidecar");
            if (this.f16039H == null) {
                this.f16039H = new C1589w();
                H_().mo284a().mo328a(this.f16039H, "family_setup_sidecar").mo334c();
            }
        } else {
            FinskyLog.m21665c("Calling family setup from untrusted package", new Object[0]);
            finish();
        }
    }

    public final boolean mo3309B() {
        return "pfm".equals(getIntent().getStringExtra("family_app_id"));
    }

    protected void onStart() {
        super.onStart();
        this.f16040I = false;
    }

    protected final void z_() {
        super.z_();
        this.f16040I = false;
        if (this.f16041J != null) {
            this.f16041J.run();
            this.f16041J = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        this.f16040I = true;
    }

    protected void onStop() {
        super.onStop();
        this.f16040I = true;
    }

    public final void mo3312a(C1573p c1573p, boolean z) {
        Runnable c3100a = new C3100a(this, c1573p, z);
        if (this.f16040I) {
            this.f16041J = c3100a;
        } else {
            c3100a.run();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.f16039H != null) {
            C1588u d = this.f16039H.f8415d.mo2348d();
            d.f8406a[d.f8407b].mo2337a(i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        C1573p c1573p = (C1573p) H_().mo281a(16908290);
        if (c1573p == null || !c1573p.am()) {
            super.onBackPressed();
        }
    }

    public final C3748a y_() {
        return null;
    }

    public final C0950c mo1243l() {
        return null;
    }

    public final void mo1241c(String str) {
    }

    public final void mo1237a(int i, boolean z) {
    }

    public final void mo1236a(int i, int i2, boolean z) {
    }

    public final void mo1235a(int i, int i2, int i3, boolean z) {
    }

    public final void mo1242d(String str) {
    }

    public final void mo1246z() {
    }

    public final void mo1240c(int i) {
    }

    public final void mo1244m() {
        finish();
    }

    public final void mo3310C() {
        C1473m.f7980a.as().m10992a(this, "family_onboardingfamilylibrary_android_ota", false);
    }

    public final void mo3311a(View view, d dVar, ad adVar) {
        HeroGraphicView heroGraphicView = (HeroGraphicView) view.findViewById(C7582R.id.family_benefits_hero);
        heroGraphicView.m13591a(new Document(dVar.h));
        if ((dVar.a & 1) != 0) {
            heroGraphicView.m13597a(dVar.c, dVar.i, false, false, 0, adVar, false, null);
        }
    }

    public final void mo1238a(String str, String str2, C2495w c2495w) {
    }

    public final C4695b mo1234A() {
        return null;
    }

    public final void a_(C2495w c2495w) {
    }
}
