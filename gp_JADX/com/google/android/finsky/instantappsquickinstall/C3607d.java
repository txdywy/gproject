package com.google.android.finsky.instantappsquickinstall;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

final class C3607d extends AsyncTask {
    public final ComponentName f17937a;
    public final C1461c f17938b;
    public final PackageManager f17939c;
    public final C2495w f17940d;
    public boolean f17941e;
    public boolean f17942f;

    C3607d(Context context, C1461c c1461c, C2495w c2495w) {
        this.f17938b = c1461c;
        this.f17940d = c2495w;
        this.f17939c = context.getPackageManager();
        this.f17937a = new ComponentName(context, InstantAppsInstallEntryActivity.class);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (this.f17942f != this.f17941e) {
            int i;
            FinskyLog.m21659a("Changing IA Quick Install Enabled State to %s", Boolean.valueOf(this.f17941e));
            if (this.f17941e) {
                i = 565;
            } else {
                i = 566;
            }
            this.f17940d.m13371a(new C2474c(i).f13342a, null);
            PackageManager packageManager = this.f17939c;
            ComponentName componentName = this.f17937a;
            if (this.f17941e) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z = true;
        this.f17941e = this.f17938b.dj().mo2294a(12639218);
        if (this.f17939c.getComponentEnabledSetting(this.f17937a) != 1) {
            z = false;
        }
        this.f17942f = z;
        return null;
    }
}
