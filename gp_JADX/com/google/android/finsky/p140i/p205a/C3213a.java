package com.google.android.finsky.p140i.p205a;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p140i.C3212a;
import java.util.ArrayList;
import java.util.List;

public final class C3213a implements C3212a {
    public final Handler f16529a = new Handler(Looper.getMainLooper());
    public final Runnable f16530b = new C3214b(this);
    public final List f16531c = new ArrayList();
    public final C1463g f16532d;
    public final boolean f16533e;
    public boolean f16534f = false;
    public boolean f16535g = false;
    public int f16536h;
    public int f16537i;
    public boolean f16538j = true;
    public int f16539k = 0;

    public C3213a(Application application, C1463g c1463g, C1461c c1461c, boolean z) {
        boolean z2 = true;
        this.f16532d = c1463g;
        if (!c1461c.dj().mo2294a(12639415) || z) {
            z2 = false;
        }
        this.f16533e = z2;
        application.registerActivityLifecycleCallbacks(new C3215c(this));
    }

    public final boolean mo3376a() {
        return this.f16538j;
    }

    public final void mo3375a(Runnable runnable) {
        this.f16531c.add(runnable);
    }

    final void m16263b() {
        this.f16529a.removeCallbacks(this.f16530b);
        this.f16538j = this.f16537i <= 0;
        if (this.f16538j) {
            for (Runnable post : this.f16531c) {
                this.f16529a.post(post);
            }
        }
    }
}
