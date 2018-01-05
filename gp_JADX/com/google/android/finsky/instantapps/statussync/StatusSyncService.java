package com.google.android.finsky.instantapps.statussync;

import android.accounts.Account;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.PhenotypeUpdateService;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.instantapps.common.p217e.bf;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class StatusSyncService extends IntentService {
    public C3555i f17807a;
    public bf f17808b;

    public StatusSyncService() {
        super("StatusSyncService");
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3516a(this);
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
        if (((Boolean) C3549c.f17814b.m26938b()).booleanValue()) {
            PhenotypeUpdateService.m16867b(this);
            if (((Boolean) this.f17808b.mo5158a()).booleanValue()) {
                boolean a;
                OptInInfo optInInfo;
                boolean booleanExtra = intent.getBooleanExtra("KILL_IAO", false);
                C3555i c3555i = this.f17807a;
                C3547a c3547a = c3555i.f17820a;
                if (!C0327a.m1722b()) {
                    a = c3547a.m17125a();
                } else if (booleanExtra || Secure.getInt(c3547a.f17809a.getContentResolver(), "instant_apps_enabled", 1) == 0 || !((Boolean) C3549c.f17813a.m26938b()).booleanValue()) {
                    a = false;
                } else {
                    a = true;
                }
                FinskyLog.m21662b("Instant App enabled status=%b", Boolean.valueOf(a));
                C3550d c3550d = c3555i.f17823d;
                ConditionVariable conditionVariable = new ConditionVariable();
                AtomicReference atomicReference = new AtomicReference();
                c3550d.f17815a.m27186a(new C3551e(atomicReference, conditionVariable));
                if (conditionVariable.block(TimeUnit.SECONDS.toMillis(10))) {
                    optInInfo = (OptInInfo) atomicReference.get();
                } else {
                    Log.e("OptInInfoFetcher", "Timeout on GMSCore call to get optin account information.");
                    optInInfo = null;
                }
                if (optInInfo == null) {
                    FinskyLog.m21667d("Could not obtain account information.", new Object[0]);
                    return;
                }
                for (Account account : optInInfo.f26427c) {
                    FinskyLog.m21662b("Syncing Instant App enable status for account=%s", account);
                    if (account == null || TextUtils.isEmpty(account.name)) {
                        FinskyLog.m21667d("Empty account found, account=%s", account);
                    } else {
                        String str = account.name;
                        if (c3555i.f17822c.contains(C3555i.m17131a(str)) && a == c3555i.f17822c.getBoolean(C3555i.m17131a(str), false)) {
                            booleanExtra = false;
                        } else {
                            booleanExtra = true;
                        }
                        if (booleanExtra) {
                            try {
                                c3555i.f17821b.mo3550a(account.name, a);
                                c3555i.f17822c.edit().putBoolean(C3555i.m17131a(account.name), a).apply();
                            } catch (Throwable th) {
                                FinskyLog.m21660a(th, "Failed updateUserPrefs: Account=%s, EnableInstantApps=%b", account.toString(), Boolean.valueOf(a));
                            }
                        } else {
                            FinskyLog.m21659a("Instant App enable status is already in sync with WHAPI for user=%s", account.name);
                        }
                    }
                }
                return;
            }
            FinskyLog.m21659a("Status Sync flag is not enabled", new Object[0]);
            return;
        }
        FinskyLog.m21659a("enableWestinghouseSupport flag is not set. Skipping status sync.", new Object[0]);
    }
}
