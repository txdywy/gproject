package com.google.android.finsky.bq;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import java.util.List;

protected final class com.google.android.finsky.bq.f extends AsyncTask
{

    public final Context a;
    public final Intent b;
    public final com.google.android.finsky.bq.e c;
    public final com.google.android.finsky.d.w d;

    f(Context p0, String p1, com.google.android.finsky.bq.e p2, com.google.android.finsky.d.w p3) {
        AsyncTask();
        this.a = p0;
        this.c = p2;
        this.d = p3;
        this.b = new Intent("android.intent.action.VIEW");
        this.b.setData(Uri.parse(p1));
        this.b.addCategory("android.intent.category.BROWSABLE");
        this.b.addCategory("android.intent.category.DEFAULT");
        this.b.setFlags(268435456);
    }

    protected final Object doInBackground(Object[] p0) {
        v3 = this.a.getPackageManager().queryIntentActivities(this.b, 0);
        v1 = 0;
        while (v1 < v3.size()) {
            if (((ResolveInfo)v3.get(v1)).isInstantAppAvailable != 0) {
                Log.d("InstantAppsLauncher", "launch!: found ri!");
                v0 = Boolean.valueOf(1);
                return v0;
            }
            v1 = v1 + 1;
        }
        v1 = String.valueOf(this.b);
        Log.d("InstantAppsLauncher", (String.valueOf(v1).length() + 28) + "no launch!: no ri found for:" + v1);
        this.d.a(new com.google.android.finsky.d.c(2905));
        v0 = Boolean.valueOf(0);
        return v0;
    }

    protected final void onPostExecute(Object p0) {
        if (((Boolean)p0).booleanValue())
            this.c.a(this.b);
        else
            this.c.a(0);
    }

}
