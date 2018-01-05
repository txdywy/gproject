package com.google.android.finsky.uninstall;

import android.content.pm.PackageStats;
import android.os.Environment;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;

final class C4600n implements C2332j {
    public final /* synthetic */ Iterator f23644a;
    public final /* synthetic */ C4597k f23645b;

    C4600n(C4597k c4597k, Iterator it) {
        this.f23645b = c4597k;
        this.f23644a = it;
    }

    public final void mo3143a(PackageStats packageStats) {
        C4604s c4604s = (C4604s) this.f23645b.f23635k.get(packageStats.packageName);
        if (c4604s == null) {
            FinskyLog.m21667d("%s not found in DocMap", packageStats.packageName);
        } else {
            c4604s.f23655c = packageStats.codeSize + packageStats.dataSize;
            if (Environment.isExternalStorageEmulated()) {
                c4604s.f23655c += (packageStats.externalObbSize + packageStats.externalDataSize) + packageStats.externalMediaSize;
                c4604s.f23655c += packageStats.externalCodeSize;
            }
        }
        this.f23645b.m21404a(this.f23644a, this);
    }

    public final void mo3144a(String str, int i, Exception exception) {
        this.f23645b.m21408c();
    }
}
