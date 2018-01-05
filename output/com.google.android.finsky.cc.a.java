package com.google.android.finsky.cc;

import com.google.android.finsky.z.d;
import com.google.android.gms.peerdownloadmanager.a;
import com.google.android.gms.peerdownloadmanager.b;
import com.google.android.gms.peerdownloadmanager.d.f;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class com.google.android.finsky.cc.a
{

    static {
        TimeUnit.DAYS.toMillis(7);
        TimeUnit.MINUTES.toSeconds(5);
    }

    a(com.google.android.finsky.z.d p0) {
        new HashMap();
        new com.google.android.gms.peerdownloadmanager.b();
        new com.google.android.gms.peerdownloadmanager.a();
        new com.google.android.gms.peerdownloadmanager.d.f();
        p0.a(Executors.newSingleThreadExecutor());
    }

}
