package com.google.android.finsky.by.p132a;

import android.util.Log;
import com.google.android.finsky.by.C2227g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C2202d extends C2201e {
    public final int f11023d;
    public final Map f11024e = new HashMap();

    public C2202d(int i, C2203m c2203m) {
        super(c2203m);
        this.f11023d = i;
    }

    public final synchronized boolean mo2782a(C2227g c2227g) {
        return this.f11024e.containsKey(c2227g);
    }

    public synchronized void mo2804d(C2227g c2227g) {
        super.mo2804d(c2227g);
        this.f11024e.put(c2227g, c2227g);
    }

    public final C2227g mo2784b(C2227g c2227g) {
        return (C2227g) this.f11024e.get(c2227g);
    }

    public synchronized void mo2788c(C2227g c2227g) {
        super.mo2788c(c2227g);
        this.f11024e.remove(c2227g);
    }

    public final synchronized int mo2792g() {
        return this.f11024e.size();
    }

    public synchronized Iterator iterator() {
        return this.f11024e.values().iterator();
    }

    public synchronized void mo2802a() {
        super.mo2802a();
        this.f11024e.clear();
    }

    public String toString() {
        return String.format("{backend=%d, num entries=%d}", new Object[]{Integer.valueOf(this.f11023d), Integer.valueOf(mo2792g())});
    }

    public void mo2803a(String str, String str2) {
        Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str2).length() + 12) + String.valueOf(str).length()).append(str2).append("Library (").append(str).append(") {").toString());
        Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str2).length() + 21).append(str2).append("  backend=").append(this.f11023d).toString());
        Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str2).length() + 24).append(str2).append("  entryCount=").append(this.f11024e.size()).toString());
        Log.d("FinskyLibrary", String.valueOf(str2).concat("}"));
    }
}
