package com.google.android.finsky.verifier.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.p102c.C0925g;
import java.util.List;

public final class bg {
    public static bg f24447a;
    public Context f24448b;
    public C1500a f24449c;
    public C3851f f24450d;
    public C4569e f24451e;
    public C2909c f24452f;
    public bh f24453g;
    public bl f24454h;
    public Object f24455i;

    private bg() {
        ((ac) C3947d.m18649a(ac.class)).mo1985a(this);
    }

    public static synchronized bg m22121a() {
        bg bgVar;
        synchronized (bg.class) {
            if (f24447a == null) {
                f24447a = new bg();
            }
            bgVar = f24447a;
        }
        return bgVar;
    }

    final synchronized void m22127b() {
        this.f24453g = null;
        this.f24455i = null;
        if (this.f24454h != null) {
            this.f24450d.mo3819b(this.f24454h);
            this.f24454h = null;
        }
    }

    final synchronized bh m22128c() {
        if (!(this.f24455i == null || this.f24455i == C0925g.m5651a(this.f24448b.getContentResolver()))) {
            m22127b();
        }
        if (this.f24453g == null) {
            if (m22125m()) {
                this.f24453g = new bk(this);
            } else if (VERSION.SDK_INT < 19) {
                if (m22123k()) {
                    this.f24453g = new bq(this);
                } else {
                    this.f24453g = new bo(this);
                }
            } else if (VERSION.SDK_INT >= 21) {
                this.f24453g = m22122j();
                if (this.f24453g == null) {
                    if (m22123k()) {
                        this.f24453g = new bp(this);
                    } else {
                        this.f24453g = new bn(this);
                    }
                }
            } else if (m22123k()) {
                this.f24453g = new bp(this);
            } else {
                this.f24453g = new bn(this);
            }
            String str = (String) C0954a.f5813I.m5760a();
            if (!C0954a.f5813I.m5764b()) {
                if (this.f24453g.mo4349b() == 0) {
                    int b = new bm(this).mo4349b();
                    if (b != 0) {
                        this.f24453g.mo4348a(b, null);
                    }
                }
                C0954a.f5813I.m5763a(this.f24453g.mo4347a());
                this.f24453g.mo4352e();
            } else if (!this.f24453g.mo4347a().equals(str)) {
                bh bmVar;
                if (str.equals("PreferenceConsent")) {
                    bmVar = new bm(this);
                } else if (str.equals("PreferenceConsentWithExport")) {
                    bmVar = new bn(this);
                } else if (str.equals("PreferenceConsentWithExportPreKK")) {
                    bmVar = new bo(this);
                } else if (str.equals("SecureSettingsConsent")) {
                    bmVar = new bp(this);
                } else if (str.equals("SecureSettingsConsentPreKK")) {
                    bmVar = new bq(this);
                } else if (str.equals("DeviceWideSystemUserConsent")) {
                    bmVar = new bj(this);
                } else if (str.equals("DeviceWideSecondaryUserConsent")) {
                    bmVar = new bi(this);
                } else if (str.equals("GooglerConsent")) {
                    bmVar = new bk(this);
                } else {
                    FinskyLog.m21667d("Invalid verify apps consent model: %s", str);
                    bmVar = new bm(this);
                }
                int b2 = bmVar.mo4349b();
                bmVar.mo4353f();
                this.f24453g.mo4348a(b2, null);
                C0954a.f5813I.m5763a(this.f24453g.mo4347a());
            }
            this.f24455i = C0925g.m5651a(this.f24448b.getContentResolver());
            this.f24454h = new bl(this);
            this.f24450d.mo3818a(this.f24454h);
        }
        return this.f24453g;
    }

    private final bh m22122j() {
        if (VERSION.SDK_INT < 21 || !m22124l()) {
            return null;
        }
        if (this.f24452f.f15463a.mo3195d()) {
            return new bj(this);
        }
        if (!m22132g()) {
            try {
                Global.getInt(this.f24448b.getContentResolver(), "package_verifier_user_consent");
            } catch (SettingNotFoundException e) {
                return null;
            }
        }
        return new bi(this);
    }

    public final boolean m22129d() {
        return !((Boolean) C0955b.bz.m28964b()).booleanValue() || m22128c().mo4349b() == 1;
    }

    public final boolean m22130e() {
        if (!m22129d()) {
            return false;
        }
        if (VERSION.SDK_INT >= 17) {
            if (Global.getInt(this.f24448b.getContentResolver(), "upload_apk_enable", 0) > 0) {
                return true;
            }
            return false;
        } else if (Secure.getInt(this.f24448b.getContentResolver(), "upload_apk_enable", 0) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void m22126a(boolean z) {
        m22128c().mo4348a(z ? 1 : -1, Boolean.valueOf(z));
    }

    private final boolean m22123k() {
        int intValue = ((Integer) C0955b.bD.m28964b()).intValue();
        if (intValue == -1) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f24448b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return packageInfo != null && packageInfo.versionCode >= intValue;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    private final boolean m22124l() {
        int intValue = ((Integer) C0955b.bF.m28964b()).intValue();
        if (intValue == -1) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f24448b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return packageInfo != null && packageInfo.versionCode >= intValue;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @TargetApi(21)
    protected final boolean m22131f() {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        UserManager userManager = (UserManager) this.f24448b.getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    @TargetApi(21)
    protected final boolean m22132g() {
        if (C0327a.m1722b()) {
            return m22131f();
        }
        UserManager userManager = (UserManager) this.f24448b.getSystemService("user");
        if (userManager == null) {
            return false;
        }
        List<UserHandle> c = this.f24452f.f15463a.mo3194c();
        if (c == null) {
            return false;
        }
        for (UserHandle userRestrictions : c) {
            Bundle userRestrictions2 = userManager.getUserRestrictions(userRestrictions);
            if (userRestrictions2 != null && userRestrictions2.getBoolean("ensure_verify_apps", false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m22133h() {
        for (Account account : ((AccountManager) this.f24448b.getSystemService("account")).getAccountsByType("com.google")) {
            if (account.name.toLowerCase().endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    private final boolean m22125m() {
        return ((Boolean) C0955b.bG.m28964b()).booleanValue() && this.f24449c.m8824d() && m22133h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m22134i() {
        /*
        r2 = this;
        r0 = 1;
        monitor-enter(r2);
        r1 = r2.f24453g;	 Catch:{ all -> 0x001d }
        if (r1 != 0) goto L_0x0015;
    L_0x0006:
        r1 = r2.m22125m();	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x000c:
        r1 = new com.google.android.finsky.verifier.impl.bk;	 Catch:{ all -> 0x001d }
        r1.<init>(r2);	 Catch:{ all -> 0x001d }
        r2.f24453g = r1;	 Catch:{ all -> 0x001d }
    L_0x0013:
        monitor-exit(r2);
        return r0;
    L_0x0015:
        r1 = r2.f24453g;	 Catch:{ all -> 0x001d }
        r1 = r1 instanceof com.google.android.finsky.verifier.impl.bk;	 Catch:{ all -> 0x001d }
        if (r1 != 0) goto L_0x0013;
    L_0x001b:
        r0 = 0;
        goto L_0x0013;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.bg.i():boolean");
    }
}
