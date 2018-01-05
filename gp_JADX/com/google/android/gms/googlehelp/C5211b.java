package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.C5106e;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.internal.af;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.googlehelp.internal.common.C5224g;
import java.io.File;

public final class C5211b {
    public final Activity f26294a;
    public final File f26295b;

    public C5211b(Activity activity) {
        this.f26295b = activity.getCacheDir();
        this.f26294a = activity;
    }

    public final void m23993a(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.googlehelp.HELP") && intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            int a = C5106e.m23700a(this.f26294a);
            if (a == 0) {
                C5022m a2 = C5215f.m23998a(this.f26294a);
                File file = this.f26295b;
                am.m23733a(a2.f26311k);
                af.m23724a(C5224g.f26310j.mo4661a(a2.f25591g, a2.f26311k, intent, file));
                return;
            }
            Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).f26280q);
            if (a != 7) {
                if ((this.f26294a.getPackageManager().queryIntentActivities(data, 0).size() > 0 ? 1 : 0) != 0) {
                    this.f26294a.startActivity(data);
                    return;
                }
            }
            C5106e.m23701a(a, this.f26294a);
            return;
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
