package com.google.android.finsky.p225k;

import android.content.pm.PackageStats;
import android.os.Environment;
import android.os.Process;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.p111d.C2495w;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class C3643d implements Runnable {
    public final CountDownLatch f18013a = new CountDownLatch(1);
    public final C2824a f18014b;
    public final C2495w f18015c;
    public final String f18016d;
    public final /* synthetic */ C3640a f18017e;

    C3643d(C3640a c3640a, C2824a c2824a, C2495w c2495w, String str) {
        this.f18017e = c3640a;
        this.f18014b = c2824a;
        this.f18015c = c2495w;
        this.f18016d = str;
    }

    public final void run() {
        Process.setThreadPriority(10);
        PackageStats a = this.f18014b.m14948a(this.f18015c, Arrays.asList(new String[]{this.f18016d}));
        if (a != null) {
            Map map = this.f18017e.f18006a;
            String str = a.packageName;
            long currentTimeMillis = System.currentTimeMillis();
            long j = a.codeSize + a.dataSize;
            if (Environment.isExternalStorageEmulated()) {
                j += (a.externalCodeSize + a.externalObbSize) + (a.externalDataSize + a.externalMediaSize);
            }
            map.put(str, new C3644e(currentTimeMillis, j));
            C3640a c3640a = this.f18017e;
            String str2 = this.f18016d;
            long j2 = a.codeSize;
            j2 = a.dataSize;
            if (Environment.isExternalStorageEmulated()) {
                j2 = a.externalCodeSize;
                j2 = a.externalObbSize;
                j2 = a.externalDataSize;
                j2 = a.externalMediaSize;
            }
            Runnable c3642c = new C3642c(c3640a, str2);
            if (this.f18017e.f18010e) {
                this.f18017e.f18008c.post(c3642c);
            } else {
                c3642c.run();
            }
        }
        this.f18013a.countDown();
    }
}
