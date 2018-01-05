package com.google.android.finsky.tos;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.instantapps.metrics.C3533f;
import com.google.android.finsky.instantapps.p220f.C3491p;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.C5260a;
import com.google.android.gms.instantapps.C5263b;
import java.util.concurrent.TimeUnit;

final class C4568d extends AsyncTask {
    public final C5263b f23354a;
    public final String f23355b;
    public final Context f23356c;
    public final Activity f23357d;
    public final C2495w f23358e;

    C4568d(C5263b c5263b, String str, Context context, Activity activity, C2495w c2495w) {
        this.f23354a = c5263b;
        this.f23355b = str;
        this.f23356c = context;
        this.f23357d = activity;
        this.f23358e = c2495w;
    }

    private final Void m21198a() {
        C5058o b = new C5089p(this.f23356c).m23647a(C5260a.f26391c).m23652b();
        try {
            FinskyLog.m21662b("Attempting to connect to the InstantApps API...", new Object[0]);
            if (b.mo4542a(5, TimeUnit.SECONDS).m23264b()) {
                FinskyLog.m21662b("Connection to the InstantApps API succeeded, calling optIn()...", new Object[0]);
                if (((Status) this.f23354a.mo4676a(b, this.f23355b).mo4488a(3, TimeUnit.SECONDS)).m23271a()) {
                    FinskyLog.m21662b("InstantApps optIn succeeded.", new Object[0]);
                    C3491p.m17061a(this.f23357d, "PHONESKY_TOS_INSTANT_APPS_OPT_IN_SUCCESS");
                    this.f23358e.m13367a(new C2474c(3306));
                    C3533f.m17116a(this.f23357d, 2207);
                } else {
                    FinskyLog.m21662b("InstantApps optIn failed, status = %s", (Status) this.f23354a.mo4676a(b, this.f23355b).mo4488a(3, TimeUnit.SECONDS));
                    this.f23358e.m13367a(new C2474c(3307));
                    C3533f.m17116a(this.f23357d, 2208);
                }
            } else {
                FinskyLog.m21662b("Connection to the InstantApps API failed. OptIn not recorded.", new Object[0]);
                C3533f.m17116a(this.f23357d, 2212);
            }
            b.mo4559g();
            FinskyLog.m21662b("Disconnected from the InstantApps API.", new Object[0]);
            return null;
        } catch (Throwable th) {
            b.mo4559g();
            FinskyLog.m21662b("Disconnected from the InstantApps API.", new Object[0]);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21198a();
    }
}
