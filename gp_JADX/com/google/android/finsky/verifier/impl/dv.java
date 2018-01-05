package com.google.android.finsky.verifier.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import java.util.List;

final class dv implements C4748z {
    public final List f24641a;
    public final /* synthetic */ dk f24642b;

    public dv(dk dkVar, List list) {
        this.f24642b = dkVar;
        this.f24641a = list;
    }

    public final void mo4371a(boolean[] zArr) {
        PackageManager packageManager = this.f24642b.f24599c.getPackageManager();
        for (int i = 0; i < this.f24641a.size(); i++) {
            if (zArr[i]) {
                PackageInfo packageInfo = null;
                try {
                    packageInfo = packageManager.getPackageInfo(((C4699c) this.f24641a.get(i)).f24154m.f24169b, 0);
                } catch (NameNotFoundException e) {
                }
                if (packageInfo != null) {
                    CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(packageManager);
                    if (loadLabel == null) {
                        loadLabel = packageInfo.packageName;
                    }
                    loadLabel.toString();
                    return;
                }
            }
        }
    }
}
