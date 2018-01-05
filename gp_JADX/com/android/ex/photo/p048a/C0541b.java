package com.android.ex.photo.p048a;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.p037h.C0314i;
import android.support.v4.view.af;
import android.view.View;
import android.view.ViewParent;

public abstract class C0541b extends af {
    public final ab f3726h;
    public aw f3727i = null;
    public Fragment f3728j = null;
    public C0314i f3729k = new C0543c(this);

    public C0541b(ab abVar) {
        this.f3726h = abVar;
    }

    public abstract Fragment mo964c(int i);

    public Object mo956a(View view, int i) {
        if (this.f3727i == null) {
            this.f3727i = this.f3726h.mo284a();
        }
        String a = mo962a(view.getId(), i);
        this.f3729k.m1697b(a);
        Fragment a2 = this.f3726h.mo283a(a);
        if (a2 != null) {
            this.f3727i.mo338e(a2);
        } else {
            a2 = mo964c(i);
            if (a2 == null) {
                return null;
            }
            this.f3727i.mo326a(view.getId(), a2, mo962a(view.getId(), i));
        }
        if (a2 == this.f3728j) {
            return a2;
        }
        a2.m593c(false);
        return a2;
    }

    public void mo957a(View view, int i, Object obj) {
        if (this.f3727i == null) {
            this.f3727i = this.f3726h.mo284a();
        }
        Fragment fragment = (Fragment) obj;
        Object obj2 = fragment.f737I;
        if (obj2 == null) {
            obj2 = mo962a(view.getId(), i);
        }
        this.f3729k.m1693a(obj2, fragment);
        this.f3727i.mo337d(fragment);
    }

    public final void mo958a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f3728j) {
            if (this.f3728j != null) {
                this.f3728j.m593c(false);
            }
            if (fragment != null) {
                fragment.m593c(true);
            }
            this.f3728j = fragment;
        }
    }

    public final void mo960c() {
        if (this.f3727i != null && !this.f3726h.mo297h()) {
            this.f3727i.mo336d();
            this.f3727i = null;
            this.f3726h.mo291b();
        }
    }

    public final boolean mo959a(View view, Object obj) {
        ViewParent viewParent = ((Fragment) obj).f746R;
        for (ViewParent viewParent2 = view; viewParent2 instanceof View; viewParent2 = ((View) viewParent2).getParent()) {
            if (viewParent2 == viewParent) {
                return true;
            }
        }
        return false;
    }

    protected String mo962a(int i, int i2) {
        return "android:switcher:" + i + ":" + i2;
    }
}
