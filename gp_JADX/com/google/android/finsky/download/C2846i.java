package com.google.android.finsky.download;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.StrictMode;
import com.google.android.finsky.utils.C4674e;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class C2846i implements C2844g {
    public final HandlerThread f15281a;
    public final Handler f15282b;
    public Map f15283c = null;
    public final C2850m f15284d;
    public final C2843f f15285e;

    public C2846i(C2843f c2843f, C2850m c2850m) {
        this.f15285e = c2843f;
        this.f15284d = c2850m;
        this.f15281a = C4674e.m21808a("Download progress manager runner");
        this.f15281a.start();
        this.f15282b = new Handler(this.f15281a.getLooper());
        this.f15282b.post(new C2847j(this));
    }

    public final void mo3169a() {
        m15052b();
    }

    final void m15052b() {
        StrictMode.noteSlowCall("DownloadProgressManager.onDownloadProgress");
        if (this.f15283c != null) {
            Set hashSet = new HashSet(this.f15283c.keySet());
        } else {
            Object hashSet2 = new HashSet();
        }
        List<C2845h> a = this.f15285e.mo3186a(null, this);
        Map hashMap = new HashMap(a.size());
        for (C2845h c2845h : a) {
            hashMap.put(c2845h.f15276a, c2845h);
        }
        hashMap = Collections.unmodifiableMap(hashMap);
        if (this.f15283c == null || !this.f15283c.equals(hashMap)) {
            Object hashSet3;
            this.f15283c = hashMap;
            if (this.f15283c != null) {
                hashSet3 = new HashSet(this.f15283c.keySet());
            } else {
                hashSet3 = new HashSet();
            }
            hashSet.removeAll(hashSet3);
            new Handler(Looper.getMainLooper()).post(new C2849l(this.f15284d, hashSet, hashSet3, hashMap));
        }
    }
}
