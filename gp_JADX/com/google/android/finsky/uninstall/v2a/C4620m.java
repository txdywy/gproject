package com.google.android.finsky.uninstall.v2a;

import android.content.pm.PackageStats;
import android.os.Environment;
import com.google.android.finsky.co.C2332j;
import java.util.Iterator;

final class C4620m implements C2332j {
    public final /* synthetic */ Iterator f23786a;
    public final /* synthetic */ C4613f f23787b;

    C4620m(C4613f c4613f, Iterator it) {
        this.f23787b = c4613f;
        this.f23786a = it;
    }

    public final void mo3143a(PackageStats packageStats) {
        am amVar = (am) this.f23787b.f23768k.get(packageStats.packageName);
        amVar.f23736c = packageStats.codeSize + packageStats.dataSize;
        if (Environment.isExternalStorageEmulated()) {
            amVar.f23736c += (packageStats.externalObbSize + packageStats.externalDataSize) + packageStats.externalMediaSize;
            amVar.f23736c += packageStats.externalCodeSize;
        }
        this.f23787b.m21541a(this.f23786a, this);
    }

    public final void mo3144a(String str, int i, Exception exception) {
        this.f23787b.m21550i();
    }
}
