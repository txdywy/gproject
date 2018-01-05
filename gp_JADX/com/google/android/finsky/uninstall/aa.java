package com.google.android.finsky.uninstall;

import android.content.pm.PackageStats;
import android.os.Environment;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;

final class aa implements C2332j {
    public final /* synthetic */ Iterator f23440a;
    public final /* synthetic */ C4605t f23441b;

    aa(C4605t c4605t, Iterator it) {
        this.f23441b = c4605t;
        this.f23440a = it;
    }

    public final void mo3143a(PackageStats packageStats) {
        C4604s c4604s = (C4604s) this.f23441b.f23666k.get(packageStats.packageName);
        if (c4604s == null) {
            FinskyLog.m21667d("%s not found in DocMap", packageStats.packageName);
        } else {
            c4604s.f23655c = packageStats.codeSize + packageStats.dataSize;
            if (Environment.isExternalStorageEmulated()) {
                c4604s.f23655c += (packageStats.externalObbSize + packageStats.externalDataSize) + packageStats.externalMediaSize;
                c4604s.f23655c += packageStats.externalCodeSize;
            }
        }
        this.f23441b.m21417a(this.f23440a, this);
    }

    public final void mo3144a(String str, int i, Exception exception) {
        this.f23441b.m21426h();
    }
}
