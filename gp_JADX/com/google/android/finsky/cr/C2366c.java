package com.google.android.finsky.cr;

import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.C4674e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class C2366c implements C2364b {
    public static final ExecutorService f11616b = Executors.newSingleThreadExecutor(new C4674e());
    public final C2364b f11617a;
    public Map f11618c = null;
    public List f11619d = new ArrayList();
    public final Handler f11620e;

    public C2366c(C2364b c2364b) {
        this.f11617a = c2364b;
        this.f11620e = new Handler(Looper.getMainLooper());
    }

    public final void m12009a(Runnable runnable) {
        C2366c.m12006c();
        if (m12012b()) {
            this.f11620e.post(runnable);
            return;
        }
        this.f11619d.add(runnable);
        if (this.f11619d.size() == 1) {
            f11616b.submit(new C2369f(this));
        }
    }

    public final boolean m12012b() {
        return this.f11618c != null;
    }

    public final void mo2869a(String str) {
        m12007d();
        this.f11618c.remove(str);
        f11616b.submit(new C2367d(this, str));
    }

    public final Map mo2868a() {
        m12007d();
        if (this.f11618c.isEmpty()) {
            return Collections.emptyMap();
        }
        Map hashMap = new HashMap();
        for (String str : this.f11618c.keySet()) {
            hashMap.put(str, Collections.unmodifiableMap((Map) this.f11618c.get(str)));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final void mo2870a(String str, Map map) {
        m12007d();
        this.f11618c.put(str, map);
        f11616b.submit(new C2368e(this, str, new HashMap(map)));
    }

    private static void m12006c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Tried to access data off of the main thread.");
        }
    }

    private final void m12007d() {
        if (m12012b()) {
            C2366c.m12006c();
            return;
        }
        throw new IllegalStateException("Tried to access data before initializing.");
    }
}
