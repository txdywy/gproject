package com.google.android.finsky.ea;

import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import java.util.HashSet;
import java.util.Set;

public final class C2964d implements bi {
    public final C2960f f15608a;
    public final Set f15609b = new HashSet();
    public final Set f15610c = new HashSet();
    public ViewPager f15611d;
    public C1069e f15612e;
    public boolean f15613f;
    public boolean f15614g = true;

    public C2964d(C2960f c2960f) {
        this.f15608a = c2960f;
    }

    public final void m15371a(ViewPager viewPager, C1069e c1069e) {
        if (this.f15611d == null || this.f15611d != viewPager) {
            this.f15611d = viewPager;
            this.f15611d.m1758a((bi) this);
            this.f15612e = c1069e;
            this.f15612e.mo1374a(this);
        }
    }

    public final void m15369a() {
        if (this.f15611d != null) {
            this.f15611d.m1759b((bi) this);
            this.f15611d = null;
        }
        if (this.f15612e != null) {
            this.f15612e.mo1382i();
            this.f15612e = null;
        }
    }

    public final void m15373c(int i) {
        this.f15610c.add(Integer.valueOf(i));
        if (!this.f15613f) {
            boolean z;
            C2960f c2960f = this.f15608a;
            boolean z2 = this.f15614g;
            if (i == this.f15611d.getCurrentItem()) {
                z = true;
            } else {
                z = false;
            }
            if (!c2960f.mo3209a(z2, z)) {
                return;
            }
        }
        m15368b();
        this.f15613f = false;
    }

    public final void m15374d(int i) {
        this.f15609b.remove(Integer.valueOf(i));
        this.f15610c.remove(Integer.valueOf(i));
    }

    public final void mo179a(int i, float f, int i2) {
        this.f15614g = false;
    }

    public final void mo180b(int i) {
    }

    public final void d_(int i) {
        boolean z;
        boolean z2 = true;
        this.f15614g = false;
        C2960f c2960f = this.f15608a;
        boolean z3 = !this.f15610c.isEmpty();
        int currentItem = this.f15611d.getCurrentItem();
        if (currentItem == 0 || currentItem == this.f15611d.getAdapter().mo961a() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f15609b.contains(Integer.valueOf(this.f15611d.getCurrentItem()))) {
            z2 = false;
        }
        m15375e(c2960f.mo3208a(i, z3, z, z2));
    }

    public final void m15375e(int i) {
        switch (i) {
            case 1:
                this.f15613f = true;
                return;
            case 2:
                m15368b();
                return;
            case 3:
                int currentItem = this.f15611d.getCurrentItem();
                if (!this.f15609b.contains(Integer.valueOf(currentItem))) {
                    this.f15610c.remove(Integer.valueOf(currentItem));
                    this.f15612e.mo1378d(currentItem);
                    this.f15609b.add(Integer.valueOf(currentItem));
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void m15368b() {
        for (Integer intValue : (Integer[]) this.f15610c.toArray(new Integer[this.f15610c.size()])) {
            int intValue2 = intValue.intValue();
            if (!this.f15609b.contains(Integer.valueOf(intValue2))) {
                this.f15612e.mo1378d(intValue2);
                this.f15609b.add(Integer.valueOf(intValue2));
            }
            this.f15610c.remove(Integer.valueOf(intValue2));
        }
    }
}
