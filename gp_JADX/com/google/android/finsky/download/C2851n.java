package com.google.android.finsky.download;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ad;
import com.google.android.finsky.utils.bb;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class C2851n implements C2850m, C2106x {
    public final Map f15292a = new LinkedHashMap();
    public final Map f15293b = new HashMap();
    public final List f15294c = new LinkedList();
    public final C2843f f15295d;
    public final C3849a f15296e;
    public C2846i f15297f;
    public Uri f15298g = null;
    public int f15299h = -1;

    public C2851n(C2843f c2843f, C3849a c3849a) {
        this.f15295d = c2843f;
        this.f15296e = c3849a;
        this.f15294c.add(this);
    }

    public final void mo3173a(C2839b c2839b) {
        C2839b c2839b2;
        bb.m21791a();
        if (c2839b.mo3166p() != 0) {
            FinskyLog.m21669e("Added download %s (url=%s) while in state %d", c2839b, c2839b.mo3153c(), Integer.valueOf(c2839b.mo3166p()));
        }
        String c = c2839b.mo3153c();
        if (this.f15293b.containsKey(c)) {
            c2839b2 = (C2839b) this.f15293b.get(c);
        } else if (this.f15292a.containsKey(c)) {
            c2839b2 = (C2839b) this.f15292a.get(c);
        } else {
            c2839b2 = null;
        }
        if (c2839b2 != null) {
            FinskyLog.m21669e("Added download %s (url=%s) while existing found %s (url=%s)", c2839b, c2839b.mo3153c(), c2839b2, c2839b2.mo3153c());
        }
        FinskyLog.m21659a("Download %s added to DownloadQueue", c2839b);
        this.f15292a.put(c2839b.mo3153c(), c2839b);
        if (this.f15297f == null) {
            this.f15297f = new C2846i(this.f15295d, this);
        }
        mo3174a(c2839b, 1);
        m15066b();
    }

    public final void mo3178b(C2839b c2839b) {
        bb.m21791a();
        String c = c2839b.mo3153c();
        FinskyLog.m21659a("Download queue recovering download %s.", c2839b);
        mo3174a(c2839b, 2);
        this.f15293b.put(c, c2839b);
        if (this.f15297f == null) {
            this.f15297f = new C2846i(this.f15295d, this);
        }
    }

    public final C2839b mo3171a(String str, String str2) {
        bb.m21791a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("empty packageName");
        }
        for (C2839b c2839b : this.f15292a.values()) {
            if (str.equals(c2839b.mo3147a()) && ad.m21692a(str2, c2839b.mo3151b())) {
                return c2839b;
            }
        }
        for (C2839b c2839b2 : this.f15293b.values()) {
            if (str.equals(c2839b2.mo3147a()) && ad.m21692a(str2, c2839b2.mo3151b())) {
                return c2839b2;
            }
        }
        return null;
    }

    private final void m15065a(int i, C2839b c2839b) {
        Runnable c2853o;
        C2845h m = c2839b == null ? null : c2839b.mo3163m();
        int q = c2839b == null ? -1 : c2839b.mo3167q();
        switch (i) {
            case 0:
                c2853o = new C2853o(this, i, c2839b);
                break;
            case 1:
                c2853o = new C2854p(this, i, c2839b);
                break;
            case 2:
                c2853o = new C2855q(this, i, c2839b, m);
                break;
            case 3:
                c2853o = new C2856r(this, i, c2839b);
                break;
            case 4:
                c2853o = new C2858t(this, i, c2839b);
                break;
            case 5:
                c2853o = new C2857s(this, i, c2839b, q);
                break;
            default:
                throw new IllegalStateException("Bad listener type.");
        }
        new Handler(Looper.getMainLooper()).post(c2853o);
    }

    public final void mo3176a(C2106x c2106x) {
        bb.m21791a();
        this.f15294c.add(c2106x);
    }

    public final void removeListener(C2106x c2106x) {
        bb.m21791a();
        this.f15294c.remove(c2106x);
    }

    public final C2839b mo3170a(Uri uri) {
        bb.m21791a();
        if (TextUtils.isEmpty(uri != null ? uri.toString() : null)) {
            return null;
        }
        for (C2839b c2839b : this.f15293b.values()) {
            if (uri.equals(c2839b.mo3162l())) {
                return c2839b;
            }
        }
        return null;
    }

    private final void m15067i(C2839b c2839b) {
        FinskyLog.m21659a("Download %s removed from DownloadQueue", c2839b);
        String c = c2839b.mo3153c();
        if (this.f15292a.containsKey(c)) {
            this.f15292a.remove(c);
            return;
        }
        this.f15293b.remove(c2839b.mo3153c());
        m15066b();
    }

    public final void mo3180c(C2839b c2839b) {
        bb.m21791a();
        if (c2839b != null && !c2839b.mo3165o()) {
            if (c2839b.mo3166p() == 2) {
                this.f15295d.mo3187a(c2839b.mo3162l());
            }
            mo3174a(c2839b, 4);
        }
    }

    public final void mo3181d(C2839b c2839b) {
        FinskyLog.m21659a("%s: onNotificationClicked", c2839b);
        m15065a(0, c2839b);
    }

    public final void mo3175a(C2839b c2839b, C2845h c2845h) {
        if (!ad.m21692a(c2845h, c2839b.mo3163m())) {
            int i;
            c2839b.mo3150a(c2845h);
            if (c2845h.f15279d == this.f15299h && this.f15298g != null && this.f15298g.equals(c2839b.mo3162l())) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                FinskyLog.m21659a("%s: onProgress %s.", c2839b, c2845h.toString());
                this.f15298g = c2839b.mo3162l();
                this.f15299h = c2845h.f15279d;
            }
            m15065a(2, c2839b);
        }
    }

    public final void mo3174a(C2839b c2839b, int i) {
        c2839b.mo3148a(i);
        switch (i) {
            case 0:
            case 1:
                return;
            case 2:
                m15065a(4, c2839b);
                return;
            case 3:
                m15065a(1, c2839b);
                return;
            case 4:
                m15065a(3, c2839b);
                return;
            case 5:
            case 6:
                m15065a(5, c2839b);
                return;
            default:
                FinskyLog.m21669e("enum %d", Integer.valueOf(i));
                return;
        }
    }

    private final void m15066b() {
        if (this.f15293b.isEmpty()) {
            long j = 0;
            for (C2839b f : this.f15292a.values()) {
                j = Math.max(f.mo3156f(), j);
            }
            this.f15296e.mo3821a(j, new C2861w(this));
        }
    }

    public final void mo2647e(C2839b c2839b) {
        FinskyLog.m21659a("%s: onComplete", c2839b);
        m15067i(c2839b);
    }

    public final void mo2644f(C2839b c2839b) {
        FinskyLog.m21659a("%s: onCancel", c2839b);
        m15067i(c2839b);
        m15068j(c2839b);
    }

    public final void mo2642b(C2839b c2839b, int i) {
        FinskyLog.m21667d("%s: onError %d.", c2839b, Integer.valueOf(i));
        m15067i(c2839b);
        m15068j(c2839b);
    }

    public final void mo2645g(C2839b c2839b) {
        FinskyLog.m21659a("%s: onStart", c2839b);
    }

    private final void m15068j(C2839b c2839b) {
        Uri l = c2839b.mo3162l();
        if (l != null) {
            this.f15295d.mo3187a(l);
        }
    }

    public final void mo2646h(C2839b c2839b) {
    }

    public final void mo2643b(C2839b c2839b, C2845h c2845h) {
    }

    public final List mo3172a() {
        return this.f15295d.mo3186a(null, null);
    }

    public final C2845h mo3177b(Uri uri) {
        List a = this.f15295d.mo3186a(uri, null);
        if (a.isEmpty()) {
            return null;
        }
        return (C2845h) a.get(0);
    }

    public final void mo3179c(Uri uri) {
        this.f15295d.mo3187a(uri);
    }
}
