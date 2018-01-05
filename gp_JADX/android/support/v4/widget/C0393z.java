package android.support.v4.widget;

import android.view.View;

final class C0393z extends bs {
    public final int f2194a;
    public bp f2195b;
    public final Runnable f2196c = new aa(this);
    public final /* synthetic */ DrawerLayout f2197d;

    C0393z(DrawerLayout drawerLayout, int i) {
        this.f2197d = drawerLayout;
        this.f2194a = i;
    }

    public final void m2301b() {
        this.f2197d.removeCallbacks(this.f2196c);
    }

    public final boolean mo173a(View view, int i) {
        return DrawerLayout.m2090d(view) && this.f2197d.m2098a(view, this.f2194a) && this.f2197d.m2094a(view) == 0;
    }

    public final void mo171a(int i) {
        DrawerLayout drawerLayout = this.f2197d;
        View view = this.f2195b.f2136s;
        int i2 = drawerLayout.f1955k.f2118a;
        int i3 = drawerLayout.f1956l.f2118a;
        if (i2 == 1 || i3 == 1) {
            i3 = 1;
        } else if (i2 == 2 || i3 == 2) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        if (view != null && i == 0) {
            C0391x c0391x = (C0391x) view.getLayoutParams();
            if (c0391x.f2191b == 0.0f) {
                c0391x = (C0391x) view.getLayoutParams();
                if ((c0391x.f2193d & 1) == 1) {
                    c0391x.f2193d = 0;
                    if (drawerLayout.f1968x != null) {
                        for (i2 = drawerLayout.f1968x.size() - 1; i2 >= 0; i2--) {
                            ((C0390w) drawerLayout.f1968x.get(i2)).a_(view);
                        }
                    }
                    drawerLayout.m2097a(view, false);
                    if (drawerLayout.hasWindowFocus()) {
                        View rootView = drawerLayout.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (c0391x.f2191b == 1.0f) {
                c0391x = (C0391x) view.getLayoutParams();
                if ((c0391x.f2193d & 1) == 0) {
                    c0391x.f2193d = 1;
                    if (drawerLayout.f1968x != null) {
                        for (i2 = drawerLayout.f1968x.size() - 1; i2 >= 0; i2--) {
                            ((C0390w) drawerLayout.f1968x.get(i2)).b_(view);
                        }
                    }
                    drawerLayout.m2097a(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i3 != drawerLayout.f1959o) {
            drawerLayout.f1959o = i3;
            if (drawerLayout.f1968x != null) {
                for (i2 = drawerLayout.f1968x.size() - 1; i2 >= 0; i2--) {
                    ((C0390w) drawerLayout.f1968x.get(i2)).g_(i3);
                }
            }
        }
    }

    public final void mo174b(View view, int i) {
        float f;
        int width = view.getWidth();
        if (this.f2197d.m2098a(view, 3)) {
            f = ((float) (width + i)) / ((float) width);
        } else {
            f = ((float) (this.f2197d.getWidth() - i)) / ((float) width);
        }
        this.f2197d.a_(view, f);
        view.setVisibility(f == 0.0f ? 4 : 0);
        this.f2197d.invalidate();
    }

    public final void mo177e(View view, int i) {
        ((C0391x) view.getLayoutParams()).f2192c = false;
        m2304c();
    }

    final void m2304c() {
        int i = 3;
        if (this.f2194a == 3) {
            i = 5;
        }
        View a = this.f2197d.m2095a(i);
        if (a != null) {
            this.f2197d.m2103f(a);
        }
    }

    public final void mo172a(View view, float f, float f2) {
        int i;
        float b = DrawerLayout.m2088b(view);
        int width = view.getWidth();
        if (this.f2197d.m2098a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && b > 0.5f)) ? 0 : -width;
        } else {
            i = this.f2197d.getWidth();
            if (f < 0.0f || (f == 0.0f && b > 0.5f)) {
                i -= width;
            }
        }
        this.f2195b.m2260a(i, view.getTop());
        this.f2197d.invalidate();
    }

    public final void mo488d() {
        this.f2197d.postDelayed(this.f2196c, 160);
    }

    public final void mo487a(int i, int i2) {
        View a;
        if ((i & 1) == 1) {
            a = this.f2197d.m2095a(3);
        } else {
            a = this.f2197d.m2095a(5);
        }
        if (a != null && this.f2197d.m2094a(a) == 0) {
            this.f2195b.m2258a(a, i2);
        }
    }

    public final int mo170a(View view) {
        return DrawerLayout.m2090d(view) ? view.getWidth() : 0;
    }

    public final int mo176d(View view, int i) {
        if (this.f2197d.m2098a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f2197d.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public final int mo175c(View view, int i) {
        return view.getTop();
    }
}
