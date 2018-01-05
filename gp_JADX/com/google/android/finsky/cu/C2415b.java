package com.google.android.finsky.cu;

import android.media.AudioManager;
import android.support.v4.app.ad;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.navigationmanager.C3748a;

public final class C2415b {
    public static final C2417d f11723a = new C2417d();
    public final C2418l f11724b;

    public C2415b(C2418l c2418l) {
        C2417d c2417d = f11723a;
        if (c2417d.f11731f == null) {
            c2417d.f11731f = C1473m.f7980a.bl();
        }
        if (c2417d.f11733h == null) {
            c2417d.f11733h = (AudioManager) C1473m.f7980a.m8581a("audio");
        }
        c2417d.f11727b.setOnPreparedListener(c2417d.f11738m);
        c2417d.f11727b.setOnCompletionListener(c2417d.f11739n);
        this.f11724b = c2418l;
    }

    public final void m12125a() {
        C2417d c2417d = f11723a;
        C2418l c2418l = this.f11724b;
        if (!c2417d.f11729d.contains(c2418l)) {
            c2417d.f11729d.add(c2418l);
        }
    }

    public final void m12126b() {
        C2417d c2417d = f11723a;
        c2417d.f11729d.remove(this.f11724b);
    }

    public static void m12124a(C3748a c3748a) {
        ad c2416c = new C2416c(c3748a);
        c3748a.mo3686b(c2416c);
        c3748a.mo3637a(c2416c);
    }
}
