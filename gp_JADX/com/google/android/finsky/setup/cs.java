package com.google.android.finsky.setup;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import android.support.v4.p028a.C0216d;
import android.view.View;
import com.android.setupwizardlib.C0605a;
import com.caverock.androidsvg.C0722q;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.layout.SetupWizardIllustration;
import com.google.android.finsky.layout.bs;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class cs {
    public static final String f20952a = ((String) C0955b.dX.m28964b());
    public static final String f20953b = ((String) C0955b.dY.m28964b());
    public static final String f20954c = ((String) C0955b.dP.m28964b());
    public static final String f20955d = ((String) C0955b.dQ.m28964b());

    public static boolean m19402a() {
        return VERSION.SDK_INT >= 21;
    }

    public static SetupWizardNavBar m19397a(Activity activity) {
        SetupWizardNavBar c = m19407c(activity);
        if (!m19402a()) {
            return null;
        }
        if (VERSION.SDK_INT < 25) {
            return c;
        }
        if (c == null) {
            return null;
        }
        c.f20628a.setVisibility(8);
        return null;
    }

    private static SetupWizardNavBar m19407c(Activity activity) {
        return (SetupWizardNavBar) activity.getFragmentManager().findFragmentById(C7582R.id.navigation_bar);
    }

    public static void m19401a(Activity activity, boolean z) {
        if (!m19402a()) {
            return;
        }
        if (z) {
            activity.overridePendingTransition(C7582R.anim.slide_back_in, C7582R.anim.slide_back_out);
        } else {
            activity.overridePendingTransition(C7582R.anim.slide_next_in, C7582R.anim.slide_next_out);
        }
    }

    public static void m19399a(Activity activity, SetupWizardParams setupWizardParams, int i, boolean z) {
        m19400a(activity, setupWizardParams, z);
        if (m19402a()) {
            int i2;
            m19405b(activity, setupWizardParams, false);
            m19407c(activity).f20630c.setEnabled(z);
            String a = m19398a((Context) activity, i);
            switch (i) {
                case 0:
                    FinskyLog.m21665c("Payment illustration context shouldn't need a fallback image.", new Object[0]);
                    i2 = C7582R.raw.ic_play_prism_clr_32dp;
                    break;
                case 1:
                    i2 = C7582R.raw.ic_play_prism_clr_32dp;
                    break;
                case 2:
                    if (VERSION.SDK_INT < 25) {
                        i2 = C7582R.raw.ic_play_prism_clr_32dp;
                        break;
                    } else {
                        i2 = C7582R.raw.ic_phone_android_googblue_32dp;
                        break;
                    }
                case 3:
                    if (VERSION.SDK_INT < 25) {
                        i2 = C7582R.raw.ic_play_prism_clr_32dp;
                        break;
                    } else {
                        i2 = C7582R.raw.ic_restore_googblue_32dp;
                        break;
                    }
                default:
                    FinskyLog.m21665c("Unknown illustration context: " + i, new Object[0]);
                    i2 = C7582R.raw.ic_play_prism_clr_32dp;
                    break;
            }
            SetupWizardIllustration setupWizardIllustration = (SetupWizardIllustration) activity.findViewById(C7582R.id.illustration);
            if (setupWizardIllustration.f18377e != null) {
                setupWizardIllustration.f18377e.setVisibility(0);
                if (a == null) {
                    C0722q a2 = C0722q.m4784a(setupWizardIllustration.getContext(), i2);
                    a2.m4792a(C0722q.m4779a(setupWizardIllustration.getResources()));
                    setupWizardIllustration.f18377e.setImageDrawable(new com.caverock.androidsvg.cs(a2));
                    return;
                }
                C1473m.f7980a.ar().m9288a(setupWizardIllustration.f18377e, a, true);
                setupWizardIllustration.f18377e.setOnLoadedListener(new bs(setupWizardIllustration));
            }
        }
    }

    public static void m19400a(Activity activity, SetupWizardParams setupWizardParams, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (!m19402a() && setupWizardParams.f21124a) {
            systemUiVisibility |= 37158912;
            z = false;
        }
        if (z) {
            systemUiVisibility &= -4194305;
        } else {
            systemUiVisibility |= 4194304;
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    public static void m19405b(Activity activity, SetupWizardParams setupWizardParams, boolean z) {
        int i;
        View findViewById = activity.findViewById(16908290);
        if (setupWizardParams.f21125b) {
            i = 4610;
            activity.getWindow().addFlags(Integer.MIN_VALUE);
        } else {
            i = 0;
            activity.getWindow().clearFlags(Integer.MIN_VALUE);
        }
        findViewById.setSystemUiVisibility(i);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ct(findViewById, i));
        if (z && setupWizardParams.f21125b && ((Boolean) C0955b.dZ.m28964b()).booleanValue()) {
            cu cuVar = new cu(activity);
        }
    }

    public static boolean m19406b() {
        return VERSION.SDK_INT >= 25;
    }

    public static String m19398a(Context context, int i) {
        boolean z = context.getResources().getBoolean(C7582R.bool.setup_wizard_use_tablet_graphic);
        switch (i) {
            case 0:
                return z ? f20953b : f20952a;
            case 1:
            case 2:
            case 3:
                if (m19406b()) {
                    return null;
                }
                return z ? f20955d : f20954c;
            default:
                FinskyLog.m21665c("Unknown illustration context: " + i, new Object[0]);
                if (m19406b()) {
                    return null;
                }
                return z ? f20955d : f20954c;
        }
    }

    public static boolean m19403a(Context context) {
        return C0327a.m1721a() && context.getResources().getBoolean(C7582R.bool.setup_wizard_enable_payments_optional_step);
    }

    @SuppressLint({"NewApi"})
    public static void m19404b(Activity activity) {
        if (m19406b()) {
            View findViewById = activity.findViewById(C7582R.id.suw_play_frame);
            if (findViewById != null) {
                findViewById.setBackground(new C0605a(C0216d.m1116c(activity, C7582R.color.setup_wizard_background_pattern_tint)));
            }
        }
    }
}
