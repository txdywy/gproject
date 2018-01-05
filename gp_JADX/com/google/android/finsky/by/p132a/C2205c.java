package com.google.android.finsky.by.p132a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.dfemodel.C2726q;
import java.util.HashSet;
import java.util.Set;

public final class C2205c extends C2202d {
    public Set f11032a = new HashSet();
    public Set f11033b = new HashSet();
    public Set f11034c = new HashSet();

    public C2205c(C2203m c2203m) {
        super(3, c2203m);
    }

    public final synchronized void mo2804d(C2227g c2227g) {
        int i = c2227g.f11105l;
        String str = c2227g.f11104k;
        if (C2726q.m14753b(i)) {
            this.f11032a.add(str);
        } else if (C2726q.m14750a(i)) {
            this.f11033b.add(str);
        } else if (!TextUtils.isEmpty(c2227g.f11111r)) {
            this.f11034c.add(str);
        }
        super.mo2804d(c2227g);
    }

    public final synchronized void mo2788c(C2227g c2227g) {
        int i = c2227g.f11105l;
        String str = c2227g.f11104k;
        if (C2726q.m14753b(i)) {
            this.f11032a.remove(str);
        } else if (C2726q.m14750a(i)) {
            this.f11033b.remove(str);
        } else if (!TextUtils.isEmpty(c2227g.f11111r)) {
            this.f11034c.remove(str);
        }
        super.mo2788c(c2227g);
    }

    public final C2230i m11573a(String str) {
        C2227g b = mo2784b(new C2227g(null, C2229h.f11120a, 3, str, 11, 1));
        if (b == null) {
            b = mo2784b(new C2227g(null, C2229h.f11120a, 3, str, 66, 1));
        }
        return (C2230i) b;
    }

    public final synchronized void mo2802a() {
        this.f11032a.clear();
        this.f11033b.clear();
        this.f11034c.clear();
        super.mo2802a();
    }

    public final String toString() {
        return String.format("{num apps=%d}", new Object[]{Integer.valueOf(mo2792g())});
    }

    public final void mo2803a(String str, String str2) {
        Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str2).length() + 15) + String.valueOf(str).length()).append(str2).append("AppLibrary (").append(str).append(") {").toString());
        Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str2).length() + 24).append(str2).append("  totalCount=").append(mo2792g()).toString());
        Log.d("FinskyLibrary", new StringBuilder(String.valueOf(str2).length() + 32).append(str2).append("  subscriptionsCount=").append(this.f11032a.size()).toString());
        Log.d("FinskyLibrary", String.valueOf(str2).concat("}"));
    }
}
