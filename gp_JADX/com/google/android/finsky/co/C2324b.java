package com.google.android.finsky.co;

import android.content.pm.PackageStats;
import android.os.Process;
import android.os.UserHandle;

final /* synthetic */ class C2324b implements Runnable {
    public final C2323a f11442a;
    public final String f11443b;
    public final C2332j f11444c;

    C2324b(C2323a c2323a, String str, C2332j c2332j) {
        this.f11442a = c2323a;
        this.f11443b = str;
        this.f11444c = c2332j;
    }

    public final void run() {
        C2323a c2323a = this.f11442a;
        String str = this.f11443b;
        C2332j c2332j = this.f11444c;
        UserHandle myUserHandle = Process.myUserHandle();
        try {
            Object invoke = c2323a.f11434d.invoke(c2323a.f11433c, new Object[]{C2323a.f11431a, str, myUserHandle});
            if (invoke == null) {
                c2323a.f11440j.post(new C2327e(c2332j, str));
                return;
            }
            PackageStats packageStats = new PackageStats(str);
            try {
                packageStats.codeSize = ((Long) c2323a.f11435e.invoke(invoke, new Object[0])).longValue();
                packageStats.dataSize = ((Long) c2323a.f11436f.invoke(invoke, new Object[0])).longValue();
                packageStats.cacheSize = ((Long) c2323a.f11437g.invoke(invoke, new Object[0])).longValue();
                c2323a.f11440j.post(new C2329g(c2332j, packageStats));
            } catch (Exception e) {
                c2323a.f11440j.post(new C2328f(c2332j, str, e));
            }
        } catch (Exception e2) {
            c2323a.f11440j.post(new C2326d(c2332j, str, e2));
        }
    }
}
