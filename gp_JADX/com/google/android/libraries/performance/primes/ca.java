package com.google.android.libraries.performance.primes;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6016h;
import com.google.android.libraries.performance.primes.p337d.C5987a;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

final class ca implements Runnable {
    public final /* synthetic */ bz f29864a;

    ca(bz bzVar) {
        this.f29864a = bzVar;
    }

    public final void run() {
        int i;
        C5987a c5987a;
        C5949a c5949a = this.f29864a.f29849a;
        int totalPss = C6016h.m27888a(this.f29864a.f29849a.f29613b).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        c5949a.f29842h.m27811a(totalPss);
        if (!ek.f30037a.f30040d) {
            long j = c5949a.f29845k.get();
            if (j == 0 || j + 86400000 <= SystemClock.elapsedRealtime()) {
                i = 1;
                if (i != 0) {
                    c5987a = c5949a.f29842h;
                    double d = c5949a.f29841g;
                    if (c5987a.f29935a.size() == 100 || c5987a.f29937c * ((double) ((Integer) Collections.min(c5987a.f29935a)).intValue()) > ((double) ((Integer) Collections.max(c5987a.f29935a)).intValue())) {
                        i = 0;
                    } else {
                        Integer[] numArr = (Integer[]) c5987a.f29935a.toArray(new Integer[c5987a.f29935a.size()]);
                        Arrays.sort(numArr);
                        i = numArr[Math.min(numArr.length + -1, (int) ((d * ((double) numArr.length)) - 1.0d))].intValue() <= totalPss ? 1 : 0;
                    }
                    if (i != 0 && c5949a.f29844j.tryLock()) {
                        c5949a.f29845k.set(SystemClock.elapsedRealtime());
                        try {
                            Debug.dumpHprofData(dl.m27819b(c5949a.f29613b).getAbsolutePath());
                            c5949a.f29843i = totalPss;
                            File b = dl.m27819b(c5949a.f29613b);
                            Object obj = c5949a.f29613b;
                            C5916a.m27406a(obj);
                            File cacheDir = obj.getCacheDir();
                            String d2 = C6016h.m27892d(obj);
                            if (d2 != null) {
                                d2 = d2.replaceAll("[^a-zA-Z0-9\\._]", "_");
                                d2 = d2.substring(0, Math.min(32, d2.length()));
                            } else {
                                d2 = "";
                            }
                            c5949a.m27754a(b, new File(cacheDir, new StringBuilder(String.valueOf(d2).length() + 11).append(d2).append("_primes_mhd").toString()));
                            dl.m27820c(c5949a.f29613b);
                        } catch (Throwable e) {
                            C5989do.m27826a("MiniHeapDumpMetric", "Failed to dump hprof data", e, new Object[0]);
                        } finally {
                            dl.m27820c(c5949a.f29613b);
                            c5949a.f29844j.unlock();
                        }
                        return;
                    }
                }
            }
        }
        i = 0;
        if (i != 0) {
            c5987a = c5949a.f29842h;
            double d3 = c5949a.f29841g;
            if (c5987a.f29935a.size() == 100) {
            }
            i = 0;
            if (i != 0) {
            }
        }
    }
}
