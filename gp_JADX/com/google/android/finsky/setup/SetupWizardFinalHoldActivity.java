package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.squareup.leakcanary.C7582R;

public class SetupWizardFinalHoldActivity extends Activity implements bx {
    public static final String f20615a = ((String) C0955b.dR.m28964b());
    public static final String f20616b = ((String) C0955b.dS.m28964b());
    public static final String f20617c = ((String) C0955b.dT.m28964b());
    public static final long f20618d = ((Long) C0955b.dU.m28964b()).longValue();
    public static final long f20619e = ((Long) C0955b.dV.m28964b()).longValue();
    public boolean f20620f;
    public boolean f20621g;
    public Handler f20622h = new Handler(Looper.getMainLooper());
    public long f20623i;
    public String f20624j;
    public cg f20625k;
    public Runnable f20626l = new cf(this);

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

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    @TargetApi(19)
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((ViewGroup) LayoutInflater.from(this).inflate(C7582R.layout.setup_wizard_final_hold, null));
        View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new cd(decorView));
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 5634);
        FifeImageView fifeImageView = (FifeImageView) findViewById(C7582R.id.setup_wizard_restore_header);
        this.f20625k = new cg((TextView) findViewById(C7582R.id.setup_wizard_title_ellipse));
        fifeImageView.setScaleType(ScaleType.CENTER_CROP);
        if (getResources().getBoolean(C7582R.bool.setup_wizard_use_tablet_graphic)) {
            str = f20617c;
        } else if (getResources().getConfiguration().orientation == 2) {
            str = f20616b;
        } else {
            str = f20615a;
        }
        C1473m.f7980a.ar().m9288a(fifeImageView, str, true);
        if (bundle == null) {
            m19110a(f20618d, null);
            return;
        }
        this.f20623i = bundle.getLong("watchdog_expiration_ms");
        this.f20624j = bundle.getString("watchdog_package");
        if (!m19111c()) {
            m19110a(this.f20623i - SystemClock.elapsedRealtime(), this.f20624j);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f20622h.removeCallbacks(this.f20626l);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("watchdog_expiration_ms", this.f20623i);
        bundle.putString("watchdog_package", this.f20624j);
    }

    protected void onResume() {
        super.onResume();
        m19111c();
        cg cgVar = this.f20625k;
        cgVar.f20921d = true;
        cgVar.f20919b.removeCallbacks(cgVar.f20922e);
        cgVar.f20919b.postDelayed(cgVar.f20922e, 500);
        if (!m19114a()) {
            m19112a(-1);
        }
    }

    protected void onPause() {
        super.onPause();
        cg cgVar = this.f20625k;
        cgVar.f20921d = false;
        cgVar.f20919b.removeCallbacks(cgVar.f20922e);
        m19115b();
    }

    final void m19112a(int i) {
        this.f20622h.removeCallbacks(this.f20626l);
        setResult(i);
        finish();
    }

    final boolean m19114a() {
        if (C1473m.f7980a.cK().mo3930a((bx) this)) {
            this.f20621g = true;
            return true;
        } else if (!VpaService.m19142a((bx) this)) {
            return false;
        } else {
            this.f20620f = true;
            return true;
        }
    }

    final void m19115b() {
        if (this.f20620f) {
            VpaService.m19142a(null);
            this.f20620f = false;
        }
        if (this.f20621g) {
            C1473m.f7980a.cK().mo3930a(null);
            this.f20621g = false;
        }
    }

    public final void mo3913a(int i, String str) {
        String str2 = "Final hold status change: listener=%s code=%d package=%s";
        Object[] objArr = new Object[3];
        objArr[0] = this.f20620f ? "VPA" : "Restore";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = str;
        FinskyLog.m21659a(str2, objArr);
        switch (i) {
            case 1:
                this.f20622h.post(new ce(this));
                return;
            case 2:
                m19110a(f20618d, null);
                return;
            case 3:
                if (this.f20624j == null || !this.f20624j.equals(str)) {
                    m19110a(f20619e, str);
                    return;
                }
                return;
            default:
                FinskyLog.m21669e("Unknown event code - finishing early", new Object[0]);
                m19112a(-1);
                return;
        }
    }

    private final void m19110a(long j, String str) {
        if (f20618d == -1) {
            FinskyLog.m21659a("Watchdog disabled", new Object[0]);
            return;
        }
        FinskyLog.m21659a("Set watchdog to %d sec (package %s)", Long.valueOf(j / 1000), str);
        this.f20623i = SystemClock.elapsedRealtime() + j;
        this.f20624j = str;
        this.f20622h.removeCallbacks(this.f20626l);
        this.f20622h.postDelayed(this.f20626l, j);
    }

    private final boolean m19111c() {
        if (f20618d == -1 || SystemClock.elapsedRealtime() <= this.f20623i) {
            return false;
        }
        this.f20626l.run();
        return true;
    }
}
