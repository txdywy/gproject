package com.google.android.finsky.cm;

import a.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.notification.ab;

public final class com.google.android.finsky.cm.a implements com.google.android.finsky.packagemanager.h
{

    public final a.a a;
    public final a.a b;
    public final a.a c;

    a(a.a p0, a.a p1, a.a p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void a(String[] p0) {
    }

    public final void b(String p0, boolean p1) {
        ((com.google.android.finsky.notification.ab)this.a.a()).c(p0);
    }

    public final void c(String p0, boolean p1) {
        if (p1 != 0)
            ((com.google.android.finsky.notification.ab)this.a.a()).b();
        else {
            ((com.google.android.finsky.notification.ab)this.a.a()).a(p0);
            ((com.google.android.finsky.notification.ab)this.a.a()).b(p0);
        }
        if (((com.google.android.finsky.ba.c)this.c.a()).dj().a(12625988))
            ((com.google.android.finsky.installer.k)this.b.a()).a(new com.google.android.finsky.cm.b(this, p0, p1));
        else
            ((com.google.android.finsky.installer.k)this.b.a()).c(p0, p1);
    }

    public final void d(String p0) {
    }

    public final void e(String p0) {
    }

}
