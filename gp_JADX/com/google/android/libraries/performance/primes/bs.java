package com.google.android.libraries.performance.primes;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.libraries.performance.primes.metriccapture.C6012d;
import com.google.android.libraries.performance.primes.metriccapture.C6016h;
import d.a.a.a.a.a.al;
import d.a.a.a.a.a.bp;
import java.util.List;

final class bs implements Runnable {
    public final /* synthetic */ al f29810a = null;
    public final /* synthetic */ String f29811b = null;
    public final /* synthetic */ int f29812c;
    public final /* synthetic */ boolean f29813d;
    public final /* synthetic */ String f29814e;
    public final /* synthetic */ bq f29815f;

    bs(bq bqVar, int i, String str) {
        this.f29815f = bqVar;
        this.f29812c = i;
        this.f29813d = false;
        this.f29814e = str;
    }

    public final void run() {
        al a;
        C5949a c5949a;
        String str;
        boolean z;
        int i;
        String str2;
        List<RunningAppProcessInfo> runningAppProcesses;
        if (this.f29815f.f29807i) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        al alVar = this.f29810a;
        if (this.f29810a == null && this.f29815f.f29806h != null) {
            try {
                a = this.f29815f.f29806h.mo5254a();
            } catch (RuntimeException e) {
                C5989do.m27827a("MemoryMetricService", "Metric metric extension provider failed.", new Object[0]);
            }
            if (this.f29815f.f29805g) {
                c5949a = this.f29815f;
                str = this.f29811b;
                z = this.f29813d;
                i = this.f29812c;
                str2 = this.f29814e;
                bp bpVar = new bp();
                bpVar.a = C6012d.m27881a(i, Process.myPid(), null, c5949a.f29613b, str2, c5949a.f29808j);
                c5949a.m27579a(str, z, bpVar, a);
                return;
            }
            c5949a = this.f29815f;
            str = this.f29811b;
            z = this.f29813d;
            i = this.f29812c;
            str2 = this.f29814e;
            runningAppProcesses = C6016h.m27888a(c5949a.f29613b).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                CharSequence packageName = c5949a.f29613b.getPackageName();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (VERSION.SDK_INT <= 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        bp bpVar2 = new bp();
                        bpVar2.a = C6012d.m27881a(i, runningAppProcessInfo.pid, runningAppProcessInfo.processName, c5949a.f29613b, str2, c5949a.f29808j);
                        c5949a.m27579a(str, z, bpVar2, a);
                    }
                }
            }
        }
        a = alVar;
        if (this.f29815f.f29805g) {
            c5949a = this.f29815f;
            str = this.f29811b;
            z = this.f29813d;
            i = this.f29812c;
            str2 = this.f29814e;
            bp bpVar3 = new bp();
            bpVar3.a = C6012d.m27881a(i, Process.myPid(), null, c5949a.f29613b, str2, c5949a.f29808j);
            c5949a.m27579a(str, z, bpVar3, a);
            return;
        }
        c5949a = this.f29815f;
        str = this.f29811b;
        z = this.f29813d;
        i = this.f29812c;
        str2 = this.f29814e;
        runningAppProcesses = C6016h.m27888a(c5949a.f29613b).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            CharSequence packageName2 = c5949a.f29613b.getPackageName();
            for (RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
                if (VERSION.SDK_INT <= 22) {
                }
                bp bpVar22 = new bp();
                bpVar22.a = C6012d.m27881a(i, runningAppProcessInfo2.pid, runningAppProcessInfo2.processName, c5949a.f29613b, str2, c5949a.f29808j);
                c5949a.m27579a(str, z, bpVar22, a);
            }
        }
    }
}
