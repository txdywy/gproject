package com.google.android.finsky.billing.setupwizard;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0233w;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.finsky.dfe.nano.aq;
import java.util.concurrent.ExecutionException;

public class SetupWizardPaymentsEnablementService extends IntentService {
    public final C2471a f10666a = C1473m.f7980a.aR();

    public SetupWizardPaymentsEnablementService() {
        super("SuwPaymentEnableService");
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

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected void onHandleIntent(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("accountName");
            if (TextUtils.isEmpty(stringExtra)) {
                FinskyLog.m21667d("No account received", new Object[0]);
                return;
            }
            FinskyLog.m21659a("Processing account", new Object[0]);
            C2495w a = this.f10666a.m13182a(intent.getExtras(), this.f10666a.m13185b(stringExtra));
            if (m10958a(a, C1473m.f7980a.mo2112b(stringExtra))) {
                FinskyLog.m21659a("Enabling Payments optional step", new Object[0]);
                m10957a(PaymentsOptionalStepShimActivity.class, true);
                a.m13367a(new C2474c(368));
            }
            FinskyLog.m21659a("Disabling component", new Object[0]);
            m10957a(SetupWizardPaymentsEnablementService.class, false);
            C0233w.m1138a(intent);
        } finally {
            C0233w.m1138a(intent);
        }
    }

    private static boolean m10958a(C2495w c2495w, C1254c c1254c) {
        c2495w.m13367a(new C2474c(369));
        ag agVar = new ag();
        c1254c.mo1621b(agVar, agVar);
        try {
            aq aqVar = (aq) agVar.get();
            m10956a(c2495w, null);
            FinskyLog.m21659a("hasUserHasValidInstrument=%b getUserHasValidInstrument=%b", Boolean.valueOf(aqVar.d()), Boolean.valueOf(aqVar.b));
            return aqVar.d() && !aqVar.b;
        } catch (Throwable e) {
            FinskyLog.m21665c("InterruptedException %s", e);
            m10956a(c2495w, e);
            return false;
        } catch (ExecutionException e2) {
            FinskyLog.m21665c("ExecutionException cause=%s", e2.getCause());
            m10956a(c2495w, e2.getCause());
            return false;
        }
    }

    private static void m10956a(C2495w c2495w, Throwable th) {
        int i = 1;
        C2474c c2474c = new C2474c(370);
        if (th == null) {
            c2474c.m13239a(true);
        } else {
            if (!(th instanceof VolleyError)) {
                i = 2;
            }
            c2474c.m13239a(false).m13210a(i).m13238a(th);
        }
        c2495w.m13367a(c2474c);
    }

    private final void m10957a(Class cls, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, cls), i, 1);
    }
}
