package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.dynamic.C5164d;
import com.google.android.gms.internal.al;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.xw;
import com.google.android.gms.internal.xx;
import com.google.android.gms.internal.xy;
import com.google.android.gms.internal.xz;
import com.google.android.gms.internal.zf;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class AdActivity extends Activity {
    public zf f25237a;

    private final void m22909a() {
        if (this.f25237a != null) {
            try {
                this.f25237a.mo4963g();
            } catch (Throwable e) {
                ap.m24194c("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f25237a.mo4954a(i, i2, intent);
        } catch (Throwable e) {
            ap.m24194c("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f25237a != null) {
                z = this.f25237a.mo4964h();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f25237a.mo4956a(C5164d.m23906a((Object) configuration));
        } catch (Throwable e) {
            ap.m24194c("Failed to wrap configuration.", e);
        }
    }

    protected void onCreate(Bundle bundle) {
        al alVar;
        Object b;
        boolean z = true;
        boolean z2 = false;
        super.onCreate(bundle);
        xw xwVar = xz.m25997a().f27733d;
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = getIntent();
        if (intent.hasExtra(str)) {
            z2 = intent.getBooleanExtra(str, false);
        } else {
            ap.m24191b("useClientJar flag not found in activity intent extras.");
        }
        xx xyVar = new xy(xwVar, this);
        if (!z2) {
            alVar = xz.m25997a().f27732c;
            if (!al.m24183a(this)) {
                ap.m24188a("Google Play Services is not available");
                z2 = true;
            }
        }
        alVar = xz.m25997a().f27732c;
        int c = al.m24185c(this);
        al alVar2 = xz.m25997a().f27732c;
        if (c <= al.m24184b(this)) {
            z = z2;
        }
        if (z) {
            b = xyVar.m25993b();
            if (b == null) {
                b = xyVar.m25994c();
            }
        } else {
            b = xyVar.m25994c();
            if (b == null) {
                b = xyVar.m25993b();
            }
        }
        this.f25237a = (zf) b;
        if (this.f25237a == null) {
            ap.m24193c("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f25237a.mo4955a(bundle);
        } catch (Throwable e) {
            ap.m24194c("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4962f();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4960d();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4953a();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4959c();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4958b(bundle);
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4957b();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f25237a != null) {
                this.f25237a.mo4961e();
            }
        } catch (Throwable e) {
            ap.m24194c("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m22909a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m22909a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m22909a();
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }
}
