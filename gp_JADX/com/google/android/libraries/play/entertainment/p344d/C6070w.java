package com.google.android.libraries.play.entertainment.p344d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class C6070w implements C6063v {
    public final C6070w f30203a;
    public final List f30204b = new ArrayList();
    public final Set f30205c = Collections.newSetFromMap(new WeakHashMap());
    public final Object f30206d = this.f30204b;
    public boolean f30207e;

    public static C6070w m27988a() {
        return new C6070w(null);
    }

    public C6070w(C6070w c6070w) {
        this.f30203a = c6070w;
        if (this.f30203a != null) {
            this.f30203a.f30205c.add(this);
        }
    }

    public final boolean m27991b() {
        boolean z;
        synchronized (this.f30206d) {
            z = this.f30207e && (this.f30203a == null || this.f30203a.m27991b());
        }
        return z;
    }

    public final void m27992c() {
        synchronized (this.f30206d) {
            this.f30207e = true;
        }
    }

    public final void m27993d() {
        synchronized (this.f30206d) {
            if (this.f30207e) {
                this.f30207e = false;
                m27989f();
            }
        }
    }

    public final void m27994e() {
        m27993d();
        m27992c();
    }

    private final void m27989f() {
        ArrayList arrayList = null;
        synchronized (this.f30206d) {
            if (!m27991b()) {
                ArrayList arrayList2;
                if (this.f30204b.isEmpty()) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(this.f30204b);
                    this.f30204b.clear();
                }
                for (C6070w f : this.f30205c) {
                    f.m27989f();
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C6055u) obj).mo5270c();
            }
        }
    }

    public final void mo5272a(C6055u c6055u) {
        synchronized (this.f30206d) {
            if (this.f30207e) {
                this.f30204b.add(c6055u);
            } else {
                c6055u.mo5270c();
            }
        }
    }
}
