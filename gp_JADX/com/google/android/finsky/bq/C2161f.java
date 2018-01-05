package com.google.android.finsky.bq;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import java.util.List;

final class C2161f extends AsyncTask {
    public final Context f10917a;
    public final Intent f10918b = new Intent("android.intent.action.VIEW");
    public final C2160e f10919c;
    public final C2495w f10920d;

    C2161f(Context context, String str, C2160e c2160e, C2495w c2495w) {
        this.f10917a = context;
        this.f10919c = c2160e;
        this.f10920d = c2495w;
        this.f10918b.setData(Uri.parse(str));
        this.f10918b.addCategory("android.intent.category.BROWSABLE");
        this.f10918b.addCategory("android.intent.category.DEFAULT");
        this.f10918b.setFlags(268435456);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f10919c.mo3099a(this.f10918b);
        } else {
            this.f10919c.mo3099a(null);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        List queryIntentActivities = this.f10917a.getPackageManager().queryIntentActivities(this.f10918b, 0);
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (((ResolveInfo) queryIntentActivities.get(i)).isInstantAppAvailable) {
                Log.d("InstantAppsLauncher", "launch!: found ri!");
                return Boolean.valueOf(true);
            }
        }
        String valueOf = String.valueOf(this.f10918b);
        Log.d("InstantAppsLauncher", new StringBuilder(String.valueOf(valueOf).length() + 28).append("no launch!: no ri found for:").append(valueOf).toString());
        this.f10920d.m13367a(new C2474c(2905));
        return Boolean.valueOf(false);
    }
}
