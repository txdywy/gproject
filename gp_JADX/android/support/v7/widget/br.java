package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class br {
    public final bt f3229a;
    public final bs f3230b = new bs();
    public final List f3231c = new ArrayList();

    br(bt btVar) {
        this.f3229a = btVar;
    }

    final void m3328a(View view) {
        this.f3231c.add(view);
        this.f3229a.mo856c(view);
    }

    final boolean m3333b(View view) {
        if (!this.f3231c.remove(view)) {
            return false;
        }
        this.f3229a.mo857d(view);
        return true;
    }

    final void m3330a(View view, int i, boolean z) {
        int a;
        if (i < 0) {
            a = this.f3229a.mo847a();
        } else {
            a = m3327a(i);
        }
        this.f3230b.m3340a(a, z);
        if (z) {
            m3328a(view);
        }
        this.f3229a.mo850a(view, a);
    }

    final int m3327a(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3229a.mo847a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f3230b.m3344e(i2));
            if (e == 0) {
                while (this.f3230b.m3342c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final View m3332b(int i) {
        return this.f3229a.mo853b(m3327a(i));
    }

    final void m3329a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a;
        if (i < 0) {
            a = this.f3229a.mo847a();
        } else {
            a = m3327a(i);
        }
        this.f3230b.m3340a(a, z);
        if (z) {
            m3328a(view);
        }
        this.f3229a.mo851a(view, a, layoutParams);
    }

    public final int m3326a() {
        return this.f3229a.mo847a() - this.f3231c.size();
    }

    final int m3331b() {
        return this.f3229a.mo847a();
    }

    final View m3335c(int i) {
        return this.f3229a.mo853b(i);
    }

    final void m3336d(int i) {
        int a = m3327a(i);
        this.f3230b.m3343d(a);
        this.f3229a.mo855c(a);
    }

    public final int m3334c(View view) {
        int a = this.f3229a.mo848a(view);
        if (a == -1 || this.f3230b.m3342c(a)) {
            return -1;
        }
        return a - this.f3230b.m3344e(a);
    }

    final boolean m3337d(View view) {
        return this.f3231c.contains(view);
    }

    public final String toString() {
        return this.f3230b.toString() + ", hidden list:" + this.f3231c.size();
    }
}
