package com.google.android.finsky.cc;

import com.google.android.finsky.p108z.C4817d;
import com.google.android.gms.peerdownloadmanager.C5349a;
import com.google.android.gms.peerdownloadmanager.C5352b;
import com.google.android.gms.peerdownloadmanager.p293d.C5484f;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class C2257a {
    public C2257a(C4817d c4817d) {
        HashMap hashMap = new HashMap();
        C5352b c5352b = new C5352b();
        C5349a c5349a = new C5349a();
        C5484f c5484f = new C5484f();
        c4817d.mo4399a(Executors.newSingleThreadExecutor());
    }

    static {
        TimeUnit.DAYS.toMillis(7);
        TimeUnit.MINUTES.toSeconds(5);
    }
}
