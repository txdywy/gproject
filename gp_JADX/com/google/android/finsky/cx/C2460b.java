package com.google.android.finsky.cx;

import android.support.v4.app.Fragment;
import com.android.volley.C0657w;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2234p;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C2460b {
    public final List f13277a = new ArrayList();
    public final C1287h f13278b;
    public final C2199l f13279c;
    public final C3300k f13280d;

    public C2460b(C1287h c1287h, C2199l c2199l, C3300k c3300k) {
        this.f13278b = c1287h;
        this.f13279c = c2199l;
        this.f13280d = c3300k;
    }

    public final void m13163a(C1000f c1000f) {
        if (c1000f == null) {
            FinskyLog.m21669e("Trying to register a null RefundPackagelistener.", new Object[0]);
        } else if (this.f13277a.contains(c1000f)) {
            FinskyLog.m21669e("Trying to register an already registered RefundPackageListener.", new Object[0]);
        } else {
            this.f13277a.add(c1000f);
        }
    }

    public final void m13164b(C1000f c1000f) {
        this.f13277a.remove(c1000f);
    }

    public final void m13162a(Fragment fragment, String str, String str2, boolean z) {
        C0657w c2461c = new C2461c(fragment);
        for (int i = 0; i < this.f13277a.size(); i++) {
            ((C1000f) this.f13277a.get(i)).mo1212b(str);
        }
        C1254c a = this.f13278b.mo2016a(str2);
        a.mo1585a(str, null, new C2234p(this.f13279c, a.mo1620b(), new C2462d(this, z, str)), new C2463e(this, c2461c, str));
    }
}
